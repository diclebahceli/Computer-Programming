/*
 * @author Dicle Bahceli
 * @since 13.04.2021
 * 
 */
public class Lab07_20190808024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}





class RemoteControlException extends RuntimeException{
	
	public RemoteControlException(String message) {
		super(message);
	}
}


abstract class RemoteControl{
	private boolean isOpen;
	private String brand;
	private int frequency;
	
	
	public RemoteControl(String brand,int frequency) {
		this.brand=brand;
		this.frequency=frequency;
	}
	
	public abstract void  open();
	public abstract void close();

	public String getBrand() {
		return brand;
	}

	public int getFrequency() {
		return frequency;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	
}


class TelevisionControl extends RemoteControl{
	private int currentChannel;
	
	public TelevisionControl(String brand,int frequency) {
		super(brand,frequency);
		this.currentChannel=1;
	}
	
	@Override
	public void  open() {
		super.setOpen(true);;
		
	}
	@Override
	public void  close() {
		super.setOpen(false);;
	}


	public int getCurrentChannel() {
		return currentChannel;
	}


	public void setCurrentChannel(int currentChannel) {
		if(super.isOpen()==false)
			throw new RemoteControlException("Television is closed");
		this.currentChannel = currentChannel;
	}

}


class AirConditionerControl extends RemoteControl{
	
	private int maxHeat;
	private int minHeat;
	private int currentHeat;
	
	public AirConditionerControl(int maxHeat,int minHeat,String brand,
			int frequency) {
		super(brand,frequency);
		this.maxHeat=maxHeat;
		this.minHeat=minHeat;
		this.currentHeat=24;
		if(maxHeat<30) {
			throw new 
			RemoteControlException("Maximum heat can not be lower than 30");}
		
		if(minHeat>18) {
			throw new
		 RemoteControlException( "Minimum heat can not be greater than 18");}
	}
	
	
	public void open() {
		if(super.isOpen()==true) {
			throw new
			RemoteControlException("Air conditioner is already opened");
		}
		super.setOpen(true);
	}
	
	
	public void close() {
		if(super.isOpen()==false) {
			throw new
			RemoteControlException("Air conditioner is already closed");
		}
		super.setOpen(false);
	}
	
	public void coolDown() {
		currentHeat-=1;
		
		if(super.isOpen()==false) {
			throw new
			RemoteControlException("Air conditioner is  closed");
		}
		
		if(minHeat<18) {
			throw new
			RemoteControlException("Error: minimum heat reached");
		}
	}
	
	public void warmup() {
		currentHeat+=1;
		if(super.isOpen()==false) {
			throw new 
			RemoteControlException("Air conditioner is  closed");
		}
		
		if(maxHeat>30) {
			throw new
			RemoteControlException("Error: maximum heat reached");
		}
	
}


	public int getMaxHeat() {
		return maxHeat;
	}


	public int getMinHeat() {
		return minHeat;
	}


	public int getCurrentHeat() {
		return currentHeat;
	}
	
	
	
}









