
public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Manuel");
		System.out.println("Nombre: " + cliente.getNombre());
		cliente.setEdad(28);
		System.out.println("Edad: " + cliente.getEdad());
		cliente.setTelefono(1234567);
		System.out.println("Telefono: " + cliente.getTelefono());
		cliente.setCredito(225);
		System.out.println("Credito: " + cliente.getCredito());
		
		System.out.println("----------------------------------------------");
		
		Trabajador trabajador = new Trabajador();
		trabajador.setNombre("Jorge");
		System.out.println("Nombre: " + trabajador.getNombre());
		trabajador.setEdad(27);
		System.out.println("Edad: " +trabajador.getEdad());
		trabajador.setTelefono(12345678);
		System.out.println("Telefono: " +trabajador.getTelefono());
		trabajador.setSalario(255875);
		System.out.println("Salario: " +trabajador.getSalario());
		
		
			
		}	
	}

class Persona {
	private String nombre;
	private int edad;
	private int telefono;
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void setEdad (int edad) {
		this.edad = edad;
	}
	
	public int getEdad () {
		return edad;
	}
	
	public void setTelefono (int telefono) {
		this.telefono = telefono;
	}
	
	public int getTelefono () {
		return telefono;
	}
	
}

class Cliente extends Persona {
	private int credito;
	
	public void setCredito (int credito) {
		this.credito = credito;
	}
	
	public int getCredito () {
		return credito;
	}
}

class Trabajador extends Persona {
	private float salario;
	
	public void setSalario (int salario) {
		this.salario = salario;
	}
	
	public float getSalario () {
		return salario;
	}

	}


