package Entidade;

public abstract class Produto {
	
	//Atributos
	private int codigo;
	private String nome;
	private int estoque;
	private double valorUnitario;
	
	//Construtor
	public Produto(int codigo, String nome){
		
		//Atributo = parâmetro recebido;
		this.codigo = codigo;
		this.nome = nome;
	}

	//Source -> Genarete Getters and Setters
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstoque() {
		return estoque;
	}

	
	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	//Métodos
	
	
	//Atualizar quantidade do estoque:
	public void incluirEstoque(int quantidade){
		
		estoque = estoque + quantidade;
	}
	
	
	//Tirar quantidade do estoque:
	public void tirarEstoque(int quantidade){
		
		if(quantidade <= estoque) {
			
			estoque = estoque - quantidade;
			
		}else {
			
			System.out.println("Estoque indisponível!");
			
		}
		
	}
	
	
}
