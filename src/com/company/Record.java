package com.company;

public class Record {
    private long id;
    private String phoneNumber;
    private String name;

    public Record(long id, String phoneNumber, String name){
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }
     public void getInfo(){
         System.out.println("id - " + this.id + ", name - " + this.name + ", phone - " + this.phoneNumber);
     }
     public long getId(){
        return this.id;
     }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getName(String name){
        return this.name;
    }
}
