package ds.patrones.builder.ejemplo1;

public class Main {

	public static void main(String[] args) {
		Director dir = new Director();

		//Construimos un auto base
		ConstructorAutoBase cab = new ConstructorAutoBase();
		dir.construirAuto(cab);
		Auto autoBase = cab.getAuto();
		System.out.println(autoBase.toString());
		
		//Construimos un auto full
		ConstructorAutoFull caf = new ConstructorAutoFull();
		dir.construirAuto(caf);
		Auto autoFull = caf.getAuto();
		System.out.println(autoFull.toString());
		
		//Construimos un auto gama media
		ConstructorAutoMedio cam = new ConstructorAutoMedio();
		dir.construirAuto(cam);
		Auto autoGMedia = cam.getAuto();
		System.out.println(autoGMedia.toString());
		
		
		

	}

}
