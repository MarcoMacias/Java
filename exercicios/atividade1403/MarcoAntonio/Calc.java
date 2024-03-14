
package atividade1403.MarcoAntonio;
import javax.swing.JOptionPane;
import java.lang.Math;


public class Calc {
    void soma () {
        int a = 10;        
        int b = 10;
        
        int res = a + b;
        
        System.out.println("O valor da soma é:" + res);

    }
    
    void subt () {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
        
        int res = a - b;
                
        JOptionPane.showMessageDialog(null,"O valor da subtração é: " + res);
    }
    
    void mult () {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
        
        int res = a * b;
                
        JOptionPane.showMessageDialog(null,"O valor da multiplicação é: " + res);
    }
    
    void div () {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
        
        int res = a / b;
                
        JOptionPane.showMessageDialog(null,"O valor da divisão é: " + res);
    }
    
    void areaQuadrado () {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de um dos lados:"));
        
        double res = Math.pow(a, 2);
                
        JOptionPane.showMessageDialog(null,"O valor da área do quadrado é: " + res);
    }
    
    void areaTriangulo () {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base:"));        
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura:"));

        
        double res = (a * b)/2;
                
        JOptionPane.showMessageDialog(null,"O valor da area do triangulo é: " + res);
    }
    
    void volumeCubo () {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de uma das arestas:"));
        
        double res = Math.pow(a, 3);
                
        JOptionPane.showMessageDialog(null,"O valor do volume do cubo é: " + res);
    }
    
    void raioCirculo () {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da circunferencia:"));
        double pi = 3.14 * 2;
        
        double res = a/pi;
                
        JOptionPane.showMessageDialog(null,"O valor do volume do cubo é: " + res);
    }
    
    
    
    
}
