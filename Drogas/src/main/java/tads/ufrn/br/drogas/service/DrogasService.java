package tads.ufrn.br.drogas.service;

import org.springframework.stereotype.Service;
import tads.ufrn.br.drogas.domain.Drogas;
import tads.ufrn.br.drogas.repository.DrogasRepository;

import org.springframework.stereotype.Service;
import java.util.Optional;

import java.util.List;

@Service
public class DrogasService {

    private DrogasRepository repository;

    public DrogasService(DrogasRepository repository) {this.repository = repository;}

    public Drogas insert(Drogas d){
        return repository.save(d);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Drogas update (Drogas a){
        return repository.saveAndFlush(a);
    }

    public List<Drogas> listAll(){
        return repository.findAll();
    }

}
