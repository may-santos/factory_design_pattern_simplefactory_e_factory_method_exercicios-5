package fatec_ipi_factory_design_pattern_simplefactory_e_factory_method_exercicio;

import java.util.ArrayList;
import java.util.Random;


public class TestePatoFactory {

	public static void main(String[] args) {
		PatoFactory[] patosFac  = {
				new SulPatoFactory(),
				new NortePatoFactory() };
		
		ArrayList<Pato> patos = new ArrayList<Pato>();
		Random random = new Random();
		String type = "";
		
		for (int i = 0; i < 5; i++) {
			int gerador = random.nextInt(2);
			if (gerador == 1) {
				type = "sul";
				patos.add(patosFac[0].nascerPato(type));
			} else {
				type = "norte";
				patos.add(patosFac[1].nascerPato(type));

			}
		}
		
		for (Pato p : patos) {
			p.voarBehavior.voar();
			p.falarBehavior.falar();
			System.out.println();
		}
	}
}
