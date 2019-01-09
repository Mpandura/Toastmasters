package testing;

import java.util.ArrayList;
import java.util.Arrays;

public class Step3_Floop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Floop Currency
        double n = 3.38;
        Double[] c = { 0.01,  0.03, 0.67, 2.71, 3.14};
        dollor_combination(n, new ArrayList<Double>(Arrays.asList(c)));
    }
    
    public static void dollor_combination(double n, ArrayList<Double> c) {    	
    	dollor_combination_recursive(c,n,new ArrayList<Double>());

    }
    
	public static void dollor_combination_recursive(ArrayList<Double> c, double n, ArrayList<Double> partialNumbers) {

	       double sum = 0;     
	       //calculate summation of partial numbers
	       for (Double x: partialNumbers) sum += x;
	       
	       //check if summation of partial numbers is equal to sum n
	       if (sum == n)
	            System.out.println("("+Arrays.toString(partialNumbers.toArray())+")="+n+"Floop");
	       
	       //if sum is greater than the n sum then why to continue 
	       if (sum >= n) return;	            
	       
	       //add the remaining numbers in the partial number list 
	       for(int i=0;i<c.size();i++) {	  
	             ArrayList<Double> remainingNumbers = new ArrayList<Double>();
	             double n1 = c.get(i);	
	             for (int j=i; j<c.size();j++) {
	            	 remainingNumbers.add(c.get(j));
	             }
	             
	             ArrayList<Double> partialNumbersList = new ArrayList<Double>(partialNumbers);
	             partialNumbersList.add(n1);
	             //recursive call
	             dollor_combination_recursive(remainingNumbers,n,partialNumbersList);
	       }

	    }
	    

}
