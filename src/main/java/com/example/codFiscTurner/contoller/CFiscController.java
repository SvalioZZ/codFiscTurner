package com.example.codFiscTurner.contoller;

import com.example.codFiscTurner.dto.PersonDataDto;
import com.example.codFiscTurner.service.CodFiscService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/codice-fiscale")
@Tag(name = "Codice Fiscale", description = "API per ottenere dati da codice fiscale")
public class CFiscController {

    @Autowired
    private CodFiscService cfService;

    @Operation(summary = "Restituisce una data di nascita ed eta' a partire dal codice fiscale in input." +
            "\nAndra' in errore qualora non venisse inserito un CF valido di 16 cifre.")
    @GetMapping("/{cf}")
    public PersonDataDto getInfo(@PathVariable("cf") String cf) {
        return cfService.getPersonDataFromCF(cf);
    }
}
