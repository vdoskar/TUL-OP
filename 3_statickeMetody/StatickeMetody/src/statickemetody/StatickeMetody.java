/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statickemetody;

/**
 *
 * @author Vladimír Doškář
 */
public class StatickeMetody {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vypisy.uvitani("Adela");
        
        char volba;
        
        do {
            Vypisy.zobrazMenu();
            
            volba = Vypisy.getVolba();
            
            switch(volba) {
                case 'A':
                case 'a':
                    System.out.println("Náhodné číslo: " + Vypisy.getNahodneCislo());
                    break;
                case 'B':
                case 'b':
                    System.out.println("Absolutní hodnota: " + Vypisy.getAbsolutniHodnota());
                    Vypisy.sc.nextLine(); // buffer
                    break;
                case 'S':
                case 's':
                    System.out.println("Uppercase text: " + Vypisy.getUppercaseText());
                    break;
                case 'N':
                case 'n':
                    Vypisy.getNice();
                    break;
                default:
                    System.out.println("Nesprávná možnost");
            }
            
            
        } while (volba != 'K' && volba != 'k');
    }
    
}
