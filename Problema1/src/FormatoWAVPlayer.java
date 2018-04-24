import problema1.WAVPlayer;

public class FormatoWAVPlayer implements FormatoAudio {

	public WAVPlayer arquivoWAVPlayer;
	
	
	@Override
	public void abrir(String arquivo) {
		arquivoWAVPlayer = new WAVPlayer(arquivo);
	}

	@Override
	public void reproduzir() {
		
		if(arquivoWAVPlayer != null) {
			arquivoWAVPlayer.play();
		}
		
	}

	@Override
	public void pausar() {
		
		if(arquivoWAVPlayer != null){
			arquivoWAVPlayer.stop();
		}
		
	}

	@Override
	public void parar() {
		
		if(arquivoWAVPlayer != null){
			arquivoWAVPlayer.stop();
			arquivoWAVPlayer.reward(arquivoWAVPlayer.reward(0));
		}
	}

	@Override
	public void avancar(int qtdSegundos) {
				
		if(arquivoWAVPlayer != null) {
			arquivoWAVPlayer.forward((qtdSegundos / 1000));
		}
	}

	@Override
	public void retornar(int qtdSegundos) {
		
		if(arquivoWAVPlayer != null) {
			arquivoWAVPlayer.reward((qtdSegundos / 1000));
		}
	}

	@Override
	public void liberar() {
		arquivoWAVPlayer = null;
	}
}
