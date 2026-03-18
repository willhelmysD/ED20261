import java.util.Scanner;

public  class PromedioEdad{

  public static void main(String[] args){
   
      Scanner sc = new Scanner(System.in);  
      String nombre = ""; 
      int edad = 0;
      long promedio_edad = 0;
          
      System.out.println("Digite la edad:");
      edad = sc.nextInt();
      
      promedio_edad = promedio_edad + edad;
      
      System.out.println("El promedio de edad fue" + edad);

  }
  
}
