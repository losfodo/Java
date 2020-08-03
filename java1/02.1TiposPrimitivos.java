/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;
import java.util.Scanner;/*necessario import para escrever na tela*/
/**
 *
 * @author Rafael
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = "Rafael";//string para nomes escritas
        float nota = 2.5f;// numeros quebrados
        int inteiro = 5;
        System.out.printf("A nota é %.3f\n", nota);/*'sout' abreviado facilidade do netbeans*/
        System.out.printf("A nota de %s é %.4f \n",nome , nota);/*'%s' seria nome e '%.4f' a nota*/
        System.out.format("A nota de %s é %.5f \n",nome , nota);/*a mesma coisa aparece igual de cima*/
        System.out.printf("A nota",nome,nota);//sem o %s o nome e nota não aparece mas por que?
        System.out.println("---------------------------------");
        System.out.format("o inteiro é %s", inteiro);// nao executa com println//
    }

    private static class string {

        public string() {
        }
    }
    
}
/*System.out.print + 'ln' para ir abaixo linha
 *System.out.print + '.2f' para aparecer depois de é e numeração completo casas decimais, + '\n' para ir para abaixo mais organizado */
