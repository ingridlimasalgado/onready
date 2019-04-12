package onready;

public class infoVehiculo {

	public static void main(String[] args) {

		Vehiculo vehiculo1= new Vehiculo("Peugeot", "206", 4, 200000);
		Vehiculo vehiculo2= new Vehiculo("Honda", "Titan", "125c", 60000);
		Vehiculo vehiculo3= new Vehiculo("Peugeot", "208", 5, 250000);
		Vehiculo vehiculo4= new Vehiculo("Yamaha", "YBR", "160c", 80500.50); 
		
		Vehiculo[] vehiculos={vehiculo1, vehiculo2, vehiculo3, vehiculo4};
		
		Vehiculo.imprimir(vehiculos);

		Vehiculo.masCaro(vehiculos);
		Vehiculo.masBaroto(vehiculos);
		
		Vehiculo.buscarLetra(vehiculos);
		
		Vehiculo.ordenar(vehiculos);
	}

	
	
}
