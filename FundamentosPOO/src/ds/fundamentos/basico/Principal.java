package ds.fundamentos.basico;

public class Principal {

	public static void main(String[] args) {
		//Creamos objetos del tipo Marca
		Marca ford = new Marca(1, "Ford");
		Marca renault = new Marca(2, "Renault");
		Marca toyota = new Marca(3, "Toyota");
		
		//Creamos objetos del tipo Coche
		Coche c1 = new Coche(1, "Ranger", ford);
		Coche c2 = new Coche(1, "Ranger", ford);
		Coche c3 = new Coche(1, "Ranger", ford);
		Coche c4 = new Coche(1, "Ranger", ford);
		Coche c5 = new Coche(1, "Ranger", ford);
		
		//Creamos un objeto del tipo Concesionario
		Concesionario con = new Concesionario("Donadio SRL", "Av. JB Alberdi 2334, La Plata", "30-33323123-2");
		con.addCoche(c1);
		con.addCoche(c2);
		con.addCoche(c3);
		con.addCoche(c4);
		con.addCoche(c5);
		
		System.out.println(con.toString());
				
	}

}
