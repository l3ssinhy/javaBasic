//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Cc contaCorrente = new Cc("069", "Lucas Lessa", "67690", 300.00);

    Cp contaPoupanca = new Cp("061", "Lucas Lessa", "16932", 2000.00);

    Pj contaJuridica = new Pj("067", "Lucas Lessa", "87432", 5000.00);

    System.out.println("Conta Corrente (CC)");
    System.out.println("Nome: " + contaCorrente.getTitular());

    contaCorrente.depositar(200.00);
    contaCorrente.sacar(100.00);

    contaCorrente.exibirSaldo();
    System.out.println("Tarifa mensal fixa de: R$ " + contaCorrente.calcularTarifaMensal());

    System.out.println();

    System.out.println("Conta Poupança (CP)");
    System.out.println("Nome: " + contaPoupanca.getTitular());

    contaPoupanca.depositar(450.00);
    contaPoupanca.sacar(200.00);

    contaPoupanca.exibirSaldo();
    System.out.println("Tarifa mensal fixa de: R$ " + contaPoupanca.calcularTarifaMensal());

    System.out.println();

    System.out.println("Conta Pessoa Jurídica (PJ)");
    System.out.println("NOme: " + contaJuridica.getTitular());

    contaJuridica.depositar(500.00);
    contaJuridica.sacar(150.00);
    contaJuridica.exibirSaldo();

    System.out.println("Tarifa mensal fixa de: R$ " + contaJuridica.calcularTarifaMensal());

}
