/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author Vladimír Doškář
 */
public class Menu {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("===============================");
        System.out.println("| Autor: V.D.                 |");
        System.out.println("|                             |");
        System.out.println("|           M E N U           |");
        System.out.println("|                             |");
        System.out.println("| 3/10/2024            KIN/OP |");
        System.out.println("===============================");
        
        char volba;

        do {
            System.out.println("Zadejte volbu:\n");
            System.out.println("\t(a/A) - matematicke operace");
            System.out.println("\t(b/B) - prace s retezci");
            System.out.println("\t(k/K) - konec programu\n");

            volba = scanner.nextLine().charAt(0);

            switch (volba) {
                case 'A':
                case 'a':
                    System.out.println("Vybrali jste moznost A");
                    menuCisla();
                    break;
                case 'B':
                case 'b':
                    System.out.println("Vybrali jste moznost B");
                    menuRetezce();
                    break;
                case 'K':
                case 'k':
                    System.out.println("Konec");
                    break;
                default:
                    System.out.println("Nevhodna moznost, zadejte znovu.");
                    break;
            }
        } while (volba != 'k' && volba != 'K');
    }

    public static void menuCisla() {
        int volba;

        do {
            System.out.println("\nMenu pro matematicke operace");
            System.out.println("Zadejte volbu:\n");
            System.out.println("\t1 - scitani");
            System.out.println("\t2 - odcitani");
            System.out.println("\t0 - zpet do hlavniho menu\n");

            volba = scanner.nextInt();
            scanner.nextLine();

            int vysledek = 0;
            switch (volba) {
                case 1:
                    System.out.println("Jdeme scitat!");
                    vysledek = scitani();
                    break;
                case 2:
                    System.out.println("Jdeme odecitat");
                    vysledek = odecitani();
                    break;
                default:
                    System.out.println("Nespravna moznost, zadejte znovu");
                    break;
            }

        } while (volba != 0);
    }

    public static int scitani() {
        int vysledek = 18;
        return vysledek;
    }

    public static int odecitani() {
        int vysledek = 8180;
        return vysledek;
    }
    
    public static void menuRetezce() {
        char volba;
        
        do {
            System.out.println("\nMenu pro prace s retezci");
            System.out.println("Zadejte volbu:\n");
            System.out.println("\t(p/P) - tisk retezce na konzoli");
            System.out.println("\t(z/Z) - zpet do hlavniho menu");

            volba = scanner.nextLine().charAt(0);
            
            if (volba == 'p' || volba == 'P') {
                System.out.println(volba);
            } else if (volba == 'z' || volba == 'Z') {
                System.out.println("Půjdete zpět.");
            } else {
                System.out.println("Nespravna moznost, zadejte znovu"); 
            }

        } while (volba != 'z' && volba != 'Z');
    }
}
