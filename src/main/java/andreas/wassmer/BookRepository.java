package andreas.wassmer;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.ApplicationPath;

@ApplicationScoped
public class BookRepository implements PanacheRepository<Book> {

}
