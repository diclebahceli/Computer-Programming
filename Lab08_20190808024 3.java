import static org.junit.Assert.assertTrue;

/*
 * @author Dicle Bahceli
 * @since 20.04.2021
 * 
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab08_20190808024 {

	@Test
	public void testProduct() {
		Product p=new Product("1324687950","Name");
		String toString=p.toString().toLowerCase();
		int length=p.getBarcode().length();
		
		assertEquals(10,length);
		assertEquals("1324687950", p.getBarcode());
		assertEquals("Name",p.getName());
		assertTrue("Product should has a barcode",
				toString.contains("barcode"));
		assertTrue("Product should has a name",
				toString.contains("name"));
		
		try {
			Product p2=new Product("1329504485","Name");
		}catch(BarcodeFormatInvalidException e) {
			assertTrue(false);
		}
	}
	
	
	
	@Test
	public void testUser() {
		User u = new User("Name","name@gmail.com");
		String toString= u.toString().toLowerCase();
		
		assertEquals("Name",u.getUsername());
		assertEquals("name@gmail.com",u.getEmail());
		assertTrue("User should has a username",toString.contains("username"));
		assertTrue("User should has an email",toString.contains("email"));
	}
	
	
	
	@Test
	public void testChart(){
		User u = new User("Name2","name2@gmail.com");
		Chart c= new Chart(u);
		String toString=c.toString().toLowerCase();
		
		assertEquals("Name2",u.getUsername());
		assertEquals("name2@gmail.com",u.getEmail());
		assertTrue("Chart should has products",toString.contains("products")); 
		assertTrue("Chart should has a user",toString.contains("user"));
		
		try {
			Product p= new Product("1625349870","Person");	
			c.addToChart(p);
			
		}catch(ShoppingChartFullException e) {
			assertTrue(false);
		}
		
		
		
	}
	
	
}
