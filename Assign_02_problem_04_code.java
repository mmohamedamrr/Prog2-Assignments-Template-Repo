//mohamed amr
//202106559

import java.util.Scanner;

public class loop
{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
       int num=sc.nextInt();
       
       for(int line=1;line<=num;line++)
       {
            for(int star=num;star>=line;star--)
            {
                System.out.print("*");
            }
            System.out.println();
       }    
    }
}