package com.bg.monitor;

public class JVMMonitor {

	public static void  printSystemMemory()
	{
		long heapSize = Runtime.getRuntime().totalMemory(); 
		
		System.out.println("current memory used in heap："+heapSize/1024+"kbytes");
	}
}
