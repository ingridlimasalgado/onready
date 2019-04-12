package onready;


public class Vehiculo {

	private String marca;
	private String modelo;
	private int puertas;
	private String cilindrada;
	private double precio;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public String getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//C
	public Vehiculo() {}
	public Vehiculo(String marca, String modelo, int puertas, double precio){
		this.marca=marca;
		this.modelo=modelo;
		this.puertas=puertas;
		this.precio=precio;
	}
	public Vehiculo(String marca, String modelo, String cilindrada, double precio){
		this.marca=marca;
		this.modelo=modelo;
		this.cilindrada=cilindrada;
		this.precio=precio;
	}
	
	

	
	public static void imprimir(Vehiculo[] vehiculos){
		for(int i=0; i<vehiculos.length; i++){
			if(vehiculos[i].cilindrada==null)
				System.out.print("Marca: "+vehiculos[i].marca+" // Modelo: "+vehiculos[i].modelo+" // Puertas: "+vehiculos[i].puertas+" // Precio: $"+vehiculos[i].precio+"\n");
			else 
				System.out.print("Marca: "+vehiculos[i].marca+" // Modelo: "+vehiculos[i].modelo+" // Cilindrada: "+vehiculos[i].cilindrada+" // Precio: $"+vehiculos[i].precio+"\n");
		}
	}
	
	public static void masCaro(Vehiculo[] vehiculos){
		
		double mayorPrecio; 
		int posicion=0;
		mayorPrecio=vehiculos[0].precio;
		
		for( int i=1; i<vehiculos.length; i++){
			if(vehiculos[i].precio>mayorPrecio){
				mayorPrecio=vehiculos[i].precio;
				posicion=i;
			}
		}	
		System.out.print("===\nVehículo más caro: "+vehiculos[posicion].marca+" "+vehiculos[posicion].modelo+"\n");
	}
	
	public static void masBaroto(Vehiculo[] vehiculos){
		
		double menorPrecio; 
		int posicion=0;
		menorPrecio=vehiculos[0].precio;
		
		for( int i=1; i<vehiculos.length; i++){			
			if(vehiculos[i].precio<menorPrecio){
				menorPrecio=vehiculos[i].precio;
				posicion=i;
			}
		}	
		System.out.print("Vehículo más barato: "+vehiculos[posicion].marca+" "+vehiculos[posicion].modelo+"\n");
	}
		
	public static void buscarLetra(Vehiculo[] vehiculos){
		String letraBuscada="Y";
		String letraEncontrada;
		
		for(int i=0; i<vehiculos.length; i++){
			char[] palabra=vehiculos[i].modelo.toCharArray();
			for(int j=0; j<palabra.length; j++){
				letraEncontrada=String.valueOf(palabra[j]);
				if(letraBuscada.equalsIgnoreCase(letraEncontrada))
					System.out.print("Vehículo que contiene en el modelo la letra 'Y': "+vehiculos[i].marca+" "+vehiculos[i].modelo+" "+vehiculos[i].precio+"\n");
			}
		}
	}
	
	public static void ordenar(Vehiculo[] vehiculos){
		Vehiculo v=new Vehiculo();
		
		for(int i=1; i<vehiculos.length; i++){
			for(int j=0; j<vehiculos.length-1; j++){
				if(vehiculos[j].precio<vehiculos[j+1].precio){
					v=vehiculos[j];
					vehiculos[j]=vehiculos[j+1];
					vehiculos[j+1]=v;
				}
			}
		}
		
		System.out.print("====\nEJERCICIO EXTRA\n\nVehículos ordenados por precio de mayor a menor:  \n");
		for(int i=0; i<vehiculos.length; i++)
			System.out.print(vehiculos[i].marca+" "+vehiculos[i].modelo+"\n");
	
	}
}
