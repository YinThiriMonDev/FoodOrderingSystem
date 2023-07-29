package foodorderingservicesystem;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ListIterator;
public class Menu implements Category1 {
	ArrayList<Item>ao;
	ArrayList<Item>ai= new ArrayList<Item>();
	Scanner sc=new Scanner(System.in);
		public static void main(String[]args) {
		Menu mn= new Menu();
		mn.welcome();
}
		
		@Override
		public void welcome() {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("=================================");
			System.out.println("Welcome from food ordering system");
			System.out.println("=================================");
			System.out.println("1. Displaying menu");
			System.out.println("2. Selecting an item from the menu");
			System.out.println("3. Adding an item to their current order");
			System.out.println("4. Reviewing their current order");
			System.out.println("5. Removing all items from their current order");
			System.out.println("6. Producing payment details on screen");
			System.out.println("7. Exit from the system");
			char ch= 'y';
			while(ch=='y') {
			System.out.println("Choose options");
			int option=sc.nextInt();
			switch(option) {
			case 1: menu(); break;
			case 2: select(); break;
			case 3: add(); break;
			case 4: review(); break;
			case 5: remove(); break;
			case 6: produce(); break;
			case 7: exit(); break;
			default: System.out.println("Invalid input number ");
			}
			System.out.println("Do you want to continue? y/n ");
			ch= sc.next().charAt(0);
			}
			if(repeat())
			welcome();
			else exit();
	}
	

		private boolean repeat() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Do another yes/no");
			String status=sc.next();
			if(status.equals("yes"))
				return true;
			else return false;
		}

	

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("**This is Oriental House's menu list**");
		System.out.println("==========================================");
		Category cg=new Category();
		cg.Category();			
		item();
		

	}
	public void item() {
		System.out.println("Choose one option");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch(option) {
			case 1: Dimsum(); break;
			case 2: Drinks();break;
			default: System.out.println("Invalid number");
		}
			
		}
		
		public void Dimsum() {
			// TODO Auto-generated method stub
			ao= new ArrayList<Item>();
			System.out.println("These are items of dimsum:");
			System.out.println("No"+"\t"+"Dimsum"+"\t"+"\t"+"\t"+"\t"+"\t"+"Price");
			ao.add(new Item(1, "Shrimp Noodle Rolls",1000));
			ao.add(new Item(2,"Steamed Pork Dumplings",1000));
			ao.add(new Item(3,"Steamed Chicken Feet",3000));
			ao.add(new Item(4,"Scallop Dumpling with Prawn & Crab Roe",3000));
			ao.add(new Item(5,"Four Coloured Roll with white sauce",3000));
			ao.add(new Item(6,"Sticky Rice in Lotus Leaf",3000));
			ao.add(new Item(7,"Prawn Dumpling with Chinese Chives",3000));
			ao.add(new Item(8,"Charcoal Custard Bun",3000));
			ao.add(new Item(9,"BBQ Pork Bun",3000));
			ao.add(new Item(10,"Salted Egg Bun",3000));
			ao.add(new Item(11,"Mushroom Bun with chicken",3000));
			ao.add(new Item(12,"Steamed Pork Feet",3000));
			ao.add(new Item(13,"Glutinous Rice Ball with Pork",3000));
			ao.add(new Item(14,"Prawn Century Egg with Oyster Sauce",3000));
			for(Item Dimsum: ao) {
			System.out.println(Dimsum.getItemid() + "\t" + Dimsum.getItemname()+ "\t" +Dimsum.getItemprice());
			}
			}
			
		
		public void Drinks() {
		// TODO Auto-generated method stub
			//ArrayList<Item>as= new ArrayList<Item>();
			ao= new ArrayList<Item>();
			System.out.println("These are items of drinks:");
			ao.add(new Item(4,"Watermelon Frappe Drink", 1500));
			ao.add(new Item(5,"Pineapple cold drink",2000));
			ao.add(new Item(6,"Snow cone milky foam",3000));
			for(Item Drinks: ao) {
			System.out.println(Drinks.getItemid()+ "\t"+ Drinks.getItemname()+ "\t" + Drinks.getItemprice());
		}
		}
	@Override
	public void select() {
		// TODO Auto-generated method stub
		Menu m = new Menu();
		m.menu();
		System.out.println("Choose your items");
		Scanner sc=new Scanner(System.in);
		String oo=sc.nextLine();
		for (Item item:m.ao)
		{
			if(item.getItemname().compareTo(oo)==0) {
				System.out.println("You have selected " + item.getItemname());
				
			}
		}

	}


	@Override
	public void add() {
		// TODO Auto-generated method stub
		Menu m = new Menu();
		m.menu();
		
		boolean flag=false;
		
		System.out.println("Choose your items");
		Scanner sc=new Scanner(System.in);
		String oo=sc.nextLine();
		for (Item item:m.ao)
		{
			if(item.getItemname().compareTo(oo)==0) {
				System.out.println("You have added " + item.getItemname());
				ai.add(item);
				flag=true;
			}
			
			
		}
		if(!flag)
			System.out.println(oo+"is not availiable items.Try again!");
		
		
		if(add1())
			add();
		else welcome();
		
		

	}
	private boolean add1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add another item  yes/no");
		String status = sc.next();
		if(status.equals("yes"))
			return true;
		else return false;
	}

	@Override
	public void review() {
		// TODO Auto-generated method stub
		Item it=new Item();
		System.out.println("You have selected these orders:");
		Iterator <Item> ooo= ai.iterator();
		while(ooo.hasNext()) {
			Item item =ooo.next();
			System.out.println(item.getItemid()+"\t"+item.getItemname()+item.getItemprice());
		}
	

	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println("Enter Remove Item");
		String  re = sc.nextLine();
		for ( Item item : ai) {
			if (item.getItemname().compareTo(re)==0) {
				
				ai.remove(item);
				
				System.out.println(item.getItemname()+"is removed");
				
				break;
				
			}}

	}

	@Override
	public void produce() {
		// TODO Auto-generated method stub
		review();
		
		int totalprice=0;
		for (Item item: ai)
		{
			totalprice+=item.getItemprice();
						
		}
		
		
		System.out.println("the totalprice is"+totalprice);
		
	}
		
	

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		System.out.println("Thank you for using our food ordering system");
		System.exit(0);

	}
	
	




}

