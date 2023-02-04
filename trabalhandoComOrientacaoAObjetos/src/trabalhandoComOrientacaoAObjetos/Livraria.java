package trabalhandoComOrientacaoAObjetos;

class Livraria {

		String nomeLivro;
		String autor;
		String editora;
		double precoLivro;
		
		//Construtor
		
		Livraria(){}
		
		Livraria(String nomeLivro, String autor, String editora, double precoLivro){
			this.nomeLivro = nomeLivro;
			this.autor =  autor;
			this.editora =  editora;
			this.precoLivro = precoLivro;
		}
		
		// Set e Get
		
		void setNomeLivro(String nomeLivro) {
			this.nomeLivro = nomeLivro;
		}
		
		String getNomeLivro(){
			return nomeLivro;
		}
		
		void setAutor(String autor) {
			this.autor = autor;
		}
		
		String getAutor(){
			return autor;
		}
		
		void setEditora(String editora){
			this.editora = editora;
		}
		
		String getEditora(){
			return editora;
		}
		
		void setPrecoLivro(double precoLivro){
			this.precoLivro = precoLivro;
		}
		
		double getPrecoLivro(){
			return precoLivro;
		}
		
		double valorParcelas(double numeroParcelas) {
			return precoLivro / numeroParcelas;	
		}

}
