package noleggi;

public class Noleggio {

	private String ID;
	private int veicoli;
	private Cliente cliente;
	
	/**
	 * @param iD
	 * @param veicoli
	 */
	public Noleggio(String iD, int posti, Cliente c) {
		if(ID.length() != 0){
			this.ID = new String(ID);
		}
		else{
			throw new IllegalArgumentException("La lunghezza della stringa deve essere diversa da 0.");
		}
		
		if(veicoli > 0){
			this.veicoli = veicoli;
		}
		else{
			throw new IllegalArgumentException("I veicoli devono essere positivi.");
		}
		
		this.cliente = cliente;
	}

	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}

	/**
	 * @return the veicoli
	 */
	public int getVeicoli() {
		return veicoli;
	}

	public Cliente getCliente() {
		return cliente;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Noleggio [ID=" + ID + ", veicoli=" + veicoli + "]";
	}
	
}
