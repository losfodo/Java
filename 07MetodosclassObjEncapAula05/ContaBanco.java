/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;
//classe:é o plano, o projeto de tudo ex:faz um plano ou planta de uma casa isso é classe
//objeto:é uma instancia de uma classe,ex:objeto: varios elementos daquele plano ou planta as 'instancias', detalhes

/*class com letra maiuscula, e objeto minuscula*/
public class ContaBanco {//aqui fica a classe conta banco em geral,ContaBanco: q é instanciada para criar uma new conta
    //atributos - todos os atributos abaixo, que são tipo dados, ou modificadores de acesso
    public int numConta;//public:publico para todos os atributos ou metodos -modificador de acesso
    protected String tipo;//protegido: apenas banco.ou apenas dentro do mesmo pacote ou classes
    private String dono;// private:privado apenas dono,ou apenas de dentro da classe,encapsulado
    private float saldo;//private: exemplo de atributo de 'encapsulamento'.
    private boolean status;//atributos que são detalhes, dados.
    //default: tbm é um 'modificador de acesso', caso nao tenha sido definido nenhum modificador,uso permitido dentro do pacote
    /*----------------------------*/
    public void estadoAtual(){//metodo:são tambem chamados de açoes do objeto,no caso mostra os dados do cliente
        System.out.println("---------------------------");
        System.out.println("conta: " + this.getNumConta());//this:utilizado para acessa atributos e metodos dentro de sua classe
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("status: " + this.getStatus());
    }
    //metodos personalizados - açoes feitas
    public void abrirConta(String t){//novo metodo criado abrirconta,void sig vazio: quer dizer q não ira retornar nada
        this.setTipo(t);/*set de definir / get de pegar*/
        this.setStatus(true);/*tbm pode ser:    this.status=true;*/
        if ("CC".equals(t)) {
            //this.saldo=50;    / diretamente no atributo
            this.setSaldo(50);// aqui pelo metodo
        } else if(t=="CP") {
            this.saldo=150;
        }
        System.out.println("conta aberta com sucesso!");
    }
    public void fecharConta(){//metodo fecharconta
        if (this.getSaldo() > 0){/*get de pegar*/
            System.out.println("conta não pode ser fechada pois ainda tem dinheiro");
        }else if (this.getSaldo() < 0){
            System.out.println("conta não pode ser fechada pois tem débito");
        }else{
            this.setStatus(false);
            System.out.println("conta fechada com sucesso!");
        }
    }
    public void depositar(float v){//metodo depositar
        if (this.getStatus()){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v); //defini com set = get pega + v de valor
            System.out.println("deposito realizado sucesso na conta" + this.getDono() );
        }else{
            System.out.println("impossivel depositar em uma conta fechada");
        }
    }
    public void sacar(float v){/*v de valor dentro doa parenteses fica os parametros*/
        if (this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);/*calculo saldo e valor possui*/
                System.out.println("Saque realizado na conta " + this.getDono());
            }else {
                System.out.println("saldo insuficiente para saque");
            }
        }else {
            System.out.println("impossivel sacar de uma conta fechada!");
        }
    }
    public void pagarMensalidade(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if(this.getTipo() == "CP") {
            v = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por" + this.getDono());
        } else{
            System.out.println("impossivel pagar uma conta fechada!");
        }
    }
    //metodos especiais
    public void ContaBanco(){/*conta bancaria point*/
        this.saldo=0;
        this.status=false;
        /*this.setsaldo(0); //outra forma de digitar
        this.setStatus(false);*/
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){/*int pois retorna numero*/
        return this.numConta;//retorna o resultado para o metodo principal
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    public String getDono(){/*string retorna e com letra maiuscula*/
        return this.dono;
    }

    public String getTipo() {/*aperta lado direito mouse-inserir codigo-get e setter- coloca tudo autom*/
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {//get:metodos de acesso=get para obter o valor do produto
        return saldo;
    }

    public void setSaldo(float saldo) {//set:metodos de acessos=set para colocar o valor do atributo
        this.saldo = saldo;
    }

    public boolean getStatus() {/*metodo boolean usa 'is' ao em vez de 'get' mas pode trocar opcional*/
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
