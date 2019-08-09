package entities;

public class Calculos {
	
	//variáveis
	
	private double altura;
	private double largura;

			
	//contrutores
	
	public Calculos() {
		
	}
	
	public Calculos(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	
	//getter and setters
	

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	
	
//funcoes
	
	public double areaRetangulo(double largura,double altura) {
		return this.largura * this.altura;
		
	}

	public double areaTriangulo(double largura, double altura) {
		return (this.largura*this.altura)/2;
	}

	@Override
	public String toString() {
		return "[altura=" + altura + ", largura=" + largura + "]";
	}
	
	
	
}
