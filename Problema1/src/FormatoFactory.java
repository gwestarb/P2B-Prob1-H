public class FormatoFactory {
	
	public static FormatoAudio getFormatoAudio(String arquivo) throws IllegalArgumentException{		
		if (arquivo.endsWith(".wav")) {
			return new FormatoWAVPlayer();
		} else if (arquivo.endsWith(".wmp")) {
			return new FormatoWmaPlay();
		} else if (arquivo.endsWith(".aiff")) {
			return new FormatoAIFFSuperPlayer();
		} else if (arquivo.endsWith(".aac")) {
			return new FormatoAACPlayer();
		} else if (arquivo.endsWith(".mp3dj")) {
			return new FormatoMP3DJPlayer();
		}
		throw new IllegalArgumentException("Tipo de audio não suportado");
	}
}
