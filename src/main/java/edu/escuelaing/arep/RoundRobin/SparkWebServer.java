package edu.escuelaing.arep.RoundRobin;
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.port;
import static spark.Spark.staticFileLocation;
import java.util.ArrayList;
import edu.escuelaing.arep.LogService.ConexionDB;
import edu.escuelaing.arep.LogService.Mensaje;
import edu.escuelaing.arep.RoundRobin.ClienteHttp;
import com.google.gson.Gson;

/**
 * Servidor spark para la aplicacion
 * @author Carlos
 */
public class SparkWebServer {
    
    public static void main(String... args)
    {
    	ClienteHttp cliente = new ClienteHttp();
    	ConexionDB conexionDB = new ConexionDB();
    	
    	port(getPort());
    	staticFileLocation("/static");
    	get("/hello", (req,res) -> {
    		res.redirect("index.html");
    		return null;
    	});
    	
        get("/resultados", (req, res) -> {
        	res.status(200);
        	res.type("application/json");
        	String resp = cliente.getMensaje();
        	cliente.cambiarNumeroServidor();
        	return resp;
        	});
          
        post("/resultados", (req, res) -> {
        	cliente.postMensaje(req.body());
        	cliente.cambiarNumeroServidor();
        	return "";
        	});
        
        get("/mensajes", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(conexionDB.getMensaje());
        });
        
        post("/mensajes", (req, res) -> {
            Mensaje a = new Mensaje(req.body());
            conexionDB.insertarMensaje(a);
            return null;
        });
    }
    
    /**
     * Se establece un puerto por defecto, si no lo hace se establece el puerto 4567
     * @return
     */
    private static int getPort()
    {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
}
