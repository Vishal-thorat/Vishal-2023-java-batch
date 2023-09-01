package arrayylist_student_example;

import java.util.*;

public class SearchGivenProductDetails {        ///understand logic and do operations

	public static void main(String[] args) {

		ArrayList<Product> al = new ArrayList<Product>();
		al.add(new Product(1, "TV", "Electronic "));
		al.add(new Product(2, "phone", "Electronic "));
		al.add(new Product(3, "mango", "Food "));
		al.add(new Product(4, "notebbok", "study material "));

		// search >>name is mobile >> need full object
		Product p = getproduct("mango", al);
		System.out.println(p);

	}

	public static  Product getproduct(String productName, ArrayList<Product> list) {
//		for (Product product : list) {
//			if (productName.equals(product.getProductName())) {
//				return product;
//			}
//
//		}
		
		
		//using Iterator
		
		Iterator<Product>itr=list.iterator();
		while(itr.hasNext()) {
			Product p=itr.next();
			if(p.getProductName().equals(productName)) {
				return p;
			}
		}
		
		
		
		return null;
	}

}
