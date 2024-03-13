package br.com.desafio.sprin.ScreenMatch.Challenge.repository;

import br.com.desafio.sprin.ScreenMatch.Challenge.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query(value = "SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Frase findRandomSentence();

}
