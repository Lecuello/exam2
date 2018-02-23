/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2.adapter;

import exam2.Europa;
import exam2.Iphone;

/**
 *
 * @author lorna
 */
public class AdaptadorEuropa implements IAdapter{
     private Europa conector;
     
     public AdaptadorEuropa (Europa euro) {
         this.conector = euro;
     }
     
     public void conectar(){
         conector.conectar();
     }
}
