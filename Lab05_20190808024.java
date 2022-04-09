/*
 * @author Dicle Bahceli
 * @since 30.03.2021
 * 
 * 
 */



class Computer{
	private Cpu Cpu;
	private Memory Memory;
	
	public Computer(Cpu Cpu,Memory Memory) {
		this.Cpu=Cpu;
		this.Memory=Memory;
		
	}
	
	public String toString() {
		return "Computer [cpu=" + Cpu + ", memory=" + Memory + "]";
	}
}


class Laptop extends Computer{
	public Laptop(Cpu Cpu,Memory Memory) {
		super(Cpu,Memory);
	}
	
	public  String toString() {
		return "Laptop [" + super.toString() + "]";
	}
}

class Desktop extends Computer{
	public Desktop(Cpu Cpu,Memory Memory) {
		super(Cpu,Memory);
		
	}
	
	public String toString() {
		
		return "Desktop [" + super.toString() + "]";
	}
	
	
}

class Cpu{
	
	private  String Name;
	private String Frequency;
	
	public Cpu(String Name,String Frequency) {
		this.Name=Name;
		this.Frequency=Frequency;
	}
	
	public String toString() {
		return "Cpu [frequency=" + Frequency + ", name=" + Name + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getFrequency() {
		return Frequency;
	}

	public void setFrequency(String frequency) {
		Frequency = frequency;
	}

	


}

class Memory{
	private String Type;
	private int Capacity;
	
	public Memory(String Type,int Capacity) {
		this.Type=Type;
		this.Capacity=Capacity;
	}
	
	public String toString() {
		return "Memory [capacity=" + Capacity + ", type=" + Type + "]";
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	
	
}



public class Lab05_20190808024 {

	public static void main(String[] args) {
		
		Cpu cpu = new Cpu("name","frequency");
		Memory m = new Memory("type",64);
		Computer c=new Computer(cpu,m);
		Laptop l = new Laptop(cpu,m);
		Desktop d = new Desktop(cpu,m);
		
		System.out.println(cpu.toString());
		
		System.out.println(m.toString());
		
		System.out.println(c.toString());
		System.out.println(l.toString());
		System.out.println(d.toString());
		
		cpu.setFrequency("0.35");
		cpu.setName("name");
		m.setCapacity(5524);
		m.setType("type");
		
		
	}

}


