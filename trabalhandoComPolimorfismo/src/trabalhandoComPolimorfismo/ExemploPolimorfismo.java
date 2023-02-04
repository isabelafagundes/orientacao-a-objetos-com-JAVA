package trabalhandoComPolimorfismo;

public class ExemploPolimorfismo {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.mostraDados();
		//---------------------------------------------------
		
		//possui polimorfismo, pois cria um novo livro através da classe Produto, porém apenas é executado os metódos sobrescritos de Produto
		Produto p2 = new Livro(); 
		p2.mostraDados();
		
		//----------------------------------------------------
		Livro l1 = new Livro(); //não possui polimorfismo
		l1.mostraDados();
		l1.mostraAutor();
		
		//----------------------------------------------------
		Livro l2 = (Livro) l1; //cria uma nova instância da instância l1
		l2.mostraAutor();
		
		//----------------------------------------------------
		Produto p3 = new Revista();
		p3.mostraDados();
		
	}

}
