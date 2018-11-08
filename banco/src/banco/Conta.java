package banco;

public class Conta {
		private double saldo;
		private int numero;
		private String nome;
		private int agencia;
		
		public Conta() {
			this.saldo = 0.0;
			this.nome = "User";
			this.agencia = 123;
			this.numero = 0000;
		}
		
		public Conta(int numero,double saldo) {
			this.numero = numero;
			this.saldo = saldo;
		}
		public void creditar(double valor) {
			this.saldo = this.saldo + valor;
			
		}
		public void debitar(double valor) {
			this.saldo = this.saldo - valor;
			
		}
		public void transferir(Conta contaDestino, double valor) {
			this.debitar(valor);
			contaDestino.creditar(valor);
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
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		
		
	

}
