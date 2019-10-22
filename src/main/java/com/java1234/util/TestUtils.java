package com.java1234.util;



import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author qtq
 * @Created on 2019-08-30 14:45.
 */
public class TestUtils {

    //文件拷贝
    public static void main(String[] args) {

        try (FileInputStream file1 = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\123.java"));
             FileOutputStream file2 = new FileOutputStream(new File("C:\\Users\\Administrator\\Desktop\\789.java"))) {
//            IOUtils.copy(file1, file2);
            byte[] byteArray = IOUtils.toByteArray(file1);
            System.out.println(byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String str = "    ";
        System.out.println(str.length()); //4
    }
}
