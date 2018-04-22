public class FormatoFactory {
	
	public String extension = "";
	
	public FormatoAudio getFormatoAudio(String arquivo) {		
		int i = arquivo.lastIndexOf('.');
		if (i > 0) {
			extension = arquivo.substring(i + 1);
		}	
		return verificaExtensao();
	}
	
	public FormatoAudio verificaExtensao() {
		if (extension.equalsIgnoreCase("wav")) {
			return new FormatoWAVPlayer();
		} else if (extension.equalsIgnoreCase("wmp")) {
			return new FormatoWmaPlay();
		} else if (extension.equalsIgnoreCase("aiff")) {
			return new FormatoAIFFSuperPlayer();
		} else if (extension.equalsIgnoreCase("aac")) {
			return new FormatoAACPlayer();
		} else if (extension.equalsIgnoreCase("mp3dj")) {
			return new FormatoMP3DJPlayer();
		}
		throw new IllegalArgumentException("Tipo de audio n�o suportado");
	}
}
