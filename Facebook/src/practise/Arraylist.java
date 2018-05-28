package practise;

import java.util.ArrayList;
import java.util.HashMap;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		
		a.add(300);
		
		a.add("avi");
		
		a.add(2.35);
		
		for (int i=0;i<a.size();i++) {
			
			System.out.println(a.get(i));
		}
		
		System.out.println(a.get(0));
		
		int ar1[]=new int[3];
		
		ar1[0]=1;
		ar1[1]=2;
		ar1[2]=3;
		
		for(int i=0;i<ar1.length;i++) {
			
			System.out.println(ar1[i]);
		}
		
		ArrayList<Integer> b=new ArrayList<Integer>();
		
		b.add(2);
		b.add(4, 5);
		b.get(4);
				
	 HashMap h1=new HashMap();
	 
	 h1.put(a, "avi");
	 
	 

	}

}
