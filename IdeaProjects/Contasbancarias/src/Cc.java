public class Cc extends Conta {

    public Cc(String agencia, String titular, String numero, double saldo) {
        super(agencia, titular, numero, saldo);
    }

    @Override
    public double calcularTarifaMensal() {
        return 12;
    }

}
