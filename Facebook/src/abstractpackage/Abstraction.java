package abstractpackage;

public abstract class Abstraction {
	
	//partial abstraction 
	//normal methods(non-abs methods) are also declared
	
	public abstract void loan();
	
	public void credit() {
		System.out.println("bank credit --------avi");
		
	}
	
	public void debit() {
		System.out.println("bank debit------------avi");
	}

}
