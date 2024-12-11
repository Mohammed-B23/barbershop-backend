package org.mb6.barbershopbackend.dtos;

import org.mb6.barbershopbackend.entities.ServiceType;

import java.time.LocalDateTime;


public class AppointmentDTO {
    private String clientName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private ServiceType service;
    private String style;

    @Override
    public String toString() {
        return "AppointmentDTO{" +
                "clientName='" + clientName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", service=" + service +
                ", style='" + style + '\'' +
                '}';
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public ServiceType getService() {
        return service;
    }

    public void setService(ServiceType service) {
        this.service = service;
    }

    public AppointmentDTO() {
    }

    public AppointmentDTO(String clientName, LocalDateTime startTime, LocalDateTime endTime) {
        this.clientName = clientName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public AppointmentDTO(String clientName, LocalDateTime startTime, LocalDateTime endTime, ServiceType service, String style) {
        this.clientName = clientName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.service = service;
        this.style = style;
    }

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
}
