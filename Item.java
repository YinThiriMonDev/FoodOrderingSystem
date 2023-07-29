package foodorderingservicesystem;
import java.util.*;
public class Item implements Comparable<Item>{
	int itemid;
    String itemname;
    int itemprice;
	private Category category;
//	ArrayList<Item>ao= new ArrayList<Item>();

	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(Category category) {
		super();
		this.category = category;
	}
	

	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}

	public Item(int itemid, String itemname, int itemprice) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.itemprice = itemprice;
	}

	
	public int getItemid() {
		return itemid;
	}


	public void setItemid(int itemid) {
		this.itemid = itemid;
	}


	public String getItemname() {
		return itemname;
	}


	public void setItemname(String itemname) {
		this.itemname = itemname;
	}


	public int getItemprice() {
		return itemprice;
	}


	public void setItemprice(int itemprice) {
		this.itemprice = itemprice;
	}
	
		
		public int compareTo(Item item) {
			// TODO Auto-generated method stub
			return itemname.compareTo(item.getItemname());
		}

//		public static Iterator<String> iterator() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//	
		
		
	
		
	
		
	
	
	
	
	

}
 