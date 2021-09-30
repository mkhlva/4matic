package com.company;

public class RecordNotValid extends Exception{
    public String toString(){
        return "In the new record, the name field and / or the phoneNumber field are not filled";
    }
}