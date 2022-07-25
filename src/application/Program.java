package application;

import entities.Account;
import entities.AccountHolder;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        System.out.print("Name: ");
        String name = s.nextLine();
        System.out.print("Cpf: ");
        String cpf = s.nextLine();
        System.out.print("Profession: ");
        String profession = s.nextLine();
        System.out.print("Agency: ");
        Integer agency = s.nextInt();
        System.out.print("Number: ");
        Integer number = s.nextInt();
        System.out.print("Balance: ");
        double balance = s.nextDouble();

        AccountHolder holder = new AccountHolder();
        holder.setName(name);
        holder.setCpf(cpf);
        holder.setProfession(profession);

        Account account = new Account(agency, number);
        account.setAgency(agency);
        account.setNumber(number);
        account.setBalance(balance);
        account.setHolder(holder);

        System.out.println(account.getHolder().getName());
        System.out.println(account.getAgency());
        System.out.println(account.getNumber());
        System.out.printf("R$ %.2f", account.getBalance());


    }
}
