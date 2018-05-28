package practise;

public class Main_class {

	public static void main(String[] args) {
		
		//static varible can be called by class name 
		
		System.out.println(Hsbc.min_bal);
		
		//Static polymorphism or compile time polymorphism  
		
		USbank us=new USbank();
		
		us.credit();
		us.debit();
		us.transfermoney();
		
		System.out.println("***********");
		
		
		/*run-time polymorphism or dynamic polymorphism-----child class object is referrred by 
		parent class varible then it is knowm as dynamic polymaorhism */
		
		Hsbc hs=new USbank();
		
		hs.credit();
		hs.debit();
	}

}
