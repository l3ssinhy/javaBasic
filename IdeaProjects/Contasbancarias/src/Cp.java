public class Cp extends Conta {

    public Cp(String agencia, String titular, String numero, double saldo) {
        super(agencia, titular, numero, saldo);
    }

    @Override
    public double calcularTarifaMensal() {
        return 0;
    }

}
