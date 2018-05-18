
import java.util.Scanner;

public class Executavel {
    public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
ContaPoupanca cp;
ContaCorrente cc;
ContaBancaria cb;
Banco bc = new Banco();


int loop =10;
while(loop != 0){
    System.out.println("------------------------------------------");
    System.out.println("DIGITE A OPÇĀO DESEJADA: \n");
    
    System.out.println("-1: Criar Conta \n"
            + "-2: Deleta Conta \n"
            + "-3: Localizar Conta \n"
            + "-4 Gerar Relatório \n"
            + "-0 Para Sair \n");
     System.out.println("------------------------------------------");
    int resposta = s.nextInt();

    switch(resposta){
        case 0:
            loop = 0;
            break;
        case 1:
            int resposta2;
            do{
            System.out.println("------------------------------------------");
            System.out.println(">>CRIAR CONTA<<");
            System.out.println("Que tipo de Conta deseja Criar?\n");
            System.out.println("-1: Conta Corrente \n-2: Conta Poupança");
            resposta2 = s.nextInt();
            
                if(resposta2 ==1){
                    cc = new ContaCorrente();
                    int conta = cc.getConta();
                    if(cc.getConta() > 1){
                        cc.setConta((conta)+1);
                    }
                    else if(cc.getConta() <=0){
                        cc.setConta(1);
                    }
                    bc.lst.add(cc);
                   
                    System.out.println("---------------------");
                    System.out.println("Conta Corrente Criada");
                    System.out.println("---------------------");
                  //  cc.MostrarDados();
                    System.out.println("Deseja realizar um depósito? \n1-Sim \n2-Nāo");
                    double respdep = s.nextDouble();
                    double saldo = cc.getSaldo();
                    if (respdep ==1) {
                        System.out.println("(Digite o valor do depósito)");
                        double valor = s.nextDouble();
                        cc.setSaldo(saldo+valor);
                    }
                    else if (respdep ==2){
                        continue;
                    }
                    
                }
                //
                //Poupança
                else if(resposta2 ==2){
                    cp = new ContaPoupanca();
                    int conta = cp.getConta();
                    if(cp.getConta() > 1){
                        cp.setConta((conta)+1);
                    }
                    else if(cp.getConta() <=0){
                        cp.setConta(1);
                        
                    }
                    bc.lst.add(cp);
                    
                   
                    System.out.println("---------------------");
                    System.out.println("Conta Poupança Criada");
                    System.out.println("---------------------");
                    //cp.MostrarDados();
                    System.out.println("Deseja realizar um depósito? \n-Sim (Digite o valor do depósito)"
                            + "\n2-Nāo");
                    double respdep = s.nextDouble();
                    double saldo = cp.getSaldo();
                    if (respdep !=0) {
                        cp.setSaldo(saldo+respdep);
                    }
                }
            }while(resposta2 !=1 && resposta2 !=2);
        break;
        
        case 2:
            System.out.println("------------------------------------------");
            System.out.println(">>DELETAR CONTA<<");
            System.out.println("Qual conta deseja deletar?\n");
            resposta2 = s.nextInt();
            bc.remover(resposta);
           
        break;
        case 3:
            System.out.println("Digite o numero da conta que deseja localizar\n");
            int loc = s.nextInt();
            bc.procurar(loc);
            break;
        case 4:
            bc.MostrarDados();
            break;
            
          

        default: loop = 10;
    }
}

    }
    
}
