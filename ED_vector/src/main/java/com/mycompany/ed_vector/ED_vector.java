/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ed_vector;

import java.util.Scanner;

/*
 *Cree un programa en java que le permita almacenar en un arreglo el total del 
 * dinero producto por la venta de un negocio de comidas 
 * rápidas diarias de N cantidad de días.
 */
public class ED_vector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float VP = 0.2f;
        float propina = 0f;
        byte dias = 0;
        float venta_dia = 0f;
        float venta = 0f;
        boolean turno;
        float prom = 0f;
        float valor_total = 0f;        
        float [] arreglo_venta;
        byte op = 0;
        
        System.out.println("¿Cuantos dias vas a calcular?");
        dias = sc.nextByte();
        
        arreglo_venta = new float [dias];
        
        for(int i = 0; i<dias; i++){
            
            System.out.println("Digite los  valores del dia:"+(i+1));    
            turno = true;
            int  cont = 0;
            while(turno){
                cont = 0;
                System.out.println("Digite la venta");        
                venta = sc.nextFloat();
                venta_dia = venta_dia + venta;
                cont++;
                System.out.println("deseas terminar el tunno");        
                
                if(op == 1){
                    turno = false;
                }
            }
            prom = venta_dia / cont;
             System.out.println("el promedio del dia fue: "+prom);      
            //venta_dia = sc.nextFloat();
            arreglo_venta[i] = venta_dia;            
        }
        
         for(int i = 0; i<dias; i++){            
            valor_total = valor_total + arreglo_venta[i] ;                        
        }
        propina = valor_total * VP;
        
         
        System.out.println("El total fue: "+valor_total + "el valor de propinas deberia es:"+ propina + " el restaurante se queda con: "+(valor_total - propina));
        
        
        
        
         
    }
}
