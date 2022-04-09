/*
 * @author Dicle Bahceli
 * @since 23.03.2021
 * 
 */


class Author{
	private String Name;
	private String Surname;
	private String Mail;
	
	public Author(String Name,String Surname,String Mail) {
		this.Name=Name;
		this.Surname=Surname;
		this.Mail=Mail;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public String getName() {
		return Name;
	}

	public String getSurname() {
		return Surname;
	}
	
	
	
}

class Book{
	private String Isbn;
	private String Title;
	private Author Author;
	private double Price;
	
	public Book(String Isbn,String Title,Author Author,double Price) {
		this.Isbn=Isbn;
		this.Title=Title;
		this.Author=Author;
		this.Price=Price;
		
	}
	
	public Book(String Isbn,String Title,Author Author) {
		this.Isbn=Isbn;
		this.Title=Title;
		this.Author=Author;
		this.Price=15.25;
		
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getIsbn() {
		return Isbn;
	}

	public String getTitle() {
		return Title;
	}

	public Author getAuthor() {
		return Author;
	}
	
	
	
	
}



class EBook extends Book{
	private String DownloadUrl;
	private double SizeMb;
	
	public EBook(String Isbn,String Title,Author Author,double Price,
			String DownloadUrl,double SizeMb) {
		super( Isbn, Title, Author, Price);
		this.DownloadUrl=DownloadUrl;
		this.SizeMb=SizeMb;
	}
	
	
	public EBook(String Isbn,String Title,Author Author,
			String DownloadUrl,double SizeMb) {
		super(Isbn,Title,Author);
		this.DownloadUrl=DownloadUrl;
		this.SizeMb=SizeMb;
	}


	public String getDownloadUrl() {
		return DownloadUrl;
	}


	public double getSizeMb() {
		return SizeMb;
	}
	
	
}


class PaperBook extends Book{
	private double ShippingWeight;
	private boolean InStock;
	
	public PaperBook(String Isbn,String Title,Author Author,double Price,
			double ShippingWeight,boolean InStock) {
		
		super(Isbn,Title,Author,Price);
		this.ShippingWeight=ShippingWeight;
		this.InStock=InStock;
	}
	
	public PaperBook(String Isbn,String Title,Author Author,
			double ShippingWeight,boolean InStock) {
		
		super(Isbn,Title,Author);
		this.ShippingWeight=ShippingWeight;
		this.InStock=InStock;
	}

	public boolean getIsInStock() {
		return InStock;
	}

	public void setInStock(boolean inStock) {
		InStock = inStock;
	}

	public double getShippingWeight() {
		return ShippingWeight;
	}
	
	
}

public class Lab04_20190808024 {

	public static void main(String[] args) {

		Author author1=new Author("Zülfü","Livaneli","zlivaneli@gmail.com");
		Book book1 = new Book("dvsad","fbsfb",author1,50);
		EBook ebook1=new EBook(book1.getIsbn(),book1.getTitle(),
				book1.getAuthor(),"vskmb",50);

		PaperBook paperbook1= new PaperBook(book1.getIsbn(),book1.getTitle(),
				book1.getAuthor(),book1.getPrice(),25.5,true);
		
		
		
		System.out.println(author1.getName() + " " + author1.getSurname() +
				" mail: " + author1.getMail());
		
		System.out.println(book1.getIsbn() + " " + book1.getTitle() +" "
				+ book1.getAuthor().getName()+" " + book1.getPrice());
		
		System.out.println(ebook1.getIsbn()+" "+ ebook1.getTitle()+" "
				+ ebook1.getAuthor().getName()+ " "+ebook1.getDownloadUrl()+" " + 
						ebook1.getSizeMb());
		
		System.out.println(paperbook1.getIsbn()+" "+paperbook1.getTitle()+" "+
		        paperbook1.getAuthor().getName()+" "+paperbook1.getPrice()+" "+
				paperbook1.getIsInStock());
	}

}
