package au.com.company.clientservice.api;

import au.com.company.clientservice.model.ClientEntity;
import au.com.company.clientservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api/v1/client")
@RestController
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @PostMapping
    public void addClient(@RequestBody ClientEntity clientEntity){ clientService.addClient(clientEntity);}

    @GetMapping
    public Iterable<ClientEntity> getAllClients(){return clientService.getAllClients();}

    @GetMapping(path = "{id}")
    public ClientEntity getClientById(@PathVariable("id") Long id) {
        return clientService.getClientById(id);
    }

    @DeleteMapping(path = "{id}")
    public void deleteClientById(@PathVariable("id") Long id){
        clientService.deleteClientById(id);
    }

    @PutMapping(path = "{id}")
    public void updateClient(@PathVariable("id") Long id, @RequestBody ClientEntity clientToUpdate){
        clientService.updateClient(id, clientToUpdate);
    }

}
