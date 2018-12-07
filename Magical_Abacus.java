
public class Magical_Abacus {
	public int add(int a, int b){
		return a + b;
	}
	public int subtract(int a, int b){
		return a - b;
		}
	public int multiply(int a, int b){
		return a * b;
		}
	public int divide(int a, int b){
		return a / b; 
		}
	public double dadd(double d, double e) {
		return d + e;
		//d + add means decimal addition
	}
	public double dsubtract(double d, double e) {
		return d - e;
		//d + sub means decimal subtract
	}
	public double dmultiply(double d, double e) {
		return d * e;
		//d + multiply means decimal multiply
	}
	public double ddivide(double d, double e) {
		return d / e;
		//d + sub means decimal divide
	}
	public static void main(String[] args) {
		Magical_Abacus myCalculator = new Magical_Abacus();
		
		System.out.println(myCalculator.add(2, 3));
		
		System.out.println(myCalculator.subtract(2, 3));
		
		System.out.println(myCalculator.multiply(2, 3));
		
		System.out.println(myCalculator.divide(2, 4));
		
		System.out.println(myCalculator.dadd(2.5, 4.2));
		
		System.out.println(myCalculator.dsubtract(2.9, 4.1));
		
		System.out.println(myCalculator.dmultiply(2.8, 4.6));
		
		System.out.println(myCalculator.ddivide(2.75, 4.56));
		}
	}