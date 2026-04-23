/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import java.util.Scanner;

/**
 *
 * @author willh
 */
public class MisForms {
    
    Scanner sc = new Scanner(System.in);
    
    public byte FormOpcion(){
       
      byte opcion = 0; 
       
        while (true) {
            System.out.print("Ingrese un número byte (-128 a 127): ");
            String input = sc.nextLine();
            try {
                opcion = Byte.parseByte(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Dato inválido o fuera de rango.");
            }
        }
        
        return opcion;  
        
        
    } 
        
}
