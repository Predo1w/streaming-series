package main;

import utils.Input;

public class Main {
    static void main(String[] args) {

        Series s1 = new Series("Mentalista", "Netflix");
        Series s2 = new Series(Input.st("Informe o nome da serie: "));

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        double nota;
        nota = Input.db("Informe a nota da serie O Mentalista: ");
        if (s1.setNota(nota)) {
            System.out.println("Nota registrada");
        }
        else {
            System.out.println("Nota invalida!");
        }


    }
 }

