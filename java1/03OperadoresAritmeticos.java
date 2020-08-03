/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Rafael
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-------------soma(+)-------------------");
        float n1 = 3.5f;//f necessario para sair numeros quebrados
        int n2 = 5; /*variaveis*/
        float m = (n1 + n2);/*primeiro + operador de soma e primeira no calculo parenteses depois / e *, %, + e -*/
        System.out.println("A soma é" + m);/*segundo + operador de concatenação pq é string*/
        
        System.out.println("--------menos(-)----------");
        int s1 = 5;
        int s2 = -7;//menos com menos é mais
        int r =s1-s2;//menos com menos é mais
        int sr = -s1+s2;//menos + mais = menos
        System.out.println("o calculo é"+r);//- + - = +
        System.out.println("calculo negativo é"+sr);//- + +=-
        
        System.out.println("----------------multiplicação(*)-------------------");
        int r1 = 10;
        int r2= 20;
        int mult = r1*r2;//*sig multiplicar
        System.out.println("a multiplicação é "+mult);
        
        System.out.println("------------------divisão(/)----------------------");
        int d1 =100;
        int d2=10;
        int div=d1/d2;//  (/)dividir
        System.out.println("divisão igual a "+div);
        
        System.out.println("-----------------resto da divisão(%)-----------------");
        int re1 =100;
        int re2=9;
        int res=re1%re2;//  (%)dividir p/ resto da divisão
        int res1=re2%10;//
        int res2=0%3;
        System.out.println("sobrou "+res);
        System.out.println("sobrou"+res1);
        System.out.println("sobrou"+res2);
        
        System.out.println("----------------arredondar float numbers----------------");
        float v = 8.9f;//8.3f para ser float
        int ar = (int)Math.floor(v);//arredonda numeros quebrador float para baixo floor em int*/
        System.out.println(ar);//resultado  para baixo 8
        int ci = (int)Math.ceil(v);//arredonda para cima agr com ceil
        System.out.println(ci);   
        
        System.out.println("------------numeros aleatorios---------------");
        double ale = Math.random();
        System.out.println(ale);//gera numeros aleatorios diferentes random toda vez que executada, usada em sorteios
        int n = (int) (5 + ale * (10-5));
        System.out.println(n);//gera numero aleatorio de 5 a 10 em sorteio
        int s = (int) (0 + ale * (10-0));//gera numero aleatorio de 0 a 10 em sorteio
        System.out.println(s);//gera numero aleatorio de 0 a 10 em sorteio
    }
    
}
