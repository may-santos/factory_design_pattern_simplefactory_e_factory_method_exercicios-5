package fatec_ipi_factory_design_pattern_simplefactory_e_factory_method_exercicio;

public abstract class Pato {
	
	VoarBehavior voarBehavior;
	FalarBehavior falarBehavior;

	public void setVoarBehavior (VoarBehavior ab) {
		voarBehavior = ab;
	} 
	
	public void setFalarBehavior (FalarBehavior fb) {
		falarBehavior = fb;
	}
}