package fatec_ipi_factory_design_pattern_simplefactory_e_factory_method_exercicio;

public class NortePato extends Pato {
	
	public NortePato() {
		voarBehavior = new NoFlyBehavior();
		falarBehavior = new KuakBehavior();
	}
	
}
