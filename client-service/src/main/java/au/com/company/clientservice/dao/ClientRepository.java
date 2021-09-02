package au.com.company.clientservice.dao;

import au.com.company.clientservice.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ClientRepository extends CrudRepository<ClientEntity,Long>{

    ClientEntity findById(long id);

    List<ClientEntity> findByName(String name);

    List<ClientEntity> findAll();

}


