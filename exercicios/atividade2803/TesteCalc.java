
package marco.atividade2803;
import javax.swing.JOptionPane;
import java.lang.Math;


public class TesteCalc {
    
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
    
    void idade () {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
        
        if(idade > 18) {
            JOptionPane.showMessageDialog(null,"Você é maior de idade");
        } else {
            JOptionPane.showMessageDialog(null,"Você é menor de idade");
        }
    }
    
    void parImpar () {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        
        boolean result = false;
        
        if(result = (numero % 2) == 0 ) {
            JOptionPane.showMessageDialog(null,"par");
        } else {
            JOptionPane.showMessageDialog(null,"impar");
        }
    }
    
    void controle () {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções: \n1-Soma\n2-subtração\n3-multiplicação\n4-divisão\n5-area do quadrado\n6-idade\n7-ParImpar"));
        
        switch (opcao) {
            case 1:
                soma();
                break;
            case 2:
                subt();
                break;
            case 3:
                mult();
                break;
            case 4:
                div();
                break;
            case 5:
                areaQuadrado();
                break;
            case 6:
                idade();
                break;
            case 7:
                parImpar();
                break;
            default:
                soma();
                break;
        }
    }
}
    

