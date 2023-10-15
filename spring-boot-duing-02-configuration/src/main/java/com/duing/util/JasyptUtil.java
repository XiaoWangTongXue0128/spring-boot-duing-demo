package com.duing.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {
    public static void main(String[] args) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("123456!@#");
        String username = textEncryptor.encrypt("wtc");
        String password = textEncryptor.encrypt("wtc13142mq");
        System.out.println(username);
        System.out.println(password);

        System.out.println("解密username：" + textEncryptor.decrypt("7Glbh3FKjvSgtVm2yM9Slw=="));
        System.out.println("解密password：" + textEncryptor.decrypt("XqsGV1lWk0thHvhMUHy8kXPxR2ub2qTe"));
//  7Glbh3FKjvSgtVm2yM9Slw==
//  XqsGV1lWk0thHvhMUHy8kXPxR2ub2qTe
//
    }
}
