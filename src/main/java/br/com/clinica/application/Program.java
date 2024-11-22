package br.com.clinica.application;

import br.com.clinica.entities.Doctor;
import br.com.clinica.entities.Pacient;
import br.com.clinica.services.SchedulingService;

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

        pacients.add(new Pacient("32165498785", 1132146547, LocalDate.of(1987, 12, 15), "Danilo Augusto", "Primeira consulta"));
        pacients.add(new Pacient("39521456285", 1112354788, LocalDate.of(1992, 2, 28), "Joice Damasceno", "Segunda consulta"));
        pacients.add(new Pacient("48521547895", 1198541254, LocalDate.of(1962, 12, 12), "Eliana Amaral", "Realizada cirurgia"));


        doctors.add(new Doctor("Fabiano", LocalDate.of(1982, 2, 13), 1198765412, 654123, "Cardiologista", Collections.singletonList(LocalDateTime.now())));
        doctors.add(new Doctor("Adriana", LocalDate.of(1965, 7, 27), 1198564123, 987122, "Dentista",Collections.singletonList(LocalDateTime.now())));
        doctors.add(new Doctor("Marcelo", LocalDate.of(1958, 12, 7), 1198765874, 447852, "Psicologo",Collections.singletonList(LocalDateTime.now())));


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a opcao desejada: ");
        System.out.println("1 - Marcar Consulta? ");
        System.out.println("2 - Confirmar Consulta agendada? ");
        System.out.println("3 - Cancelar Consulta agendada? ");

        int chooseOption = sc.nextInt();
        sc.nextLine();

        String namePacient;
        String nameDoctor;

        switch (chooseOption) {
            case 1:
                System.out.println("Você escolheu marcar uma consulta:");
                System.out.println();
                System.out.println("Digite o nome do Paciente ");
                namePacient = sc.nextLine();
                Pacient patientFound = null;
                for(Pacient pacient : pacients) {
                    if(pacient.getName().equalsIgnoreCase(namePacient)) {
                        patientFound = pacient;
                        break;
                    }
                }
                if (patientFound != null) {
                System.out.println("Paciente encontrado: " + patientFound.toString());
                }else {
                    System.out.println("Paciente não encontrado");
                }
                System.out.println("Digite o nome do Médico ");
                nameDoctor = sc.nextLine();
                Doctor doctorFound = null;
                for(Doctor doctor : doctors){
                    if (doctor.getName().equalsIgnoreCase(nameDoctor)) {
                        doctorFound = doctor;
                    }
                }
                if(doctorFound != null) {
                    System.out.println("Medico encontrado: " + doctorFound.toString());
                }else {
                    System.out.println("Medico não encontrado");
                }
                break;
            case 2:
                System.out.println("Você escolheu confirmar consulta agendada. ");
                System.out.println("Digite o nome do Paciente");
                namePacient = sc.nextLine();
                Pacient patientFound2 = null;
                for(Pacient pacient : pacients) {
                    if(pacient.getName().equalsIgnoreCase(namePacient)) {
                        patientFound = pacient;
                        break;
                    }
                }
                if (patientFound2 != null) {
                    System.out.println("Paciente encontrado: " + patientFound2.toString());
                }else {
                    System.out.println("Paciente não encontrado");
                }
        }


        sc.close();
    }


}
