
public class FormatoAdapter implements FormatoAudio{

	FormatoAIFFSuperPlayer formatoAiffSuperPlayer;
	FormatoWAVPlayer formatoWavPlayer;
	FormatoWmaPlay formatoWmaPlayer;
	String extension = "";
	
	
	//TODO TODAS OS METODOS SEGUIRIAM O MESMO PRINCIPIO DO ABRIR()
	@Override
	public void abrir(String arquivo) {
		
		int i = arquivo.lastIndexOf('.');
		if (i > 0) {
		    extension = arquivo.substring(i+1);
		}
		
		if (extension.equalsIgnoreCase("wavplayer")) {
			formatoWavPlayer.abrir(arquivo);
		}else if(extension.equalsIgnoreCase("wmaplayer")) {
			formatoWmaPlayer.abrir(arquivo);
		}else if(extension.equalsIgnoreCase("AIFFSuperPlayer")) {
			formatoAiffSuperPlayer.abrir(arquivo);
		}else {
			System.out.println("Tipo de audio não suportado!");
		}
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
	public void retornar(int qtdSegundos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void liberar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproduzirSimples(String arquivo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paraSimples() {
		// TODO Auto-generated method stub
		
	}
	
}
