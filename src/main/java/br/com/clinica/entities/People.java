package br.com.clinica.entities;

import java.time.LocalDate;

public class People {

    private String name;
    private LocalDate dateBirth;
    private int phoneNumber;

    public People() {
    }

    public People(String name, LocalDate dateBirth, int phoneNumber) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
    }

    public People(int phoneNumber, LocalDate dateBirtho, String name) {
        this.phoneNumber = phoneNumber;
        this.dateBirth = dateBirtho;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dataNascimento) {
        this.dateBirth = dataNascimento;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int numeroTelefone) {
        this.phoneNumber = numeroTelefone;
    }

    @Override
    public String toString() {
        return "\n name: " + name  +
                ",\n dataNascimento: " + dateBirth +
                ",\n numeroTelefone: " + phoneNumber ;
    }
}
