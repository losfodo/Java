/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author Rafael
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("--------operadores relacionais---------");
        String nome1 = "Rafael";// quando usa String letra maiuscula ela é classe automaticamente cria um objeto
        String nome2 = "Rafael";
        String nome3 = new String("Rafael");//new String deu diferença da string padrão
        
        String res;
        res = (nome1==nome3)?"igual":"diferente";//== igual:um igual a outro ou não
        System.out.println(res);
        
        String res2;
        res2 = (nome1.equals(nome3))?"igual":"diferente";//equals pergunta se realmente é igual ou diferente o nome
        System.out.println(res2);// sendo assim igual
        
        boolean res3;
        boolean res4;
        boolean res6;
        boolean res7;        
        int num= 8; int nuu=10;
        
        res3= nome1==nome2;//==valores iguais
        res4=nome1!=nome2;//=!valores diferentes
        res6=num>nuu;//'>'maior que e menor que '<'para dar true
        res7=num>=nuu;//maior ou igual para dar verdadeiro
        
        System.out.println("simbolo iguais== "+res3);
        System.out.println("simbolo diferente!= "+res4);
        System.out.println("maior e menor<,>: "+res6);
        System.out.println("maior ou igual>=: "+res7);
        
        
        System.out.println("-----------------operadores logicos-------------------");
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r,s,t,u;// se tivesse uma string o r daria erro, boolean para criar um variavel logica
        r = (x<y && y<z)?true:false;//&& logica um 'e' outro para dar verdadeiro os dois devem ser verdade
        System.out.println(r);
        
        s = (x<y || y<z)?true:false;//uso do || significa 'ou' pelo menos uma delas deve estar certa para dar true
        System.out.println(s);
        
        t = (x<y ^ y<z)?true:false;//uso do ^ sig 'xou' apenas uma delas deve ser verdadeiro para dar true
        System.out.println(t);
    }
    
}
