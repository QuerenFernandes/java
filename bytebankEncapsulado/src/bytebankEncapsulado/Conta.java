package bytebankEncapsulado;

public class Conta {
	//atributos da conta:
		private double saldo;
		private int agencia;
		private int numero;
		private Cliente titular;
		
		//métodos da conta:
		public void deposita(double valor) {
			this.saldo = this.saldo + valor;
		}
		
		public boolean saca(double valor) {
			if (this.saldo >= valor) {
				this.saldo = this.saldo - valor;
				return true;
			} else {
				return false;
			}
		}
		
		public boolean transfere(double valor, Conta destino) {
			if(this.saldo >= valor) {
				this.saldo -= valor;
				destino.deposita(valor);
				return true;
			} else {
				return false;
			}
		}
		
		public double getSaldo() {
			return this.saldo;
		}
		
		public int getNumero() {
			return this.numero;
		}
		
		public void setNumero(int numero){
			this.numero = numero;
		}
		
		public int getAgencia() {
			return this.agencia;
		}
		
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
}		

