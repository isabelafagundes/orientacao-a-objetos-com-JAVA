package exerciciosJava;
import java.util.Scanner;

public class anosEmDias {

	public static void main(String[] args) {
		
		int anos, meses, aDias, mDias, sDias, dias, diasTotal;
		
		System.out.println("Insira sua idade em anos, meses e semanas: ");
		System.out.println("Anos: ");
		Scanner lerAnos = new Scanner(System.in);
		anos = lerAnos.nextInt();
		
		System.out.println("Meses: ");
		Scanner lerMeses = new Scanner(System.in);
		meses = lerMeses.nextInt();
		
		System.out.println("Dias: ");
		Scanner lerDias = new Scanner(System.in);
		dias = lerDias.nextInt();
		
		aDias = anos * 365;
		mDias = meses * 30;
		diasTotal = aDias + mDias + dias;
		
		System.out.println(anos + " anos, " + meses + " meses, " + dias + " dias = " + diasTotal + " dias");
		
		
		
		

	}

}
