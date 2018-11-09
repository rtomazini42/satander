package banco;

public class Conta extends ContaAbstrata{
	private int agencia = 343;
	
	public void debitar(double valor) {
			this.setSaldo(getSaldo() - valor);
			
		}
	
	public void sacar(double valor){
		if(getSaldo()> valor){
			System.out.println("Saldo Suficiente");
			debitar(valor);
		} else{
			System.out.println("Saldo Insuficiente, valor não retirado");
		}
	}
	
		
				
		//public void transferir(Conta contaDestino, double valor) {
		//	this.debitar(valor);
		//	contaDestino.creditar(valor);
		//}
	public int getAgencia() {
		return agencia;
	}
		
		
		
	

}
