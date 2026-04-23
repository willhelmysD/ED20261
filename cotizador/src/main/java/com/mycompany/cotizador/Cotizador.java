/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cotizador;

import ED.Cotizacion;
import ED.Servicio;
import java.util.Scanner;

/**
 *
 * @author willh
 */
public class Cotizador {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Servicio nuevo = new Servicio();
        
        float base = 0f;
        float altura = 0f;
        float area = 0f;
        byte tipo = 0;
        float total = 0f;
        
        Cotizacion [] lista = {
            new Cotizacion("pared","ladrillos","unidad",50f,0.5f),
            new Cotizacion("pared","cemento","kilogramo",9f,12f),
            new Cotizacion("pared","arena","metro",50f,3f),
        };
        
        //
        
        System.out.println("Digite base");
        base = sc.nextFloat();
        System.out.println("Digite altura");
        altura = sc.nextFloat();
        System.out.println("digite su servicio");
        tipo = sc.nextByte();
        area = base * altura;
        switch(tipo){
            case 1:
                total = ((lista[0].getCantidad() * area) * lista[0].getValor_unidad() + total);
                System.out.println("costo por ladrillo"+(lista[0].getCantidad() * area) * lista[0].getValor_unidad() );
                total = ((lista[1].getCantidad() * area) * lista[1].getValor_unidad() + total);
                System.out.println("costo por cemento"+(lista[1].getCantidad() * area) * lista[1].getValor_unidad() );
                total = ((lista[2].getCantidad() * area) * lista[2].getValor_unidad() + total);
                System.out.println("costo por arena"+(lista[2].getCantidad() * area) * lista[2].getValor_unidad() );
                System.out.println(total);
                break;
                
        }
        
        
    }
}
