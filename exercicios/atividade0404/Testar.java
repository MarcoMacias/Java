/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marcoantonio.atividade0404;

/**
 *
 * @author CAMARGO
 */
public class Testar {
    public static void main(String[] args) {
        Caneta x = new Caneta();
        
        x.cor = "Azul";
        x.ponta = 0.5f;
        x.tampa = true;
        
        x.tampar();
        x.rabiscar();
        x.status();

    }
}
