
package aula06.joo;/*1-novo projeto feito*/

public class Aula06JOO {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();// c foi criado abreviação nick do controle
        
        c.ligar();//liga o controle
        c.maisVolume();//volume normal 50 com maisvolume aumenta +5
        //c.ligarMudo();//deixa o som do controle no mudo        
        //c.fecharMenu();//fecha o menu
        c.play();//começa a tocar
        //c.setVolume(50); //não funciona pq esta privado, publico funcionaria
        c.maisVolume();//+5 , só funciona assim pq só esta disponivel assim private
        
        c.abrirMenu();//abre o menu, sem isto não aparece nada na tela;abrirmenu deve ficar abaixo para sair as infor corretas.interface
        c.getTocando();//ligado false pq ele esta abaixo do abrir menu
    }
    
}
