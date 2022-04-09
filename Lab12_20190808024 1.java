
import java.util.ArrayList;


/*
 * @Dicle Bahceli
 * @since 08.06.2021
 * 
 * 
 */




public class Lab12_20190808024 {


public static void findRepeats(int[] array, int n) {
	
	int counter=0;
	ArrayList<Integer> more=new ArrayList<Integer>();
	
	for(int i=0;i<array.length;i++) {
		counter=0;
		for(int j=0;j<array.length;j++) {
			if(array[i]==array[j]) 
				counter++;
		}
		if(counter>n && !more.contains(array[i])) 
			more.add(array[i]);
			
	}
	
		
		System.out.print("result: ");
		for(int i=more.size()-1;i<more.size();i--) {
			if(i==0) {
				System.out.print(more.get(i));
				break;
			}
				
			System.out.print(more.get(i) +",");
			
		}
		
	
}
	
	
	
	public static void main(String[] args) {

		int [] array = {5,4,3,0,9,3,7,9,3,4,4};
		findRepeats(array, 2);
		
	}

}
