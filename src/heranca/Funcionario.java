package heranca;

public abstract class Funcionario {
	
	private String nome;
	private int cargaHoraria;
	private int tempoServico;

	public Funcionario(String nome, int cargaHoraria, int tempoServico) {
		this.nome = nome;
		
		if(cargaHoraria < 0)
			this.cargaHoraria = 0;
		else
			this.cargaHoraria = cargaHoraria;
		
		this.tempoServico = tempoServico;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTempoServico() {
		return tempoServico;
	}
	
	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		if(cargaHoraria < 0)
			this.cargaHoraria = 0;
		else
			this.cargaHoraria = cargaHoraria;
	}
	
	public abstract float calculaSalario();
	

}
