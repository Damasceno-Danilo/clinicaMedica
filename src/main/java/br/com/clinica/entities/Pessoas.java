package br.com.clinica.entities;

import java.time.LocalDate;

public class Pessoas {

    private String name;
    private LocalDate dataNascimento;
    private int numeroTelefone;
    private String cpf;

    public Pessoas() {
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

    public String getCpf() {
        return cpf;
    }
}
