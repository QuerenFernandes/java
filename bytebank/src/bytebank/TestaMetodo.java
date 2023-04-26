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
		
		
		Conta contaDaNoemy = new Conta();
		contaDaNoemy.saldo = 0;
		
		contaDaNoemy.deposita(5000);
		
		if(contaDaNoemy.transfere(500, contaDoOdin)) {
			System.out.println("transferencia com sucesso");
			System.out.println("o novo saldo da conta do Odin"
					+ " e: " + contaDoOdin.saldo);
			System.out.println("o novo saldo da conta da Noemy"
					+ " e: " + contaDaNoemy.saldo);
			
		}else {
			System.out.println("transferencia nao realizada, "
					+ "sem saldo disponivel");
		}
		
	
		
	}
}
