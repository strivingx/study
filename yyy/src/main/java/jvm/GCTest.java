package jvm;

import java.util.ArrayList;
import java.util.List;

public class GCTest {

    public static void main(String[] args) {
        byte[] allocation1, allocation2;
       // allocation1 = new byte[55900*1024];
       // allocation2 = new byte[1900*1024];
        System.out.println("abc" == new String("abc").intern());
        List<String> list = new ArrayList<String>();
        int i=0;
        while(true){
            list.add("aa" + i);
        }
    }
}