package noleggi;

public class Veicolo {

	private String ID;
	private String descrizione;
	private int veicoliTotali;
	
	/**
	 * @param iD
	 * @param descrizione
	 * @param veicoliTotali
	 */
	public Veicolo(String iD, String descrizione, int veicoliTotali) {
		super();
		ID = iD;
		this.descrizione = descrizione;
		this.veicoliTotali = veicoliTotali;
	}
	
	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @return the veicoliTotali
	 */
	public int getVeicoliTotali() {
		return veicoliTotali;
	}
	
	public int getVeicoliDisponibili() {
		
		return veicoliDisponibili;
	}
	
	public void addNoleggio(Noleggio n) {
		
	}
	
	public Vector getNoleggi() {
		
		return noleggi;
	}
}
