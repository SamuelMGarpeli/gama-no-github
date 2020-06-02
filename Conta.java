public class Conta {
   
    private double transferir;
    private double consultar;
    private double depositar;
    private double sacar;
    private double criarConta[];
    private double saldo;
    private double conta;


    // metodos de acesso *** FALTA COLOCAR O QUE VAI ACONTECER *****
  
  
    public void setsaldo(double saldo){
        this.saldo = saldo;
    }
    public double getsaldo(){
        return this.saldo;      // deve retornar o valor do arrey da posicao da conta
    }
    public void setconta(double conta){
        this.conta = conta;
    }
    public double getconta(){
        return this.conta;
    }

    // Metodos de acao ****
    
    public void settransferir(double transferir){
        if (this.conta != 0){

            this.saldo -= transferir;
        }
    }
      /*  public double gettransferir(){
            return this.transferir;
        }*/

    public void setdepositar(double depositar){
        if (this.conta != 0){
            
            this.saldo += depositar;
        }
    }
       /* public double getdepositar(double depositar){
            return this.depositar;
         }*/

    public void setsacar(double sacar){
        if (this.conta != 0 && sacar < saldo){   // falta associar a conta e a posicao
            
            this.saldo -= sacar;
        }
    }
    public double getsacar(double sacar){
        return this.sacar;
    }
    public void setcriarConta(double criarConta){
        this.criarConta = criarConta;
    }
    public double getcriarConta(double criarConta){
        return this.criarConta;
    }
    public void getconsultar(){
        System.out.println("Valor do saldo da conta eh: " + getsaldo());   
    }
    public void getagradecer(){
        System.out.println("Agradecemos a preferencia!!!");   
    }
}