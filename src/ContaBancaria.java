
public abstract class ContaBancaria{
    protected int conta;
    protected double saldo;
    protected String tipoConta;
    
    
    public abstract double sacar(double valor);
    
    public abstract double depositar(double valor);
    
    public abstract String tipoConta(String tipo);

    public void Transferir(double valor , ContaBancaria contadest){
        saldo -= valor;
        contadest.depositar(valor);
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
}
