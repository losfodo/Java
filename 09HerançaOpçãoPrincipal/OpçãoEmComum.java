/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opçãoprincipal;

/**
 *
 * @author Rafael
 *///herança basicamente é isto abaixo
public class OpçãoEmComum {//superclasses conectada com opção1 e opção2,para quando ter coisas em comum entre elas coloca aqui.
    //poupando assim code de escrita + rapido
    private float dinheiro;
    public String role;//detalhe que string sempre letra maiuscula.
    protected String pontos;
    
    public void grbfrp(){
        System.out.println("noite");
    }
//inserido codigos getters e setters.
    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {//retorna vazio,setter:metodo seta o valor de um atributo
        this.dinheiro = dinheiro;
    }

    public String getRole() {//retorna uma string,getter:metodo pega,recupera o valor de um atributo 
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPontos() {
        return pontos;
    }

    public void setPontos(String pontos) {
        this.pontos = pontos;
    }
    
    
}
