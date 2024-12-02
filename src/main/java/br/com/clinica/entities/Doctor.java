package br.com.clinica.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Doctor extends professionalHealth {

    private int crm;

    public Doctor(String name, LocalDate dateBirth, int phoneNumber, int crm,String specialization, List<LocalDateTime> scheduleAvailable) {
        super(name, dateBirth, phoneNumber, specialization, scheduleAvailable);
        this.crm = crm;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    @Override
    public void scheduleAppointment(Pacient pacient, LocalDateTime time) {
        if(!isTimeAvailable(time)) {
            System.out.println("Horario indisponível para consulta: ");
            return;
        }
        System.out.println("Consulta agendada com um médico " + getName() +
                ", para o paciente " + pacient.getName() + ", no horario: " + time);
        getScheduleAvailable().remove(time);
    }

    @Override
    public String toString () {
        return "Doctor \n" +
                "crm: " + crm +
                "\n specialization: '" + getSpecialization() + '\'' +
                "\n scheduleAvailable: " + getScheduleAvailable() +
                "\n name='" + getName() + '\'' +
                "\n dateBirth=" + getDateBirth()
                ;
    }
}
