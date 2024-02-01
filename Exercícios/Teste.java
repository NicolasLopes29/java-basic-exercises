package Exercícios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

          /*
    Tem-se o conjunto de dados contendo a altura e o sexo de 10 pessoas.
    Os dados deverão ser informados via teclado.

    Elabore um programa que calcule e imprima:

    a)a maior e a menor altura do grupo
    b)a média das altura dos homens
    c)o número total de mulheres
     */

        Scanner scn = new Scanner(System.in);

        Map<String, Float> alturaMap = new HashMap<>();
        Map<String, String> sexoMap = new HashMap<>();

        int quantidadeHomens = 0;
        int quantidadeMulheres = 0;
        float maiorAltura = 0;
        float menorAltura = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Insira a altura da pessoa " + i + ".");
            float altura = scn.nextFloat();

            System.out.println("Insira o sexo da pessoa " + i + ". (m/f)");
            String sexo = scn.next();

            if (sexo=="m") {
                quantidadeHomens = quantidadeHomens + 1;
            } else if (sexo=="f"){
                quantidadeMulheres = quantidadeMulheres + 1;
            } else {
                System.out.println("Insira um sexo válido.");
            }

            alturaMap.put("Pessoa" + i, altura);
            sexoMap.put("Pessoa" + i, sexo);
        }


        for (int i = 1; i <= 10; i++) {


            Float alturaPessoa1 = alturaMap.get("Pessoa1");
            System.out.println("Altura da primeira pessoa: " + alturaPessoa1);

            String sexoPessoa1 = sexoMap.get("Pessoa1");
            System.out.println("Sexo da primeira pessoa: " + sexoPessoa1);

            Float alturaPessoa2 = alturaMap.get("Pessoa2");
            System.out.println("Altura da segunda pessoa: " + alturaPessoa2);

            String sexoPessoa2 = sexoMap.get("Pessoa2");
            System.out.println("Sexo da segunda pessoa: " + sexoPessoa2);

            Float alturaPessoa3 = alturaMap.get("Pessoa3");
            System.out.println("Altura da terceira pessoa: " + alturaPessoa3);

            String sexoPessoa3 = sexoMap.get("Pessoa3");
            System.out.println("Sexo da terceira pessoa: " + sexoPessoa3);

            Float alturaPessoa4 = alturaMap.get("Pessoa4");
            System.out.println("Altura da quarta pessoa: " + alturaPessoa4);

            String sexoPessoa4 = sexoMap.get("Pessoa4");
            System.out.println("Sexo da quarta pessoa: " + sexoPessoa4);

            Float alturaPessoa5 = alturaMap.get("Pessoa5");
            System.out.println("Altura da quinta pessoa: " + alturaPessoa5);

            String sexoPessoa5 = sexoMap.get("Pessoa5");
            System.out.println("Sexo da quinta pessoa: " + sexoPessoa5);

            Float alturaPessoa6 = alturaMap.get("Pessoa6");
            System.out.println("Altura da sexta pessoa: " + alturaPessoa6);

            String sexoPessoa6 = sexoMap.get("Pessoa6");
            System.out.println("Sexo da sexta pessoa: " + sexoPessoa6);

            Float alturaPessoa7 = alturaMap.get("Pessoa7");
            System.out.println("Altura da sétima pessoa: " + alturaPessoa7);

            String sexoPessoa7 = sexoMap.get("Pessoa7");
            System.out.println("Sexo da sétima pessoa: " + sexoPessoa7);

            Float alturaPessoa8 = alturaMap.get("Pessoa8");
            System.out.println("Altura da oitava pessoa: " + alturaPessoa8);

            String sexoPessoa8 = sexoMap.get("Pessoa8");
            System.out.println("Sexo da oitava pessoa: " + sexoPessoa8);

            Float alturaPessoa9 = alturaMap.get("Pessoa9");
            System.out.println("Altura da nona pessoa: " + alturaPessoa9);

            String sexoPessoa9 = sexoMap.get("Pessoa9");
            System.out.println("Sexo da nona pessoa: " + sexoPessoa9);

            Float alturaPessoa10 = alturaMap.get("Pessoa10");
            System.out.println("Altura da décima pessoa: " + alturaPessoa10);

            String sexoPessoa10 = sexoMap.get("Pessoa10");
            System.out.println("Sexo da décima pessoa: " + sexoPessoa10);

            System.out.println("Quantidade de mulheres: " + quantidadeMulheres);
            System.out.println("Quantidade de homens: " + quantidadeHomens);

            System.out.println(sexoMap);
            System.out.println(alturaMap);
        }
    }
}
