public class Vaca extends Animal {

    public Vaca() {
        super();

    }

    public Vaca(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public void fazerSom() {
        super.fazerSom();
        IO.println("Muuuuh");
    }
}
