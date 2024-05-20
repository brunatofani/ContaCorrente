

public abstract class Conta implements IConta {

    private int agencia;
    protected int numero;
    private double saldo;

    private static int AGENCIA_DEFAULT = 1;
    private static int SEQ = 1;
    
    public Conta() {
        this.agencia = AGENCIA_DEFAULT;
        this.numero = SEQ++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("Saldo: "+ this.getSaldo());
    }

    @Override
    public void imprimirInformacaoConta() {
        System.out.println("Agencia: "+ this.getAgencia());
        System.out.println("Numero: "+ this.getNumero()); 
    }

    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}