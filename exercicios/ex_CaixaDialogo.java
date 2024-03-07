
package exercicios;
import javax.swing.JOptionPane;


public class ex_CaixaDialogo {
    public static void main(String[] args) {
        //Entrada de dadods
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B:"));
        
        //Processamento dos dados
        double res = a + b;
        
        JOptionPane.showMessageDialog(null, "O valor da da soma é: " + res);
        
        
        
    }


    
}
