package banco;

public abstract class ContaAbstrata {
	private double saldo;
	private int numero;
	private String nome;
	

	public void creditar(double valor) {
		this.setSaldo(getSaldo() + valor);
		
	}
	
	public abstract void debitar(double valor);
	
	public void renderJuros(double juros) {
		this.saldo = this.saldo * juros;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
