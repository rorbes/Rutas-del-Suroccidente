package modelo.datos;

import java.util.ArrayList;
import modelo.mundo.Linea;
import modelo.mundo.Marca;


/**
 * clase encargada del manejo de las marcas en la base de datos
 * @author MiPc
 *
 */
public class MarcaDAO {

	
	/**
	 * atributo para la administracion de la base de datos
	 */
	private FachadaDB fachadaDB;
	
	
	/**
	 * metodo constructor de la calse
	 * <b>post:</b> se ha inicializada el atributo de la clase fachada, se ha creado una nueva instancia de la clase 
	 */
	public MarcaDAO(){
		fachadaDB= new FachadaDB();
	}
	
	
	/**
	 * metodo que permite seleccionar las marcas almacenadas en la base de datos<br>
	 * <b>pre:</b> ha inicializado el atributo fachadaDB
	 * <b>post:</b> se ha seleccionado y retornado las marcas almacenadas en la base de datos
	 * @return la lista con las marcas seleccionadas
	 */
	public ArrayList<Linea> seleccionar(){
		
	}
	
	
	/**
	 * metodo que actualizar una marca almacenada en la base de datos<br>
	 * <b>pre:</b> el atributo fachadaDB ha sido inicializado<br>
	 * <b>post:</b> se ha modificado la marca ingresada como parametro
	 * @param nMarca la marca actualizar en la base de datos nMarca!=null
	 */
	public void actualizar(Marca nMarca){
		
	}
	
	
	/**
	 * metodo que permite agregar una marca a la base de datos<br>
	 * <b>pre:</b> el atributo fachadaDB ha sido inicializado<br>
	 * <b>post:</b> agregado una marca a la base de datos 
	 * @param nMarca la marca a agregar a la base de datos
	 */
	public void agregar(Marca nMarca){
		
	}
	
	
	/**
	 * metodo que permite eliminar una marca de la base de datos<br>
	 * <b>pre:</b> el atributo fachadaDB ha sido inicializado<br>
	 * <b>post:</b> se ha eliminado la marca pasada como parametro de la base de datos
	 * @param nMarca la marca a eliminar de la base de datos nMarca !=null
	 */
	public void eliminar(Marca nMarca){
		
	}
}