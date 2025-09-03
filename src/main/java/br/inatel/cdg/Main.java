package br.inatel.cdg;

import br.inatel.Model.User;
import br.inatel.comand.Comand;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Comand comando = new Comand();

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite seu cpf: ");
        String cpf = input.nextLine();

        User user1 = new User(nome, cpf, 1);
        boolean success = comando.insertUser(user1);

        if (success) {
            System.out.println("Cadastro realizado com sucesso!");
        }
    }
}
