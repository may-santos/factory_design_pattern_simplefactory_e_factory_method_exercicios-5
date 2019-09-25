package fatec_ipi_factory_design_pattern_simplefactory_e_factory_method_exercicio;

public class SulPatoFactory extends PatoFactory {

	@Override
	public Pato createPato(String type) {
		
		if (type.equalsIgnoreCase("sul")) {
			return new SulPato();
		}
		return null;
	}

}
