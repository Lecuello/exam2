/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2;

import exam2.adapter.AdaptadorEuropa;
import exam2.adapter.AdaptadorUSA;
import exam2.adapter.IAdapter;


/**
 *
 * @author lorna
 */
public class Exam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Impresion Europa
       IAdapter adapE = (IAdapter)new AdaptadorEuropa(new Europa());
        Iphone iphone = new Iphone(adapE);
        iphone.conectar();
        IAdapter adap = (IAdapter)new AdaptadorEuropa(new Europa());
        Samsung sam = new Samsung (adap);
          sam.conectar();
          
         System.out.println();
         
          //Impresion USA
         IAdapter adapU = (IAdapter)new AdaptadorUSA(new USA());
        Iphone iphone1 = new Iphone(adapU);
        iphone1.conectar();
        IAdapter adapus = (IAdapter)new AdaptadorUSA(new USA());
        Samsung samu = new Samsung (adapus);
          samu.conectar();
     
        
        
      
    }
    
}
