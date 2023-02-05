package Entidade;

public class Revista extends Produto{
	
	private String editora;

	//Construtor herdado da super classe Produto
	public Revista(int codigo, String nome, String editora) {
		super(codigo, nome);
		this.editora = editora;
	}

	//Getters and Setters
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	

}
