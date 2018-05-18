
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Banco implements IImprimivel {
    List<ContaBancaria> lst  = new ArrayList<ContaBancaria>(); 
   
    
    public void inserir(ContaBancaria objeto){
        lst.add(objeto);
    }
    
    public void remover(int numeroconta){
        for(int i = 0; i > lst.size(); i++){
            if(numeroconta == lst.get(i).conta){
                lst.remove(i);
            }
        }
    }

    public void procurar(int numeroConta){
        for (int i = 0; i < lst.size(); i++) {
            if(numeroConta == lst.get(i).conta){
                IImprimivel imp = (IImprimivel)lst.get(i);
                imp.MostrarDados();
                
            }
            else
                System.out.println("Conta inválida");
        }
    }
   

    @Override
    public void MostrarDados() {
       
        for(int i = 0; i < lst.size(); i++){
            IImprimivel imp = (IImprimivel)lst.get(i);
            imp.MostrarDados();
        }

        
    }
   
 //   public void MostrarDados(ContaBancaria aux) {
 //       System.out.println("Conta "+ aux.getClass().getName() + "Saldo:"aux.getSaldo() + "\nLimite:" + aux.get + "\n");
 //   }
    
 /*
     Crie outra classe executável (com o método main) que instancie um banco e ofereça
o seguinte menu para o usuário: 
  */ 
}