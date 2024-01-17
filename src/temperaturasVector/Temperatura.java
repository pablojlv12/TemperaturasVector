package temperaturasVector;

import java.util.Arrays;

public class Temperatura {

	private int temperaturas[];
	private int contador;

	public Temperatura() {

		temperaturas = new int[7];
		contador = 0;
	}

	public void addTemp(int temp) {

		if (contador == temperaturas.length) {
			contador = 0;

		}
		temperaturas[contador] = temp;
		contador++;
	}

	
	public int buscaTemp(int temp) {


		int contador = 0;
		int pos=-9999;
		
		while(contador<temperaturas.length) {
			
			if(temperaturas[contador]==temp) {
				
				pos = contador;
			}
			
			contador++;
		}
		
		return pos;
	}

	@Override
	public String toString() {
		return Arrays.toString(temperaturas) + " " + contador;
	}
}
