package trabalhandoComOrientacaoAObjetos;

class Carro {
	String modelo;
	String cor;
	int capacidadeTanque;
	
	// Sobrecarga do construtor
	
	Carro(){
		
	}
	
	Carro(String cor, String modelo, int capacidadeTanque){
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	
	// set e get, colocar dados em atributos e retornar atributos
	void setCor(String cor) {
		this.cor = cor;
	}
	
	String getCor(){
		return cor;
	}
	
	void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	String getModelo() {
		return modelo;
	}
	
	void setCapacidadeTanque(int capacidadeTanque){
		this.capacidadeTanque = capacidadeTanque;
	}
	
	int getCapacidadeTanque(){
		return capacidadeTanque;
	}
	
	double totalValorTanque(double valorCombustivel){
		return capacidadeTanque * valorCombustivel;
	}
}
