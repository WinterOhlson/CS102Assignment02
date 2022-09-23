/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs102assignment02;

/**
 *
 * @author jehuv
 */
public class ContainsBoth
{
    public static void main(String[] args)
    {
        int[] arrayA = {33, 55, 77};
        int[] arrayB = {65, 77, 89};
        
        if(containsBoth(arrayA))
        {
            System.out.println("arrayA contains both 65 and 77");
        }
        else
        {
            System.out.println("arrayA doesn't contain 65 and 77");
        }
        if(containsBoth(arrayB))
        {
            System.out.println("arrayB contains both 65 and 77");
        }
        else
        {
            System.out.println("arrayB doesn't contain 65 and 77");
        }
    }
    
    public static boolean containsBoth(int[] array)
    {
        boolean contains65 = false;
        boolean contains77 = false;
        
        for(int i : array)
        {
            if(i == 65)
            {
                contains65 = true;
            }
            if(i == 77)
            {
                contains77 = true;
            }
        }
        
        if(contains65 == true && contains77 == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
