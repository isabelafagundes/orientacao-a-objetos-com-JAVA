package trabalhandoComPolimorfismo;

public class ExemploPolimorfismo {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.mostraDados();
		//---------------------------------------------------
		
		//possui polimorfismo, pois cria um novo livro atrav�s da classe Produto, por�m apenas � executado os met�dos sobrescritos de Produto
		Produto p2 = new Livro(); 
		p2.mostraDados();
		
		//----------------------------------------------------
		Livro l1 = new Livro(); //n�o possui polimorfismo
		l1.mostraDados();
		l1.mostraAutor();
		
		//----------------------------------------------------
		Livro l2 = (Livro) l1; //cria uma nova inst�ncia da inst�ncia l1
		l2.mostraAutor();
		
		//----------------------------------------------------
		Produto p3 = new Revista();
		p3.mostraDados();
		
	}

}
