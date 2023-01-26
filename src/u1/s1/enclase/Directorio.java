package u1.s1.enclase;

public class Directorio {

	private int[] telefonos;
	private int contador;
	
	public Directorio(int tamanio) {
		telefonos = new int[tamanio];
	}
	
	/**
	 * Alternativa para registrar los teléfonos dentro del arreglo.
	 * Se recorre el arreglo hasta encontrar una posición en 0
	 * y se guarda el teléfono ahí.
	 * @param telefono
	 */
	public void ingresarTelefonoV1(int telefono) {
		
		for(int i=0;i<telefonos.length;i++) {
			if(telefonos[i]==0) {
				telefonos[i] = telefono;
				contador++;
				break;
			}
		}
		
	}
	
	/**
	 * Alternativa para registrar los teléfonos dentro del arreglo.
	 * Se usa un contador externo para conocer la siguiente posición
	 * en la que se guardará. Pero tiene un problema.
	 * @param telefono
	 */
	public void ingresarTelefonoV2(int telefono) {
		
		telefonos[contador] = telefono;
		contador++;
		
	}
	
	/**
	 * Registra un teléfono en la posición indicada.
	 * @param posicion
	 * @param telefono
	 */
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
