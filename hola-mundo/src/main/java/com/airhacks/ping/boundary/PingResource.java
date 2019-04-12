package com.airhacks.ping.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author airhacks.com
 */
@Path("Saludo")
public class PingResource {

    @GET
    public String ping(@QueryParam("nombre") String nombre) {
        return "Hola " + nombre;
    }

}
