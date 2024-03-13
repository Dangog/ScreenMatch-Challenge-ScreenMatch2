package br.com.desafio.sprin.ScreenMatch.Challenge.service;

import br.com.desafio.sprin.ScreenMatch.Challenge.dto.FraseDTO;
import br.com.desafio.sprin.ScreenMatch.Challenge.model.Frase;
import br.com.desafio.sprin.ScreenMatch.Challenge.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO searchRandomSentence(){
        Frase frase = repository.findRandomSentence();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPoster(),frase.getPersonagem());
    }

}
