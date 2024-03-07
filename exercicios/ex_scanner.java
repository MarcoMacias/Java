
package exercicios;
import java.util.Scanner;

public class ex_scanner {
    
    public static void main(String[] args) {
        
    Scanner x = new Scanner(System.in);
    
    double a, b;
    
    System.out.println("Digite o valor de a:");
    a = x.nextDouble();
    
    System.out.println("Digite o valor de b:");
    b = x.nextDouble();
    
    double res = a + b;
    System.out.println("O resultado é : " + res);
    
    
    
    }
}
