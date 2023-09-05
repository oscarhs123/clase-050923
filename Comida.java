
public class Comida{
	
	//Declaramos atributos
	private String nombre;
	private String color;
	private int gradosTemp;
	private String sabor;

	public Comida(String nombre, String color, int gradosTemp, String sab){
		this.nombre = nombre;
		this.color = color;
		this.gradosTemp = gradosTemp;
		sabor = sab;
	}

	public String buenEstado(){
		return "Estoy en buen estado";
	}


	public String getSabor(){
		return sabor;
	}


	public void setSabor(String sabor){
		this.sabor = sabor;
	}

	

	public String toString(){
		String datosComida = nombre + " " + color + " " + gradosTemp + " " + sabor;
		return datosComida;
	}

	
	
	public static void main(String[] args) {

		Comida chilaquiles = new Comida("Chilaquiles", "Verde", 30, "Picoso"); //Creando objeto chilaquiles
		System.out.println(chilaquiles.getSabor()); //Imprimimos el sabor de chilaquiles através de su getter
		System.out.println(chilaquiles.buenEstado()); //nuestro objeto llama al metodo buenEstado() e imprime la cadena que devuleve
		System.out.println(chilaquiles.toString()); //chilaquiles llama al metodo toString() para imprimir sus datos

	}
}