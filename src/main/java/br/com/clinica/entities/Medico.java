package br.com.clinica.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Medico extends ProfissionalSaude {

    public Medico(String name, LocalDate dataNascimento, Integer numeroTelefone, int crm, String especializacao) {
        super(name, dataNascimento, numeroTelefone, crm, especializacao);
    }

    @Override
    public void agendarConsulta(Paciente paciente, LocalDateTime horario) {
        if (gethorarioDisponivel().contains(horario)) {
            System.out.println("Consultar agenda com DR. " + getName() + "No horario " + horario);
        }else {
            System.out.println("Horario indisponivel");
        }
    }
}
