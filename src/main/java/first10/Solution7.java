package first10;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        //added this:
        for (int i=0; i<n;i++){
            int arrItem = Integer.parseInt(String.valueOf(arr.get(i)));
            arr.set(i, arrItem);
        }

        for (int x=arr.size()-1; x>=0; x--){
            System.out.print(arr.get(x) + " ");
        }


        bufferedReader.close();
    }
}
