/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author Rafael
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while (cc<10){/*while seria loops finitos ou não*/
            cc++;
            if (cc==5 || cc==7){
                continue;/*vai pular o 5 e 7*/
            }
            if (cc==8){
                break;/*para no 8*/
            }
            System.out.println("Cambalhota" + cc);
        }
        
        System.out.println("--------------------------");
        
        int dd = 0;/*dd igual a zero*/
        do{/*uso do 'do' */
            System.out.println("giro "+dd);
            dd++;/*fica adicionando dd até chegar 4*/
        }while (dd<=4);/*enquanto for menor q 4 forma looping- while fora do 'do'*/
        
        
    }
    
    
}
