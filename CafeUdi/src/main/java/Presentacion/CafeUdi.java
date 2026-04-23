/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Presentacion;

import Logica.LogicaCafe;

public class CafeUdi {
    
    public static void main(String[] args) {
        MisMenus mm = new MisMenus();
        MisForms mf  = new MisForms();
        LogicaCafe lc =  new LogicaCafe();
        boolean estado =  true;
        byte opcion = 0;
        while(estado){            
            mm.MenuPrincipal();
            opcion = mf.FormOpcion();
            if(opcion==5){
                estado = false;
            }else if(opcion >=1 || opcion <5){              
                System.out.println("Digite cantidad");
                byte cant = mf.FormOpcion();
                opcion = (byte) (opcion - 1);
                lc.calcularTotal(cant, opcion);
            }else{
                System.out.println("opcion desconocida!");
            }
 
        }//while
        mm.MenuSalir();
        
    }
    
}
