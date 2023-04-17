
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserResource {

    
     // In-memory collection to store users
    private static Map<String, User> users = new HashMap<>();
    
      // GET method to retrieve a user by ID
    @GET
    @Path("/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam("userId") String userId) {
        User user = users.get(userId);
        if (user != null) {
            return Response.ok(user).build(); // Return HTTP 200 OK with user object
        } else {
            return Response.status(Response.Status.NOT_FOUND).build(); // Return HTTP 404 Not Found if user doesn't exist
        }
    }
    
    
}
