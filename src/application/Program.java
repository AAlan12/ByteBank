package application;

import entities.accountSystem.*;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        /*
        System.out.print("Name: ");
        String name = s.nextLine();
        System.out.print("Cpf: ");
        String cpf = s.nextLine();
        System.out.print("Profession: ");
        String profession = s.nextLine();
        System.out.print("Agency: ");
        int agency = s.nextInt();
        System.out.print("Number: ");
        int number = s.nextInt();
        System.out.print("Balance: ");
        double balance = s.nextDouble();

        AccountHolder holder = new AccountHolder();
        holder.setName(name);
        holder.setCpf(cpf);
        holder.setProfession(profession);

        Account account = new CheckingAccount(agency, number);
        account.setAgency(agency);
        account.setNumber(number);
        account.setBalance(balance);
        account.setHolder(holder);

        System.out.println(account.getHolder().getName());
        System.out.println(account.getAgency());
        System.out.println(account.getNumber());
        System.out.printf("R$ %.2f", account.getBalance());

         */

        /*
        CheckingAccount ca = new CheckingAccount(111, 111);
		ca.deposit(100.0);

		SavingsAccount sa = new SavingsAccount(222, 222);
		sa.deposit(200.0);

		ca.transfer(10.0, sa);

		System.out.printf("CC: R$%.2f%n", ca.getBalance());
		System.out.printf("CP: R$%.2f", sa.getBalance());


         */



    /*
        CheckingAccount ca = new CheckingAccount(222, 333);
		ca.deposit(100.0);

		LifeInsurance lifeInsurance = new LifeInsurance();

		TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.register(ca);
        taxCalculator.register(lifeInsurance);

		System.out.printf("R$%.2f",taxCalculator.getTotaltax());

     */



    }
}
