package aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array { // Crie outra classe
    // solicitar entrada um número qualquer
    // e depois mostrar
    static void main() {

          List<Integer> numeros = new ArrayList();
          numeros.add(5);
          numeros.add(2);
          numeros.add(3);
// utilize o forEach para imprimir os numeros impares e pares


          for (int num : numeros) {
              IO.println(num);
          }

//        Scanner teclado = new Scanner(System.in);
//        List<Integer> numeros = new ArrayList();
//        IO.println("Digite um número");
//        int num = teclado.nextInt();
//        numeros.add(num);
//        IO.println(numeros);

//        List<String> nomes = new ArrayList();
//        nomes.add("Osasco");
//        nomes.add("Perneta");
//        nomes.add("Careca");
//        IO.println(nomes);
//        IO.println(nomes.get(0));
    }
}
