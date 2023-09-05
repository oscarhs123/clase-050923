/**
 * Clase Comida para simular platillos con nombre, color, temperatura y sabor
*/

public class Comida{
	
	//Declaramos atributos
	private String nombre;
	private String color;
	private int gradosTemp;
	private String sabor;

	/**
	 * Constructor, para crear obejtos de tipo comida
	 * @param nombre: nombre que le asignamos a nuestra instancia 
	 * @param color: el color que le asignamos a nuestra instancia
	 * @param gradosTemp: la temperatura en grados de nuestra instancia
	 * @param sab: el sabor que le asignamos a nuestra instancia
	*/

	public Comida(String nombre, String color, int gradosTemp, String sab){
		this.nombre = nombre;
		this.color = color;
		this.gradosTemp = gradosTemp;
		sabor = sab;
	}

	/**
	 * Metodo que imprime el estado de la comida 
	 * @return una cadena de texto que indica el buen estado de la comida
	 */
	public String buenEstado(){
		return "Estoy en buen estado";
	}

	/**
	 *Getter 
	 * @return el valor del atributo sabor  
	*/
	public String getSabor(){
		return sabor;
	}

	/**
	 * Setter de sabor
	 * @param sabor : el nuevo valor del atributo sabor
	*/
	public void setSabor(String sabor){
		this.sabor = sabor;
	}

	
	@Override
	public String toString(){
		String datosComida = nombre + " " + color + " " + gradosTemp + " " + sabor;
		return datosComida;
	}

	
	//Metodo main: el metodo que ejcuta el compilador de Java
	public static void main(String[] args) {

		Comida chilaquiles = new Comida("Chilaquiles", "Verde", 30, "Picoso"); //Creando objeto chilaquiles
		System.out.println(chilaquiles.getSabor()); //Imprimimos el sabor de chilaquiles através de su getter
		System.out.println(chilaquiles.buenEstado()); //nuestro objeto llama al metodo buenEstado() e imprime la cadena que devuleve
		System.out.println(chilaquiles.toString()); //chilaquiles llama al metodo toString() para imprimir sus datos

	}
}