public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 100, 45, 80);
    }

    public void golpePesado(Personagem alvo) {
        if (getVida() <= 0) {
            IO.println(getName() + " --- Num é imortal não poh--- ");
        } else {
            int dano = getAtaque() * 2;
            IO.println(getName() + " usou Salto da Espada causando " + dano + " de dano!");
            receberDano(dano);
        }
    }
}

