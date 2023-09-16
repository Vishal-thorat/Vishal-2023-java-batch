package matrix_product;

public class Product {
public static void main(String[] args) {
	
	int[][] arr1 = {
			{ 10, 20, 30 }, 
			{ 40, 50, 60 }
	         };
	
	
	int[][] arr2 = {
			{1,2},
			{8 ,3}, 
			{ 4, 5}
	         };
	for(int i=0;i<arr1.length;i++) {
		int sum=0;
		for(int j=0;j<arr1[i].length;j++) {
			sum=sum+arr1[i][j]*arr2[j][i];
		}
		System.out.println(sum+" ");
		
	}
	
	
}
}
