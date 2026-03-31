public class Torta extends Doce{

    public Torta() {

    }

    public Torta(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void coberturaMassa() {
        super.coberturaMassa();
        IO.println("Massa de biscoito e ganache");
    }
}
