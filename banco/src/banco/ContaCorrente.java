package banco;

public class ContaCorrente extends ContaAbstrata{

		
	
			
				
	public void transferir(ContaCorrente contaDestino, double valor) {
		if (sacar(valor) == true){
			System.out.println("Transferindo para" + contaDestino.getNome());
			contaDestino.creditar(valor);
		}else{
			System.out.println("Não tem saldo para transferencia");
		}
			
	}
		

		
		
	

}
