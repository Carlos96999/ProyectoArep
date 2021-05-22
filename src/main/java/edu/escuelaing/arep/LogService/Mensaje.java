package edu.escuelaing.arep.LogService;

import java.util.Date;

public class Mensaje 
{
	private String mensaje;
	private Date fecha;
	
	/**
	 * Clase mensaje que será el objeto ingresado en la base de datos
	 * @param mensaje (Mensaje ingresado por la pagina)
	 */
	public Mensaje(String mensaje) 
	{
		this.mensaje = mensaje;
		fecha = new Date();
	}
	
	/**
	 * Constructor del mensaje con fecha en la que fue creado
	 * @param mensaje (Mensaje ingresado por la pagina)
	 * @param fecha (Fecha en la que se ingreso el mensaje)
	 */
	public Mensaje(String mensaje, Date fecha) 
	{
		this.mensaje = mensaje;
		this.fecha = fecha;
	}

	/**
	 * Obtenemos el mensaje por medio de un string
	 * @return mensaje (Mensaje del objeto en forma de string)
	 */
	public String getMensaje()
	{
		return mensaje;
	}

	/**
	 * Colocamos el mensaje ingresado a la base de datos
	 * @param mensaje (Mensaje ingresado por la pagina)
	 */
	public void setMensaje(String mensaje)
	{
		this.mensaje = mensaje;
	}

	/**
	 * Obtenemos la fecha en la que se creo el mensaje
	 * @return fecha 
	 */
	public Date getFecha()
	{
		return fecha;
	}

	/**
	 * Colocamos la fecha de creacion del mensaje
	 * @param fecha
	 */
	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}

}
