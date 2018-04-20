
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
		}
		throw new IllegalArgumentException("Tipo de audio não suportado");
	}
}
