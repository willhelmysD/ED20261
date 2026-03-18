import java.util.Scanner;
public class Main{//pascal case   
  public static void autorApp(){//camelCase
    System.out.println("By will0");
  }
  public static void main(String [] args){
    //
    Scanner sc = new Scanner(System.in);
    float total_pagar, sub_total, salud, pension;//snake_case 
    total_pagar = 0;
    sub_total = 0;
    salud = 0;
    pension = 0;
    boolean estado = true;
    byte dias = 0;
    char opcion = ' ';
    final byte MANANA = 20;
    final byte TARDE = 25;
    final byte NOCHE = 40;
    final float PEN = 0.1f;
    final float SAL = 0.08f;
    while(estado){
      System.out.println("Digite los dias trabajados:");
     dias = sc.nextByte();
      for(int i = 0; i<dias; i++){
        System.out.println("Menu:");        
        System.out.println("---------------------------");        
        System.out.printf("|%5s|%10s|%5s|\n", "M", "Manana", "20");
        System.out.printf("|%5s|%10s|%5s|\n", "T", "Tarde", "25");
        System.out.printf("|%5s|%10s|%5s|\n", "N", "Noche", "40");
        System.out.println("---------------------------");        
        System.out.println("Digite opcion:");
        
        opcion = sc.next().charAt(0);
        
        switch(opcion){
          case 'm':
              sub_total =  sub_total + MANANA;
            break;
          case 't':
              sub_total =  sub_total +TARDE;          
            break;
          case 'n':
               sub_total =  sub_total + NOCHE;
            break;
            default:
               System.out.println("Caso no valido!!!");         
              break;            
        }//SW
        
        
      }//FOR
    
    salud = sub_total * SAL;
    pension = sub_total * PEN;
    total_pagar =  sub_total + salud + pension;
    
    System.out.println("El total a pagar es: "+total_pagar+"\npago pension: "+pension+" \npago salud: "+salud+ "\nsub total: "+ sub_total);
    
    System.out.println("Digite 0 para salir");
    dias = sc.nextByte();
    if(dias==0){
      estado = false;
    }
    
    
    }//WHILE

    
    autorApp();
  }
}