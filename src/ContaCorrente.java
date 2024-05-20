public class ContaCorrente extends Conta {


    private static int SEQ = 500;
    
    public void ContaCorrente() {
        super.numero = SEQ++;
    }
}
