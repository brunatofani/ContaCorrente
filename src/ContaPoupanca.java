public class ContaPoupanca extends Conta {

    private static int SEQ = 1;
    
    public void ContaPoupanca() {
        super.numero = SEQ++;
    }
}