package Entidade;

public class Doce extends Produto {
	
	private String marca;

	//Construtor herdado da super classe Produto
	public Doce(int codigo, String nome, String marca) {
		super(codigo, nome);
		this.marca = marca;
	}
	
	//Getters and Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	

}
