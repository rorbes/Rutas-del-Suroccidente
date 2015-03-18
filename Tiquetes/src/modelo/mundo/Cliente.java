package modelo.mundo;


/**
 * 
 * @author megasoft.
 * Universidad Mariana (Pasto - Colombia) 
 * Departamento de Ingenier�a de Sistemas. 
 */
public class Cliente {
	
	
	/**
	 * Apellido del cliente
	 */
	private String apellidos;


	/**
	 *Identificacion del cliente 
	 */
	private int identificacion;
	
	
	/**
	 * Nombre del cliente
	 */
	private String nombres;
	
	
	/**
	 * Crea un cliente con la informacion basica
	 * @param nIdentificacion es la identificacion del cliente.
	 * @param nNombres Es el nombre del cliente.
	 * @param nApellidos Es el apellido del cliente.
	 */
	public Cliente(int nIdentificacion, String nNombres, String nApellidos) {
		identificacion=nIdentificacion;
		nombres=nNombres;
		apellidos=nApellidos;
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Retorna la identificacion del cliente.
	 * @return identificacion.
	 */
	public int getIdentificacion() {
		return identificacion;
	}
	
	
	/**
	 * @param identificacion La identificacion del cliente
	 */
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	
	
	/**
	 * Retorna el nombre del cliente.
	 * @return nombres nombre del cliente.
	 */
	public String getNombres() {
		return nombres;
	}
	
	
	/**
	 * @param nombres el nombre del cliente
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	
	/**
	 * Retorna el pellido del cliente.
	 * @return apellidos del cliente.
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	
	/**
	 * @param apellidos apellidos del cliente.
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}
