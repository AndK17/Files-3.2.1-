package com.company;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try{
            sravnen("src/com/company/f1.txt", "src/com/company/f2.txt");
        }catch(Exception ex){
            System.out.println("Что то пошло не так: "+ex.getMessage());
        }
    }

    static void sravnen(String file1, String file2) throws IOException {
        FileInputStream f1=new FileInputStream(file1);
        FileInputStream f2 = new FileInputStream(file2);
        int sch = 0;
        int t;
        while((t = f1.read()) != -1) {
            char t1 = (char)t;
            char t2 = (char)f2.read();
            if (t1 != t2)
                System.out.println(sch + ":" + t1 + " " + t2);
            sch++;
        }
        f1.close();
        f2.close();
    }
}
