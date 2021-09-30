package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class PhoneBook {
    private ArrayList<Record> allRecords = new ArrayList<>();

    public List<Record> getAllRecords() {
        return this.allRecords;
    }

    public void createRecord(Record record) {
//  метод сохраняет в справочнике новую запись. Если в справочнике есть запись c
//  таким же номером телефона, выбросить проверяемое исключение PhoneNumberAlreadyExists.
        try {
            for (Record r : allRecords) {
                if (Objects.equals(record.getPhoneNumber(), r.getPhoneNumber())) {
                    throw new PhoneNumberAlreadyExists();
                }
            }
            allRecords.add(record);
            System.out.println("Запись прошла проверку и сохранена.");
        } catch (PhoneNumberAlreadyExists ex) {
            System.out.println("Exception: " + ex);
        }
    }

    //- метод обновляет запись в справочнике. Если запись с таким идентификатором
    //не существует, выбросить непроверяемое исключение RecordNotFound. Если в новой записи не заполнено поле name и/или
    //поле phoneNumber, выбросить проверяемое исключение RecordNotValid.
    public void updateRecord(Record record) {
        try {
            if (record.getId() == 0 || record.getPhoneNumber() == null || record.getPhoneNumber().isBlank()) {
                throw new RecordNotValid();
            }
            for (Record r : allRecords) {
                if (r.getId() == record.getId()) {
                    allRecords.remove(r);
                    allRecords.add(record);
                    System.out.println("Запись прошла проверку и обновлена.");
                    return;
                }
            }
            throw new RecordNotFound();
        }
//
        catch (RecordNotValid ex) {
            System.out.println("Exception: " + ex);
        }
//
    }

    //     Метод удаляет запись из справочника по идентификатору, если подходящая запись в
//    справочнике не найдена - выбрасывается непроверяемое исключение RecordNotFound.
    public void deleteRecord(long id) {
        int a = allRecords.size();
        for (Record r : allRecords) {
            if (r.getId() == id) {
                allRecords.remove(r);
                System.out.println("Запись из справочника удалена");
                break;
            }
        }
        if (a == allRecords.size()){
            throw new RecordNotFound();
        }

    }
}
