public abstract class Personagem {

    private String name;
    private int vida;
    private int ataque;
    private int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.name = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

}
