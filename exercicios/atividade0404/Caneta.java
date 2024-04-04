/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marcoantonio.atividade0404;

/**
 *
 * @author CAMARGO
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;
    
    void status() {
        System.out.println("modelo:" + this.modelo);        
        System.out.println("Uma caneta:" + this.cor);        
        System.out.println("Esta tampada:" + this.tampa);        
        System.out.println("Ponta:" + this.ponta);        
        System.out.println("Carga:" + this.carga);        
        System.out.println("Tampada:" + this.tampa);
    }
    
    void rabiscar() {
        if(this.tampa == true) {
            System.out.println("Erro não posso utilizar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    
    void tampar() {
        this.tampa = true;
    }
    
    void destampar() {
        this.tampa = false;
    }
    
    
    
}
