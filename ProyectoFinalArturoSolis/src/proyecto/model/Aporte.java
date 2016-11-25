package proyecto.model;

public class Aporte {
	private int montoCuotaAnho;
	private int saldoMoroso;
	private Socio socio;
	private int montoAnual;
	private TipoAporte tipoAporte;
	
	
	//constructor
	public Aporte(int montoCuotaAnho, int saldoMoroso, Socio socio,
			int montoAnual, TipoAporte tipoAporte) {
		super();
		this.montoCuotaAnho = montoCuotaAnho;
		this.saldoMoroso = saldoMoroso;
		this.socio= socio;
		this.montoAnual =montoAnual;
		this.tipoAporte = tipoAporte;
	}
	
	public Aporte() {
		// TODO Auto-generated constructor stub
	}

	//getters y setters
	public int  getMontoCuotaAnho() {
		return montoCuotaAnho;
	}
	public void setMontoCuotaAnho(int montoCuotaAnho) {
		this.montoCuotaAnho = montoCuotaAnho;
	}
	public int  getSaldoMoroso() {
		return saldoMoroso;
	}
	public void setSaldoMoroso(int saldoMoroso) {
		this.saldoMoroso = saldoMoroso;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio= socio;
	}
	public int  getMontoAnual() {
		return montoAnual;
	}
	public void setMontoAnual(int montoAnual) {
		this.montoAnual = montoAnual;
	}
	public TipoAporte getTipoAporte() {
		return tipoAporte;
	}
	public void setTipoAporte(TipoAporte tipoAporte) {
		this.tipoAporte = tipoAporte;
	}


}
