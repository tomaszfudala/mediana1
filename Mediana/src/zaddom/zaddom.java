package zaddom;
import java.util.Arrays;
import java.util.Random;

public class zaddom {

	public static void main(String[] args) {
		int[] tabela = new int[100];
		Random generator = new Random();
		for(int i = 0; i < 100; i++) {
			tabela[i] = generator.nextInt(10);
			System.out.println("tabela[" + i + "] = " + tabela[i]);
		}
int max = tabela[0];
for (int i = 0; i < 100; i++) {
	if(tabela[i] > max) {
		max = tabela[i];
	}
	
}
int suma = 0;
for(int i = 0; i < 100; i++) {
	suma += tabela[i];
}
double a = 100;
double srednia = suma/a;
Arrays.sort(tabela);
double mediana = 0;
double ssrednia = 0.0;
for(int i = 0; i < tabela.length; i++) {
	System.out.println("sort = " + tabela[i]);
	srednia = tabela[tabela.length/2] + tabela[(tabela.length/2) - 1];
	mediana = srednia/2.0;
	
}
System.out.println("mediana = " + mediana);
System.out.println("srednia = " + srednia);
System.out.println("max = " + max);
System.out.println("suma" + suma);
	}

}

