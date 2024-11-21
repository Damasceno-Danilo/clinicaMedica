package br.com.clinica.entities;

import java.time.LocalDateTime;

public class Consulta {

    private Paciente paciente;
    private ProfissionalSaude proffisionalSaude;
    private LocalDateTime dateTime;

    public Consulta(Paciente paciente, ProfissionalSaude profissionalSaude, LocalDateTime dateTime) {
        this.paciente = paciente;
        this.proffisionalSaude = profissionalSaude;
        this.dateTime = dateTime;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ProfissionalSaude getProffisionalSaude() {
        return proffisionalSaude;
    }

    public void setProffisionalSaude(ProfissionalSaude profissionalSaude) {
        this.proffisionalSaude = profissionalSaude;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String consultaAgendada() {
        return "Nome do Paciente: "
                + paciente.getName()
                + "com o medico: "
                + proffisionalSaude.getName()
                + "Horario: "
                + dateTime;
    }
}
