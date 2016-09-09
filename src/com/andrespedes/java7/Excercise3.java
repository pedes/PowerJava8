package com.andrespedes.java7;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andres on 09/09/2016.
 */
public class Excercise3 {
    public static void main(String[] args) {
        File aDirectory = new File(".");

        List<String> filesInDir = new ArrayList<>();
        for(File child : aDirectory.listFiles()) {
            filesInDir.add(child.getName());
        }

        for(int i = 0; i < filesInDir.size(); i++) {
            System.out.print(filesInDir.get(i));
            if(i != filesInDir.size() - 1)
                System.out.print(", ");
        }
        System.out.println();
    }
}
