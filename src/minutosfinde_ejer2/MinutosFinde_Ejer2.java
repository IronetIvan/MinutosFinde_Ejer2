/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minutosfinde_ejer2;
import java.util.*;
/**
 *
 * @author Usuario DAM 1
 */
public class MinutosFinde_Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Inserte un día de la semana (Lunes a viernes): ");
        String dia;
        dia = sc.nextLine();
        
        int numdias = 0;

        switch (dia) {
            case "lunes":
                numdias = 0;
                break;
            case "martes":
                numdias = 1;
                break;
            case "miercoles":
                numdias = 2;
                break;
            case "jueves":
                numdias = 3;
                break;
            case "viernes":
                numdias = 4;
                break;
            default:
                System.out.print("Dia incorrecto");
        }

        System.out.println("Introduzca la hora");
        System.out.print("Hora: ");
        int hora;
        hora = sc.nextInt();
        
        System.out.print("Minutos: ");
        int minutos;
        minutos = sc.nextInt();
        
        

        int minTot = (4 * 24 * 60) + (15 * 60);
        int minAct = (numdias * 24 * 60) + (hora * 60) + minutos;

        System.out.print("Faltan " + (minTot - minAct) + " minutos para llegar al fin de semana.");
    }
}
