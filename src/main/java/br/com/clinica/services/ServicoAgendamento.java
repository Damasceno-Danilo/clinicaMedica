package br.com.clinica.services;

import br.com.clinica.entities.Consulta;
import br.com.clinica.entities.Medico;
import br.com.clinica.entities.Paciente;
import br.com.clinica.entities.ProfissionalSaude;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

public class ServicoAgendamento {

    private List<Consulta> consulta;
    private List<Medico> medicos;

    public ServicoAgendamento(List<Consulta> consulta, List<Medico> medicos) {
        this.consulta = consulta;
        this.medicos = medicos;
    }

    //

    public boolean isHorarioDisponivel(ProfissionalSaude profissionalSaude, LocalDateTime localDateTime) {
        return profissionalSaude.getHorarioDisponivel().contains(localDateTime);
    }

    public void agendarConsulta(Paciente paciente, ProfissionalSaude profissionalSaude, LocalDateTime localDateTime) {
        if (isHorarioDisponivel(profissionalSaude, localDateTime)) {
            Consulta novaConsulta = new Consulta(paciente, profissionalSaude, localDateTime);
            consulta.add(novaConsulta);
            System.out.println("Consulta agendada com sucesso! ");
        }else {
            System.out.println("*** HORARIO INDISPONIVEL ***");
        }
    }

    public boolean cancelarConsulta(Paciente paciente, LocalDateTime localDateTime) {
        Iterator<Consulta> iterator = consulta.iterator();

        while (iterator.hasNext()) {
            Consulta consulta = iterator.next();
            if (consulta.getPaciente().equals(paciente) && consulta.getDateTime().equals(localDateTime)) {
                System.out.println("Consulta pode ser cancelada: ");
                iterator.remove();
                System.out.println("Consulta cancelada com sucesso! ");
                return true;
            }
        }
        System.out.println("Consulta não encontrada para o paciente informado.");
        return false;
    }

    public void visualizarConsulta(Consulta consulta) {
        consulta.consultaAgendada();
    }

    public void listarProfissionaisDisponivel(Consulta consulta, LocalDateTime localDateTime) {
        if (medicos.isEmpty()) {
            System.out.println("Nenhum profissional disponivel: ");
        }
        System.out.println("Medico disponivel ");
        for (Medico medico : medicos) {
            System.out.println(consulta.consultaAgendada());
        }
    }


}
