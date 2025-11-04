package com.kodewala.practise.Add;

import java.security.DomainCombiner;

public class ThrteadClass1 {
       public static void main(String[] args) {
		   Book b = new Book();
		   b.start();
	}
}


class Book extends Thread{
	public void run() {
		System.out.println("Thread name : " + Thread.currentThread().getName());
	}
}