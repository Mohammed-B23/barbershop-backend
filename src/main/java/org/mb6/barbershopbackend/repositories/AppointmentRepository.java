package org.mb6.barbershopbackend.repositories;

import org.mb6.barbershopbackend.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByStartTimeBetween(LocalDateTime start, LocalDateTime end);
}
