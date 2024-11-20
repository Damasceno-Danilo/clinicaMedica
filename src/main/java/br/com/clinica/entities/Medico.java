package br.com.clinica.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Medico extends ProffisionalSaude {

    public Medico(String cpf, int numeroTelefone, LocalDate dataNascimento, String name, int crm, String especializacao, List<LocalDateTime> horarioDisponivel, String espcialidade) {
        super(cpf, numeroTelefone, dataNascimento, name, crm, especializacao, horarioDisponivel);
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
