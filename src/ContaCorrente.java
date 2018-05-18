
public class ContaCorrente extends ContaBancaria implements IImprimivel{
    
    protected double taxaOperacao=5;
    protected String tipo= "Conta Corrente";

    @Override
    public double sacar(double valor) {
        if(saldo>(valor+taxaOperacao)){
        return saldo = saldo - valor - taxaOperacao;
        }
        else{
            System.out.println("Não tem saldo Disponível");
            return saldo;
        }
        
    }

    @Override
    public double depositar(double valor) {
        return saldo = saldo + valor - taxaOperacao;
    }
    
    @Override
    public String tipoConta(String tipo) {
        return tipo = "Conta Corrente";
    }

    @Override
    public void MostrarDados() {
        System.out.println("Conta Corrente. \nSaldo:" + saldo + "\nTaxa de Operação:" + taxaOperacao + "\n");
    }

}
