import java.awt.*;

public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setNome("Eduardo");
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);



        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.depositar(100);
        cc.transferir(50,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
