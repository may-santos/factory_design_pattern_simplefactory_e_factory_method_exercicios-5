package fatec_ipi_factory_design_pattern_simplefactory_e_factory_method_exercicio;

public class SulPato extends Pato {
	
	public SulPato() {
		voarBehavior = new FlyBehavior();
		falarBehavior = new QuackBehavior();
	}
	
}
