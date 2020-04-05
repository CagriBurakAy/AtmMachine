package Atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner scanner=new Scanner(System.in);
	DecimalFormat money_Format=new DecimalFormat("'$'###,##0.00");
	private int customerID;
	private int password;
	private double savingBalance;
	private double checkBalance;
	public int setPassword(int password) {
		// TODO Auto-generated method stub
		this.password=password;
		return password;
	}
	public int setIDNumber(int customerID) {
		// TODO Auto-generated method stub
		this.customerID=customerID;
		return customerID;
	}
	public int getIDNumber() {
		return customerID;
	}
	public int getPassword() {
		return password;
	}
	public double getSavingBalance() {
		// TODO Auto-generated method stub
		return savingBalance;
	}
	public double getCheckBalance() {
		// TODO Auto-generated method stub
		return checkBalance;
	}
	public double calcCheckWithdraw(double amount) {
		checkBalance=checkBalance-amount;
		return checkBalance;
	}
	public double calcSaveWithdraw(double amount) {
		savingBalance=savingBalance-amount;
		return savingBalance;
	}
	public double calcCheckDeposit(double amount) {
		checkBalance=checkBalance+amount;
		return checkBalance;
	}
	public double calcSaveDeposit(double amount) {
		savingBalance=savingBalance+amount;
		return savingBalance;
	}
	public void getCheckWithdraw() {
		System.out.println("Checking Account Balance:"+money_Format.format(checkBalance));
		System.out.print("Amount you want to withdraw from checking account:");
		double amount=scanner.nextDouble();
		if (checkBalance-amount>=0) {
			calcCheckWithdraw(amount);
			System.out.println("Checking Account Balance:"+money_Format.format(checkBalance));
		}else {
			System.out.println("Negative value!/n");
		}
	}
	public void getSaveWithdraw() {
		System.out.println("Saving Account Balance:"+money_Format.format(savingBalance));
		System.out.print("Amount you want to withdraw from saving account:");
		double amount=scanner.nextDouble();
		if (savingBalance-amount>=0) {
			calcSaveWithdraw(amount);
			System.out.println("Saving Account Balance:"+money_Format.format(savingBalance));
		}else {
			System.out.println("Negative value!/n");
		}
	}
	public void getCheckDeposit() {
		System.out.println("Checking Account Balance:"+money_Format.format(checkBalance));
		System.out.print("Amount you want to deposit from checking account:");
		double amount=scanner.nextDouble();
		if (checkBalance+amount>=0) {
			calcCheckDeposit(amount);
			System.out.println("New checking Account Balance:"+money_Format.format(checkBalance));
		}else {
			System.out.println("Negative value!/n");
		}
	}
	public void getSaveDeposit() {
		System.out.println("Saving Account Balance:"+money_Format.format(savingBalance));
		System.out.print("Amount you want to deposit from saving account:");
		double amount=scanner.nextDouble();
		if (checkBalance+amount>=0) {
			calcCheckDeposit(amount);
			System.out.println("New saving Account Balance:"+money_Format.format(savingBalance));
		}else {
			System.out.println("Negative value!/n");
		}
	}
}
