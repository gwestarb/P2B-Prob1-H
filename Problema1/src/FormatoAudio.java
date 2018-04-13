
public interface FormatoAudio {

	void abrir(String arquivo);
	
	void reproduzir();
	
	void pausar();
	
	void parar();
	
	void avancar(int qtdSegundos);
	
	void retomar(int qtdSegundos);
	
	void liberar();
	
	//void reproduzirSimples(String):
	
	
}
