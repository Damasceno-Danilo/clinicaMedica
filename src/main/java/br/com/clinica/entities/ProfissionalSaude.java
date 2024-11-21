package br.com.clinica.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public abstract class ProfissionalSaude extends Pessoas {

    private int crm;
    private String especializacao;
    private List<LocalDateTime> horarioDisponivel;

    public ProfissionalSaude(String name, LocalDate dataNascimento, int numeroTelefone, int crm, String especializacao) {
        super(name, dataNascimento, numeroTelefone);
        this.crm = crm;
        this.especializacao = especializacao;
        this.horarioDisponivel = horarioDisponivel;
    }

    public int getCrm() {
        return crm;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public List<LocalDateTime> getHorarioDisponivel() {
        return horarioDisponivel;
    }

    public void setHorarioDisponivel(List<LocalDateTime> horarioDisponivel) {
        this.horarioDisponivel = horarioDisponivel;
    }

    public abstract void agendarConsulta(Paciente paciente, LocalDateTime horario);

    public void adicionarConsulta(LocalDate horario) {
        horarioDisponivel.add(horario.atStartOfDay());
    }

    public List<LocalDateTime> gethorarioDisponivel() {
        return horarioDisponivel;
    }

}
