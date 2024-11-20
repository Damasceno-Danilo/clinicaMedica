package br.com.clinica.entities;

import java.time.LocalDateTime;

public class Consulta {

    private Paciente paciente;
    private ProffisionalSaude proffisionalSaude;
    private LocalDateTime dateTime;

    public Consulta(Paciente paciente, ProffisionalSaude proffisionalSaude, LocalDateTime dateTime) {
        this.paciente = paciente;
        this.proffisionalSaude = proffisionalSaude;
        this.dateTime = dateTime;
    }

    public String consultaAgendada() {
        return "Nome do Paciente: "
                + paciente.getName()
                + "com o médico: "
                + proffisionalSaude.getName()
                + "Horario: "
                + dateTime;
    }
}
