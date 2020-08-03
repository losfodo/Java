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
public class DescoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here = varios testes brow
    int B[] = {10,15,20,25,30};

         Descoberta d  = new Descoberta(101);//p=101, d é objeto instanciado

          for (int i = 0; i  < B.length ; i++)   {//lenght: mostra o tamanho tipo comprimento

         d.faz(B[i]);//102.v = v + p(10)
//d.faz(B[i]); chama o método faz que altera o valor de v com a expressão v+p: 102+10=112; 112+15=127;...

                   d.exec();//chama o metodo

         }


         
        }
    }


