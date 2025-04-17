package com.example.codFiscTurner.utils;

import com.example.codFiscTurner.enums.MonthEnum;

import java.time.LocalDate;
import java.util.Objects;

public class DateRetrieverUtil {

    public static LocalDate extractBirthDateFromCF(String cf) {
        if (cf != null && cf.length() == 16) {

            //Caratteri del codFisc dai quali possiamo calcolare l'anno di nascita
            int year = Integer.parseInt(cf.substring(6, 8));

            //Carattere del codFisc dai quali possiamo calcolare il mese di nascita
            String month = String.valueOf(cf.charAt(8));

            //Caratteri del codFisc dai quali possiamo calcolare il giorno di nascita
            int day = Integer.parseInt(cf.substring(9, 11));

            // con l'anno a 2 cifre da solo non facciamo nulla, per calcolare anche il secolo bisogna:
            year = year + (year < 40 ? 2000 : 1900);


            // Dall'enum dei mesi, prendo il valore numerico del mese rispettivamente al carattere gia preso
            // dal codFisc
            int monthConverted = 0;
            for (MonthEnum monthEnum : MonthEnum.values()) {
                if (Objects.equals(monthEnum.getMonthCode(), month)) {
                    monthConverted = monthEnum.getMonthNb();
                }
            }
            if (monthConverted == 0) {
                throw new IllegalArgumentException("Mese non valido");
            }
            // per quanto riguarda il genere femminile se il day estratto è maggiore di 40
            // bisogna sottrarlo al valore ottenuto, ricavando così il giorno effettivo.

            if (day > 40) day = day - 40;
            return  LocalDate.of(year, monthConverted, day);
        } else {
            throw new IllegalArgumentException("Il codice fiscale inserito e' incompleto o non corretto");
        }
    }

}
