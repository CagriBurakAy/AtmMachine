package Atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account{
	Scanner scanner=new Scanner(System.in);
	DecimalFormat money_Format=new DecimalFormat("'$'###,##0.00");
	HashMap<Integer, Integer> info=new HashMap<Integer,Integer>();
	int selection;
	public void getLogin() throws IOException{
		try {
		info.put(9876543, 9876);
		info.put(8989898, 1890);
		System.out.println("Welcome!");
		System.out.print("Enter ID Number:");
		setIDNumber(scanner.nextInt());
		System.out.print("Enter password:");
		setPassword(scanner.nextInt());
		}
		catch (Exception e) {
			System.out.println("Invalid character");
			// TODO: handle exception
		}
		for (Entry<Integer,Integer> entry : info.entrySet()) {
			if (entry.getKey()==getIDNumber()&&entry.getValue()==getPassword()) {
				getAcountType();
			}
		}
		
	}
	private void getAcountType() {
		// TODO Auto-generated method stub
		System.out.println("Select:");
		System.out.println("Type 1-check");
		System.out.println("Type 2-save");
		System.out.println("Type 3-Exit");
		System.out.print("Choice:");
		 selection=scanner.nextInt();
		switch (selection) {
		case 1:
			getCheck();
			
			break;
		case 2:
			getSave();
			break;
		case 3:
			System.out.println("bye bye");
			break;
		default:
			System.out.println("Wrong number.");
			getAcountType();
		}
	}
	public void getCheck() {
		System.out.println("Select:");
		System.out.println("Type 1-View Balance");
		System.out.println("Type 2-Withdraw Funds");
		System.out.println("Type 3-Deposit Funds");
		System.out.println("Type 4-Exit");
		System.out.print("Choice:");
		selection=scanner.nextInt();
		switch (selection) {
		case 1:
			System.out.println("Balance"+money_Format.format(getCheckBalance()));
			getAcountType();
			break;
		case 2:
			getCheckWithdraw();
		getAcountType();
		break;
		case 3:
			getCheckDeposit();
			getAcountType();
			break;
		case 4:
			System.out.println("bye bye");
			break;
		default:
			System.out.println("Wrong!");
			getCheck();
		}
	}
	public void getSave() {
		System.out.println("Save:");
		System.out.println("Type 1-View Balance");
		System.out.println("Type 2-Withdraw Funds");
		System.out.println("Type 3-Deposit Funds");
		System.out.println("Type 4-Exit");
		System.out.print("Choice:");
		selection=scanner.nextInt();
		switch (selection) {
		case 1:
			System.out.println("Balance"+money_Format.format(getSavingBalance()));
			getAcountType();
			break;
		case 2:
			getSaveWithdraw();
		getAcountType();
		break;
		case 3:
			getSaveDeposit();
			getAcountType();
			break;
		case 4:
			System.out.println("bye bye");
			break;
		default:
			System.out.println("Wrong!");
			getSave();
		}
	}

}
