/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opçãoprincipal;

/**
 *
 * @author Rafael
 */
public class OpçãoPrincipal {

    /**
     * @param args the command line arguments
     *///se tiver dois iguai na sub e na super classe , chama primeiro a sub.
    public static void main(String[] args) {
        System.out.println("--------------------garopaba-------------------------");
        Opção1 garopaba= new Opção1();//instanciar opção1 como garopaba
       
       garopaba.setRole("praia");//setta ,o role
        System.out.println(garopaba.getRole());//get para pegar role
        System.out.println("------------------em comum--------------------");
        
        garopaba.grbfrp();//chamou o metodo em comum as duas subclasses
        System.out.println("-----------------florianopolis--------------------");
        
        Opção2 florianopolis=new Opção2();//instanciar opção2 como florianopolis
        
        florianopolis.floripa();//instanciar
    }
    
}
