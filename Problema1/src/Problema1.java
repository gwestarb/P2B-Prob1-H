
public class Problema1 {

	public static void main(String[] args) {
			
		Facade formatoAudio = new Facade("teste/teste/teste.aiff");
		formatoAudio.reproduzirSimples("teste/teste/teste.aiff");
		formatoAudio.pararSimples();
		
	}

	

}
