package banco;

public class main {

	public static void main(String[] args) {
		//testes aqui
		Conta conta1 = new Conta();
		System.out.println(conta1.getSaldo());
		conta1.creditar(20.30);
		System.out.println(conta1.getSaldo());
	}

}
