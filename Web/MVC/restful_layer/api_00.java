
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
    
    
        // POST method to create a new user
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createUser(User user) {
        String userId = UUID.randomUUID().toString(); // Generate a random UUID for user ID
        user.setId(userId);
        users.put(userId, user); // Add user to the collection
        return Response.ok(userId).build(); // Return HTTP 200 OK with user ID
    }
    
       // PUT method to update an existing user by ID
    @PUT
    @Path("/{userId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateUser(@PathParam("userId") String userId, User user) {
        User existingUser = users.get(userId);
        if (existingUser != null) {
            existingUser.setName(user.getName()); // Update user's name
            existingUser.setEmail(user.getEmail()); // Update user's email
            users.put(userId, existingUser); // Update user in the collection
            return Response.ok().build(); // Return HTTP 200 OK
        } else {
            return Response.status(Response.Status.NOT_FOUND).build(); // Return HTTP 404 Not Found if user doesn't exist
        }
    }
    
}
