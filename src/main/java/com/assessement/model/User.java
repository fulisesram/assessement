package com.assessement.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TBL_USERS" )
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUser;
	
	private String username;
	private String password;
	private int idEmployee;
	private int IDPROFILE;
	private String status;
	private String createDate;
	private String updateDate;
	private String login;
	
}


/* Se implementa Serializable: para compartir con el cliente la llamada demanera remota que se envia a travez del servidor
 * permite convertir cualquier objeto en una secuencia de bytes que pueden ser posteriormente leídos para restaurar el objeto original
 * La serialización es una característica añadida al lenguaje Java para dar soporte a:
 * - La invocación remota de objetos (RMI)
 * - La persistencia
 */


/* Otras anotaciones utiles:
 * 
 * @Entity
 * - Estamos diciendo a JPA que esta clase es una Entidad y deberá ser administrada por EntityManager
 * - Un EntityManager será una instancia de de EntityManagerFactory en JPA. Dicha factoria lo que hace es representar la configuración para acceder a la base de datos que utilice nuestra aplicación.
 * @Data  
 * - Lombok ayuda a crear getters, setters, hash, equals, toString en automatico
 * 
 * */
