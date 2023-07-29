package foodorderingservicesystem;
import java.util.*;
import java.util.Scanner;
public class UserDemo {
		Scanner sc=new Scanner(System.in);
		public static void main(String[]args) {
			UserDemo ud= new UserDemo();
			ud.userloginMenu();
		}
		private void userloginMenu() {
	
		System.out.println("Welcome to Food Ordering Services");
		System.out.println("1.User Login \n 2. User Logout");
		System.out.println("Choose one option");
		int option= sc.nextInt();
		switch(option) {
		case 1: login();break;
		case 2: logout();break;
		default: System.out.println("Error option");	
		userloginMenu();
		}
		}
	
	
	private void login() {
		System.out.println("Login");
		System.out.println("Enter username");
		String userName=sc.next();
		System.out.println("Enter password ");
		String password=sc.next();
		
		if(userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123")) {
			adminmenu();
		}
		else if(userName.equalsIgnoreCase("user") && password.equalsIgnoreCase("456")) {
			usermenu();
		}
		
		else {
			System.out.println(" Your username and password are wrong");
		}
	}
	
		private void usermenu() {
			System.out.println("Here are options:\n 1. Displaying menu \n 2. Selecting items from menu\n 3.Adding the selected items \n 4.Viewing the total amount of order\n 5.Removing selected items\n 6.Displaying the total amount of order\n 7.Exit from the system");
			char ch='y';
			while(ch=='y') {
				System.out.println("Select one option");
				int option=sc.nextInt();
				switch(option) {
				case 1: System.out.println("Displaying menu");
						break;
				case 2: System.out.println("Selecting items from menu");
				        break;
				case 3: System.out.println("Adding the selected items");
						break;
				case 4: System.out.println("Viewing the total amount of order");
				        break;
				case 5: System.out.println("Removing selected items");
				        break;
				case 6: System.out.println("Displaying the total amount of order");
				        break;
				case 7: System.out.println("Exit from the system");
				        break;
				default:System.out.println("Invalid input number");
				
				}
				
				System.out.println("Do you want to continue? y/n ");
				ch= sc.next().charAt(0);
			}
				if(repeat())
				login();
				else logout();
		}
		
		private boolean repeat() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Do another yes/no");
			String status=sc.next();
			if(status.equals("yes"))
				return true;
			else return false;
		}
		
		private void adminmenu() {
			
			System.out.println();
		}
		
		
		public void logout() {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Do you want to logout? yes/no");
			String condition=sc.next();
			if(condition.equals("yes"))
				System.out.println("Logout successful");
			else if(condition.equals("no"))
				userloginMenu();
			else 
				System.out.println("Error");
			
			System.out.println("Thank you for using our food ordering system");
			System.exit(0);;

		}
	
	
	
	
	
	

}
