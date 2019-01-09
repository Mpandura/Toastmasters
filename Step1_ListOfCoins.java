package testing;

import java.util.ArrayList;
import java.util.Arrays;

public class Step1_ListOfCoins {
	
	public static void main(String args[]) {
    	//US Currency $
        int n = 25;

        dollor_combination(n);
    }
    
    public static void dollor_combination(int n) {
    	//dollors avaiable 
    	Integer[] dollors_available = {1,2,5,10,20,50,100};
    	
    	dollor_combination_recursive(new ArrayList<Integer>(Arrays.asList(dollors_available)),n,new ArrayList<Integer>());

    }
    
	public static void dollor_combination_recursive(ArrayList<Integer> dollors_available, int n, ArrayList<Integer> partialNumbers) {

	       int sum = 0;     
	       //calculate summation of partial numbers
	       for (int x: partialNumbers) sum += x;
	       
	       //check if summation of partial numbers is equal to sum n
	       if (sum == n)
	            System.out.println("("+Arrays.toString(partialNumbers.toArray())+")="+n+"$");
	       
	       //if sum is greater than the n sum then why to continue 
	       if (sum >= n) return;	            
	       
	       //add the remaining numbers in the partial number list 
	       for(int i=0;i<dollors_available.size();i++) {	  
	             ArrayList<Integer> remainingNumbers = new ArrayList<Integer>();
	             int n1 = dollors_available.get(i);	
	             for (int j=i+1; j<dollors_available.size();j++) {
	            	 remainingNumbers.add(dollors_available.get(j));
	             }
	             
	             ArrayList<Integer> partialNumbersList = new ArrayList<Integer>(partialNumbers);
	             partialNumbersList.add(n1);
	             //recursive call
	             dollor_combination_recursive(remainingNumbers,n,partialNumbersList);
	       }

	    }
	    

}
