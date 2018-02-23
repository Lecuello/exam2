/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2;

/**
 *
 * @author lorna
 */
public class Samsung implements Equipo {
    private String microusb;
    
     public void off(){
         System.out.println("Equipo.off");
     }
     
    public void on(){
         System.out.println("Equipo.on");
    }
    
    public void call(){
         System.out.println("Equipo.call");
    }
    
     public void conectar(){
         System.out.println("Coenctado Samsung");
    }
}
