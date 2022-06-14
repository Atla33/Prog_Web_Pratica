package com.example.filmes.repository;

import com.example.filmes.domain.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmesRepository extends JpaRepository<Filmes, Long> {
}
