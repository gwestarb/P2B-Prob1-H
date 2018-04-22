
public class FormatoFacade {

	FormatoAudio formato;
	String arquivo = "";
	
	public FormatoFacade (String arquivo) {
		
		this.arquivo = arquivo;
		FormatoFactory formatoFactory = new FormatoFactory();
		formato = formatoFactory.getFormatoAudio(this.arquivo);
		
	}

	// TODO TODAS OS METODOS SEGUIRIAM O MESMO PRINCIPIO DO ABRIR()
	
	public void abrir() {
		formato.abrir(arquivo);
	}

	
	public void reproduzir() {
		// Caso o arquivo esteja nulo pode gerar erro, verificar e tratar isso
		formato.reproduzir();

	}

	
	public void pausar() {
		// Caso o arquivo esteja nulo pode gerar erro, verificar e tratar isso
		formato.pausar();

	}

	
	public void parar() {
		// Caso o arquivo esteja nulo pode gerar erro, verificar e tratar isso
		formato.parar();

	}

	
	public void avancar(int qtdSegundos) {
		// Caso o arquivo esteja nulo pode gerar erro, verificar e tratar isso
		formato.avancar(qtdSegundos);

	}

	
	public void retornar(int qtdSegundos) {
		// Caso o arquivo esteja nulo pode gerar erro, verificar e tratar isso
		formato.retornar(qtdSegundos);
	}

	
	public void liberar() {
		// Caso o arquivo esteja nulo pode gerar erro, verificar e tratar isso
		formato.liberar();
	}

	
	public void reproduzirSimples(String arquivo) {

		// Caso o arquivo esteja nulo pode gerar erro, verificar e tratar isso
		formato.reproduzirSimples(arquivo);
	}

	
	public void paraSimples() {
		// Caso o arquivo esteja nulo pode gerar erro, verificar e tratar isso
		formato.paraSimples();
	}

	
}

