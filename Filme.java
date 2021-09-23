public class Filme {                           // definindo a classe como pública
	private int codigo;                       // restringindo o acesso a variável código
	private String nome;                     // restringindo o acesso a variável nome
	private double valor;                   // restringindo o acesso a variável valor
	private boolean disponivel;            // restringindo o acesso a variável disponivel

	public int getCodigo() {               // acessar o método
		return codigo;                    // consultar pelo método o código
	}

	public void setCodigo(int codigo) {     // atribuir um valor
		this.codigo = codigo;                // trabalhando com esses atributos da classe
	}

	public String getNome() {              // acessar o método
		return nome;                       // consultar pelo método o código
	}

	public void setNome(String nome) {       // atribuir um valor
		this.nome = nome;                    // trabalhando com esses atributos da classe
	}

	public double getValor() {               // acessar o método
		return valor;                        // consultar pelo método o código
	}

	public void setValor(double valor) {     // atribuir um valor
		this.valor = valor;                  // trabalhando com esses atributos da classe
	}

	public boolean isDisponivel() {         // classe para disponibilidade
		return disponivel;                  // consultar o metododisponivel
	}

	public void setDisponivel(boolean disponivel) {   // atribuir um valor inalterável
		this.disponivel = disponivel;                 //trabalhando com esses atributos da classe
	}

	public void retirar() {                       // classe de retirar
		if(disponivel == true) {                  // checar se é verdade que o filme está disponivel
			disponivel = false;                   // se a condição for falsa
		}else{
			throw new RuntimeException("Este filme não está disponível para locação!");   // Caso a condição seja falsa imprimir essa mensagem na tela
		}
				
	}

	public void devolver() {
		disponivel = true;     // checar se filme esta disponivel
	}
	
	public void mostra(){
		System.out.println("Código do filme:" + this.codigo);       // Imprir o código do filme na tela
		System.out.println("Nome do filme:" + this.nome);           //Imprimir o nome do filme na tela
		System.out.println("Valor: R$" + this.valor);		        //Imprimir o valor na tela
		System.out.println("Disponível:" + this.disponivel);        //Imprimir na tela se o filme está disponivel
	}
}
