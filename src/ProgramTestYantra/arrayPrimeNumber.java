package ProgramTestYantra;

import java.util.ArrayList;

public class arrayPrimeNumber {
	
	public static void main(String[] args) {
		//public 
	}

	public ArrayList getPrimeNumbers(int number)
	{
	    ArrayList primeNumbers = new ArrayList();
	    for (int i = 0; i <= number; i++)
	    {
	        if(isPrime(i)) 
	        {
	            primeNumbers.add(i);
	        }
	    }
	    return primeNumbers;
	} 


	private boolean isPrime(int n) 
	{
	    for(int i=2;i<n;i++) 
	    {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}