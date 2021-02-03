/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqutedos;


import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        e.useLocale(Locale.US);
        boolean flag = true;
        String team, stadium, de, message = "";
        char l;
        double budget;
        while (flag) {

            System.out.println("Ingrese el nombre del equipo: ");
            team = e.nextLine();
            System.out.println("Ingrese el presupuesto anual del equipo: ");
            budget = e.nextDouble();
            e.nextLine();
            System.out.println("Ingrese el estadio donde juega el equipo: ");
            stadium = e.nextLine();
            message = String.format("%s%s, presupuesto %.2f, estadio %s\n", message, team, budget, stadium);
            System.out.println("¿Desea ingresar otro equipo (n) no?");
            de = e.nextLine();
            de = de.toLowerCase();
            l = de.charAt(0);
            if (l == 'n') {
                flag = false;
            }
        }
        EscribirArchivo.file(message);
    }
}
