package banco;

public class Conta extends ContaAbstrata{
	private int agencia = 343;
	
	public void debitar(double valor) {
			this.setSaldo(getSaldo() - valor);
			
		}
	
	public boolean sacar(double valor){
		if(getSaldo()> valor){
			System.out.println("Saldo Suficiente");
			debitar(valor);
			return true;
		} else{
			System.out.println("Saldo Insuficiente");
			return false;
		}
	}
	
		
				
	public void transferir(Conta contaDestino, double valor) {
		if (sacar(valor) == true){
			System.out.println("Transferindo para" + contaDestino.getNome());
			contaDestino.creditar(valor);
		}else{
			System.out.println("Não tem saldo para transferencia");
		}
			
	}
		
		
	public int getAgencia() {
		return agencia;
	}
		
		
		
	

}
