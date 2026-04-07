/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calorias;

import java.util.Scanner;

/**
 *
 * @author willh
 */
public class Calorias {

    public static void main(String[] args) {
        /*Ejemplo 3*/
        Scanner sc = new Scanner(System.in);
        byte tipo = 0;
        float total_pagar = 0f;
        byte cantidad = 0;
        String [] vector_info = {"horas","dias","semanas"};
        float [] vector_precio = {2, 14, 60};
        boolean estado = true;
        
        while(estado){
            System.out.println("Menu:");               
            for(int a =0; a<vector_info.length;a++){
                System.out.println("opcion "+a +":  "+ vector_info[a] + " costo: " + vector_precio[a]);    
            }     
            System.out.println("Digite opcion:");    
            tipo = sc.nextByte();
            System.out.println("Digite cantidad tiempo:");    
            cantidad = sc.nextByte();
            total_pagar = cantidad * vector_precio[tipo];
            
            System.out.println("El total a pagar es:"+ total_pagar);    
            System.out.println("quiere salir");        
            estado = sc.nextBoolean();
            
                    
        }
        
        
        /** ejemplo 2
           byte [] v1 = {10,20,30 };
           byte [] v2 = {40,50,60 };
           byte [] v3 = new byte[3];   
                   
          
           for(int i =0; i<v3.length; i++){
               
               v3[i] = (byte) (v1[i] + v2[i]);               
           
           }
           
           for(int i =0; i<v3.length; i++){
                System.out.println("el resultado de sumar primer y segundo vector en la posicion "+ (i+1) + " es:" + v3[i]);               
           }
           * 
           * /
                   
        /*
        ejemplo 1
            Scanner sc = new Scanner(System.in);
            short calorias_ingresadas = 0;            
            byte dias_calcular = 0;
            float promedio_calorias = 0f;
            short [] vector_calorias;
            
            System.out.println("Digite los dias a calcular");
            dias_calcular = sc.nextByte();
            
            vector_calorias = new short [dias_calcular];
            
            for(int i =0; i<dias_calcular; i++){
                System.out.println("Digite las calorias:");    
                calorias_ingresadas = sc.nextShort();
                vector_calorias[i] = calorias_ingresadas;
            }
            
            for(int i =0; i<dias_calcular; i++){
                promedio_calorias = promedio_calorias + vector_calorias[i];               
            }
            promedio_calorias = promedio_calorias / vector_calorias.length;
            
            System.out.println("quemo en promedio:"+ promedio_calorias);
           */                   
    }
}
