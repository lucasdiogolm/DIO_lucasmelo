public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa lucas = new Pessoa("123", "LUCAS");
		
		//definimos o endereço de lucas
		lucas.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do lucas ?
		
		//imprimindo o marcos sem o nome e cpf
		
		System.out.println(lucas.getNome() + "-" + lucas.getCpf());
	}
}

