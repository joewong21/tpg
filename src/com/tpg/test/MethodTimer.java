package com.tpg.test;

public class MethodTimer {
 
 
	   public static void logMethodExecTime(Runnable s)
	   {
	     long start = System.nanoTime();
	     s.run();
	     long end = System.nanoTime();
	     double consumedTime = ((end-start)/1000000000d);
	     System.out.println( "Total " + consumedTime + " secs");
	   }
 
}
