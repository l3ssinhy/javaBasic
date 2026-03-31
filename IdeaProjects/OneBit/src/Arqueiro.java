public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome, 100, 20, 20);
    }

    public void disparoPreciso(Personagem alvo) {
        if (getVida() <= 0) {
            IO.println(getName() + " --- Morto --- ");
        } else {
            int dano = getAtaque() * 2;
            IO.println(getName() + " usou Grand Rey Cero causando " + dano + " de dano");
            receberDano(dano);
        }
    }
}