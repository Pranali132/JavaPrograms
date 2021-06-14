package BasicPrograms;
import java.util.*;
public class Factorial {
	 public static void main(String args[]){  
		  int i,fact=1;  
		  Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		  System.out.print("Enter the number: ");
		  int a= sc.nextInt();
    
		  for(i=1;i<=a;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+a+" is: "+fact);    
		 }  


}
