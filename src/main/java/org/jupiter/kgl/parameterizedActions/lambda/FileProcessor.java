package org.jupiter.kgl.parameterizedActions.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {

    public static String processFile(BufferedReaderProcessor brp) throws IOException{
        try(BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/data.txt"))){
            return brp.process(reader);
        }
    }

    public static void main(String[] args) throws IOException {
        String oneLine = processFile((BufferedReader br) -> br.readLine());
        System.out.println(oneLine);
        String twoLines = processFile((BufferedReader br) -> br.readLine() + "\n"+ br.readLine());
        System.out.println(twoLines);
    }
}
