package com.example.codFiscTurner.enums;

public enum MonthEnum {

    GENNAIO("A", 1),
    FEBBRAIO("B", 2),
    MARZO("C", 3),
    APRILE("D", 4),
    MAGGIO("E", 5),
    GIUGNO("H", 6),
    LUGLIO("L", 7),
    AGOSTO("M", 8),
    SETTEMBRE("P", 9),
    OTTOBRE("R", 10),
    NOVEMBRE("S", 11),
    DICEMBRE("T", 12);

    private final String monthCode;
    private final int monthNb;

    MonthEnum(String monthCode, int monthNb) {
        this.monthCode = monthCode;
        this.monthNb = monthNb;
    }

    public String getMonthCode() {
        return monthCode;
    }

    public int getMonthNb() {
        return monthNb;
    }
}
