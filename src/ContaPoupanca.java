
public class ContaPoupanca extends ContaBancaria implements IImprimivel {

    protected double limite=500;
    protected String tipo= "Conta Popança";

    @Override
    public double sacar(double valor) {
        if((saldo+limite) >= valor){
            return saldo = saldo - valor;
        }
        else{
            System.out.println("Não tem saldo Disponível");
            return saldo;
        }
    }

    @Override
    public double depositar(double valor) {
        return saldo = saldo + valor;
    }
    
    @Override
    public String tipoConta(String tipo) {
        return tipo = "Conta Poupanca";
    }

    @Override
    public void MostrarDados() {
        System.out.println("Conta Poupança. \n" + "Saldo:"+saldo + "\nLimite:" + limite + "\n");
    }
    
 
    
}
