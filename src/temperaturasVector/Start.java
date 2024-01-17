package temperaturasVector;

public class Start {

	public static void main(String[] args) {

		Temperatura uno = new Temperatura();

		
		uno.addTemp(1);
		uno.addTemp(2);
		uno.addTemp(3);
		uno.addTemp(4);
		uno.addTemp(5);
		uno.addTemp(6);
		uno.addTemp(7);
		uno.addTemp(8);
		uno.addTemp(9);
		uno.addTemp(10);

		System.out.println(uno);
		System.out.println(uno.buscaTemp(0));

		
	}

}
