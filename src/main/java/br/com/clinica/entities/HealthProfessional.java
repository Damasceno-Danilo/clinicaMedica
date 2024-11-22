package br.com.clinica.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public abstract class HealthProfessional extends People {

    private int crm;
    private String specialization;
    private List<LocalDateTime> scheduleAvailable;

    public HealthProfessional(String name, LocalDate dateBirth, int phoneNumber, int crm, String specialization, List<LocalDateTime> scheduleAvailable) {
        super(name, dateBirth, phoneNumber);
        this.crm = crm;
        this.specialization = specialization;
        this.scheduleAvailable = scheduleAvailable;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public List<LocalDateTime> getScheduleAvailable() {
        return scheduleAvailable;
    }

    public void setScheduleAvailable(List<LocalDateTime> scheduleAvailable) {
        this.scheduleAvailable = scheduleAvailable;
    }

    public abstract void agendarConsulta(Pacient pacient, LocalDateTime horario);

    @Override
    public String toString() {
        return super.toString() +
                "\n crm: " + crm +
                "\n especializacao: '" + specialization + '\'' +
                "\n horarioDisponivel: " + scheduleAvailable;
    }
}
