package Entidade;

public class Bebida extends Produto {
	
	private String tipo;

	//Construtor herdado da super classe Produto
	public Bebida(int codigo, String nome, String tipo) {
		super(codigo, nome);
		this.tipo = tipo;
	}

	//Getters and Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
