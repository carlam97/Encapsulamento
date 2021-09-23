public class Programa {    // Definindo a classe como pública
	public static void main(String[] args) {   // "Public" declara que esse método pode ser acessado por qualquer classe dentro e fora do projeto, "static" define esse método com estático, "void" é um tipo de retorno vazio, "main" é o nome do método, "String[] args" define o parâmetro de recebimento caso seja necessário o programa receber algum valor.
		Filme f = new Filme();           // Chamar o tipo da classe e o nome do objeto
		f.setCodigo(123);                // define o valor do código
		f.setNome("A Era do Gelo");      // define o nome
		f.setValor(2.50);                // define o valor
		f.devolver();                    // define a devolução
		f.mostra();                      //	define mostra
		f.retirar();                     // define a retirada
		f.mostra();                      // define mostra
		
		try {                               // bloco protegido
			f.retirar();                    // definição da retirada
		} catch (RuntimeException e) {      // caso ocorra um erro sofrerá o devido tratamento de erro
			System.out.println(e.getMessage());    // imprimir mensagem na tela
		}
		
		
	}
}