
import java.util.Scanner;

public class EntradaDeDados {
    //static void main() {

    //Scanner sc = new Scanner(System.in);

    //String nome = sc.next();

    //IO.println(nome);

    //}


//Exemplo:

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.next();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Seu nome: " + nome);
        System.out.println("Seu idade: " + idade);
        System.out.println("Seu peso: " + peso);
        System.out.println("Seu altura: " + altura);

        System.out.println("O seu IMC é: " + (peso / (altura * altura)));

    }
}