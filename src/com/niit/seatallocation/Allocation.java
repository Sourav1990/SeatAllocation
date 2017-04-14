package com.niit.seatallocation;


import java.io.*;
public class Allocation{
    public static void main(String[]args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int i,n;int a[]=new int[11];
        do
        {
            System.out.println("Enter the number of test cases(T)");
            n=Integer.parseInt(in.readLine());
            System.out.println("Enter the seat number to be checked(N)");
            for(i=1;i<=n;i++)
           {
               
               do{
                   
                a[i]=Integer.parseInt(in.readLine());
            }while(!(a[i]<=108));
        }
        }while(!((n<10)&&(n>0)));
        for(i=1;i<=n;i++)
        {
            
            switch (a[i]%3)
            {
                case 1:System.out.println("WS"+" "+a[i]);
                break;
                case 2:System.out.println("MS"+" "+a[i]);
                break;
                case 0:System.out.println("AS"+" "+a[i]);
                break;
                default:System.out.println("error");
            }
        }
    }
}
