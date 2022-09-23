/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs102assignment02;

/**
 *
 * @author jehuv
 */
public class ReverseArray 
{
    public static void main(String[] args)
    {
        char[] arrayA = {'a', 'p', 'p', 'l', 'e'};
        
        System.out.println("The reverse of arrayA is ");
        char[] arrayB = reverseArray(arrayA);
        
        for(int i = 0; i < arrayB.length; i++)
        {
            System.out.println(arrayB[i]);
        }
    }
    
    public static char[] reverseArray(char[] inputArray)
    {
        char[] newArray = new char[inputArray.length];
        int count = 0;
        
        for(int i = inputArray.length - 1; i >=0; i--)
        {
            newArray[count] = inputArray[i];
            count++;
        }
        
        return(newArray);
    }
}
