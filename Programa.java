public class Programa {    // Definindo a classe como pública
	public static void main(String[] args) {   // "Public" declara que esse método pode ser acessado por qualquer classe dentro e fora do projeto, "static" define esse método com estático, "void" é um tipo de retorno vazio, "main" é o nome do método, "String[] args" define o parâmetro de recebimento caso seja necessário o programa receber algum valor.
		Filme f = new Filme();      // Chamar o tipo da classe e o nome do objeto
		f.setCodigo(123);           //
		f.setNome("A Era do Gelo");
		f.setValor(2.50);
		f.devolver();
		
		f.mostra();
		
		f.retirar();
		
		f.mostra();
		
		try {
			f.retirar();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}