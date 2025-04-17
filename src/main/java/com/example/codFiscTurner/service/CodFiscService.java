package com.example.codFiscTurner.service;

import com.example.codFiscTurner.dto.PersonDataDto;
import com.example.codFiscTurner.utils.DateRetrieverUtil;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class CodFiscService {

    public PersonDataDto getPersonDataFromCF(String cf) {
        LocalDate birthDate = DateRetrieverUtil.extractBirthDateFromCF(cf);
        int age = Period.between(birthDate, LocalDate.now()).getYears();

        return new PersonDataDto(birthDate.toString(), age);
    }

}
