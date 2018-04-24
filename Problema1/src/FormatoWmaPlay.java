import problema1.wmaPlay;

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
		if (arquivoWmaPlay != null) {
			arquivoWmaPlay.play();
		}
		
	}

	@Override
	public void pausar() {
		if (arquivoWmaPlay != null) {
			arquivoWmaPlay.stop();
		}
	}

	@Override
	public void parar() {
		if (arquivoWmaPlay != null) {
			arquivoWmaPlay.stop();
			arquivoWmaPlay.stop();
		}
	}

	@Override
	public void avancar(int qtdSegundos) {
		if (arquivoWmaPlay != null) {
			arquivoWmaPlay.setLocation(arquivoWmaPlay.getLocation() + qtdSegundos);
			arquivoWmaPlay.play();
		}
	}

	@Override
	public void retornar(int qtdSegundos) {
		if (arquivoWmaPlay != null) {
			arquivoWmaPlay.setLocation(arquivoWmaPlay.getLocation() - qtdSegundos);
			arquivoWmaPlay.play();
		}
	}

	@Override
	public void liberar() {
		arquivoWmaPlay = null;
		
	}
}
