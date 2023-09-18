package blink.api;

import java.util.Map;

import javax.sql.DataSource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/_hc")
public class HealthCheck {
    @Inject
    DataSource ds;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> getHealth(){
        try (var conn = ds.getConnection()){
            var valid = conn.isValid(15);
            return Map.of("healthy", ""+valid);
        }catch(Exception e){
            return Map.of("healthy", "no");
        }
    }    
}
