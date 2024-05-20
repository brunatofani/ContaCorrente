public class Main {
    
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(50);
        cp.depositar(90);

        cc.sacar(10);
        cp.sacar(30);

        cc.transferir(20, cp);

        cc.imprimirInformacaoConta();
        cc.imprimirSaldo();

        cp.imprimirInformacaoConta();
        cp.imprimirSaldo();
    }
}
