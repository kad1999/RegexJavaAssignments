import java.io.Serializable;

public class Product implements Serializable{
	int productId;
	String productName;
	double productPrice;
	
	Product(){
		
	}

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	protected void finalize(){
		System.out.println("destroyed");
	}
}
