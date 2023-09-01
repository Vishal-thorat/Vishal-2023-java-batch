package functional_interface_example;

@FunctionalInterface

//Here annotation is forcing to keep 1 method inside interface
public interface A {
	void m1();
	void m2();
//	void m2(); // Invalid '@FunctionalInterface' annotation; A is not a functional interface
}
