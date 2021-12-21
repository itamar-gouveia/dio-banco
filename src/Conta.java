public abstract class Conta implements IConta{
    protected int agencia;
    protected int numero;
    protected double saldo;


    public int getAgencia(){
        return agencia;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -=valor;
        
    }

    @Override
    public void depositar(double valor) {
        saldo+=valor;
        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }

    protected void imprimirDados(){
        System.out.println(String.format("Agencia %d", this.agencia));
        System.out.println(String.format("Conta %d", this.numero));
        System.out.println(String.format("Saldo %.2f", this.saldo));
    }

    
}
