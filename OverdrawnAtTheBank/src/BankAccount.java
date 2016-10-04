import java.io.*;
import java.util.*;

public class BankAccount {
	public double balance;
	public String name;
	
	
	public BankAccount(double b, String n){
		balance = b;
		name = n;
	}
	
	public void Deposit(double d){
	
		balance += d;
	}
	
	public void Withdraw(double wd){
	
		balance -= wd;
	}
}
