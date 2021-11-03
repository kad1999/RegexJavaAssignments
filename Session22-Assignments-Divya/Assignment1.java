import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Assignment1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String file = "d:\\product.txt";
		FileOutputStream fs = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fs);
		
		
		Product p = new Product(101, "watch",320.4);
		oos.writeObject(p);
		oos.flush();
		fs.close();
		System.out.println("Serailized");
			
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream inp = new ObjectInputStream(fis);
		
		Object obj = inp.readObject();
		Product p1 = (Product)obj;
		System.out.println(p1.productId);
		System.out.println(p1);
	}
}
