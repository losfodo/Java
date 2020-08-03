/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;

/**
 *
 * @author Rafael
 */
public class Numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("--------------numero++------------------");
        int numero = 5;/*chamando um de pré incremento e pós incremento*/
        int n = 10;
        int valor = 5 + numero++;/*prevalece o numero pois esta primeiro do ++ e vice versa ao contrario*/
        int vale = 4 + --n;/*chamando isto de decremento, começa com --*/
        int g = 8;
        int gg=g++ + 0;//sobe mais um por causa do ++ msm g estando primeiro pq nao esta no 'sout'
        System.out.println(valor);/*assim o resultado é 10 se for numero e 11 se for ++ primeiro*/
        System.out.println(numero);/*porem colocando numero ele ja vem com o incremento n importando a posição*/
        System.out.println(vale);
        System.out.println(n);
        System.out.println("g é: "+g++);//não sobe mais um numero com g++ prevalece numero g do sout
        System.out.println("segundo g é: "+ ++g);//com 3 mais sobe duas vezes o +++g e tbm por + esta na frente
        System.out.println("--------abreviação calculos--------");
        int x = 4;
        x *=2;/*x = x * 2 ----operadores de atribuição*/
        System.out.println(x);     
        
        System.out.println("-------------while-------------");
        int b = 1;
        while (b < 10){ //while: cria um looping como o 'for' mas no caso de varios b=1 até chegar a 10 ou passar.
            if (b%2==0){ b++;
            } else { b=b+2; //else foi executado pois o if nao foi =0
            } 
            System.out.println(b+" yes"); //com print sem ln fica um do lado do outro.
        }
        System.out.println("--------while loopin++------------");
        int p = 1;
        while (p < 5){ //while: cria um looping como o 'for' mas no caso de varios b=1 até chegar a 10 ou passar.
             p++;//igual a p=p+1
            System.out.println(p+" loop"); //com print sem ln fica um do lado do outro.
        }
        
         System.out.println("-----------------do while---------------------");
        int dw=0;
        do{//do while é igual ao while praticamente, mas ele executa pelo menos uma vez mesmo dando erro
            System.out.println("do while"+dw );//
            dw++;
        }while(dw>5);//dw nao é maior q 5 então executara uma vez apenas com 'do'
        //se fosse apenas while não executaria nada.
        System.out.println("---------------for----------------");      
            for(int i=0; i<=15; i+=2) {/*uso do for, faz tudo dentro da condição, no caso pula de dois em dois*/
            if(i%3==0) {System.out.println("continue if for "+i); continue;}/*os que dão zero são executados,comando 'continue' continua o laço*/
            else System.out.println("continue else for "+i);//else 
       }
           
        System.out.println("----------for++-------------");
        
        int v[] = {3,2,8,7,5,4};/*valores de v com [] para por o c*/
        //este é exemplo de vetor
        for(int c=0; c<=5; c++){/*for de c*/
            System.out.println("na posição" + c + "temos o valor " + v[c]);/*aparece o v conectado com c*/
            System.out.println("total de v: "+v);//da uns bug no sistem numeros aleatorios
        }
       
        System.out.println("-------------for total----------------");
        int[] vet={10,20,34,56,60};
        int u;
        for(u=0; u < vet.length;u++){//lenght mostra o tamanho tipo comprimento do vetor um de cada
            System.out.println("vet["+u+"]=" + vet[u]);
        }
        System.out.println("u total="+u);
        
        System.out.println("--------------for array-----------------");
        System.out.println("Inicio do main!!");
  try {
   System.out.println("Inicio do try!");
   int[] array = new int[3];//instancia um array para armazenar 3, detalhes q esta entre coxetes o 3'limite' de arrays q pode se armazenar
   for (int i = 0; i < 4; ++i) {
    array[i] = i;
    System.out.println("vet["+i+"]=" + array[i]);
    System.out.println(i);//i é ezibido até o limite 3 da instancia, do qual ocorre um erro e executa catch
   }
   System.out.println("Fim do try!");//este não executa pq antes ocorre um erro no for o 3
  } catch (Exception e) {
   System.out.println("Exceçao: " + e);//e: mostra o tipo de erro ocorrido ou excepção que é abaixo:
  }//ArrayIndexOutOfBoundsException:Índice de matriz fora dos limites de exceção ''3''
  System.out.println("Fim do main!");//ja este executa pois esta dentro da continuação e fora do for de erro
  
        System.out.println("--------------for Exception++-------------------");
        //int q= 0; no necessary
	int result =0;
	for(int i=0;i<=3;i++){p++;//p++ p=1 e parou até 3
		result=p*0;
		for(int z=2;z>=0;z--){//for não compila então catch corrige 
			try{
		result=(p/0);
		}catch(/*Arithmetic*/Exception e){//exception do catch a seguir,este tipo não precisa de import
			++result;}//++result quantidade de fail catch
			}
			}
		System.out.println("Hello World catch: "+result);//resultado catch é o total do looping

    }
    
}
