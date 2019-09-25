package fatec_ipi_factory_design_pattern_simplefactory_e_factory_method_exercicio;

public abstract class PatoFactory {
	
	public final Pato nascerPato (String type) {
		Pato pato = createPato(type);
		return pato;
	}
	
	public abstract Pato createPato(String type);	
}
