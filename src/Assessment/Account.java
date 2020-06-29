package Assessment;
import java.util.Scanner;




public class Account implements Comparable<Account> {
Scanner scanner;
private  String account_Number,name,password,phone ;
Double balance;
Account(){
	scanner= new Scanner(System.in);
}

public String getAccount_number() {
	return account_Number;
}

public void setAccount_number(String account_number) {
	this.account_Number = account_number;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public Double getBalance() {
	return balance;
}

public void setBalance(Double balance) {
	this.balance = balance;
}

Account(String account_number ,String name ,String password, String phone ,double balance){
	this.account_Number=account_number;
	this.name=name;
	this.password=password;
	this.phone=phone;
	this.balance=balance;
}

void takeAccountDetailsFromUser() {
	System.out.println("Enter the Account Number");
	account_Number=scanner.nextLine();
	System.out.println("Enter the Account Name");
	name=scanner.nextLine();
	System.out.println("Enter the password");
	password=scanner.nextLine();
	System.out.println("Enter the Account phone");
	phone=scanner.nextLine();
	System.out.println("Enter the Account Balance");
	balance=scanner.nextDouble();

}

@Override
public String toString() {
	String data = "Account Number is  : "+account_Number.replaceAll("\\d(?=\\d{2})", "*")+
			"\nAccount name is :"+name+
			"\npassword is ********"+
			"\nAccount phone no is :"+phone+
			"\n Balance is "+balance;
	return data;
}


@Override
public int compareTo(Account o) {
	// TODO Auto-generated method stub
	return this.getName().compareTo(o.getName());
}

	
}