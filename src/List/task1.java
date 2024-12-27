package List;
import java.util.ArrayList;
import java.util.List;
public class task1 {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
//		books.add(new Book(1,2000,"blue",true,"maths"));
//		books.add(new Book(2,1000,"grey",true,"science"));
//		books.add(new Book(3,4000,"green",false,"tamil"));
//		books.add(new Book(4,2500,"red",false,"english"));
//		books.add(new Book(5,20000,"white",true,"cloud computing"));
		Book b1 = new Book(1,2000,"blue",true,"maths");
		Book b2 = new Book(2,1000,"grey",true,"science");
		Book b3 = new Book(3,4000,"green",false,"tamil");
		Book b4 = new Book(4,2500,"red",false,"english");
		Book b5 = new Book(5,20000,"white",true,"cloud computing");
//		
		books.add(b1);
		books.add(b2);
		books.add(b3);
	books.add(b4);
		books.add(b5);
		//books.forEach(x->System.out.println(x));
//		int max = b1.getPrice();
//		for(int i=0;i<books.size();i++) {
//			if(books.get(i).getPrice()>max) {
//				max = books.get(i).getPrice();
//			}
//		}
//				System.out.println(max);
		
//		task1 t1 = new task1();
//		System.out.println(t1.maxPrice(books));
//		int maxPrice = Integer.MIN_VALUE;
//		for(Book book : books) {
//			maxPrice = Math.max(maxPrice, book.getPrice());
//		}
//		System.out.println(maxPrice);
		//books.forEach(x->System.out.println(x));
		//books.forEach(x->x.getPrice());
//		for(Book x : books) {
//			System.out.println(x.getPrice());
//		}
		
//		int max = b1.getPrice();
//		for(int i=0;i<books.size();i++) {
//			if(books.get(i).getPrice()>max) {
//				max = books.get(i).getPrice();
//			}
//		}
//		System.out.println(max);
		
//		Book max = b1;
//		for(int i=0;i<books.size();i++) {
//			if(books.get(i).getPrice()>max.getPrice()) {
//				max = books.get(i);
//			}
//		}
//		System.out.println(max);
		
		
//		for(int i=0;i<books.size();i++) {
//			if(books.get(i).getName().length()>5) {
//				System.out.println(books.get(i).getName());
//			}
//		}
		
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getColor().equals("blue")) {
				System.out.println(books.get(i));
			}
		}
		
	}
//	int total = books.g
	

	
	
	}
		

class Book {
	private int id;
	
	private int price;
	private String color;
	private boolean isAvailable;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Book(int id) {
		super();
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book(int id,int price, String color, boolean isAvailable, String name) {
		super();
		this.id = id;
		this.price = price;
		this.color = color;
		this.isAvailable = isAvailable;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [price=" + price + ", color=" + color + ", isAvailable=" + isAvailable + ", name=" + name + "]";
	}
	
	
}
