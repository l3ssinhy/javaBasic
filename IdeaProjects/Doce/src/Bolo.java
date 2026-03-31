public class Bolo extends Doce{

    public Bolo(){

    }

    public Bolo(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void coberturaMassa() {
        super.coberturaMassa();
        IO.println("Merengue e amanteigada");
    }
}
