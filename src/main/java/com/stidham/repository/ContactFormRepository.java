package com.stidham.repository;

import com.stidham.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by drewjocham on 4/20/16.
 */
@Repository
public interface ContactFormRepository extends CrudRepository<Contact,Long> {


}
