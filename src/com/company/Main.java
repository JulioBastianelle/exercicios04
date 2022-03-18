package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valorDoProduto = sanner.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        int quantidadeDoProduto = sanner.nextInt();

        boolean haDesconto = quantidadeDoProduto > 10;
        double subTotal = valorDoProduto * quantidadeDoProduto;

        if (haDesconto) {

            double desconto = (subTotal * 10) / 100;
            subTotal = subTotal - desconto;
            System.out.println("Você deverá pagar o valor de: " + subTotal + " reais.");
        }
        else{
            System.out.println("Sem desconto pois não atingiu a regra de 10 produtos, valor final de: " + subTotal);
        }
    }
}
