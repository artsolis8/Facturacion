package proyecto.model;

public class TipoAporte {
	private String descripcion;
	
	public TipoAporte(String descripcion) {
		super();
		this.descripcion= descripcion;
	}
	

	public TipoAporte(){
		
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
