public abstract class Conta {

    private String agencia;
    private String titular;
    private String numero;
    private double saldo;

    public Conta(String agencia, String titular, String numero, double saldo) {
        this.agencia = agencia;
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor){
        saldo = saldo - valor;
    }

    public void exibirSaldo(){
        System.out.println("Saldo: " + saldo);;
    }

    public abstract double calcularTarifaMensal();

}

