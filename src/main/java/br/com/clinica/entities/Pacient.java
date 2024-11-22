package br.com.clinica.entities;

import java.time.LocalDate;

public class Pacient extends People {

    private String medicalHistory;

    public Pacient(String cpf, int numeroTelefone, LocalDate dataNascimento, String name, String historicoMedico) {
        super(numeroTelefone, dataNascimento, name);
        this.medicalHistory = historicoMedico;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String historicoMedico) {
        this.medicalHistory = historicoMedico;
    }

    @Override
    public String toString() {
        return super.toString() + // Chama o toString da classe base
                ",\n Historico medico: " +
                getMedicalHistory() ;

    }


}
