package org.example;

import java.util.Scanner;
import org.example.entity.Conta;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        Conta minha_conta = new Conta(100.00, "Berenice da Silva");

        do {
            minha_conta.bonus();
            System.out.printf("Olá " + minha_conta.getNome_completo() + "!!\n" +
                    "[+] Sistema de conta bancária [+] \n" +
                    "\t Escolha uma opção: \n" +
                    "1 - Sacar \n" +
                    "2 - Depositar \n" +
                    "3 - Exibir Saldo \n" +
                    "4 - Investir \n ");
            escolha = scanner.nextInt();

            switch(escolha){
                case 1:
                    System.out.println("Insira o valor que deseja SACAR: \n");
                    minha_conta.resgatarSaldo(scanner.nextFloat());
                    break;
                case 2:
                    System.out.println("Insira o valor que deseja DEPOSITAR: \n");
                    minha_conta.depositarSaldo(scanner.nextFloat());
                    break;
                case 3:
                    minha_conta.exibirSaldo();
                    break;
                case 4:
                    System.out.println("Insira o valor que deseja INVESTIR: \n");
                    minha_conta.investirSaldo(scanner.nextFloat());
                    break;

                default:
                    System.out.println("Opção inválida!");

            }

        }while(1==1);


    }
}