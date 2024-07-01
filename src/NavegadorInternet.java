
public interface NavegadorInternet {
	default void exibirPagina() {
		System.out.println("Exibindo página");
	}
	default void adicionarAba() {
		System.out.println("Adicionando aba");
	}
	default void atualizandoAba(){
		System.out.println("Atualizando aba");
	}
}
