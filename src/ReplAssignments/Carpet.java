package ReplAssignments;

public class Carpet {
	
	double width;
	double length;
	double unitPrice;
	double totalPrice;
	boolean isPersion;
	
	public Carpet() {
		this.length=300d;
		this.width=300d;
		this.totalPrice=200d;
		this.isPersion=false;
		this.unitPrice=0d;
	}

	
	 



	public Carpet(double width, double length, double unitPrice,boolean isPersion) {
		
		this.width = width;
		this.length = length;
		this.unitPrice = unitPrice;
		this.isPersion = isPersion;
}
	
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = (width+length)*unitPrice;
		if(isPersion==true)
			totalPrice+=200;
			
	}






	public static void main(String[] args) {
		   
		    Carpet c  = new Carpet();
		    System.out.println(c.totalPrice);
		    Carpet c2  = new Carpet();
		    c2.length=300d;
		    c2.width=300d;
		    c2.totalPrice=200d;
		    c2.isPersion=true;
		    c2.unitPrice=0d;
		    System.out.println(c2.totalPrice);
		    

		  }
	

}
