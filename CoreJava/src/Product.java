
public class Product {
	
	private long price;
	
	public void setPrice(long price) {		
		 this.price = price;
	}
	public long getPrice() {
		return this.price;
	}
	public long getPrice(int quandity){
	  return price*quandity;		
}

	public static void main(String[] args){

		Product obj= new Product();
		obj.setPrice(20);
		System.out.println("Price: " + obj.getPrice());
        System.out.println("total: " +obj.getPrice(3));
		}
}



