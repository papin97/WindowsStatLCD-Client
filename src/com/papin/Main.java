package com.papin;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SystemInfo si = new SystemInfo();
        CentralProcessor cp = si.getHardware().getProcessor();
        System.out.println("Processor codename: "+cp.getIdentifier());
    }
}
