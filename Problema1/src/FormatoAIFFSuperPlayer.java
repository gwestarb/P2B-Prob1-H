import problema1.AIFFSuperPlayer;

public class FormatoAIFFSuperPlayer implements FormatoAudio{

	
	public AIFFSuperPlayer arquivoAIFFSuperPlayer;
	public int pontoExecucao;
	
	@Override
	public void abrir(String arquivo) {
		
		arquivoAIFFSuperPlayer = new AIFFSuperPlayer(arquivo);
		pontoExecucao = 0;
	}

	@Override
	public void reproduzir() {
		if (arquivoAIFFSuperPlayer != null) {
			arquivoAIFFSuperPlayer.setCursor(pontoExecucao);
			arquivoAIFFSuperPlayer.play();
		}
	}

	@Override
	public void pausar() {
		if (arquivoAIFFSuperPlayer != null) {
			pontoExecucao = arquivoAIFFSuperPlayer.pause();
		}
	}

	@Override
	public void parar() {
		if (arquivoAIFFSuperPlayer != null) {
			arquivoAIFFSuperPlayer.stop();
			pontoExecucao = 0;
		}
	}

	@Override
	public void avancar(int qtdSegundos) {
		if (arquivoAIFFSuperPlayer != null) {
			arquivoAIFFSuperPlayer.setCursor(qtdSegundos);
			arquivoAIFFSuperPlayer.play();
		}
	}

	@Override
	public void retornar(int qtdSegundos) {
		if (arquivoAIFFSuperPlayer != null) {
			arquivoAIFFSuperPlayer.setCursor(qtdSegundos);
			arquivoAIFFSuperPlayer.play();
		}
	}

	@Override
	public void liberar() {
		if (arquivoAIFFSuperPlayer != null) {
			arquivoAIFFSuperPlayer.release();
		}
	}

	@Override
	public void reproduzirSimples(String arquivo) {
		arquivoAIFFSuperPlayer = new AIFFSuperPlayer(arquivo);
		arquivoAIFFSuperPlayer.setCursor(0);
		arquivoAIFFSuperPlayer.play();
	}

	@Override
	public void paraSimples() {
		if (arquivoAIFFSuperPlayer != null) {
			arquivoAIFFSuperPlayer.stop();
			arquivoAIFFSuperPlayer.release();
		}
		
		
	}

}
