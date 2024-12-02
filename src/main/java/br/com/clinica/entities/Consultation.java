package br.com.clinica.entities;

import java.time.LocalDateTime;

public class Consultation {

    private Pacient pacient;
    private professionalHealth proffisionalSaude;
    private LocalDateTime dateTime;

    public Consultation() {
    }

    public Consultation(Pacient pacient, professionalHealth professionalHealth, LocalDateTime dateTime) {

        this.pacient = pacient;
        this.proffisionalSaude = professionalHealth;
        this.dateTime = dateTime;
    }

    public Pacient getPatient() {
        return pacient;
    }

    public void setPatient(Pacient pacient) {
        this.pacient = pacient;
    }

    public professionalHealth getHelthProfessional() {
        return proffisionalSaude;
    }

    public void setProffisionalSaude(professionalHealth professionalHealth) {
        this.proffisionalSaude = professionalHealth;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }



    public String toString() {
        return "Nome do Paciente: "
                + pacient.getName()
                + " com o Dr(a): "
                + proffisionalSaude.getName()
                + " Horario: "
                + dateTime;
    }
}
