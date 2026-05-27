package heranca;

public class Programador extends Funcionario {

	private static float salarioBase = 60;
	private int linhasDeCodigo;
	
	public Programador(String nome, int cargaHoraria, int tempoServico, int linhasCodigo) {
		super(nome, cargaHoraria, tempoServico);
		this.linhasDeCodigo = linhasCodigo;
	}
	
	public static float getSalarioBase() {
		return salarioBase;
	}
	
	public static void setSalarioBase(float salarioBase) {
		if(salarioBase > Programador.salarioBase)
			Programador.salarioBase = salarioBase;
	}

	public int getLinhasDeCodigo() {
		return linhasDeCodigo;
	}

	public void setLinhasDeCodigo(int linhasDeCodigo) {
		this.linhasDeCodigo = linhasDeCodigo;
	}
	
	@Override
	public float calculaSalario() {
		return (this.getCargaHoraria() * salarioBase) + (250 * this.getTempoServico());
	}
	
	
}
