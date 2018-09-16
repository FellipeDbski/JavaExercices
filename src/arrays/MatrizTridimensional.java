package arrays;

public class MatrizTridimensional {

	public static void main(String[] args) {
		
		//Cada elemento da matriz é a soma de seus índices.
		//O algoritmo cria no primeiro laço os valores em cada índice
		//No segundo laço o algoritmo soma os mesmos e define se tal valor é par ou impar.
		//Ajuste**
		
		int[][][] matrizTridimensional = new int[3][3][3];
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		
		for(int i = 0; i < matrizTridimensional.length; i++) {
			for(int j = 0; j < matrizTridimensional[i].length; j++ ) {
				for(int k = 0; k < matrizTridimensional[i][j].length; k++) {
					matrizTridimensional[i][j][k] = i + j + k;
					System.out.println(" I = " + i + " J = "+ j +" K = " + k);
					System.out.println("------------------------------------");
				}
			}
		}
		
		for(int i = 0; i < matrizTridimensional.length; i++) {
			for(int j = 0; j < matrizTridimensional[i].length; j++ ) {
				for(int k = 0; k < matrizTridimensional[i][j].length; k++) {
					soma += matrizTridimensional[i][j][k];
					
					if(matrizTridimensional[i][j][k] % 2 == 0) {
						somaPares += matrizTridimensional[i][j][k];
					}
					else {
						somaImpares += matrizTridimensional[i][j][k];
					}
				}
			}
		}
		
		System.out.println("A soma dos valores Pares: " + somaPares);
		System.out.println("A soma dos valores Impares: " + somaImpares);
		System.out.println("A soma Total: " + soma);
	}

}
