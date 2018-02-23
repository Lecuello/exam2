/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2.adapter;

import exam2.Europa;
import exam2.USA;

/**
 *
 * @author lorna
 */
public class AdaptadorUSA implements IAdapter{
     private USA conector;
     
     public AdaptadorUSA (USA eu) {
         this.conector = eu;
     }
     
     public void conectar(){
         conector.conectar();
     }
}
