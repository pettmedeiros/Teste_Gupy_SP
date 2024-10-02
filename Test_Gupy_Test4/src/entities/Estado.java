package entities;

public class Estado {

	private String nome;
	private double faturamento;
	
	public Estado(String nome, double faturamento) {
		this.nome = nome;
		this.faturamento = faturamento;
	}

	public String getNome() {
		return nome;
	}

	public double getFaturamento() {
		return faturamento;
	
	}
	
	public double percentual(double total) {
		return (faturamento / total) * 100; 
	}
	
}
