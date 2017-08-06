package classes;

public class Circulo {
	int raio;
	
	Circulo(int raio){
		this.raio = raio;
		
	}
	
	double calculaArea(){
		return (3.14 * (raio * raio));
		
	}
	
	double calculaCircunferencia(){
		return (2 * 3.14 * raio);
	}

}
