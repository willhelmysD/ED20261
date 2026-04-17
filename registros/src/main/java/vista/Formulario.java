/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author willh
 */
public class Formulario {
    
    Scanner sc = new Scanner(System.in);
    
    public String escribir_texto(String texto){
        String nombre = "";
        boolean estado = true;
        while(estado){
           System.out.println(texto);        
           nombre = sc.nextLine();
            if(nombre.length() ==0){
                    System.out.println("texno no valido o nulo");            
             }else{
                     estado = false;
           }
        }        
        return nombre;    
    }
    
}
