package trabalhandoComOrientacaoAObjetos;

public class MostrarCompra {

	public static void main(String[] args) {
		
		Livraria compra1 = new Livraria();
		
		compra1.setNomeLivro("Heartstopper");
		compra1.setAutor("Alice Oseman");
		compra1.setEditora("Seguinte");
		compra1.setPrecoLivro(39.9);
		
		System.out.println(compra1.getNomeLivro());
		System.out.println(compra1.getAutor());
		System.out.println(compra1.getEditora());
		System.out.println(compra1.getPrecoLivro());
		System.out.println(compra1.valorParcelas(2));
		
		Livraria compra2 = new Livraria("Pequeno Principe", "Fulano", "Editora Legal", 10);
		
		System.out.println("\n" + compra2.getNomeLivro());
		System.out.println(compra2.getAutor());
		System.out.println(compra2.getEditora());
		System.out.println(compra2.getPrecoLivro());
		System.out.println(compra2.valorParcelas(5));
		
	}

}
