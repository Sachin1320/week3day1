package week3.day1;

public class Calculator {
public void add(int num1, int num2) {
	System.out.println(num1+num2);
}

public void add(int num1, int num2, int num3) {
	System.out.println(num1+num2+num3);
}
public void mult(int num1, int num2) {
	System.out.println(num1*num2);
}
public void mult(int num1, double num2) {
	System.out.println(num1*num2);
}
public void sub(int num1, double d20) {
	System.out.println(num1-d20);
}
public void div(double num1, double num2) {
	System.out.println(num1-num2);
}
public void div(int num1, int num2) {
	System.out.println(num1/num2);
}
public void div(int num1, double num2) {
	System.out.println(num1/num2);
}
public static void main(String[] args) {
	   Calculator calc =  new Calculator();
	   
	   calc.add(10, 20);
	   calc.add(10, 20, 30);
	   calc.mult(10, 2.0);
	   calc.mult(10, 2.0);
	   calc.sub(10, 20);
	   calc.sub(10, 2.0);
	   calc.div(10, 20);
	   calc.div(10, 2.0);
	   
	   
	   
}
}

