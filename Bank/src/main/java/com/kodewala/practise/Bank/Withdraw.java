package com.kodewala.practise.Bank;

public class Withdraw {
     private  int currentAmount;
     private  int withDrawAmount;
     
     public int withdrawAmount1() {
    	  int restAmount = currentAmount-withDrawAmount;
    	 return restAmount;
     }
	 public int getCurrentAmount() {
		 return currentAmount;
	 }
	 public int getWithDrawAmount() {
		 return withDrawAmount;
	 }
	 public void setCurrentAmount(int currentAmount) {
		 this.currentAmount = currentAmount;
	 }
	 public void setWithDrawAmount(int withDrawAmount) {
		 this.withDrawAmount = withDrawAmount;
	 }
     
}
