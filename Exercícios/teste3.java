package Exercícios;

import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class teste3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Map<String, Double> alturaMap = new HashMap<>();
        Map<String, String> sexoMap = new HashMap<>();
        int quantidadeHomens = 0;
        int quantidadeMulheres = 0;


        for (int i = 1; i <= 10; i++) {
            System.out.println("Insira a altura da pessoa " + i + " (em metros):");
            double altura = scn.nextDouble();

            String sexo;
            while (true) {
                System.out.println("Insira o sexo da pessoa " + i + ". (m/f)");
                sexo = scn.next();
                if (sexo.equals("m") || sexo.equals("M")) {
                    quantidadeHomens = quantidadeHomens+ 1 ;
                    break;
                } else if (sexo.equals("f") || sexo.equals("F")) {
                    quantidadeMulheres = quantidadeMulheres + 1;
                    break;
                } else {
                    System.out.println("Insira um sexo válido (m/f)");
                }
            }

            alturaMap.put("Pessoa" + i, altura);
            sexoMap.put("Pessoa" + i, sexo);
        }

        double somaAlturaHomens = 0;
        double somaAlturaMulheres = 0;

        for (Map.Entry<String, Double> entry : alturaMap.entrySet()) {
            if (sexoMap.get(entry.getKey()).equals("m")||sexoMap.get(entry.getKey()).equals("M")) {
                somaAlturaHomens += entry.getValue();
            }
        }

        for (Map.Entry<String, Double> entry : alturaMap.entrySet()) {
            if (sexoMap.get(entry.getKey()).equals("f")||sexoMap.get(entry.getKey()).equals("F")) {
                somaAlturaMulheres += entry.getValue();
            }
        }


        double mediaAlturaHomens = somaAlturaHomens / quantidadeHomens;
        double mediaAlturaMulheres = somaAlturaMulheres / quantidadeMulheres;

        Double maiorAltura = Collections.max(alturaMap.values());
        Double menorAltura = Collections.min(alturaMap.values());

        System.out.println("Maior altura do grupo: " + maiorAltura + " metros");
        System.out.println("Menor altura do grupo: " + menorAltura + " metros");

        System.out.println("Média de altura dos homens: " + mediaAlturaHomens + " metros");
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres + " metros");

        System.out.println("Número total de mulheres: " + quantidadeMulheres);
        System.out.println("Número total de homens: " + quantidadeHomens);
    }
}
