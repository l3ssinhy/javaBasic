public class Pj extends Conta {

    public Pj(String agencia, String titular, String numero, double saldo) {
        super(agencia, titular, numero, saldo);
    }

    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo() - valor - 1.50);
    }

    @Override
    public double calcularTarifaMensal() {
        return 20;
    }

}
