
public class Facade {

	public FormatoAudio formatoAudioCriado;
	
	public Facade(String arquivo) {
		formatoAudioCriado = FormatoFactory.getFormatoAudio(arquivo);
	}
	
	public void reproduzirSimples(String arquivo) {
		formatoAudioCriado.abrir(arquivo);
		formatoAudioCriado.reproduzir();
	}
	
	public void pararSimples() {
		formatoAudioCriado.parar();
		formatoAudioCriado.liberar();
	}
}
