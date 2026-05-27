package exemplos.conta;

public class App {

    void main(){
        ContaBancaria conta1 = new ContaBancaria();
        conta1.saldo = 10; // Por que não estou conseguindo acessar diretamente o atributo saldo de conta??

        ContaBancaria conta2 = new ContaBancaria();
        conta2.saldo = -99;

        System.out.println("Conta1.saldo: " + conta1.saldo);
        System.out.println("Conta2.saldo: " + conta2.saldo);
    }
}