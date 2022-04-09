import java.util.Arrays;

/*
 * @author Dicle Bahceli
 * @since 06.04.2021
 * 
 */

class BarcodeFormatInvalidException extends RuntimeException{
	
	public BarcodeFormatInvalidException() {
		
		super("Barcode number must be consist of 10 digit");
	}
	
	
}

class ShoppingChartFullException extends RuntimeException{
	
	public ShoppingChartFullException() {
		super("Shopping chart can not exceed 3 products.");
	}
	
	
}


class Product{
	private String Barcode;
	private String Name;
	
	public Product(String Barcode,String Name) {
		this.Barcode=Barcode;
		this.Name=Name;
		if(Barcode.length()!=10)
			throw new BarcodeFormatInvalidException();
	}

	public String getBarcode() {
		return Barcode;
	}

	public String getName() {
		return Name;
	}
	
	
	public String toString() {
		return "Product [barcode=" + Barcode + ", name=" + Name + "]";
	}
}



class User{
	private String Username;
	private String Email;
	
	public User(String Username,String Email) {
		this.Username=Username;
		this.Email=Email;
		
	}

	public String getUsername() {
		return Username;
	}

	public String getEmail() {
		return Email;
	}
	
	public String toString() {
		return "User [email=" + Email + ", username=" + Username + "]";
	}
}




class Chart{
	private User User;
	private Product[] Product;
	
	public Chart(User User) {
		this.User=User;
		Product=new Product[3];
		
	}
	
	public void addToChart (Product product) {
		if(Product[2] != null)
			throw new ShoppingChartFullException();
		
		
		for(int i=0;i<3;i++) {
			if(Product[i]==null) { 
				Product[i]=product;
				break;
				}
		
		
		
	}}
	
		public String toString() {
			return "Chart [products=" + Arrays.toString(Product) +
												", user=" + User + "]"; 
		}
}







public class Lab06_20190808024 {

	public static void main(String[] args) {

		try {
			Product cake= new Product("new","Cake");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

		Product ayran = new Product("1324657985","Ayran");
		Product coke = new Product("1643597825","Coke");
		Product pepsi = new Product("4973128565","Pepsi");
		Product fish = new Product("7548691235","Fish");
		
		
		
		User user = new User("Meryem","meryem@akdeniz.edu.tr");
		Chart chart = new Chart(user);
		
		chart.addToChart(ayran);
		System.out.println(chart);
		chart.addToChart(coke);
		System.out.println(chart);
		chart.addToChart(pepsi);
		System.out.println(chart);
		
		chart.addToChart(fish);
		
		
	}

}
