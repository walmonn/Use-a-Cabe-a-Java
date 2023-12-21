public class Loopy {
  public static void main (String[] args) {
    int x = 1;
    System.out.println("Antes do Loop");
    while (x < 10) {
       System.out.println("No Loop");
       System.out.println("O Valor de x e " + x);
       x = x + 1;
     }
     System.out.println("Esse e o fim do Loop");
  }
}
