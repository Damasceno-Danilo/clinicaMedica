package br.com.clinica.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Doctor extends HealthProfessional {

    public Doctor(String name, LocalDate dateBirth, int phoneNumber, int crm, String specialization, List<LocalDateTime> scheduleAvailable) {
        super(name, dateBirth, phoneNumber, crm, specialization, scheduleAvailable);
    }

    @Override
    public void agendarConsulta(Pacient pacient, LocalDateTime horario) {
        if (getScheduleAvailable().contains(horario)) {
            System.out.println("Consultar agenda com DR. " + getName() + "No horario " + horario);
        }else {
            System.out.println("Horario indisponivel");
        }
    }

    @Override
    public String toString() {
        return "\n Medico(a): "
                + super.toString();
    }
}
