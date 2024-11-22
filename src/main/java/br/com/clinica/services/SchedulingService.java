package br.com.clinica.services;

import br.com.clinica.entities.Consultation;
import br.com.clinica.entities.Doctor;
import br.com.clinica.entities.Pacient;
import br.com.clinica.entities.HealthProfessional;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

public class SchedulingService {

    private List<Consultation> consultation;
    private List<Doctor> doctors;

    public SchedulingService(List<Doctor> doctors) {
        this.doctors = doctors;
    }


    public boolean isHorarioDisponivel(HealthProfessional healthProfessional, LocalDateTime localDateTime) {
        return healthProfessional.getScheduleAvailable().contains(localDateTime);
    }

    public void agendarConsulta(Pacient pacient, HealthProfessional healthProfessional, LocalDateTime localDateTime) {
        if (isHorarioDisponivel(healthProfessional, localDateTime)) {
            Consultation novaConsultation = new Consultation(pacient, healthProfessional, localDateTime);
            consultation.add(novaConsultation);
            System.out.println("Consulta agendada com sucesso! ");
        }else {
            System.out.println("*** HORARIO INDISPONIVEL ***");
        }
    }

    public boolean cancelarConsulta(Pacient pacient, LocalDateTime localDateTime) {
        Iterator<Consultation> iterator = consultation.iterator();

        while (iterator.hasNext()) {
            Consultation consultation = iterator.next();
            if (consultation.getPatient().equals(pacient) && consultation.getDateTime().equals(localDateTime)) {
                System.out.println("Consulta pode ser cancelada: ");
                iterator.remove();
                System.out.println("Consulta cancelada com sucesso! ");
                return true;
            }
        }
        System.out.println("Consulta não encontrada para o paciente informado.");
        return false;
    }

    public void visualizarConsulta(Consultation consultation) {
        consultation.appointmentScheduled();
    }


}
