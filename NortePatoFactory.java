package fatec_ipi_factory_design_pattern_simplefactory_e_factory_method_exercicio;

public class NortePatoFactory extends PatoFactory {

	@Override
	public Pato createPato(String type) {
		if (type.equalsIgnoreCase("norte")) {
			return new NortePato();
		}
		return null;
	}

}
