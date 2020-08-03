/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernasswitch;

import java.util.Scanner;//classe scanner importada no pacote

/**
 *
 * @author Rafael
 */
public class ProgramaPernasSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//metodo main q é principal
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);// para digitar no programa em execução
        System.out.println("Quantas pernas?");
        int perna = tec.nextInt();//int resposta deve estar
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (perna){// uso do switch para multiplas escolhas ou casos
            case 1:
                tipo = "Saci";
                break;//break para parar nessa escolha
            case 2:
                tipo = "Bipedi";
                break;
            case 3:
                tipo = "tripé";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default://deafault caso seja um numero alem do que esta nas opçoes do case
                tipo = "ET";
                break;
                 }
        System.out.println(tipo);
        
        System.out.println("---------------switch sem break----------------");
        int letras = 1;
           switch (letras){// uso do switch para multiplas saidas a todas as escolhas.
            case 1:
                System.out.println("a");
           
            case 2:
                System.out.println("b");
             
            case 3:
                System.out.println("c");
               
            case 4:
                System.out.println("d");
                
    }
    }
    
}
