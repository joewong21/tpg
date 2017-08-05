package com.tpg.test;

import java.security.SecureRandom;

public class Q3 {

	public static void main(String[] args) {
		
		System.out.println(" ** Java 8 **");
		MethodTimer.logMethodExecTime(()->generateRandomNumber(500,300000000));
		MethodTimer.logMethodExecTime(()->genRandomKey(9009922));
		
		System.out.println("Java 7");
		Runnable numberGenerator = new Runnable() {
			   public void run() {
				   generateRandomNumber(500,300000000);
			   }
		};
		
		Runnable keyGenerator = new Runnable() {
			   public void run() {
				   genRandomKey(9009922);
			   }
		};
		MethodTimer.logMethodExecTime(numberGenerator);
		MethodTimer.logMethodExecTime(keyGenerator);
	}

	
	private static void generateRandomNumber(int range, int limit){
		int random = 0 ;		
		 for(int  i= 0 ; i< limit; i++){
			 random = (int )(Math.random() * limit + range);
		 }
		 System.out.println(" Generated random number : " + random);
	}
	
	private static void genRandomKey(int len ){
		final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_+";
		SecureRandom rnd = new SecureRandom();
 
		   StringBuilder sb = new StringBuilder( len );
		   for( int i = 0; i < len; i++ ) 
		      sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
		   System.out.println(" Secret key : " +sb.toString().substring(0,50));
	}
	
}


