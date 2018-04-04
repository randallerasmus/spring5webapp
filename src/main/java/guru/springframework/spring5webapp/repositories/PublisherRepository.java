package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by randall.erasmus on 2018/04/04.
 */
public interface PublisherRepository extends CrudRepository <Publisher,Long> {
}
