/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprograma;/*que faz parte do pacote primeiro programa*/

import java.util.Date;/*clica na lampada no date e faz a importação de data na biblioteca, dando 'import' para importar algo a mais*/
import java.util.Scanner;/*import para digitar no programa*/
import java.util.InputMismatchException;//import para mostra este tipo de erro na tela
/**acima no java util date = deu import para sair o horario atual do sistema
 *
 * @author Rafael
 */
public class PrimeiroPrograma {/*dentro classe primeiro programa*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {/*'psvm' depois tab cria o metodo principal*/
        // TODO code application logic here
        System.out.print("Ola, Mundo!");/*escreva ola mundo na tela, escrevendo 'sout' e tab sai o programa*/
         System.out.println("Hello, friend!");/*escreve na tela em baixo uma linha por causa do println*/
                System.out.println("sistema.saida.imprimir");/*traduzindo o 'sout'*/
                
                System.out.println("--------------------------");
                
                Date relogio = new Date ();/*mostrar a hora no programa*/
        System.out.println("A hora do Sistema é ");
        System.out.println(relogio.toString());/*converteu para uma string relogio*/
        
        System.out.println("-------------------try catch finally----------------------");
      try{//monitora o erro
        String n; //variaveis de escrita
        int i;//variaveis numero   
        Scanner teclado = new Scanner(System.in);//comando necessario para digitar na tela
        
        System.out.print("Digite seu nome: ");
            n = teclado.next();//escrever na tela
           
        System.out.print("Digite sua idade: ");
            i = teclado.nextInt();//escrever na tl numeros int
          
        System.out.println("seu nome é "+n+" e tem idade de"+i+"anos");//+n+ necessario para aparecer na tela
           }catch(InputMismatchException e){//este tipo de exception necessita de import
               System.out.println("Errou");}//diz onde esta errado
                finally{//executada de qualquer forma seja try ou catch antes
          System.out.println("finally exe");
      }
     System.out.println("-----------------maior e menor valor-------------------"); 
                           final int NUMEROS = 5;//5 valores
        Scanner sc = new Scanner(System.in);
        int valorMax = Integer.MIN_VALUE;//min_value:mostra o menor valor de resultado comparado com todos os outros
        int valorMin = Integer.MAX_VALUE;//max_value:mostra o maior valor de resultado
        for (int i = 0; i < NUMEROS; i++){//coloca 5 valores neste for
            System.out.println("Entre com um valor:");
            int valor = sc.nextInt();
            if (valor > valorMax)//valor maximo conectadando a valor usando if
                valorMax = valor;
            if (valor < valorMin)
                valorMin = valor;
        }
        System.out.println("O maior valor é: "+valorMax);//exibir os valores
        System.out.println("O menor valor é: "+valorMin);
                           
    }
  
}
