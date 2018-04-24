
public class Problema1 {

	public static void main(String[] args) {
			
		FormatoAudio formatoAudio = FormatoFactory.getFormatoAudio("teste/teste/teste.aiff");
		formatoAudio.abrir("teste/teste/teste.aiff");
		formatoAudio.avancar(3476);
		
	}

	

}
