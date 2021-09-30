package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.company.PhoneNumberAlreadyExists;
import com.company.RecordNotFound;
import com.company.RecordNotValid;
import com.company.Record;


public class PhoneBook {
    private ArrayList<Record> allRecords = new ArrayList<>();
    public List<Record> getAllRecords(){
        return allRecords;
        }

    public void createRecord(Record record) {
//  метод сохраняет в справочнике новую запись. Если в справочнике есть запись c
//  таким же номером телефона, выбросить проверяемое исключение PhoneNumberAlreadyExists.
        try{
            for(Record r : allRecords){
                if (Objects.equals(record.getPhoneNumber(), r.getPhoneNumber())) throw new PhoneNumberAlreadyExists();
            }
            allRecords.add(record);
            System.out.println("Новая запись успешно сохранена");
        }
        catch(PhoneNumberAlreadyExists e) {
                System.out.println("Exception: "+e);
            }
        }

    public void updateRecord(Record record) {
        try{
            if(record.getId()==0 || record.getPhoneNumber()==null) {
                throw new RecordNotValid();
            }
            for(Record r:allRecords){
                if(r.getId() == record.getId()) {
                    allRecords.remove(r);
                    allRecords.add(record);
                    System.out.println("Запись успешно обновлена");
                    return;
                }
            }
            throw new RecordNotFound();
        }
//        catch(RecordNotFound e){
//            System.out.println("Exception: "+e.toString());
//        }
        catch(RecordNotValid e){
            System.out.println("Exception: "+e.toString());
        }
//    метод обновляет запись в справочнике. Если запись с таким идентификатором
//    не существует, выбросить непроверяемое исключение RecordNotFound. Если в новой записи не заполнено поле name и/или
//    поле phoneNumber, выбросить проверяемое исключение RecordNotValid.
    }
    public void deleteRecord(long id) {
//     удаляет запись из справочника по идентификатору, если подходящая запись в
//    справочнике не найдена - выбрасывается непроверяемое исключение RecordNotFound.
//        try{
            for(Record r:allRecords){
                if(r.getId()==id){
                    allRecords.remove(r);
                    System.out.println("Запись удалена");
                }
            }
            throw new RecordNotFound();
//        }
//        catch(RecordNotFound e){
//            System.out.println("Exception: "+e.toString());
//            return;
//        }
    }
}
