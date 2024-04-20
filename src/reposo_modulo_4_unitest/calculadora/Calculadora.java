package reposo_modulo_4_unitest.calculadora;

public class Calculadora {

	public int sumar(int num1, int num2) {
		return num1+num2;
	}
	
	public int restar(int num1, int num2) {
		return num1-num2;
	}
	
	public int dividir(int num1, int num2) {
		if(num2==0) {
			return 0;
		}
		return num1/num2;
	}
	public int multiplicar(int num1, int num2) {
		return num1*num2;
	}
}
