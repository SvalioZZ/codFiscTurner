package com.example.codFiscTurner.dto;

public class PersonDataDto {

    private String birthDate;
    private int age;

    public PersonDataDto(String birthDate, int age) {
        this.birthDate = birthDate;
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
