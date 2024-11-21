package br.com.clinica.entities;

import java.time.LocalDate;

public class Paciente extends Pessoas{

    private String historicoMedico;

    public Paciente(String cpf, int numeroTelefone, LocalDate dataNascimento, String name, String historicoMedico) {
        super(cpf, numeroTelefone, dataNascimento, name);
        this.historicoMedico = historicoMedico;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    @Override
    public String toString() {
        return super.toString() + // Chama o toString da classe base
                ",\n Historico medico: " +
                getHistoricoMedico() ;

    }


}
