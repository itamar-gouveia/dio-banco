import java.util.Scanner;

public class Main {
    
    public static void menu(){
        

        System.out.println("Menu de opções");
        System.out.println("0. Finalizar");
        System.out.println("1. Incluir");
        System.out.println("2. Sacar");
        System.out.println("3. Transferir");
        System.out.println("4. Consultar");
        System.out.println("Opcao:");
    }

  
    
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca(); 

        int opcao,contaDest;
        double din;
        Scanner entrada = new Scanner(System.in);
       Scanner dinheiro = new Scanner(System.in);

        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                System.out.println("Informe o valor a ser depositado:");
                din = dinheiro.nextDouble();
                cc.depositar(din);
                break;
                
            case 2:
                System.out.println("Informe o valor a sacar:");
                din = dinheiro.nextDouble();
                cc.sacar(din);
                break;
                
            case 3:
                cc.imprimirExtrato();
                cp.imprimirExtrato();
                break;
            
            case 0:
                System.out.println("Encerrando Sistema.");
            }
        } while(opcao != 0);
    }
}





/*public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca(); 

        cc.depositar(1000);
        cc.transferir(25, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
*/