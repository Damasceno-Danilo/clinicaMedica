package br.com.clinica.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class professionalHealth extends People {

    private String specialization;
    private List<LocalDateTime> scheduleAvailable;

    public professionalHealth() {
    }

    public professionalHealth(String name, LocalDate dateBirth, int phoneNumber, String specialization, List<LocalDateTime> scheduleAvailable) {
        super(name, dateBirth, phoneNumber);

        this.specialization = specialization;
        this.scheduleAvailable = scheduleAvailable;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public List<LocalDateTime> getScheduleAvailable() {
        return new ArrayList<>(scheduleAvailable);
    }

    public void setScheduleAvailable(List<LocalDateTime> scheduleAvailable) {
        this.scheduleAvailable = new ArrayList<>(scheduleAvailable);
    }

    public abstract void scheduleAppointment(Pacient pacient, LocalDateTime time);

    public boolean isTimeAvailable(LocalDateTime time) {
        return scheduleAvailable.contains(time);
    }

    @Override
    public String toString() {
        return "HealthProfessional " +
                "specialization: " + specialization +
                ", scheduleAvailable: " + scheduleAvailable +
                ", name: " + getName() +
                ", dateBirth: " + getDateBirth() +
                ", phoneNumber: " + getPhoneNumber();
    }

}
