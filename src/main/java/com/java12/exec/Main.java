package com.java12.exec;

import com.java12.service.Service;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        service.indentSrtring("hello world");

        service.transformString();

        service.compareFiles("src/main/java/com/java12/service/File1.txt", "src/main/java/com/java12/service/File2.txt");
        service.numberFormat();
    }
}