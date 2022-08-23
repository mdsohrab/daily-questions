package javacourse;

import java.util.Scanner;

public class BankAccount {
    static Scanner input = new Scanner(System.in);
    String name, Acc_Type;
    int accNo, bal, amt;


    BankAccount(String name, int accNo, String Acc_Type, int bal) {
        this.name = name;
        this.Acc_Type = Acc_Type;
        this.accNo = accNo;
        this.bal = bal;
    }

    int deposit() {
        System.out.println("ENTER AMOUNT TO DEPOSIT: ");
        amt = input.nextInt();
        if (amt < 0) {
            System.out.println("INVALID AMOUNT");
        }
        bal = bal + amt;
        return 0;
    }


    int withdraw() {
        System.out.println("ENTER AMOUNT TO WITHDRAW: ");
        amt = input.nextInt();
        if (bal < amt) {
            System.out.println("Not sufficient balance");
            return 1;
        }
        //if(0<amt){
        // System.out.println("Invalid amount balance");
        //return 1;
        //  }
        bal = bal - amt;
        return 0;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account no: " + accNo);
        System.out.println("Balance no: " + bal);
    }

    void dbal() {
        System.out.println("Balance: " + bal);
    }

    public static void main(String args[]) {
        System.out.println("Enter your Name: ");
        String nn = input.nextLine();
        System.out.println("Enter Account Number: ");
        int num = input.nextInt();
        System.out.println("Enter Account Type: ");
        String type = input.next();
        System.out.println("Enter Initial Balance: ");
        int bal = input.nextInt();
        BankAccount b1 = new BankAccount(nn, num, type, bal);
        int menu;
        System.out.println("Menu");
        System.out.println("1. Deposit Amount");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Display Information");
        System.out.println("4. Exit");
        boolean quit = false;
        do {
            System.out.print("Please enter your choice: ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    b1.deposit();
                    break;

                case 2:
                    b1.withdraw();
                    break;

                case 3:
                    b1.display();
                    break;

                case 4:
                    quit = true;
                    break;
            }
        } while (!quit);
    }

}




