package br.com.clinica.entities;

import java.time.LocalDate;

public class Pessoas {

    private String name;
    private LocalDate dataNascimento;
    private int numeroTelefone;
    private String cpf;

    public Pessoas() {
    }

    public Pessoas(String name, LocalDate dataNascimento, int numeroTelefone) {
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.numeroTelefone = numeroTelefone;
    }

    public Pessoas(String cpf, int numeroTelefone, LocalDate dataNascimento, String name) {
        this.cpf = cpf;
        this.numeroTelefone = numeroTelefone;
        this.dataNascimento = dataNascimento;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "Dados Paciente " +
                "\n name: " + name  +
                ",\n dataNascimento: " + dataNascimento +
                ",\n numeroTelefone: " + numeroTelefone +
                ",\n cpf: " + cpf ;
    }
}
