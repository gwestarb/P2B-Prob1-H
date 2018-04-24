import problema1.MP3DJ;

public class FormatoMP3DJPlayer implements FormatoAudio {

	public MP3DJ arquivoMP3DJ = new MP3DJ();
	
	@Override
	public void abrir(String arquivo) {
		// TODO Auto-generated method stub
		arquivoMP3DJ.setFile(arquivo);
	}

	@Override
	public void reproduzir() {
		// TODO Auto-generated method stub
		if (arquivoMP3DJ != null) {
			arquivoMP3DJ.play();
		}
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		if (arquivoMP3DJ != null) {
			arquivoMP3DJ.stop();
		}
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		if (arquivoMP3DJ != null) {
			arquivoMP3DJ.stop();
			arquivoMP3DJ.reward(arquivoMP3DJ.reward(0));
		}
	}

	@Override
	public void avancar(int qtdSegundos) {
		// TODO Auto-generated method stub
		if (arquivoMP3DJ != null) {
			arquivoMP3DJ.forward(qtdSegundos);
		}
	}

	@Override
	public void retornar(int qtdSegundos) {
		// TODO Auto-generated method stub
		if (arquivoMP3DJ != null) {
			arquivoMP3DJ.reward(qtdSegundos);
		}
	}

	@Override
	public void liberar() {
		// TODO Auto-generated method stub
		arquivoMP3DJ = null;
	}

}
