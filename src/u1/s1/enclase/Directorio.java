package u1.s1.enclase;

public class Directorio {

	private int[] telefonos;
	private int contador;
	
	public Directorio(int tamanio) {
		telefonos = new int[tamanio];
	}
	
	public void ingresarTelefonoV1(int telefono) {
		
		for(int i=0;i<telefonos.length;i++) {
			if(telefonos[i]==0) {
				telefonos[i] = telefono;
				contador++;
				break;
			}
		}
		
	}
	
	public void ingresarTelefonoV2(int telefono) {
		
		telefonos[contador] = telefono;
		contador++;
		
	}
	
	public void ingresarTelefono(int posicion, int telefono) {
		
		// Validar que la posición esté vacía
		if(telefonos[posicion]==0) {
		
			// Si está vacía, asignar
			telefonos[posicion] = telefono;
		
		}
		
	}
	
	public void eliminarTelefono() {
		
	}
	
	public void actualizarTelefono() {
		
	}
	
	public int obtenerTamanio() {
		return telefonos.length;
	}
	
}
