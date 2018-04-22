import problema1.AACPlayer;

public class FormatoAACPlayer implements FormatoAudio {
	
	public AACPlayer arquivoAACPlayer;

	@Override
	public void abrir(String arquivo) {
		// TODO Auto-generated method stub
		arquivoAACPlayer = new AACPlayer(arquivo);
		arquivoAACPlayer.open();
		arquivoAACPlayer.setLocation(0);
	}

	@Override
	public void reproduzir() {
		if (arquivoAACPlayer != null) {
			arquivoAACPlayer.getLocation();
			arquivoAACPlayer.play();
		}
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		if (arquivoAACPlayer != null) {
			arquivoAACPlayer.stop();
		}
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		if (arquivoAACPlayer != null) {
			arquivoAACPlayer.stop();
			arquivoAACPlayer.stop();
		}
	}

	@Override
	public void avancar(int qtdSegundos) {
		// TODO Auto-generated method stub
		if (arquivoAACPlayer != null) {
			arquivoAACPlayer.setLocation(arquivoAACPlayer.getLocation()+qtdSegundos);
			arquivoAACPlayer.play();
		}
	}

	@Override
	public void retornar(int qtdSegundos) {
		// TODO Auto-generated method stub
		if (arquivoAACPlayer != null) {
			arquivoAACPlayer.setLocation(arquivoAACPlayer.getLocation() -qtdSegundos);
			arquivoAACPlayer.play();
		}
	}

	@Override
	public void liberar() {
		// TODO Auto-generated method stub
			arquivoAACPlayer = null;
	}

	@Override
	public void reproduzirSimples(String arquivo) {
		// TODO Auto-generated method stub
		arquivoAACPlayer = new AACPlayer(arquivo);
		arquivoAACPlayer.open();
		arquivoAACPlayer.setLocation(0);
		arquivoAACPlayer.play();
	}

	@Override
	public void paraSimples() {
		// TODO Auto-generated method stub
		if (arquivoAACPlayer != null) {
			arquivoAACPlayer.stop();
			arquivoAACPlayer.stop();
			arquivoAACPlayer = null;
		}
	}

	
	
	
	
}
