/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java6tiposprimitivos2;

import java.util.Scanner;/*importação javautilscanner necessario para escrever na tela*/

/**
 *
 * @author Rafael
 */
public class Java6Tiposprimitivos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);/*escrever no programa tela*/
        System.out.println("Digite o nome do aluno:");/*impresso na tela pergunta*/
        String nome = teclado.nextLine();/*colocando com letra maiuscula 'string'*/
        System.out.println("Digite a nota do aluno:");
        float nota = teclado.nextFloat();/*'nextFloat ou line' usado para digitar no programa */
        System.out.format("A nota de %s é %.1f \n", nome,nota);/*o que aparecera no final impresso na tela*/
        
    }
    
}
