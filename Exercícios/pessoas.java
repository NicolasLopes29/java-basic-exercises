package Exercícios;

import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class pessoas {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Map<String, Double> alturaMap = new HashMap<>();
        Map<String, String> sexoMap = new HashMap<>();
        int quantidadeHomens = 0;
        int quantidadeMulheres = 0;


        for (int i = 1; i <= 10; i++) {
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura da pessoa " + i + " (em metros):"));

            String sexo;
            while (true) {
                sexo = JOptionPane.showInputDialog("Insira o sexo da pessoa " + i + ". (m/f)").toLowerCase();
                if (sexo.equals("m")) {
                    quantidadeHomens++;
                    break;
                } else if (sexo.equals("f")) {
                    quantidadeMulheres++;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Insira um sexo válido (m/f)");
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
