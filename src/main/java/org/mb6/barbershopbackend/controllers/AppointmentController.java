package org.mb6.barbershopbackend.controllers;
import org.mb6.barbershopbackend.dtos.AppointmentDTO;
import org.mb6.barbershopbackend.entities.Appointment;
import org.mb6.barbershopbackend.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/{date}")
    public List<AppointmentDTO> getAppointments(@PathVariable String date) {
        return appointmentService.getAppointmentsForDate(LocalDate.parse(date).atStartOfDay());
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody AppointmentDTO appointmentDTO) {
        return appointmentService.createAppointment(appointmentDTO);
    }
}
