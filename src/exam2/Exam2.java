/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2;

import exam2.adapter.AdaptadorEuropa;
import exam2.adapter.AdaptadorUSA;

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
        
        AdaptadorEuropa conector = new AdaptadorEuropa(new Europa());
        conector.conectar();
        
        AdaptadorUSA conector1 = new AdaptadorUSA(new USA());
        conector1.conectar();
    }
    
}
