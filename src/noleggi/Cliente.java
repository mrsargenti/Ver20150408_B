package noleggi;

public class Cliente {

	private String nome;
	private String cognome;
	private String email;
	
	/**
	 * @param nome
	 * @param cognome
	 * @param email
	 */
	public Cliente(String nome, String cognome, String email) {
		if(nome.length() > 0){
			this.nome = new String(nome);
		}
		else{
			throw new IllegalArgumentException("La lunghezza della stringa deve essere maggiore di 0.");
		}
		
		if(cognome.length() > 0){
			this.cognome = new String(cognome);
		}
		else{
			throw new IllegalArgumentException("La lunghezza della stringa deve essere maggiore di 0.");
		}
		
		if(email.length() > 0){
			this.email = new String(email);
		}
		else{
			throw new IllegalArgumentException("La lunghezza della stringa deve essere maggiore di 0.");
		}
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", email=" + email + "]";
	}
	
}
