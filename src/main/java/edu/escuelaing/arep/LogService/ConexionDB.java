package edu.escuelaing.arep.LogService;

import java.util.ArrayList;
import java.util.Date;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class ConexionDB
{
    MongoClientURI uri;
    MongoClient mongoCliente;
    
    /**
     * Metodo constructor de la clase DBConnection.
     */
    public ConexionDB() 
    {
        uri = new MongoClientURI("mongodb+srv://carlos:1234567890@cluster0.amety.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        mongoCliente = new MongoClient(uri);
    }
    
    /**
     * Metodo encargado de insertar el mensaje en la base de datos
     * @param mensaje (Parametro que indica los datos a insertar en la base de datos)
     */
    public void insertarMensaje(Mensaje mensaje)
    {
        mongoCliente = new MongoClient(uri);
        MongoDatabase database = mongoCliente.getDatabase("areplab5");
        MongoCollection<Document> coleccion =database.getCollection("mensajes");
        Document documento=new Document();
        documento.put("mensajes",mensaje.getMensaje());
        documento.put("fecha",mensaje.getFecha());
        coleccion.insertOne(documento);
    }
    
    /**
     * Metodo encargado de realizar una consulta a la base de datos y obtener el mensaje
     * @return (Retorna una lista que contiene los mensajes almacenados en la base de datos)
     */
    public ArrayList<Mensaje> getMensaje() 
    {
        MongoDatabase database = mongoCliente.getDatabase("areplab5");
        MongoCollection<Document> coleccion = database.getCollection("mensajes");
        FindIterable findIterable = coleccion.find();
        ArrayList<Document> documento = new ArrayList<Document>();
        ArrayList<Mensaje> mensaje = new ArrayList<Mensaje>();
        findIterable.into(documento);
        for (Document doc : documento) {
            if (doc.get("mensajes") != null && doc.get("fecha") != null) {
            	mensaje.add(new Mensaje((String) doc.get("mensajes"), (Date) doc.get("fecha")));
            }
        }
        return mensaje;
   }
}