package ReplAssignments;

public class GasTank {
	
	 double amount=0;
	double capacity;
	
	public GasTank(double capacity) {
		this.capacity=capacity;
	}
	public void addGa (double addBy){
		amount=amount+addBy;
		if (amount>capacity) {
			capacity=amount;
			
		}
	}
	public void useGas(double decreaseBy) {
		amount=amount-decreaseBy;
		if (amount<0) {
			amount=0;
			
		}
		
	}
	public boolean isEmpty() {
		if (amount<0.1) {
			return true;
			
		}else {
			return false;
		}
		
	}
	public boolean isFull(){
		if (amount>capacity-0.1) {
			return true;
			
		}else {
			return false;
		}
		
	}
	public double getGasLevel() {
		return amount;
		
	}
	public double  fillUp() {
		return capacity-amount;
	}
	
	
	
	
	

}
