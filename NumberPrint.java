package cravita;

import java.util.*;  
public class NumberPrint {
	static String one[] = { "", "one ", "two ", "three ", "four ", 
            "five ", "six ", "seven ", "eight ", 
            "nine ", "ten ", "eleven ", "twelve ", 
            "thirteen ", "fourteen ", "fifteen ", 
            "sixteen ", "seventeen ", "eighteen ", 
            "nineteen " }; 
	static String ten[] = { "", "", "twenty ", "thirty ", "forty ", 
            "fifty ", "sixty ", "seventy ", "eighty ", 
            "ninety " }; 
	static String numToWords(int n, String s) 
    { 
        String str = ""; 
       
        if (n > 19) { 
            str += ten[n / 10] + one[n % 10]; 
        } 
        else { 
            str += one[n]; 
        } 
        if (n != 0) { 
            str += s; 
        } 
  
        return str; 
    } 
	
	 static String convertToWords(double n) 
	    { 
	        String out = ""; 
	  
	       
	        out += numToWords((int)(n / 10000000), "crore "); 
	  
	       
	        out += numToWords((int)((n / 100000) % 100), "lakh "); 
	  
	        
	        out += numToWords((int)((n / 1000) % 100), "thousand "); 
	  
	       
	        out += numToWords((int)((n / 100) % 10), "hundred "); 
	  
	        if (n > 100 && n % 100 > 0) { 
	            out += "and "; 
	        } 
	  
	        
	        out += numToWords((int)(n % 100), ""); 
	        
	        out +="only";
	        
	        return out; 
	    } 
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);  
		 
         System.out.print("Enter Value: ");  
         double n = sc.nextDouble();
	      
	     System.out.printf(convertToWords(n)); 
		

	}

}
