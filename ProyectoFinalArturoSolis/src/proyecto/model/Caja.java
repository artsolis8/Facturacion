package proyecto.model;

import java.util.Date;

public class Caja {
	private Cajero cajero;
	private int nroCaja;
	private Date fechaApertura;
	private Date fechaCierre;
	private int saldoInicial;
	private int saldoFinal;
	
	//constructor
	public Caja(Cajero cajero, int nroCaja, Date fechaApertura,
			Date fechaCierre, int saldoInicial, int saldoFinal) {
		super();
		this.cajero= cajero;
		this.nroCaja = nroCaja;
		this.fechaApertura= fechaApertura;
		this.fechaCierre= fechaCierre;
		this.saldoInicial= saldoInicial;
		this.saldoFinal= saldoFinal;
	}
	
	public Caja() {
	}


	public Cajero getCajero() {
		return cajero;
	}
	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}
	public int getNroCaja() {
		return nroCaja;
	}
	public void setNroCaja(int nroCaja) {
		this.nroCaja = nroCaja;
	}
	public Date getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public Date getFechaCierre() {
		return fechaCierre;
	}
	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}
	public int getSaldoInicial() {
		return saldoInicial;
	}
	public void setSaldoInicial(int saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
	public int getSaldoFinal() {
		return saldoFinal;
	}
	public void setSaldoFinal(int saldoFinal) {
		this.saldoFinal= saldoFinal;
	}

	@Override
	public String toString() {
		return "Caja [cajero=" + cajero + ", nroCaja="
				+ nroCaja+ ", fechaApertura=" + fechaApertura+ ", fechaCierre="
				+ fechaCierre+ ", saldoInicial=" + saldoInicial+ ", saldoFinal="
				+ saldoFinal+ "]";
	}
}
