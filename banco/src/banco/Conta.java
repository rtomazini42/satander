package banco;

public class Conta extends ContaAbstrata{
	private int agencia = 343;
	
	public void debitar(double valor) {
			this.setSaldo(getSaldo() - valor);
			
		}
	
		
				
		//public void transferir(Conta contaDestino, double valor) {
		//	this.debitar(valor);
		//	contaDestino.creditar(valor);
		//}
	public int getAgencia() {
		return agencia;
	}
		
		
		
	

}
