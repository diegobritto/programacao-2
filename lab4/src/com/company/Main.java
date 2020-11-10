package com.company;

import entidade.Paciente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static ArrayList<Paciente> pacientesVacinados = new ArrayList<Paciente>();
    static ArrayList<Paciente> pacientesNãoVacinados = new ArrayList<Paciente>();

    public static void main(String[] args) {
        init();
        menu();
    }

    public static void init() {
        pacientesNãoVacinados.add(0, new Paciente("Joana", 25, false));
        pacientesNãoVacinados.add(1, new Paciente("Beatriz", 60, false));
        pacientesNãoVacinados.add(2, new Paciente("Paulo", 76, false));
        pacientesNãoVacinados.add(3, new Paciente("Joao", 40, false));
        pacientesNãoVacinados.add(4, new Paciente("Isabella", 9, false));
        Collections.sort(pacientesNãoVacinados);
    }

    public static void menu() {
        Scanner in = new Scanner(System.in);
        int escolhaMenu = -1;

        while (escolhaMenu != 0) {
            System.out.println(":::::::::::::::Menu::::::::::::::::");
            System.out.println(":::1- Vacinar o primeiro da fila:::");
            System.out.println(":::2- Mostrar vacinados         :::");
            System.out.println(":::3- Mostrar não vacinados     :::");
            System.out.println(":::0- Sair                      :::");
            System.out.println(":::::::::::::::::::::::::::::::::::");
            escolhaMenu = in.nextInt();

            switch (escolhaMenu) {
                case 1:
                    if (validarListaVazia(pacientesNãoVacinados))
                        break;

                    pacientesNãoVacinados.get(0).Vacinar();
                    pacientesVacinados.add(pacientesNãoVacinados.get(0));
                    pacientesNãoVacinados.remove(0);
                    break;
                case 2:
                    System.out.println("::::::::::Paciêntes  vacinados:::::::::::::");
                    mostrarLista(pacientesVacinados);
                    break;
                case 3:
                    System.out.println("::::::::::Fila de vacinação::::::::::::::::");
                    mostrarLista(pacientesNãoVacinados);
                    break;
                case 0:
                    return;
                default:

            }
        }
    }


    public static boolean validarListaVazia(ArrayList<Paciente> lista) {
        if (lista.size() == 0) {
            System.out.println("Não há paciêntes.\n");
            return true;
        }
        return false;
    }

    public static void mostrarLista(ArrayList<Paciente> lista) {
        if (validarListaVazia(lista))
            return;

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(
                    "index: " + i + "\n" +
                    lista.get(i).toString()+"\n"
            );
        }
    }
}
