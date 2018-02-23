/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2;

import exam2.adapter.IAdapter;

/**
 *
 * @author lorna
 */
public class Samsung implements Equipo {
    private String microusb;
    
     private IAdapter conexion;
     
     public Samsung (IAdapter con) {
         this.conexion = con;
     }
    
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
         System.out.println("Samsung");
          conexion.conectar();
    }
}
