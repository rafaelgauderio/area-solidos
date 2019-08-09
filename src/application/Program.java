package application;

import java.util.Scanner;

import entities.Calculos;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Informe uma valor da altura do s�lido: ");
		double altura=scanner.nextDouble();
		System.out.println("Informe uma valor da largura do s�lido: ");
		double largura=scanner.nextDouble();
		
		
		
		Calculos calculo=new Calculos(altura,largura);
		
		System.out.println();
		System.out.println(calculo);
		System.out.println("O valor da �rea de um Retangulo com as seguintes medidas �: "+calculo.areaRetangulo((altura), altura));
		System.out.println("O valor da �rea de um triangulo com as seguintes medidas �: "+calculo.areaTriangulo(largura, altura));
		
	
		
		
		
		scanner.close();

	}
}
