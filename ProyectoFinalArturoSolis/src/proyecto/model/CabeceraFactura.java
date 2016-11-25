package proyecto.model;

import java.util.Date;

public class CabeceraFactura {
	//atributos
			private Integer nroFactura;
			private Date fechaEmision;
			private Socio socio;
			private String timbrado;
			private String formaPago;
			private Integer montoTotal;

			//constructor vacio
			public CabeceraFactura() {

			}
			//metodo que implementa logica de negocio
			public void emitirFactura(){
				
			}
			//metodos de acceso getters y setters
			public Integer getNroFactura() {
				return nroFactura;
			}

			public void setNroFactura(Integer nroFactura) {
				this.nroFactura = nroFactura;
			}

			public Date getFechaEmision() {
				return fechaEmision;
			}

			public void setFechaEmision(Date fechaEmision) {
				this.fechaEmision = fechaEmision;
			}

			public Persona getSocio() {
				return socio;
			}

			public void setSocio(Socio socio) {
				this.socio = socio;
			}

			
			public String getTimbrado() {
				return timbrado;
			}

			public void setTimbrado(String timbrado) {
				this.timbrado = timbrado;
			}
			
			public String getFormaPago() {
				return formaPago;
			}

			public void setFormaPago(String formaPago) {
				this.formaPago = formaPago;
			}
			
			public Integer getMontoTotal() {
				return montoTotal;
			}

			public void setMontoTotal(Integer montoTotal) {
				this.montoTotal = montoTotal;
			}

	
	
}
