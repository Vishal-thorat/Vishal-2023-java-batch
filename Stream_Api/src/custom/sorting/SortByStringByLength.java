package custom.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortByStringByLength {
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("ma","abc","pqr","abclmn","b","ma");
		
		//Natural sorting order
		List<String>ans=list.stream().sorted().collect(Collectors.toList());
		System.out.println(ans);
		
		//custom sort
		
		List<String>ans1=list.stream().sorted((s1,s2)->{
			
			if(s1.length() <s2.length()) {
				return -1;
			}else {
				return 1;
			}
		}).collect(Collectors.toList());
		System.out.println(ans1);
}
}