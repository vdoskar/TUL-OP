/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduction;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Vladimír Doškář
 */
public class Introduction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Hello World");
        
        String stringText = "This is a string";
        char character = 'a';
        char character2 = '\u20ef';
        char character3;
        
        System.out.println(character + " " + character2);
        
        int intNumber;
        double doubleNumber;
        
        // init scanner
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        // scanning an int
        System.out.println("\n\nZadejte cele cislo:");
        intNumber = scanner.nextInt();
        System.out.println("Zadane int cislo je " + intNumber);
        scanner.nextLine(); // vycisteni bufferu
        
        // scanning a double
        System.out.println("\n\nZadejte desetinne cislo:");
        doubleNumber = scanner.nextFloat();
        System.out.println("Zadane double cislo je " + doubleNumber);
        scanner.nextLine(); // vycisteni bufferu

        // scannig a char
        System.out.println("\n\nZadejte jedno pismeno:");
        character3 = scanner.nextLine().charAt(0);
        System.out.println("Zadany znak " + character3);
        
        // scanning a string
        System.out.println("\n\nZadejte text:");
        stringText = scanner.nextLine();
        System.out.println("Zadany text " + stringText);
        
        
        // RESULT
        System.out.println("\nVýsledné hodnoty jsou:\n" + 
            "\nCelé: \t\t" + intNumber +
            "\nDesetinné: \t\t" + doubleNumber +
            "\nZnak: \t\t '" + character3 +
            "\nŘetězec: \t\t" + stringText
        );


        // new class creation
        String name = "Petr";
        int age = 18;

        Person newPerson = new Person(name, age);
        System.out.println("\n\n");
        newPerson.greet();
    }
}

class Person {

    final private String name;
    final private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hey, I'm " + this.name);
        System.out.println("I'm " + this.age + " years old.");
    }
}
