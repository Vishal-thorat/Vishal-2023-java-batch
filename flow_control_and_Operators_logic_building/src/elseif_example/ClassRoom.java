package elseif_example;

public class ClassRoom {
  private String classRoomm;
  private int lowerAge;
  private int upperAge;
  private double fees;
  
  public ClassRoom() {}

public ClassRoom(String classRoomm, int lowerAge, int upperAge, double fees) {
	super();
	this.classRoomm = classRoomm;
	this.lowerAge = lowerAge;
	this.upperAge = upperAge;
	this.fees = fees;
}

public String getClassRoomm() {
	return classRoomm;
}

public void setClassRoomm(String classRoomm) {
	this.classRoomm = classRoomm;
}

public int getLowerAge() {
	return lowerAge;
}

public void setLowerAge(int lowerAge) {
	this.lowerAge = lowerAge;
}

public int getUpperAge() {
	return upperAge;
}

public void setUpperAge(int upperAge) {
	this.upperAge = upperAge;
}

public double getFees() {
	return fees;
}

public void setFees(double fees) {
	this.fees = fees;
}

@Override
public String toString() {
	return "ClassRoom [classRoomm=" + classRoomm + ", lowerAge=" + lowerAge + ", upperAge=" + upperAge + ", fees="
			+ fees + "]";
}
  
  
  
}
