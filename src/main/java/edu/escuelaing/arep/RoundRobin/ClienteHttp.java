package edu.escuelaing.arep.RoundRobin;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Clase encargada de realizar la conexion HTTP el cliente del programa.
 * @author  Carlos Amorocho
 */
public class ClienteHttp
{
    private String[] puertos = {":34001",":34002",":34003"};
    private int cantidadServidores = 0;
    private String url = "http://192.168.0.2";
    
    /**
     * Metodo para realizar una peticion GET al LogService
     * @return String (Cadena que contiene la peticion GET realizado)
     * @throws UnirestException (Si no encuentra la peticion, se lanza una excepcion)
     */
    public String getMensaje() throws UnirestException 
    {
        HttpResponse<String> apiResponse = Unirest.get(url+puertos[cantidadServidores]+"/mensaje").asString();
        System.out.println("Petición GET de "+url+puertos[cantidadServidores]);
        return apiResponse.getBody();
    }
    
    /**
     * Metodo para realizar una peticion POST al LogService.
     * @param mensaje (Mensaje ingresado por el usuario)
     * @return String (Cadena que contiene la peticion POST)
     * @throws UnirestException (Si no hay mensaje se lanza la excepcion)
     */
    public String postMensaje(String mensaje) throws UnirestException
    {
        HttpResponse<String> apiResponse = Unirest.post(url+puertos[cantidadServidores]+"/mensaje").body(mensaje).asString();
        System.out.println("Petición POST de "+url+puertos[cantidadServidores]);
        return apiResponse.getBody();
    }
    
    /**
     * Metodo encargado de cambiar el servidor para LogService
     */
    public void cambiarNumeroServidor()
    {
    	cantidadServidores=(cantidadServidores + 1) % puertos.length;
    }
}