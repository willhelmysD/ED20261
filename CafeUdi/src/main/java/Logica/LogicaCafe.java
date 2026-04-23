/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Modelo.Cafe;

public class LogicaCafe {
    
        Cafe lista_cafes [] = {
            new Cafe("Capuccino",25f,'c'),
            new Cafe("Mocca",22f,'c'),
            new Cafe("Expreso",29f,'c'),
            new Cafe("Del Dia",15f,'f')
        };
        
        public void calcularTotal(byte cant,byte pos){
            
            if(pos>=0 &&  pos<=lista_cafes.length){
            
               float total =  0f;
               total = cant * lista_cafes[pos].getPrecio();
               System.out.println("el total fue:" + total);            
            
            }else{
                System.out.println("Opcion de cafe no valida!!!");            
            }

        }
      
    
}
