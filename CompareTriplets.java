package com.mycompany.comparetriplets;

import java.util.*;
import java.util.Scanner;


public class CompareTriplets 
{

    public static void main(String[] args)
    {
        int [] tripletA, tripletB;
        tripletA = new int[3];
        tripletB = new int[3];

        Scanner kbd = new Scanner(System.in);
        
        System.out.println("Enter the elements of the first triplet: ");
        for(int i = 0; i<3; i++)
        {
            if(kbd.hasNextInt())
            tripletA[i]= kbd.nextInt();
            
        }
        System.out.println("Enter the elements of the second triplet: ");
        for(int i = 0; i<3; i++)
        {
            if(kbd.hasNextInt())
            tripletB[i]= kbd.nextInt();
            
        }
    
        int[] result = compareTriplets(tripletA, tripletB);
        System.out.println(result[0] + " " + result[1]);

        kbd.close();
    }

    public static int[] compareTriplets(int[] a, int[] b)
    {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                aliceScore++;
            } else if (a[i] < b[i]) {
                bobScore++;
            }
        }

        return new int[]{aliceScore, bobScore};
    }
        
    }