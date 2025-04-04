package com.it;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Integer");
            int a= Integer.parseInt(br.readLine());
        System.out.println("Enter the String");
                String b = br.readLine();
                System.out.println("integer value is "+a+ " And String is "+b);

    }
}
