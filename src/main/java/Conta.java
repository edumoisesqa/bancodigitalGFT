public  abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL =1;


    protected int agencia;
    protected int conta;
    protected double saldo;

    public void  sacar(){

    }
    public void depositar(){

    }

    public void transferir(){

    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void trasferir(double valor, Conta contaDestino) {

    }
}
