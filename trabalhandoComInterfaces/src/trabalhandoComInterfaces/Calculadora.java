package trabalhandoComInterfaces;

class Calculadora implements OperacaoMatematica {
	
	//Met�dos da interface foram sobrescritos

	@Override
	public void soma(double operando1, double operando2) {
		System.out.println("Soma: " + operando1 + operando2);
		
	}

	@Override
	public void subtracao(double operando1, double operando2) {
		System.out.println("Subtra��o: " + (operando1 - operando2));
		
	}

	@Override
	public void multiplicacao(double operando1, double operando2) {
		System.out.println("Multiplica��o: " + (operando1 * operando2));
		
	}

	@Override
	public void divisao(double operando1, double operando2) {
		System.out.println("Divis�o: " + (operando1 / operando2));
		
	}


}
