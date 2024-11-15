package com.java12.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.Locale;

public class Service {

    public void indentSrtring(String s){
        System.out.println(s.indent(4));
    }

    public void transformString(){
        String uppercase = "abcde".transform(String::toUpperCase);
        Integer i        = "12345".transform(Integer::valueOf);
        BigDecimal big   = "1234567891011121314151617181920".transform(BigDecimal::new);

        System.out.println(uppercase);
        System.out.println(i);

    }

    public void compareFiles(String path1, String path2){
        try {
            System.out.println((int) Files.mismatch(Path.of(path1), Path.of(path2)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void numberFormat(){
        NumberFormat nfLong = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);

        System.out.println( nfLong.format(1_000));
    }
}
