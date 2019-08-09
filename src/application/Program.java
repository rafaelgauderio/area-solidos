package application;

import java.util.Scanner;

import entities.Calculos;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Informe uma valor da largura do sólido: ");
		double largura=scanner.nextDouble();
		System.out.println("Informe uma valor da altura do sólido: ");
		double altura=scanner.nextDouble();
		Calculos calculo=new Calculos(largura,altura);
		
		System.out.println("O valor da área de um Retangulo com as seguintes medidas é: "+calculo.areaRetangulo((altura), altura));
		System.out.println("O valor da área de um triangulo com as seguintes medidas é: "+calculo.areaTriangulo(largura, altura));
		
		
		
		
		
		scanner.close();

	}
}
