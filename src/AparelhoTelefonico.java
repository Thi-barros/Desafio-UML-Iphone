
public interface AparelhoTelefonico {
	default void ligar (String numero) {
		System.out.println("Ligando");
	}
	default void atender() {
		System.out.println("Atendendo");
	}
	default void iniciarCorreioVoz() {
		System.out.println("Enviando correio de voz.");
	}
}
