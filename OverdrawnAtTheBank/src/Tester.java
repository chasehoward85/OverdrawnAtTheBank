import java.util.Scanner;
import java.io.*;
import java.util.*;


public class Tester {

	public static void main(String[] args) {
		
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Enter your account name: ");
		String acctName = kbReader.nextLine();
		System.out.println("Enter your deposit: ");
		double balance = kbReader.nextDouble();
		
		BankAccount b1 = new BankAccount(balance, acctName);
		b1.balance = 1000;
		b1.Deposit(505.22);
		System.out.println(b1.balance);
		b1.Withdraw(100.0);
		
		System.out.println("Your balance is: " + b1.balance);
			
		

	}

}
