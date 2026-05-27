package heranca;

public class Testador extends Funcionario {
	
	private static float salarioBase = 40;

	public Testador(String nome, int cargaHoraria, int tempoServico) {
		super(nome, cargaHoraria, tempoServico);
	}
	
	public static float getSalarioBase() {
		return salarioBase;
	}

	public static void setSalarioBase(float salarioBase) {
		if(salarioBase > Testador.salarioBase)
			Testador.salarioBase = salarioBase;
	}
	
	@Override
	public float calculaSalario() {
		return (getCargaHoraria() * salarioBase) + (250 * getTempoServico());
	}
	

}
