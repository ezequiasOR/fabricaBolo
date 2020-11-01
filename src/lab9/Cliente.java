package lab9;

public class Cliente {
	public static void main(String[] args) {
		Cobertura cMorango = new CoberturaMorango();
		Cobertura cCaramelo = new CoberturaCaramelo();
		
		FabricaBolo fBoloBaunilha = new FabricaBoloBaunilha(cCaramelo);
		FabricaBolo fBoloChocolate = new FabricaBoloChocolate(cMorango);
		
		fBoloBaunilha.prepararBolo();
		fBoloChocolate.prepararBolo();
	}
}