import java.util.ArrayList;
import java.util.List;

/*
 * @Dicle Bahceli
 * @since 18.05.2021
 */


interface IStructure<T> {
	
	public boolean isEmpty();
	public int size();
	public int capacity();
	public String toString();
}


abstract class Structure<T>{
	protected T[] elements ;
	
	public Structure(int capacity) {
		elements=(T[]) new Object[capacity];
	}


	
}


  class Stack<T> extends Structure implements IStructure{

	  
	 
	public Stack(int capacity) {
		super(capacity);
		
	}
	
	int i=0;
	public void push(T element) {
		super.elements[i]=element;
		i++;
	}
	
	
	public T pop() {
		i--;
		T  pop=(T) super.elements[i];
		super.elements[i]=0;
		return pop;
		
	}


	@Override
	public boolean isEmpty() {
		if(super.elements[0]==null)
			throw new RuntimeException();
		else if(super.elements[elements.length-1]!=null)
			throw new RuntimeException();
		return false;
	}


	@Override
	public int size() {
		return super.elements.length;
	}


	@Override
	public int capacity() {
		return super.elements.length;
	}


}



 class Queue<T> extends Structure implements IStructure{

	public Queue(int capacity) {
		super(capacity);
	}
	
	
	public void queue(T element) {
		if(super.elements[0]!=null) {
		for(int j=0;j<super.elements.length-2;j++) {
		T shift = (T) super.elements[j];
		super.elements[j]=element;
		super.elements[j+1]=shift;
		}}
		else {
			super.elements[0]=element;
		}
		
	}
	
	
	public T dequeue() {
		
		T first = (T) super.elements[0];
		super.elements[0]=0;
		return first;
		
	}


	@Override
	public boolean isEmpty() {
		if(super.elements[0]==null)
			throw new RuntimeException();
		else if(super.elements[elements.length-1]!=null)
			throw new RuntimeException();
		return false;
	}


	@Override
	public int size() {
		return super.elements.length;
	}


	@Override
	public int capacity() {
		return super.elements.length;
	}

	
}


public class Lab09_20190808024 {

	public static void main(String[] args) {
		Stack s = new Stack(3);
		Queue q= new Queue(2);
		s.push(4);
		s.push(5);
		s.push(88);
		System.out.println(s.pop());
		System.out.println(s.capacity());
		q.queue(4);
		System.out.println(q.dequeue());
	}

}
