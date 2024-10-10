/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statickemetody;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Vladimír Doškář
 */
public class Vypisy {

    static Scanner sc = new Scanner(System.in);

    public static void uvitani(String jmeno) {

        System.out.println("###############################################################################");
        System.out.println("#                                                                             #");
        System.out.println("#                                                                             #");
        System.out.println("#  ____    ____  __  .___________. _______        __  .___________. _______   #");
        System.out.println("#  \\   \\  /   / |  | |           ||   ____|      |  | |           ||   ____|  #");
        System.out.println("#   \\   \\/   /  |  | `---|  |----`|  |__         |  | `---|  |----`|  |__     #");
        System.out.println("#    \\      /   |  |     |  |     |   __|  .--.  |  |     |  |     |   __|    #");
        System.out.println("#     \\    /    |  |     |  |     |  |____ |  `--'  |     |  |     |  |____   #");
        System.out.println("#      \\__/     |__|     |__|     |_______| \\______/      |__|     |_______|  #");
        System.out.println("#                                                                             #");
        System.out.println("#                                                                             #");
        System.out.println("###############################################################################");

        System.out.println("Vitejte " + jmeno + "!");
    }

    public static void zobrazMenu() {
        System.out.println("\n");
        System.out.println("| ________ |");
        System.out.println("||12345678||");
        System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
        System.out.println("|[M|#|C][-]|                 Stiskni klávesu pro výběr metody:");
        System.out.println("|[7|8|9][+]|                 (a/A) - Náhodné číslo");
        System.out.println("|[4|5|6][x]|                 (b/B) - Absolutní hodnota");
        System.out.println("|[1|2|3][%]|                 (s/S) - Uppercase text");
        System.out.println("|[.|O|:][=]|                 (n/N) - NICE");
        System.out.println("\"----------\"               (k/K) - Ukončení programu");
    }

    public static char getVolba() {
        return sc.nextLine().charAt(0);
    }

    public static int getAbsolutniHodnota() {
        int cislo, absHodnota;
        System.out.println("Zadejte číslo:\n=> ");
        cislo = sc.nextInt();
        absHodnota = Math.abs(cislo);

        return absHodnota;
    }

    public static double getNahodneCislo() {
        return Math.random();
    }

    public static String getUppercaseText() {
        String inputText;
        System.out.println("Zadejte text:\n=> ");
        inputText = sc.nextLine();
        return inputText;
    }

    public static void getNice() {
        char[] upperCaseLetters = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };
        
        int max = upperCaseLetters.length - 1;
        int min = 0;
        
        char jedna, dva, tri, ctyri;
        String result = "";
        
        Random rand = new Random();
        
        long startTime, estimatedTime;
        startTime = System.currentTimeMillis();
        
        do {
            jedna = upperCaseLetters[rand.nextInt(max - min)];            
            dva = upperCaseLetters[rand.nextInt(max - min)];
            tri = upperCaseLetters[rand.nextInt(max - min)];
            ctyri = upperCaseLetters[rand.nextInt(max - min)];
            
            result = "" + jedna + dva + tri + ctyri;
            
            System.out.println("Result: " + result);
        } while (!"NICE".equals(result));
        
        estimatedTime = System.currentTimeMillis() - startTime;
        
        System.out.println("HOTOVO! Konečný čas: " + estimatedTime + "ms");
    }
}
