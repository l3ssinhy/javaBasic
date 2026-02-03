package aula3;

public class IfElse {
//    static void main() {
//
//        int idade = 18;
//
//        if(idade < 18){
//            IO.println("Foi barrado na porta");
//        }else {
//            IO.println("Liberado");
//        }
//    }
//}

static void main(){

    int nota = 7;

    int nota2 = 3;

    int nota3 = 9;

    float media = (nota + nota2 + nota3) / 3;
    IO.println("Sua média é: " + media);

    if(media < 4){
        IO.println("Reprovado");
    }else if(media <= 6){
        IO.println("Recuperação");
    }else if(media > 6){
        IO.println("Aprovado");
    }else {
        IO.println("Digite corretamente sua nota");
    }
}
}







