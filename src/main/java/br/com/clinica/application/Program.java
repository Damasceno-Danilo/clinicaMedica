package br.com.clinica.application;

import br.com.clinica.entities.Medico;
import br.com.clinica.entities.Paciente;
import br.com.clinica.entities.Pessoas;
import br.com.clinica.services.ServicoAgendamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medicos = new ArrayList<>();

        System.out.println("Cadastrar uma pessoa");
        System.out.println();
        pacientes.add(new Paciente("32165498785", 1132146547, LocalDate.of(1987,12,15), "Danilo Augusto", "Primeira consulta"));
        System.out.println(pacientes.toString());
        System.out.println("Cadastrar uma pessoa");
        medicos.add(new Medico("Dr. Fabiano", LocalDate.of(1982,02,13),1298765412, 654123, "Cardiologista"));

        ServicoAgendamento servicoAgendamento = new ServicoAgendamento(medicos);

        servicoAgendamento.listarProfissionaisDisponivel();


    }


}
