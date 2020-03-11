/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git_saluda;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Git_saluda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre,edad,apellidos;
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextLine();
        System.out.println("Introduzca nombre: ");
        nombre = sc.nextLine();
        System.out.println("Introduzca los apellidos: ");
        apellidos = sc.nextLine();
        System.out.println("Introduzca la edad: ");
        edad = sc.nextLine();
        System.out.println("Hola "+nombre+" "+apellidos+" tienes "+edad+" años");
    }
    
}
