/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02variaveisjava;

/**
 *
 * @author Rafael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    byte variavelByte = 10; //primeiro minuscula depois maiuscula camelcase//byte:numeros menores
    int vInt = 10000; //aumenta numeração
    long vLong = 10000000;//aumenta + numeração
    
    float variavelFloat = 1.3f;//numeros quebrados-tem q colocar f no final numero
    double vDouble = 1.234566;//numeros quebrados maiores
    
    boolean variavelBoolean = false;//true ou false ou seja vdd ou fake, ou sim ou não
    String vString = "Rafael Lino Lobo";//nomes, textos, escrita
    char letra= 'b';//char: apenas caractere como a,b,c,d,e
    
        System.out.println(variavelByte);
        System.out.println(vInt);
        System.out.println(vLong);
        
        System.out.println(variavelFloat);
        System.out.println(vDouble);
        
        System.out.println(variavelBoolean);
        System.out.println(vString);
        System.out.println(++letra);//++ é para aumentar um a mais, no caso caractere vai c
        
        System.out.println(vString+variavelFloat);// colocando dois juntos
            
        System.out.println("--------------converte byte p int----------------");
        
        variavelByte=(byte)vInt;//converter int para byte
        System.out.println("convertendo em byte"+variavelByte);
    }
    
}
