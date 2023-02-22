package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoOdin = new Conta();
		contaDoOdin.saldo = 100;
		contaDoOdin.deposita(50);
		System.out.println(contaDoOdin.saldo);
		
		boolean conseguiuRetirar = contaDoOdin.saca(20);
		System.out.println(contaDoOdin.saldo);
		System.out.println(conseguiuRetirar);
	}
}
