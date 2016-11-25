package proyecto.model;



public class Persona {
		private String email;
		private String ruc;
		private String direccion;
		private String telefono;
		private String nombreApellido;
		
		
		//constructor
		public Persona(String email, String ruc, String direccion,
				String telefono, String nombreApellido) {
			super();
			this.email = email;
			this.ruc = ruc;
			this.direccion= direccion;
			this.telefono = telefono;
			this.nombreApellido = nombreApellido;
		}
		
		public Persona() {
			// TODO Auto-generated constructor stub
		}

		//getters y setters
		public String  getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email= email;
		}
		public String  getRuc() {
			return ruc;
		}
		public void setRuc(String ruc) {
			this.ruc = ruc;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getNombreApellido() {
			return nombreApellido;
		}
		public void setNombreApellido(String nombreApellido) {
			this.nombreApellido = nombreApellido;
		}
}
		

		
		
	

