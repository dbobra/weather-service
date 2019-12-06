package com.dbobr.util;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;

public class PropertyEncryptionTest {

    @Test
    public void contextLoads() {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //Salt required for encryption
        textEncryptor.setPassword("secret");
        //Data to be encrypted
        String encrypted = textEncryptor.encrypt("23ea786b27f284b6ecd76e87150a8898");
        System.out.println("Encrypted:"+encrypted);

    }

}
