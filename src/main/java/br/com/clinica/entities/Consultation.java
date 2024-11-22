package br.com.clinica.entities;

import java.time.LocalDateTime;

public class Consultation {

    private Pacient pacient;
    private HealthProfessional proffisionalSaude;
    private LocalDateTime dateTime;

    public Consultation(Pacient pacient, HealthProfessional healthProfessional, LocalDateTime dateTime) {
        this.pacient = pacient;
        this.proffisionalSaude = healthProfessional;
        this.dateTime = dateTime;
    }

    public Pacient getPatient() {
        return pacient;
    }

    public void setPaciente(Pacient pacient) {
        this.pacient = pacient;
    }

    public HealthProfessional getHelthProfessional() {
        return proffisionalSaude;
    }

    public void setProffisionalSaude(HealthProfessional healthProfessional) {
        this.proffisionalSaude = healthProfessional;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String appointmentScheduled() {
        return "Nome do Paciente: "
                + pacient.getName()
                + "com o medico: "
                + proffisionalSaude.getName()
                + "Horario: "
                + dateTime;
    }
}
