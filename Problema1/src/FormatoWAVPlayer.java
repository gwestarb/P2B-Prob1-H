
public class FormatoWAVPlayer implements FormatoAudio {

	public WAVPlayer arquivoWAVPlayer;
	
	
	@Override
	public void abrir(String arquivo) {
		arquivoWAVPlayer = new WAVPlayer(arquivo);
	}

	@Override
	public void reproduzir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void avancar(int qtdSegundos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retomar(int qtdSegundos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void liberar() {
		// TODO Auto-generated method stub
		
	}

}
