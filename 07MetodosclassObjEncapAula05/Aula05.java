/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author Rafael
 */
public class Aula05 {//aqui fica a classe no caso a classe principal,onde se faz as açoes da conta.

    /**
     * @param args the command line arguments
     *///metodos:tbm são açoes do objeto ex:abrir conta, depositar.
    public static void main(String[] args) {//<-public static void main é o metodo principal que chama os outros metodos(aqui fica os parametros int,float,string)
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();/*dados do cliente p1 rafa nova conta criada, instanciando a classe*/
        p1.setNumConta(1111);/*numero da conta de rafael*/
        p1.setDono("rafa");/*nome do dono da conta*/
        p1.abrirConta("CC");/*conta corrente começa com 50 reais*///chama o metodo
        
        ContaBanco p2 = new ContaBanco();/*segunda conta de saylor*/
        p2.setNumConta(2222);
        p2.setDono("Saylor");
        p2.abrirConta("CP");/*poupança com 150 reais*/
        
        p1.estadoAtual();/*estado atual da conta"sem isso nao apareceria na tela"*/
        p2.estadoAtual();
    }
    
}
