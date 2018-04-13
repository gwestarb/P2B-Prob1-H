
public class FormatoWmaPlay implements FormatoAudio{

	public wmaPlay arquivoWmaPlay = new wmaPlay();
	@Override
	public void abrir(String arquivo) {
		arquivoWmaPlay.setFile(arquivo);
		arquivoWmaPlay.open();
		arquivoWmaPlay.setLocation(0);
		
	}

	@Override
	public void reproduzir() {
		arquivoWmaPlay.play();
		
	}

	@Override
	public void pausar() {
		arquivoWmaPlay.stop();
		
	}

	@Override
	public void parar() {
		arquivoWmaPlay.stop();
		arquivoWmaPlay.stop();
		
	}

	@Override
	public void avancar(int qtdSegundos) {
		arquivoWmaPlay.setLocation(arquivoWmaPlay.getLocation() + qtdSegundos);
		
	}

	@Override
	public void retornar(int qtdSegundos) {
		arquivoWmaPlay.setLocation(arquivoWmaPlay.getLocation() - qtdSegundos);
		
	}

	@Override
	public void liberar() {
		arquivoWmaPlay = null;
		
	}

}
