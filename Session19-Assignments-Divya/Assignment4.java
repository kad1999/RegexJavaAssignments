import java.util.Comparator;
import java.util.TreeSet;

class ProductIdComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product p1 = (Product)o1;
		Product p2 = (Product)o2;
		if(p1.getProductId() == p2.getProductId()) {
			return 0;
		}
		else if(p1.getProductId() > p2.getProductId()) {
			return 1;
		}
		else {
			return -1;
		}
				
	}
	
}

class ProductNameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product p1 = (Product)o1;
		Product p2 = (Product)o2;
		return p1.getProductName().compareTo(p2.getProductName());
				
	}
	
}

class ProductPriceComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product p1 = (Product)o1;
		Product p2 = (Product)o2;
		if(p1.getProductPrice() == p2.getProductPrice()) {
			return 0;
		}
		else if(p1.getProductPrice() > p2.getProductPrice()) {
			return 1;
		}
		else {
			return -1;
		}
				
	}
	
}

public class Assignment4 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new ProductIdComparator());
		
		ts.add(new Product(2,"bag",1000));
		ts.add(new Product(3,"mobile",30000));
		ts.add(new Product(1,"watch",890));
		
		for (Object object : ts) {
			System.out.println(object);
		}
		
		TreeSet ts1 = new TreeSet(new ProductNameComparator());
		
		ts1.add(new Product(2,"bag",1000));
		ts1.add(new Product(3,"mobile",30000));
		ts1.add(new Product(1,"watch",890));
		
		for (Object object : ts1) {
			System.out.println(object);
		}
		
		TreeSet ts2 = new TreeSet(new ProductPriceComparator());
		
		ts2.add(new Product(2,"bag",1000));
		ts2.add(new Product(3,"mobile",30000));
		ts2.add(new Product(1,"watch",890));
		
		for (Object object : ts2) {
			System.out.println(object);
		}
		
	}
	
}
