/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.egervaccir.t1p2;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class SPP2EGervacciRT1P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Erick Eduardo Gervacci Romero A01410809 (IIS)
        //Presentación
System.out.println("Calculadora de perímetros");

//Variables
Scanner k = new Scanner (System.in);
double b,h,A,P;

//Ejecución
System.out.println	("Ingrese el valor de la base");
b = k.nextDouble();

System.out.println ("Ingrese el valor de la altura");
h = k.nextDouble();

//Operaciones
A = (b*h);
P = (2*b) + (2*h);

//Resultados 
System.out.println	("La superficie de su rectángulo es de: " + A);
System.out.println	("El perímetro de su rectángulo es de: " + P);
    }
    
}
