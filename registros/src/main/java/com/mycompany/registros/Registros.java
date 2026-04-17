/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.registros;

import ED.Piloto;
import java.util.Scanner;
import vista.Formulario;

/**
 *
 * @author willh
 */
public class Registros {

    public static void main(String[] args) {
        
        Piloto test = new Piloto();
        Formulario f = new Formulario();
        
        Piloto vector_piloto [] = new Piloto[5];
        
        for(int i =0; i<vector_piloto.length; i++){
 
           vector_piloto[i] =  new Piloto();
           vector_piloto[i].setNombre(f.escribir_texto("Digite el nombre del piloto"));
           vector_piloto[i].setNacion(f.escribir_texto("Digite el pais del piloto"));
            
            
        }
        
        for(int i =0; i<vector_piloto.length; i++){
 
           
            System.out.println( vector_piloto[i].toString());
            
            
        }
        /* 
        test.setNombre(f.escribir_texto("Digite el nombre del piloto"));
        test.setNacion(f.escribir_texto("Digite el pais"));
        test.setCarreras((short) 20);
        test.setVictorias((short) 10);
        System.out.println(test.toString());        
        test.setEstado(true);
        System.out.println(test.toString());
        float porcentaje = (test.getCarreras() * test.getVictorias()) / 100;
        System.out.println("Porcentaje de victorias:"+porcentaje);        
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
         */       
        
    }
}
