package assignment4_4;//package name

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4_4 {//class name
	

	//logic to find aloquit sum
	public static int findAloquitSum(int num){
		
		int sum=0;
		 for(int i=1; i<=num/2; i++)
	        {
	            if(num%i == 0)
	            {
	                sum += i;
	                
	            }
	        }
		 
		
		return sum;
	}
	
	//logic to find out the perfect number
	 public static boolean isPerfectNumber(int num)
	    {
	        boolean isPerfect = false;
	               
	       if(num<6)return false;
	         
	       int sum=findAloquitSum(num);
	            
	        
	        if(sum==num){
	        	
	        	return true;
	        }
	        
	         
	        return isPerfect;
	    }
	 
	    public static void main(String args[])
	    {
	      
	        Scanner inpScanner = new Scanner(System.in);//instantiating Scanner object
	        //Take input from the user
	        System.out.println("Enter the number to find the aliquot sum");
	        int aloquitSum=findAloquitSum(inpScanner.nextInt());
	        System.out.println("Enter the range of numbers min and max to find the perfect numbers ");
	        int minRange = inpScanner.nextInt();//starting range
	        int maxRange= inpScanner.nextInt();//ending range
	        ArrayList<Integer> perfectNums = new ArrayList<Integer>(); //creating arraylist object to add perfect numbers
	        for(int i=minRange; i<=maxRange;i++)
	        {
	            if(isPerfectNumber(i))//calling perfect number method
	                perfectNums.add(i);//adding to arraylist if perfect number
	        }
	         
	        System.out.println("Aloquit Sum of the given Integer :"+aloquitSum);
	        System.out.format("Perfect numbers within range %s %s: %s\n",minRange,maxRange,perfectNums.toString());//printing the perfect number
	        
	        inpScanner.close();//close scanner
	    }

}
