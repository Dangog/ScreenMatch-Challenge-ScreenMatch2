package br.com.desafio.sprin.ScreenMatch.Challenge.controller;

import br.com.desafio.sprin.ScreenMatch.Challenge.dto.FraseDTO;
import br.com.desafio.sprin.ScreenMatch.Challenge.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO getFrase(){
        return service.searchRandomSentence();
    }
}
