class Cuenta {
	
	//ATRIBUTOS
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	//METODOS
	
	void depositar(double valor){
		this.saldo += valor;
		//this.saldo = this.saldo + valor;
	}
	
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			System.out.println("La cantidad ingresada es superior al saldo disponible");
			return false;
		}
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo -  valor;
			cuenta.depositar(valor);
			return true;
			
		}
		return false;
	}
}
