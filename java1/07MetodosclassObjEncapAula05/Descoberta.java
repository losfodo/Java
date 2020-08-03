/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descoBerta;

/**
 *
 * @author Rafael
 */
class Descoberta {
     private  int v;

 
 public  Descoberta(int  p)/*101*/    { v= p+1;  }//102
 

 public void faz(int p)    {v = v + p; }//faz: ele vai no calculo como uma operação que substitui

 
 public void  exec()  {

     System.out.print("  ok " + v);/*sai os resultados do calculo for*/      }
    
}
