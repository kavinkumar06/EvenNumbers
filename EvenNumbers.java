# EvenNumbers
import java.io.*;
import java.util.*;
public class EvenNumbers
{
  public static void main(String args[])
  {
    int limit=50;
    System.out.println("Printing even numbers between 1 and "+limit);
    for(int i=1;i<=limit;i++)
    {
    if(i%2==0)
    {
     System.out.println(i+" ");
     }
    }
   }
  } 
