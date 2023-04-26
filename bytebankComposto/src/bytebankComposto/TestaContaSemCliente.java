package bytebankComposto;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaNoemy = new Conta();
		System.out.println(contaDaNoemy.getSaldo());
		
		//retorna null porque não foi criado o cliente
		System.out.println(contaDaNoemy.titular);
		
		contaDaNoemy.titular = new Cliente();
		System.out.println(contaDaNoemy.titular);
			
		contaDaNoemy.titular.nome = "Noemy";
		System.out.println(contaDaNoemy.titular.nome);
	}
}
