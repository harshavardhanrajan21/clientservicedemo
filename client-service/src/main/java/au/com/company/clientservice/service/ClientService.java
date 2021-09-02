package au.com.company.clientservice.service;

import au.com.company.clientservice.dao.ClientRepository;
import au.com.company.clientservice.model.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void addClient(ClientEntity client){
        clientRepository.save(client);
        System.out.println(clientRepository.findAll());
    }

    public ClientEntity getClientById(Long id) {
       return  clientRepository.findById(id.longValue());
    }

    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }

    public void updateClient(Long id, ClientEntity clientToUpdate) {
        ClientEntity toBeUpdated = getClientById(id);
        toBeUpdated.setName(clientToUpdate.getName());
        toBeUpdated.setEmail(clientToUpdate.getEmail());

        clientRepository.save(toBeUpdated);

    }

    public List<ClientEntity> getAllClients() {
        return clientRepository.findAll();
    }
}
