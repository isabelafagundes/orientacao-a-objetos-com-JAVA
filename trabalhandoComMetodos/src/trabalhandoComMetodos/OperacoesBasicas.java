package trabalhandoComMetodos;
import java.util.Scanner;

public class OperacoesBasicas {

	public static void main(String[] args) {
		int numero1, numero2, total;
		String operador;
		
		System.out.print("Insira o primeiro número: ");
		Scanner lerNumero1 =  new Scanner(System.in);
		numero1 = lerNumero1.nextInt();
		
		System.out.print("Insira o segundo número: ");
		Scanner lerNumero2 =  new Scanner(System.in);
		numero2 = lerNumero2.nextInt();
		
		System.out.println("Insira: + (para soma), - (para subtração), * (para multiplicação), / (para divisão)");
		Scanner lerOperador =  new Scanner(System.in);
		operador = lerOperador.next();
		
		switch(operador) {
		case "+":
			total = somar(numero1, numero2);
			System.out.println("A soma deu: " + total);
			break;
		
		case "-":
			total = subtrair(numero1, numero2);
			System.out.println("A subtração deu: " + total);
			break;
			
		case "*":
			total = multiplicar(numero1, numero2);
			System.out.println("A multiplicação deu: " + total);
			break;
			
		case "/":
			total = divisao(numero1, numero2);
			System.out.println("A divisão deu: " + total);
			break;
			
		default:
			System.out.println("Insira: + (para soma), - (para subtração), * (para multiplicação), / (para divisão)");
			break;
		}

	}

	public static int somar(int a, int b) {
		return(a + b);
	}
	
	public static int subtrair(int a, int b) {
		return(a - b);
	}
	
	public static int multiplicar(int a, int b) {
		return(a * b);
	}
	
	public static int divisao(int a, int b) {
		return(a / b);
	}
}
