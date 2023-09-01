package assignment;

import java.util.LinkedList;

public class CRUDoperation {
	
	LinkedList<Integer>list;
	
	public CRUDoperation() {
		list=new LinkedList<>();
		list.add(100);
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		list.add(700);
		list.add(800);
			
	}
	//here we are cheking input object is exist or not inside  linkedlist
	Boolean isObjectExit(Integer obj) {
		boolean isExist=this.list.contains(obj);
		return isExist;
	}
	
	
	//assignment todo
	/*
	 * insert
	 * check frequency //count of 700
	 * delete 300
	 * update 7000>>replace701
	 */
	
// insert  --here we are storing new Object inside linked list
	
	Boolean saveObject(Integer obj) {
		boolean b=this.list.add(obj);
		return b;
	}
	
	
	Integer countofObject(Integer obj) {
		int cnt=0;
		for (Integer item : list) {
			if(item.equals(obj)) {
				cnt++;
			}
			}return cnt;
	}
	
	
	//delete
	
	Boolean removeObject(Integer obj) {
		return this.list.remove(obj);
	}
	
	
	// update 7000>>replace701    --Iterator use then pending
	
	void replaceObject(Integer oldObject,Integer newObject) {
		System.out.println("old list"+ this.list);
		//old object=30 >> newObject =300
		
//		another way
//		int index=list.lastIndexOf(oldObject)
//		this.list.remove(index);
//		this.list.add(index, newObject);
		
		
		int index =-1;
		for (Integer item : list) {  //{10,20,300,40,50}
			index++;
			if(item.equals(oldObject)) {
//				this.list.remove(index);
//				this.list.add(index, newObject);  //due to list iterator  //comncuurent coollection
				break;
			}
		}
		this.list.remove(index);
		this.list.add(index, newObject);
		
		System.out.println("new  list"+ this.list);
	}
	
	
	
	
	public static void main(String[] args) {
		
		CRUDoperation c=new CRUDoperation();
		//System.out.println(c.isObjectExit(500));
		c.replaceObject(700,70);
	}

}
