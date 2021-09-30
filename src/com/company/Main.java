package com.company;
import com.company.PhoneBook;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	    PhoneBook ph = new PhoneBook();
        ph.createRecord(new Record(1, "89130109089", "Andrey"));
        ph.createRecord(new Record(2, "89130050111", "Ivan"));
        ph.createRecord(new Record(2, "89139130011", "Sergey"));
        List<Record> list = ph.getAllRecords();
//        pb.updateRecord(new Record(1, "89130107070", "Andrey"));
        ph.updateRecord(new Record(1, "89130109090", "Slava"));
        //pb.deleteRecord(1);
    }
}
