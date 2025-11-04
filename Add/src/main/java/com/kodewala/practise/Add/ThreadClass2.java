package com.kodewala.practise.Add;

public class ThreadClass2 {
       public static void main(String[] args) {
		Book1 b = new Book1();
		System.out.println(b.getState()); 
		b.start();
	 System.out.println(b.getState()); 
		
	}
}
class Book1 extends Thread{
	public void run() {
		System.out.println("Ashish Kumar Swian...");
	}
}