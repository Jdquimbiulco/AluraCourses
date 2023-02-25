class Cuenta {
	
	//ATRIBUTOS
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//METODOS
	
	void depositar(double valor){
		saldo = saldo + valor;
	}
}
