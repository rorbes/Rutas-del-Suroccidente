package modelo.datos;
import java.sql.*;


/**
 * clase encargada del manejo de la base de datos
 * @author juandiego
 *
 */
public class FachadaDB {

	/**
	 * constante para el controlador de mysql
	 * @uml.property  name="Driver"
	 */
	public final static  String DRIVER = "com.mysql.jdbc.Driver";


	/**
	 * constante encargada de la url de la base de datos a la cual se va a conectar
	 * @uml.property  name="URL" readOnly="true"
	 */
	public static final String URL = "jdbc:mysql://localhost/hotel";


	/**
	 * contraseña para el usuario con el que se va a conectar a la base de datos
	 * @uml.property  name="USUARIO" readOnly="true"
	 */
	public static final String USUARIO = "root";


	/**
	 * contraseña del usurario con el que se conecta a la base de datos
	 * @uml.property  name="PASSWORD" readOnly="true"
	 */
	public static final String PASSWORD = "mysql";


	/**
	 * la contrseña del usuario con la que se conecta a la base de datos
	 * @uml.property  name="password"
	 */
	private String password;


	/**
	 * la url de la base la base de datos
	 * @uml.property  name="url"
	 */
	private String url;


	/**
	 * el usuario con el cual se conecta a la base de datos
	 * @uml.property  name="usuario"
	 */
	private String usuario;


	/**
	 * metodo construccutor de la clse FachadaBD<br>
	 * <b>post:</b> se ha inicializado los atributos con los valores conenidos en las constantes
	 */
	public FachadaDB(){
		password= PASSWORD;
		url= URL;
		usuario=USUARIO;
	}
	
	
	/**
	 * metodo que retorna un objeto de tipo conecction para realizar las operaciones en la base de datos<br>
	 * <b>post:</b> se ha creado y retornado la coneccion a la base de datos
	 * @throws ClassNotFoundException en caso de que no exista la clase llamda
	 * @throws SQLException en caso de presentarse problemas al conectar a la base de datos
	 */
	public Connection conectarDB() throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER);
		Connection retorno= (Connection)DriverManager.getConnection(url, usuario, password);
		return retorno;
	}
	
	
	/**
	 * meotodo que permite cerrar la coneccion a la base de datos<br>
	 *<b>pre:</b> la coneccion a sido inicializada<br>
	 *<b>post:</b> se ha cerrado la coneccion a la basede datos
	 *@param coneccion la coneccion a la base de datos conecction!=null
	 * @throws SQLException en caso de presentarse problemas al desconectar la base de datos
	 */
	public void desconectarDB(Connection conexion) throws SQLException
	{
		conexion.close();
	}

}