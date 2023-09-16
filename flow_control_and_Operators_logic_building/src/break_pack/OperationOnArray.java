package break_pack;

public class OperationOnArray {
int search(int[]arr,int targetElement) {
	int index=-1;
	for(int i=0;i<arr.length;i++) {
		//onceif u get ur valid index still for loop searching functionaality is going on
		if(arr[i]==targetElement) {
			index =i;
		}
	}
	return index;
}


int search1(int[]arr,int targetElement) {
	int index=-1;
	for(int i=0;i<arr.length;i++) {
		//onceif u get ur valid index still for loop searching functionaality is going on
		if(arr[i]==targetElement) {
			index =i;
			break;
		}
	}
	return index;
}



}
