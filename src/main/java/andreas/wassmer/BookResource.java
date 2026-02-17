package andreas.wassmer;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/books")
public class BookResource {

    @Inject
    BookRepository bookRepository;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getBooks() {

        return Response.ok(bookRepository.findAll()).build();
    }
}
