package u1.s2.matrices;

import javax.swing.JOptionPane;

public class Procesamiento {

	private int[][] matrix = new int[10][10];

	/**
	 * Inicializa la matriz solicitando los valores de una vez
	 */
	public void inicializarMatriz() {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				String valor = JOptionPane.showInputDialog("Ingrese valor: ");
				int valorInt = Integer.parseInt(valor);
				matrix[row][column] = valorInt;
			}
		}
	}

	/**
	 * Se inicializa la matriz encontrando la primera posición
	 * disponible, y se registra el valor pasado en el parámetro
	 * @param valor
	 */
	public void ingresarDatoMatriz(int valor) {
		// Busca una posición fila/columna disponible

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] == 0) {
					matrix[row][column] = valor;
					break;
				}
			}
		}
	}

	/**
	 * Vuelve a instanciar la matriz.
	 */
	public void limpiarMatriz() {
		matrix = new int[10][10];
	}

	/**
	 * Imprime la matriz fila por fila. Se incluye un salto de línea
	 * para separar las filas al imprimir.
	 */
	public void imprimirMatriz() {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Se suman todos los elementos de la matriz y se imprime el valor.
	 */
	public void sumarElementos() {
		int total = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				total += matrix[row][column];
			}
		}
		System.out.println("Suma elementos = "+total);
	}
	
	/**
	 * Se imprime la suma de cada fila de la matriz. 
	 */
	public void calcularSumaFilas() {
		
	}
	
	/**
	 * Se imprime los elementos de la fila cuyos elementos sumen el mayor número. 
	 */
	public void calcularMayorSumaFila() {
		
	}

}
