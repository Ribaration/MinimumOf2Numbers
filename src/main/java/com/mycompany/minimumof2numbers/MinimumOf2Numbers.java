/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minimumof2numbers;

/**
 *
 * @author Ribaration
 */
import java.util.Scanner;
public class MinimumOf2Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int min = (num1 < num2) ? num1 : num2;
        
        System.out.println("Minimum of " + num1 + " and " + num2 + " is: " + min);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

