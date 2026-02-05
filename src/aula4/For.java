package aula4;

public class For {
    
    static void main(){

        // 1ª inicia a variável
        // 2ª condição
        // 3ª alteração a variável
        for (int i = 1; i <= 10; i += 2) {
            IO.println("O valor de i é: " + i);
        }
        for (int i = 0; i < 10; i++) {
            IO.println("O valor de i é: " + i++);
        }
        // mostrar todos os números impares de 1 a 10
        // mostrar todos os números pares de 1 a 10
    }
}
