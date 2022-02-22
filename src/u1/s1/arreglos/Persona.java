package u1.s1.arreglos;

import javax.swing.JOptionPane;

public class Persona {

	private int telefono;
	private String nombres;
	
	public Persona(String nombres, int telefono) {
		this.nombres = nombres;
		this.telefono = telefono;
	}
	
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Ingrese valor");
		System.out.println(valor);
	}
		
}
