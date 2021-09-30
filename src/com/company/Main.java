package com.company;
import com.company.PhoneBook;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	    PhoneBook pb = new PhoneBook();
        pb.createRecord(new Record(1, "8", "Kirill"));
        pb.createRecord(new Record(2, "8", "Kirill"));
        pb.createRecord(new Record(2, "89", "Kirill"));
        List<Record> list = pb.getAllRecords();
//        pb.updateRecord(new Record(111, "8", "Kirill"));
        pb.updateRecord(new Record(1, "", "Kir"));
        //pb.deleteRecord(77);
    }
}
