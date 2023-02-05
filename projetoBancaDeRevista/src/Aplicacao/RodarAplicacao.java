package Aplicacao;

//* para importar todas as classes de Entidade
import Entidade.*; 

public class RodarAplicacao {
	public static void main(String[] args) {
		
		Bebida produto1 = new Bebida(1, "Coca Cola", "Refrigerante");
		Doce produto2 = new Doce(2, "Chocolate", "Lacta");
		Revista produto3 = new Revista(3, "Albúm de Figurinhas", "Panini");
		
		
		//Incluir estoque dos Produtos
		produto1.incluirEstoque(7);
		produto1.setValorUnitario(3.50);
		
		produto2.incluirEstoque(4);
		produto2.setValorUnitario(2.50);
		
		produto3.incluirEstoque(6);
		produto3.setValorUnitario(19.99);
		
		//Imprimir dados dos produtos
		System.out.println("- " + produto1.getNome() + " COD:" + produto1.getCodigo());
		System.out.println("Estoque: " + produto1.getEstoque() + "\nValor unitário: " + produto1.getValorUnitario() + "\nTipo: " + produto1.getTipo());
		
		System.out.println("\n- " + produto2.getNome() + " COD:" + produto2.getCodigo());
		System.out.println("Estoque: " + produto2.getEstoque() + "\nValor unitário: " + produto2.getValorUnitario() + "\nMarca: " + produto2.getMarca());
		
		System.out.println("\n- " + produto3.getNome() + " COD:" + produto3.getCodigo());
		System.out.println("Estoque: " + produto3.getEstoque() + "\nValor unitário: " + produto3.getValorUnitario() + "\nEditora: " + produto3.getEditora());
		
		
		//Tirar produtos do estoque
		produto1.tirarEstoque(3);
		System.out.println("\nNovo estoque de " + produto1.getNome() + " é " + produto1.getEstoque());
		
	}

}
