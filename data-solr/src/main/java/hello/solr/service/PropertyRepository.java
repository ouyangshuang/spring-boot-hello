package hello.solr.service;

import hello.solr.Property;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

/**
 * @author ouyang
 * @since 2015-07-06 10:28
 */
public interface PropertyRepository extends SolrCrudRepository<Property,String> {

    List<Property> findByEstateNameStartingWith(String estateName);

}
