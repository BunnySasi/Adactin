package org.adactin.pages;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Demoss {
@Test
public void testName() throws Exception {
	Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    for (int i = n; i >= 1; i--) {
        for (int j = i; j >= n; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    
    scanner.close();
}
}

