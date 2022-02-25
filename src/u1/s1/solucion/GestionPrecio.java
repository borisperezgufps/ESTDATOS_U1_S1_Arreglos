package u1.s1.solucion;

import javax.swing.JOptionPane;

public class GestionPrecio {

	private int[] precios = new int[20];
	private double promedio;
	
	public void ingresarValores() {
		
		for(int i=0;i<precios.length;i++){
			String valor = JOptionPane.showInputDialog("Ingrese valor:");
			int val = Integer.parseInt(valor);
			precios[i] = val;
		}
		
	}
	
	public void imprimirValores() {
		for(int i=0;i<precios.length;i++){
			System.out.println(precios[i] + " | ");
		}
	}
	
	public void imprimirSuma() {
		int suma = calcularSuma();		
		System.out.println("Suma = "+suma);		
	}
	
	public void calcularPromedio() {
		
		int suma = calcularSuma();		
		promedio = (double) suma / 20;
		System.out.println("Prom = "+promedio);
	}
	
	private int calcularSuma() {
		int suma = 0;
		for(int i=0;i<precios.length;i++){
			suma += precios[i];
		}
		return suma;
	}
	
	/**
	 * Se requiere que antes se ejecute el método
	 * calcularPromedio().
	 */
	public void imprimirMayoresPromedio() {
		
	}
	
	
}







