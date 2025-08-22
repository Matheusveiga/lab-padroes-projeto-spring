package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

import com.example.labpadroesprojetospring.model.Client;

public interface ClientService {
    Iterable<Client> findAll();
    Client findById(Long id);
    void insert(Client client);
    void update(Long id, Client client);
    void delete(Long id);
}
}
