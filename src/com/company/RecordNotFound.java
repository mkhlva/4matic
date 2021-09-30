package com.company;

public class RecordNotFound extends RuntimeException{
    public String toString(){
        return "Record with this identifier does not exist";
    }
}
