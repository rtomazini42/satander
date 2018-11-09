package banco;

public abstract class ContaAbstrata {
	private double saldo;
	private int numero;
	private String nome;
	private int agencia = 343;
	
	public boolean sacar(double valor){
		if(getSaldo()> valor){
			System.out.print("Saldo Suficiente ");
			System.out.println("Retirando " + valor);
			this.setSaldo(getSaldo() - valor);
			return true;
		} else{
			System.out.println("Saldo Insuficiente");
			return false;
		}
	}
	
	
	public void debitar(double valor) {
	
		sacar(valor);
		
	}
	
	public void creditar(double valor) {
		this.setSaldo(getSaldo() + valor);
		
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
	
	public int getAgencia() {
		return(agencia);
	}

}
