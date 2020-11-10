package com.company;

import entidade.Paciente;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static ArrayList<Paciente> pacientesVacinados = new ArrayList<Paciente>();
    static ArrayList<Paciente> pacientesNãoVacinados = new ArrayList<Paciente>();

    public static void main(String[] args) {
        init();

    }

    public static void init() {
        pacientesNãoVacinados.add(0, new Paciente("Joana", 25, false));
        pacientesNãoVacinados.add(1, new Paciente("Beatriz", 60,false));
        pacientesNãoVacinados.add(2, new Paciente("Paulo", 76,false));
        pacientesNãoVacinados.add(3, new Paciente("Joao", 40,false));
        pacientesNãoVacinados.add(4, new Paciente("Isabella", 9,false));
        Collections.sort(pacientesNãoVacinados);
    }

    public static void menu(){

    }
}
