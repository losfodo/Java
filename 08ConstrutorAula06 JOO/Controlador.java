/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.joo;
//encapsular:1-torna mudanças invisiveis. 2-facilita reutilização de codigo. 3-reduz os efeitos colaterais.
//
public interface Controlador { /*2-nova interface feita, irterface classe começa letra maiuscula,define ações que devem ser obrigatoriamente executadas*/
    public abstract void ligar();
    public abstract void desligar();//interface só tem metodos, coisas que podem ser feitas
    public abstract void abrirMenu();//Interfaces contém valores constantes ou assinaturas de métodos que devem ser implementados dentro de uma classe.
    public abstract void fecharMenu();//interface define o que pode ser feito nessa classe
    public abstract void maisVolume();//interface são obrigatoriamente publicas.
    public abstract void menosVolume();//interfaces no Java servem apenas pra dizer quais funções devem ser criadas na classe que implementou a interface.
    public abstract void ligarMudo();//abstract:significa que ele não vai ser definido aqui, e sim em outra classe ou lugar
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}//interface digamos que é os botoes do controle que vc clica e faz as açoes.