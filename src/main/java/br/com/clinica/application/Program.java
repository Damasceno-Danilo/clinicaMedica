package br.com.clinica.application;

import br.com.clinica.entities.Consultation;
import br.com.clinica.entities.Doctor;
import br.com.clinica.entities.Pacient;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        List<Pacient> pacients = new ArrayList<>();
        List<Doctor> doctors = new ArrayList<>();
        List<Consultation> consultations = new ArrayList<>();
        LocalDateTime dateTime = null;

        pacients.add(new Pacient("32165498785", 1132146547, LocalDate.of(1987, 12, 15), "Danilo Augusto", "Primeira consulta"));
        pacients.add(new Pacient("39521456241", 1112354788, LocalDate.of(1992, 2, 28), "Joice Damasceno", "Segunda consulta"));
        pacients.add(new Pacient("48521547897", 1198541254, LocalDate.of(1962, 12, 12), "Eliana Amaral", "Realizada cirurgia"));

        doctors.add(new Doctor("Fabiano", LocalDate.of(1982, 2, 13), 1198765412, 654123, "Cardiologista", Collections.singletonList(LocalDateTime.now())));
        doctors.add(new Doctor("Adriana", LocalDate.of(1965, 7, 27), 1198564123, 987122, "Dentista", Collections.singletonList(LocalDateTime.now())));
        doctors.add(new Doctor("Marcelo", LocalDate.of(1958, 12, 7), 1198765874, 447852, "Psicologo", Collections.singletonList(LocalDateTime.now())));

        Scanner sc = new Scanner(System.in);
        int chooseOption;

        do {
            System.out.println("Digite a opcao desejada: ");
            System.out.println("1 - Marcar Consulta? ");
            System.out.println("2 - Confirmar Consulta agendada? ");
            System.out.println("3 - Cancelar Consulta agendada? ");
            System.out.println("0 - Sair");

            chooseOption = sc.nextInt();
            sc.nextLine();

            String namePacient;
            String nameDoctor;
            Pacient patientFound = null;
            Doctor doctorFound = null;

            switch (chooseOption) {
                case 1:
                    //selecionar um paciente
                    System.out.println("Você escolheu marcar uma consulta:");
                    System.out.println();
                    System.out.println("Digite o nome do Paciente ");
                    namePacient = sc.nextLine();
                    for (Pacient pacient : pacients) {
                        if (pacient.getName().equalsIgnoreCase(namePacient)) {
                            patientFound = pacient;
                            break;
                        }
                    }
                    if (patientFound != null) {
                        System.out.println("Paciente encontrado: " + patientFound.toString());
                    } else {
                        System.out.println("Paciente não encontrado");
                    }
//Selecionar um médico
                    System.out.println("Digite o nome do Médico ");
                    nameDoctor = sc.nextLine();

                    for (Doctor doctor : doctors) {
                        if (doctor.getName().equalsIgnoreCase(nameDoctor)) {
                            doctorFound = doctor;
                        }
                    }
                    if (doctorFound != null) {
                        System.out.println("Medico encontrado: " + doctorFound);
                    } else {
                        System.out.println("Medico não encontrado");
                        break;
                    }

                    // Selecionar a data da consulta
                    System.out.println("Selecionar a data da consulta (Ex: 2024-12-01T15:30): ");
                    String dataTimeInput = sc.nextLine();
                    dateTime = LocalDateTime.parse(dataTimeInput);
//Criar a consulta e exibir confirmação

                    Consultation consultation = new Consultation(patientFound, doctorFound, dateTime);
                    consultations.add(consultation);
                    System.out.println("Consulta agendada com sucesso.");
                    System.out.println(consultation.toString());
                    break;

                case 2:
                    System.out.println("Você escolheu confirmar consulta agendada.");
                    System.out.println("Digite o nome do Paciente:");
                    namePacient = sc.nextLine();

// Procurar consulta na lista de consultas agendadas
                    Consultation consultationFound = null;
                    for (Consultation consultation1 : consultations) {
                        if (consultation1.getPatient().getName().equalsIgnoreCase(namePacient)) {
                            consultationFound = consultation1;
                            break;
                        }
                    }
// Exibir consulta se encontrada
                    if (consultationFound != null) {
                        System.out.println("Consulta encontrada:");
                        System.out.println(consultationFound);
                    } else {
                        System.out.println("Nenhuma consulta encontrada para o paciente: " + namePacient);
                    }
                    break;
                case 3:
                    System.out.println("Voce escolheu cancelar sua consulta. ");
                    System.out.println("Digite o nome do paciente: ");
                    namePacient = sc.nextLine();
                    Consultation consulationRemoved = null;
                    for (Consultation consultation1 : consultations) {
                        if (consultation1.getPatient().getName().equalsIgnoreCase(namePacient)) {
                            consulationRemoved = consultation1;
                            break;
                        }
                    }
                    if (consulationRemoved != null) {
                        consultations.remove(consulationRemoved);
                        System.out.println("Consulta cancelada com sucesso.");
                    } else {
                        System.out.println("Nenhuma consulta encontrada para o paciente: " + namePacient);
                    }
            }
        } while (chooseOption != 0);
        sc.close();
    }
}




