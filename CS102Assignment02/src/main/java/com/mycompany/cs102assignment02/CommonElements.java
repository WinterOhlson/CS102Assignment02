/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs102assignment02;

import java.util.ArrayList;

/**
 *
 * @author jehuv
 */
public class CommonElements 
{
    public static void main(String[] args)
    {
        int[] arrayA = {3, 5, 7, 11, 13, 17, 19};
        int[] arrayB = {2, 5, 8, 11, 14, 17, 20};
        
        System.out.println("The common elements of arrayA and arrayB are: ");
        for(int i : commonElements(arrayA, arrayB))
        {
            System.out.println(i);
        }
    }
    
    public static int[] commonElements(int[] array0, int[] array1)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0; i < array0.length; i++)
        {
            for(int k = 0; k < array1.length; k++)
            {
                if(array1[k] == array0[i])
                {
                    boolean contains = false;
                    for(Integer num : arrayList)
                    {
                        if(num == array1[k])
                        {
                            contains = true;
                        }
                    }
                    if(contains == false)
                    {
                        arrayList.add(array1[k]);
                    }
                }
            }
        }
        int[] newArray = new int[arrayList.size()];
        for(int i = 0; i < newArray.length; i++)
        {
            newArray[i] = arrayList.get(i);
        }
        
        return newArray;
    }
}
