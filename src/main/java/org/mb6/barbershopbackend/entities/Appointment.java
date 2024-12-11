package org.mb6.barbershopbackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clientName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private ServiceType service;
    private String style;

    public ServiceType getService() {
        return service;
    }

    public void setService(ServiceType service) {
        this.service = service;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Appointment(String clientName, LocalDateTime startTime, LocalDateTime endTime) {
        this.clientName = clientName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Appointment(String clientName, LocalDateTime startTime, LocalDateTime endTime, ServiceType service, String style) {
        this.clientName = clientName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.service = service;
        this.style = style;
    }

    public Appointment() {}

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
