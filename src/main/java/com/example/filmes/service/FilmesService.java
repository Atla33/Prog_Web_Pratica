package com.example.filmes.service;


import com.example.filmes.domain.Filmes;
import com.example.filmes.repository.FilmesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmesService {

    private FilmesRepository repository;

    public FilmesService(FilmesRepository repository) {
        this.repository = repository;
    }

    public Filmes insert(Filmes f){
        return repository.save(f);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Filmes update (Filmes f){
        return repository.saveAndFlush(f);
    }

    public List<Filmes> listAll(){
        return repository.findAll();
    }
}
