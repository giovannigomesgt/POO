
import java.util.Scanner;


public class Desativado {
    /*
    public static void main(String[] args) throws Exception{
    Scanner entradadedados = new Scanner(System.in);
    char opcao2='a';
    int opcao = 50,tipoconta,numeroconta=1,conta;
    ContaPoupanca np;
    ContaCorrente nc;
    Banco nplst;
    nplst = new Banco();
    ContaBancaria aux;
    
    
    while(opcao!=99){
    
    switch(opcao){
    case 50:
    System.out.println("MENU\nDigite o Número Correspondente a Operação Desejada: \n"
    + "1- Criar Conta.\n2- Selecionar Conta.\n3- Remover Conta.\n"
    + "4- Gerar Relatório.\n5- Finalizar.");
    opcao = entradadedados.nextInt();
    break;
    
    case 1:
    System.out.print("Digite o número 1 para poupança ou 2 para conta corrente: ");
    tipoconta = entradadedados.nextInt();
    if(tipoconta == 1){
    
    np = new ContaPoupanca();
    np.setConta(numeroconta);
    System.out.println("Deseja efetuar um deposito?\nCaso não deseje digite 0, ou o valor que deseja depositar: ");
    np.depositar(entradadedados.nextDouble());
    nplst.inserir(np);
    numeroconta++;
    np = null;
    //nplst = null;
    //nplst = new Banco();
    opcao = 50;
    break;
    
    
    }
    if(tipoconta == 2){
    
    nc = new ContaCorrente();
    nc.setConta(numeroconta);
    System.out.println("Deseja efetuar um deposito?\nCaso não deseje digite 0, ou o valor que deseja depositar: ");
    nc.depositar(entradadedados.nextDouble());
    nplst.inserir(nc);
    numeroconta++;
    nc = null;
    //nplst = null;
    //nplst = new Banco();
    opcao = 50;
    break;
    }
    else {
    System.out.println("\nOperação Reiniciada Digite um tipo de conta válida.");
    opcao = 50;
    break;
    }
    case 2:
    System.out.print("Digite o número da conta: ");
    System.out.println();
    conta = entradadedados.nextInt();
    if(nplst.procurar(conta) == null){
    System.out.println("Conta Inexistente.");
    opcao = 50;
    break;
    }
    else{
    
    
    while(opcao2 != 'z'){
    System.out.println("Digite a letra minuscula correspondente a opção desejada.\n"
    + "a. Depositar: recebe um valor e deposita na conta.\n"
    + "b. Sacar: recebe um valor e tenta sacar da conta.\n"
    + "c. Transferir: recebe um valor e o número de outra conta. Caso a conta exista, transfere o valor de uma conta para a outra.\n"
    + "d. Gerar relatório: Mostra os dados da conta selecionada."
    + "e. Retornar ao menu anterior.\n");
    opcao2 = (char)System.in.read();
    switch(opcao2){
    case 'a':
    
    aux = nplst.procurar(conta);
    aux.depositar(entradadedados.nextDouble());
    break;
    case 'b':
    aux = nplst.procurar(conta);
    aux.sacar(entradadedados.nextDouble());
    break;
    case 'c':
    aux = nplst.procurar(conta);
    double valortrans = entradadedados.nextDouble();
    int contadest = entradadedados.nextInt();
    ContaBancaria auxdest;
    auxdest = nplst.procurar(contadest);
    if(auxdest == null){
    System.out.println("Conta de destino não localizada.");
    break;
    }
    aux.Transferir(valortrans, auxdest);
    case 'd':
    aux = nplst.procurar(conta);
    //nplst.MostrarDados(aux);
    break;
    case 'e':
    opcao2 = 'z';
    opcao = 50;
    break;
    }
    }
    }
    case 5:
    opcao = 99;
    break;
    
    
    }
    
    
    
    }
    }
    */
}
