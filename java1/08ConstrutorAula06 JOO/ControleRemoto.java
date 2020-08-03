/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06.joo;
//classe controleremoto
public class ControleRemoto implements Controlador {/*class controle remoto implementado ou conectado a interface controlador*/
    //atributos do controle, classes, 
    private int volume;
    private boolean  ligado;
    private boolean tocando;//private==encapsulamento 
    //encapsular:1-torna mudanças invisiveis. 2-facilita reutilização de codigo. 3-reduz os efeitos colaterais.

    
    //metodos especiais:
    //construtor: responsavel pela inicialização do objeto no caso o controle remoto.
    public ControleRemoto(){/*estado atual do controle remoto ou construtor*///construtor não é obrigatorio//
    this.volume = 50;
    this.ligado = false;//abre estas opçoes ao abrir menu 
    this.tocando = false;
    }//construtor deve ter mesmo nome da classe.
//contrutor: não possue atributo ou void no metodo uma das caracteristicas comparado a outros metodos
    
    /*get e set do controle remoto ou seja atributos*///metodos especiais: os getter e setter colocados abaixo.
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {//get pega o resultado
        return ligado;
    }

    public void setLigado(boolean ligado) {//set coloca o resultado como pode ver
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {//set coloca o resultado como boolean
        this.tocando = tocando;
    }


//sobrescrevendo metodos    
//todos metodos abstrados da interface controlador colocado abaixo, implementado por controleremoto
    @Override
    public void ligar() {
        /*throw new UnsupportedOperationException("Not supported yet.");*/ //To change body of generated methods, choose Tools | Templates.
        this.setLigado(true);
    }
//override: é sobrepor pois é quando tem dois metodos iguais e um é diferente do outro
    @Override//override no caso aqui é conectado com os abstract.
    public void desligar() {
        this.setLigado(false);
    }

    @Override/*sobreescrever, desconsiderando e programando cada um deles*/
    public void abrirMenu() {/*menu do controle, para iniciar o controle*/
        System.out.println("----------menu-------------");
        System.out.println("Esta ligado?" + this.getLigado());//get pega o resultado de algum metodo 
        System.out.println("Esta tocando?" + this.getTocando());//abrir esta opçoes
        System.out.print("Volume: " + this.getVolume());
        for (int i =0; i<= this.getVolume(); i+=10) {
            System.out.print("[]");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()) {/*se estive ligado aumenta mais volume*/
           this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("impossivel aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume()-5);
        }else{
            System.out.println("impossivel diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado()&&this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume()==0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado()&& !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("não consegui pausar");
        }
    }
}
/*ctrl e apaga uma linha que voce quiser*/