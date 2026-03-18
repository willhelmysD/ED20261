package utilidades;

public class Menu{
  
  public void autor(){
    System.out.println("Power By Will0");
  }
  
  public void lineas(byte numero){
     String cadena = "";
      for(int i =0; i<numero; i++){
          cadena += "-";
      }
      System.out.println(cadena);
  }
  
  public void ops(){
      lineas((byte) 40);
      System.out.println("menu de cafes:");
      lineas((byte) 40);
      System.out.printf("|%5s|%-26s|%-5s|%n", "1", "Frapuccino", "$51");
      System.out.printf("|%5s|%-26s|%-5s|%n", "2", "cafe del dia", "$20");
      System.out.printf("|%5s|%-26s|%-5s|%n", "3", "Macchiato", "$42");
      System.out.printf("|%5s|%-26s|%-5s|%n", "4", "Chiapas", "$26");
      System.out.printf("|%5s|%-26s|%-5s|%n", "5", "Americano", "$32");      
      lineas((byte) 40);
  }
  
}
