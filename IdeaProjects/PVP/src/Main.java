//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Personagem davyJones = new Personagem() {
        @Override
        public void ataque(int ataque) {
            ataque = ataque * 3;
        }
        @Override
        public void defesa(int defesa) {
            defesa = 30;
        }
        @Override
        public void receberDano(int receberDano, int ataque, int vida) {
            receberDano = ataque - vida;
        }
    };

    Personagem bullseeye = new Personagem() {
        @Override
        public void ataque(int ataque) {
            ataque = ataque * 2;
        }
        @Override
        public void defesa(int defesa) {
            defesa = 45;
        }
        @Override
        public void receberDano(int receberDano, int ataque, int vida) {
            receberDano = ataque - vida;

        }
    };

    Personagem tarnished = new Personagem() {
        @Override
        public void ataque(int ataque) {
            ataque = ataque * 2;
        }
        @Override
        public void defesa(int defesa) {
            defesa = 65;
        }
        @Override
        public void receberDano(int receberDano, int ataque, int vida) {
            receberDano = ataque - vida;

        }
    };
}
