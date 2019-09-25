package fatec_ipi_factory_design_pattern_simplefactory_e_factory_method_exercicio;

public class NoFlyBehavior implements VoarBehavior {

	@Override
	public void voar() {
		System.out.println("Não sei voar...");
		
	}


}
