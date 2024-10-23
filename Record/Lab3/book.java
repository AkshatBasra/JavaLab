import java.util.Scanner;

class  Book{
	String name;
	String author;
	float price;
	int numPages;
	Book(String name, String author, float price, int numPages){
		this.name = name;
		this.author = author;
		this.price = price;
		this.numPages = numPages;
	}
	String getName(){
		return this.name;
	}
	String getAuthor(){
		return this.author;
	}
	float getPrice(){
		return this.price;
	}
	int getNumPages(){
		return this.numPages;
	}
	void setName(String name){
		this.name = name;
	}
	void setAuthor(String author){
		this.author = author;
	}
	void setPrice(float price){
		this.price = price;
	}
	void setNumPages(int numPages){
		this.numPages = numPages;
	}
	public String toString(){
		String name = "\nName is " + this.name;
		String author = "\nAuthor is " + this.author;
		String price = "\nPrice is " + this.price;
		String numPages = "\nNumber of pages is " + this.numPages;
		return name + author + price + numPages;
	}
}

class BookRun{
	public static void main(String[] args){
		System.out.println("Akshat Basra 1BM23CS020");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Books: ");
		int i, n = sc.nextInt();
		Book[] books = new Book[n];
		for(i = 0; i < n; i++){
			System.out.println("Book " + (i+1)); 
			System.out.print("Enter Name: ");
			String a = sc.next();
			System.out.print("Enter Author: "); 
			String b = sc.next();
			System.out.print("Enter Price: ");
			float c = sc.nextFloat();
			System.out.print("Enter Number of Pages: ");
			int d = sc.nextInt();
			books[i] = new Book(a, b, c, d);
		}
		for(i = 0; i < n; i++){
			System.out.println(books[i].toString());
		}
	}
}
