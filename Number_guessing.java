import java.util.Random;
import java.util.Scanner;
public class Number_guessing
{
    public static void main()
    {
        Random ra = new Random();
        Scanner sc = new Scanner (System.in);
        int n=0,a=0,sn,g,i=1 ;
        System.out.println("Enter according to the difficulty level you desire to play with :");
        System.out.println("1 : Easy");
        System.out.println("2 : Moderate");
        System.out.println("3 : High");
        n = sc.nextInt();
        if(n==1)
        {
            System.out.println("The computer is going to choose any number between 1 to 100 and you have to guess it.");
            System.out.println("The lesser the attempts the smarter you are!!");
            System.out.println("Here we begin");
            sn = ra.nextInt(100)+1;
            while (i!=0)
            {
                System.out.println("Enter your guess "); 
                g = sc.nextInt();
                if ( g > sn )
                {
                    System.out.println("Too high");
                    a++;
                }
                if ( g < sn)
                {
                    System.out.println("Too Low");
                    a++;
                }
                if ( g==sn)
                {
                    a++;
                    i = 0;
                }
            }
            if (i==0)
            {
                System.out.println("Congratulations on guessing the number!!");
                System.out.println("Attempts used : "+a);
            }
        }
        if ( n==2)
         {
          System.out.println("The computer is going to choose any number between 1 to 200 and you have to guess it.");
            System.out.println("The lesser the attempts the smarter you are!!");
            System.out.println("Here we begin");
            sn = ra.nextInt(200)+1;
         while (i!=0)
            {
        System.out.println("Enter your guess "); 
        g = sc.nextInt();
        if ( g > sn )
        {
         System.out.println("Too high");
         a++;
        }
        if ( g < sn)
        {
         System.out.println("Too Low");
         a++;
        }
        if ( g==sn)
        {
            i=0;
            a++;
        }
    }
    if ( i == 0)
    {
      System.out.println("Congratulations on guessing the number!!");
      System.out.println("Attempts Used : "+a);
    }
  }
  if ( n==3)
  {
          System.out.println("The computer is going to choose any number between 1 to 500 and you have to guess it.");
          System.out.println("The lesser the attempts the smarter you are!!");
          System.out.println("Here we begin");
          sn = ra.nextInt(500)+1;
         while (i!=0)
            {
              System.out.println("Enter your guess "); 
              g = sc.nextInt();
              if ( g > sn )
              { 
                  System.out.println("Too high");
                  a++;
                }
              if ( g < sn)
              {
                  System.out.println("Too low");
                  a++;
              }
              if ( g == sn)
              {
                  a++;
                  i=0;
              }
            }
         if ( i==0 )
         {
             System.out.println("Congartulations on guessing the number!!");
             System.out.println(" Attempts Used : "+a);
         }
        }
    }
}
