package lab9;

public abstract class FabricaBolo {
	
	private Cobertura cobertura;
	
	public FabricaBolo(Cobertura cobertura) {
		this.cobertura = cobertura;
	}
	
	public void prepararBolo() {
		fazerMassa();
		levarAoForno();
		cobertura.fazerCobertura();
		decorarBolo();
	}
	
	private void levarAoForno() {
		System.out.println("Leva ao forno");
	}
	
	protected abstract void fazerMassa();
	
	private void decorarBolo() {
		System.out.println("Decora bolo");
	}

	public Cobertura getCobertura() {
		return cobertura;
	}

	public void setCobertura(Cobertura cobertura) {
		this.cobertura = cobertura;
	}
	
}
