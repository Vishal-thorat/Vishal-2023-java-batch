package setterandgeter.example;

public class A {

	
	private int x;
	private int y;
	
	A(){
		
	}
	
	A(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	
	int getX() {
		return x;
		
	}
	
	void setX(int x) {
		this.x=x;
		
	}
	
	int getY() {
		return y;
		
	}
	

	void setY(int y) {
		this.y=y;
		
	}
	
}
