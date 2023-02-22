package bytebankComposto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente odin = new Cliente();
		odin.nome = "Odin Husky";
		odin.cpf = "111.222.333.44";
		odin.profissao = "cao";
		
		Conta contaDoOdin = new Conta();
		contaDoOdin.deposita(10);
		
		//associa o cliente odin à conta contaDoOdin
		contaDoOdin.titular = odin;
		System.out.println(contaDoOdin.titular.nome);
		System.out.println(contaDoOdin.titular);
		System.out.println(odin);
				
	}

}
