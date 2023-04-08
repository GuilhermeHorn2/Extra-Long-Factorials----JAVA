package misc;

import java.math.BigInteger;

public class main_misc2 {
	
	//private static HashMap<Integer,Integer> cache = new HashMap<>();
	public static void main(String[] args) {
		// 20 : 2432902008176640000
		System.out.println(big_factorial(99));
	
	
	}
	private static BigInteger big_factorial(int n) {
		
		BigInteger R;
		R = BigInteger.valueOf(1); 
		for(int i = n;i >= 1;i--) {
			BigInteger I = BigInteger.valueOf(i);
			R = R.multiply(I);
			
		}
		
		return R;
	}

	
		
	
	
	
	
	
	
	
	
	
	}
	
	
