package com.company;

import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args) {

    Account account1 = new Account(50.00);
    Account account2 = new Account(-7.53);

        System.out.printf( "account1 balance: $ %.2f \n",
                account1.getBalance() );
        System.out.printf("account2 balance : $%.2f \n",account2.getBalance());

        Scanner input = new Scanner(System.in);
         double depositAmount;

        System.out.print("Enter the deposit Amount for account1:");
        depositAmount = input.nextDouble();


        System.out.printf( "\n adding %.2f to account1 balance\n\n",
                depositAmount );
        account1.credit( depositAmount );

        System.out.printf("account1 balance: %.2f \n",account1.getBalance());


        System.out.printf("account2 balance : %.2f \n",account2.getBalance());

        System.out.printf("Enter the deposit amount for account 2:");
        depositAmount =input.nextDouble();

        System.out.printf("\n adding %.2f to account 2 balance \n\n",depositAmount);
        account2.credit(depositAmount);
        System.out.printf( "account1 balance: $ %.2f \n",
                account1.getBalance() );
        System.out.printf( "account2 balance: $ %.2f \n",
                account2.getBalance() );
    }




}

