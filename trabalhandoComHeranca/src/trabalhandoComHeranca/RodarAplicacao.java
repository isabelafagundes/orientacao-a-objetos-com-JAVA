package trabalhandoComHeranca;

public class RodarAplicacao {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		//Upcast
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		
		//Downcast
		//Tansformando classe filha em classe mãe
		//Deve ser evitado por o que tem na classe mãe não tem na filha
		Vendedor vendedor_ = (Vendedor) new Funcionario();

	}

}
