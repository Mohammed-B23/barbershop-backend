package org.mb6.barbershopbackend.services;

import org.mb6.barbershopbackend.dtos.AppointmentDTO;
import org.mb6.barbershopbackend.entities.Appointment;
import org.mb6.barbershopbackend.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<AppointmentDTO> getAppointmentsForDate(LocalDateTime date) {
        LocalDateTime startOfDay = date.withHour(0).withMinute(0);
        LocalDateTime endOfDay = date.withHour(23).withMinute(59);
        return appointmentRepository.findByStartTimeBetween(startOfDay, endOfDay)
                .stream()
                .map(appointment -> new AppointmentDTO(appointment.getClientName(),
                        appointment.getStartTime(),
                        appointment.getEndTime()
                ))
                .toList();
    }

    public Appointment createAppointment(AppointmentDTO appointmentDTO) {
        Appointment appointmentEntity = new Appointment(
                appointmentDTO.getClientName(),
                appointmentDTO.getStartTime(),
                appointmentDTO.getEndTime(),
                appointmentDTO.getService(),
                appointmentDTO.getStyle()
        );
        return appointmentRepository.save(appointmentEntity);
    }
}
