/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;// import do programa

/**
 *
 * @author Rafael
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------------if e else---------------");
        Scanner teclado = new Scanner(System.in);// funciona com import, uso do new cria novo objeto
        System.out.print("primeira nota avaliação parcial");// sem ln no print coloca nota no lado
        float n1 = teclado.nextFloat();// para digitar durante o programa na tela
        System.out.println("segunda nota av");
        float n2 = teclado.nextFloat();//e fazer a media 
        float m = n1+n2;//media calculo
        System.out.println("sua media foi: " + m);
        if (m>=8) {//abrindo o bloco chave com uso do if
            System.out.println("passou. parabéns, pequeno gafanhoto!");
        }else if(m>=6||m<8){
            System.out.println("passou. foi bem!");
        }else{
            System.out.println("reprovado na matéria.");
        }
        System.out.println("------------------------");
        
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano voce nasceu?");
        int nasc = t.nextInt();
        int i = 2018 - nasc;
        System.out.println("Sua idade é" + i);//mostrar a idade
        if (i>=18){//se for maior
            System.out.println("Maior de idade");
        } else{//senão nao for maior, fica menor
            System.out.println("Menor de idade");
        }
    }
    
}
