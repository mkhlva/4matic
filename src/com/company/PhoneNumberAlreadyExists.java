package com.company;

public class PhoneNumberAlreadyExists extends Exception{
    public String toString(){
        return "There is already an entry in the directory with the same phone number";
    }
}

