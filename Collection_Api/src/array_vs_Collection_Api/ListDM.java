package array_vs_Collection_Api;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class ListDM {
	public static void main(String[] args) {
		
 /// Collection api
		
		List<Integer>arr=new ArrayList<>(); 
		arr.add(100);
		arr.add(null);
	    arr.add(200);
		arr.add(300);
		arr.add(null);
		arr.add(400);
		arr.add(500);
		
		System.out.println(arr.toString());
		
		System.out.println(arr.size());
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		arr.remove(new Integer(300));
		
		System.out.println(arr.toString());
		
	}
	}












