
public class FormatoAdapter implements FormatoAudio {

	public FormatoAIFFSuperPlayer formatoAiffSuperPlayer;
	public FormatoWAVPlayer formatoWavPlayer;
	public FormatoWmaPlay formatoWmaPlayer;
	public String extension = "";

	// TODO TODAS OS METODOS SEGUIRIAM O MESMO PRINCIPIO DO ABRIR()
	@Override
	public void abrir(String arquivo) {

		int i = arquivo.lastIndexOf('.');
		if (i > 0) {
			extension = arquivo.substring(i + 1);
		}

		if (extension.equalsIgnoreCase("wav")) {
			formatoWavPlayer.abrir(arquivo);
		} else if (extension.equalsIgnoreCase("wmp")) {
			formatoWmaPlayer.abrir(arquivo);
		} else if (extension.equalsIgnoreCase("aiff")) {
			formatoAiffSuperPlayer.abrir(arquivo);
		} else {
			System.out.println("Tipo de audio não suportado!");
		}
	}

	@Override
	public void reproduzir() {
		// Caso o arquivo esteja nullo pode gerar erro, verificar e tratar isso
		if (extension.equalsIgnoreCase("wav")) {
			formatoWavPlayer.reproduzir();
		} else if (extension.equalsIgnoreCase("wmp")) {
			formatoWmaPlayer.reproduzir();
		} else if (extension.equalsIgnoreCase("aiff")) {
			formatoAiffSuperPlayer.reproduzir();
		} else {
			System.out.println("Tipo de audio não suportado ou ainda não foi aberto!");
		}
	}

	@Override
	public void pausar() {
		// Caso o arquivo esteja nullo pode gerar erro, verificar e tratar isso
		if (extension.equalsIgnoreCase("wav")) {
			formatoWavPlayer.pausar();
		} else if (extension.equalsIgnoreCase("wmp")) {
			formatoWmaPlayer.pausar();
		} else if (extension.equalsIgnoreCase("aiff")) {
			formatoAiffSuperPlayer.pausar();
		} else {
			System.out.println("Tipo de audio não suportado ou ainda não foi aberto!");
		}
	}

	@Override
	public void parar() {
		// Caso o arquivo esteja nullo pode gerar erro, verificar e tratar isso
		if (extension.equalsIgnoreCase("wav")) {
			formatoWavPlayer.parar();
		} else if (extension.equalsIgnoreCase("wmp")) {
			formatoWmaPlayer.parar();
		} else if (extension.equalsIgnoreCase("aiff")) {
			formatoAiffSuperPlayer.parar();
		} else {
			System.out.println("Tipo de audio não suportado ou ainda não foi aberto!");
		}
	}

	@Override
	public void avancar(int qtdSegundos) {
		// Caso o arquivo esteja nullo pode gerar erro, verificar e tratar isso
		if (extension.equalsIgnoreCase("wav")) {
			formatoWavPlayer.avancar(qtdSegundos);
		} else if (extension.equalsIgnoreCase("wmp")) {
			formatoWmaPlayer.avancar(qtdSegundos);
		} else if (extension.equalsIgnoreCase("aiff")) {
			formatoAiffSuperPlayer.avancar(qtdSegundos);
		} else {
			System.out.println("Tipo de audio não suportado ou ainda não foi aberto!");
		}
	}

	@Override
	public void retornar(int qtdSegundos) {
		// Caso o arquivo esteja nullo pode gerar erro, verificar e tratar isso
		if (extension.equalsIgnoreCase("wav")) {
			formatoWavPlayer.retornar(qtdSegundos);
		} else if (extension.equalsIgnoreCase("wmp")) {
			formatoWmaPlayer.retornar(qtdSegundos);
		} else if (extension.equalsIgnoreCase("aiff")) {
			formatoAiffSuperPlayer.retornar(qtdSegundos);
		} else {
			System.out.println("Tipo de audio não suportado ou ainda não foi aberto!");
		}
	}

	@Override
	public void liberar() {
		// Caso o arquivo esteja nullo pode gerar erro, verificar e tratar isso
		if (extension.equalsIgnoreCase("wav")) {
			formatoWavPlayer.liberar();
		} else if (extension.equalsIgnoreCase("wmp")) {
			formatoWmaPlayer.liberar();
		} else if (extension.equalsIgnoreCase("aiff")) {
			formatoAiffSuperPlayer.liberar();
		} else {
			System.out.println("Tipo de audio não suportado ou ainda não foi aberto!");
		}
	}

	@Override
	public void reproduzirSimples(String arquivo) {

		// Caso o arquivo esteja nullo pode gerar erro, verificar e tratar isso
		if (extension.equalsIgnoreCase("wav")) {
			formatoWavPlayer.reproduzirSimples(arquivo);
		} else if (extension.equalsIgnoreCase("wmp")) {
			formatoWmaPlayer.reproduzirSimples(arquivo);
		} else if (extension.equalsIgnoreCase("aiff")) {
			formatoAiffSuperPlayer.reproduzirSimples(arquivo);
		} else {
			System.out.println("Tipo de audio não suportado ou ainda não foi aberto!");
		}
	}

	@Override
	public void paraSimples() {
		// Caso o arquivo esteja nullo pode gerar erro, verificar e tratar isso
		if (extension.equalsIgnoreCase("wav")) {
			formatoWavPlayer.paraSimples();
		} else if (extension.equalsIgnoreCase("wmp")) {
			formatoWmaPlayer.paraSimples();
		} else if (extension.equalsIgnoreCase("aiff")) {
			formatoAiffSuperPlayer.paraSimples();
		} else {
			System.out.println("Tipo de audio não suportado ou ainda não foi aberto!");
		}
	}

}
