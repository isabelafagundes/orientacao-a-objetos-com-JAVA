package trabalhandoComMetodos;
import java.util.Scanner;

public class SaudacaoPeloHorario {

	public static void main(String[] args) {
		
		int horas;
		
		System.out.println("Insira as horas: ");
		Scanner lerHoras = new Scanner(System.in);
		horas = lerHoras.nextInt();
		
		switch(horas) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 12:
			bomDia();
			break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			boaTarde();
			break;
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 0:
			boaNoite();
			break;
		default:
			System.out.println("Hora inválida");
			
		}
		

	}

	public static void bomDia(){
		System.out.println("Bom dia!");
	}
	
	public static void boaTarde(){
		System.out.println("Boa tarde!");
	}
	
	public static void boaNoite(){
		System.out.println("Boa noite!");
	}
	
}
