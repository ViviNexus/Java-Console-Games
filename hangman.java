import java.util.Random;
import java.util.Scanner;
public class hangman 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        String c [];
        int i,l,j,live = 3,a;
        String w;
        char inp;
        System.out.println("Hello There !!, Welcome to Hangman");
        System.out.println("You will have 3 lives initially with you, and you will loose one live if you fail to guess one letter in three guess");
        System.out.println("Once you have lost all three lives, you loose the game and the word will reveal itself");
        System.out.println("You will recieve a hint for each word before beginning the guesses, make sure to use them well");
        System.out.println("Please select the difficulty level accordingly");
        System.out.println("1 - Easy");
        System.out.println("2 - Moderate");
        System.out.println("3 - Difficult");
        int n = sc.nextInt();
        if ( n==1)
        {
          c = new String[] {"TIGER", "LOTUS", "WORK", "CRAB", "ADULT", "HUMAN", "GOAL", "ALONE", "PATH", "BRAIN", "SPECS", "PIZZA", "EXAM", "HAPPY"};
          i = ra.nextInt(c.length);
          w = c[i];
          l = w.length();
          System.out.println("You have been assigned a "+l+" letter word!");
          if (w=="TIGER")
          {
              System.out.println("HINT : National Animal of India");
              for (j=0;j<l;j++)
              {
                System.out.println("Enter you "+(j+1)+" letter!!");
                inp = sc.next().charAt(0);
              if (w.charAt(j)==inp)
              {
                      System.out.println("Correct guess ^_^!");
                      System.out.println("Lives left : "+live);
              }
                  else
              {
                      live = live-1;
                       System.out.println("Wrong guess *_*!");
                      System.out.println("Lives left : "+live);
              }
              if(live== 0)
              {
                  System.out.println("You have lost all your lives");
                  System.out.println("The word was : "+w); 
                  break;
              }
          }
        }
        else if (w=="LOTUS")
        {
         System.out.println("HINT : The flower that grows beautifully even in the dirtiest surroundings");
         for (j=0;j<l;j++)
         {
             System.out.println("Enter your "+(j+1)+" letter");
             inp = sc.next().charAt(0);
         if (w.charAt(j) == inp)
            {
                System.out.println("Correct guess ^_^!");
                System.out.println("Lives left: " + live);
            }
         else
            {
                 live = live - 1;
                 System.out.println("Wrong guess *_*!"); 
                 System.out.println("Lives left: " + live);
            }
         if (live == 0)
             {
                System.out.println("You have lost all your lives!");
                System.out.println("The word was: " + w);
                break;
             }
        }
    }
    else if (w=="WORK")
    {
        System.out.println("HINT : The thing we all have to do to get paid");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if ( w=="CRAB")
    {
        System.out.println("HINT : The creature you find at a beach, under the sand and can bite you");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
     }
    else if ( w=="ADULT")
    {
        System.out.println("HINT : A legal title you attain once you turn 18");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }          
        }
    }
    else if (w=="HUMAN")
    {
        System.out.println("HINT : Termed as the best creature of god");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if(w=="ALONE")
    {
        System.out.println("HINT : When you have no one around you, you are?");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if (w=="GOAL")
    {
        System.out.println("HINT : Everyone has wishes to achieve their desired ?");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if (w=="PATH")
    {
        System.out.println("HINT : We all must follow it to reach our destination");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if(w=="BRAIN")
    {
        System.out.println("HINT : Also known as the CPU of our body");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if (w=="SPECS")
    {
        System.out.println("HINT : The thing people with bad eyesight require to see");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if(w=="PIZZA")
    {
        System.out.println("HINT : Italian dish, round in shape with triangles formed in it");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if (w=="EXAM")
    {
        System.out.println("HINT : The students prepare for them ");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if(w=="HAPPY")
    {
        System.out.println("HINT : The feeling you get when you are in the situation you desired");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
}
if(n==2)
{
     c = new String[] {"MEMORY", "FUTURE", "MINDSET", "POTENTIAL", "LEGENDARY", "SUCCESS", "PROMISE", "BELIEVE", "STRESSED", "VITAMIN", "DRAMATIC", "THEATRE", "MONOPLY"};
          i = ra.nextInt(c.length);
          w = c[i];
          l = w.length();
          System.out.println("You have been assigned a "+l+" letter word!");
          if (w=="MEMORY")
          {
              System.out.println("HINT : It can be lost,shared or stored digitally, but is the hardest to replcae when about a person");
              for (j=0;j<l;j++)
              {
                System.out.println("Enter you "+(j+1)+" letter!!");
                inp = sc.next().charAt(0);
              if (w.charAt(j)==inp)
              {
                      System.out.println("Correct guess ^_^!");
                      System.out.println("Lives left : "+live);
              }
                  else
              {
                      live = live-1;
                       System.out.println("Wrong guess *_*!");
                      System.out.println("Lives left : "+live);
              }
              if(live== 0)
              {
                  System.out.println("You have lost all your lives");
                  System.out.println("The word was : "+w); 
                  break;
              }
          }
        }
        else if (w=="FUTURE")
        {
         System.out.println("HINT : It is something everyone is headed towards, yet no one knows about it until it arrives");
         for (j=0;j<l;j++)
         {
             System.out.println("Enter your "+(j+1)+" letter");
             inp = sc.next().charAt(0);
         if (w.charAt(j) == inp)
            {
                System.out.println("Correct guess ^_^!");
                System.out.println("Lives left: " + live);
            }
         else
            {
                 live = live - 1;
                 System.out.println("Wrong guess *_*!"); 
                 System.out.println("Lives left: " + live);
            }
         if (live == 0)
             {
                System.out.println("You have lost all your lives!");
                System.out.println("The word was: " + w);
                break;
             }
        }
    }
    else if (w=="VITAMIN")
    {
        System.out.println("HINT : They are named after alphabets and are essential for our body to work");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if ( w=="STRESSED")
    {
        System.out.println("HINT : It is an overwhelming feeling, when spelled backwards, becomes sweet");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
     }
    else if ( w=="LEGENDARY")
    {
        System.out.println("HINT : It describes something or someone famous enough to belong to a myth, not history ");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }          
            System.out.println("Congratulations on Winning!!");
        }
    }
    else if (w=="PROMISE")
    {
        System.out.println("HINT : It gets broken if not kept, yet you can give it to someone without losing it yourself");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if(w=="SUCCESS")
    {
        System.out.println("HINT : It is peak achievement that you got after piles of failures");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if (w=="POTENTIAL")
    {
        System.out.println("HINT : The hidden ability inside you, that is yet to be unleashed");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if (w=="MINDSET")
    {
        System.out.println("HINT : It dictates how you view the world, it canbe firm or open to growth");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if(w=="THEATRE")
    {
        System.out.println("HINT : It is a place where people pay to see illusions taht are not real");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if (w=="MONOPLY")
    {
        System.out.println("HINT : It can refer to a unbeatable looking company, or a board game");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if(w=="ACHIEVEMENT")
    {
        System.out.println("HINT : It is a mileston that turns hardwork into pride");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if (w=="BELIEVE")
    {
        System.out.println("HINT : THe act of holding something as the truth, it requires faith not proof ");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if(w=="DRAMATIC")
    {
        System.out.println("HINT : A person who overreacts or makes a huge scene");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
}
if (n==3)
{
     c = new String[] {"JURISIDICTION", "METAMORPHOSIS", "FLABERGAST", "PHONETICIAN", "KALIEDOSCOPE", "PHILOSOPHY", "PROCRASTINATE", "CLAUSTROPHOBIA", "PSEUDOSCIENCE", "CARDIOLOGIST", "AMERICANO", "REVOLUTIONARY", "ARITHMETIC"};
          i = ra.nextInt(c.length);
          w = c[i];
          l = w.length();
          System.out.println("You have been assigned a "+l+" letter word!");
          if (w=="JURISIDICTION")
          {
              System.out.println("HINT :It defines the invisible boundary where a specific set of laws holds power, but a single step across it can render a judge powerless");
              for (j=0;j<l;j++)
              {
                System.out.println("Enter you "+(j+1)+" letter!!");
                inp = sc.next().charAt(0);
              if (w.charAt(j)==inp)
              {
                      System.out.println("Correct guess ^_^!");
                      System.out.println("Lives left : "+live);
              }
                  else
              {
                      live = live-1;
                       System.out.println("Wrong guess *_*!");
                      System.out.println("Lives left : "+live);
              }
              if(live== 0)
              {
                  System.out.println("You have lost all your lives");
                  System.out.println("The word was : "+w); 
                  break;
              }
          }
        }
        else if (w=="METAMORPHOSIS")
        {
         System.out.println("HINT : The dramatic biological transformation a creature undergoes, famously seen when a caterpillar turns into a butterfly.");
         for (j=0;j<l;j++)
         {
             System.out.println("Enter your "+(j+1)+" letter");
             inp = sc.next().charAt(0);
         if (w.charAt(j) == inp)
            {
                System.out.println("Correct guess ^_^!");
                System.out.println("Lives left: " + live);
            }
         else
            {
                 live = live - 1;
                 System.out.println("Wrong guess *_*!"); 
                 System.out.println("Lives left: " + live);
            }
         if (live == 0)
             {
                System.out.println("You have lost all your lives!");
                System.out.println("The word was: " + w);
                break;
             }
        }
    }
    else if (w=="FLABERGAST")
    {
        System.out.println("HINT :A funny-sounding word that means to shock or surprise someone so intensely that they are left completely speechless.");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if ( w=="PHONETICIAN")
    {
        System.out.println("HINT : A language expert who spends their time studying and analyzing the physical sounds of human speech.");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
     }
    else if ( w=="KALIEDOSCOPE")
    {
        System.out.println("HINT :  A toy tube you look through that uses mirrors to turn loose, colorful beads into shifting geometric patterns.");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }          
        }
    }
    else if (w=="PHIOLOSOPHY")
    {
        System.out.println("HINT : The academic study of the fundamental nature of knowledge, reality, and existence—literally meaning the love of wisdom.");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if(w=="PROCRASTINATE")
    {
        System.out.println("HINT : The universal bad habit of delaying your chores or work until the absolute last minute because you just don't want to do them.");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if (w=="CLAUSTROPHOBIA")
    {
        System.out.println("HINT : The intense, panicky fear of being trapped in tight, cramped, or small enclosed spaces like elevators.");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if (w=="PSEUDOSCIENCE")
    {
        System.out.println("HINT : Practices like astrology or palm reading that claim to be scientific but lack actual evidence or real facts.");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if(w=="CARDIOLOGIST")
    {
        System.out.println("HINT : A specialized medical doctor you would visit if you needed your heart checked or treated.");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if (w=="AMERICANO")
    {
        System.out.println("HINT : A popular coffee order made by simply diluting a shot of strong espresso with hot water.");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if(w=="PIZZA")
    {
        System.out.println("HINT : Italian dish, round in shape with triangles formed in it");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if (w=="REVOLUTIONARY")
    {
        System.out.println("HINT : An adjective for a person, idea, or invention that completely overthrows the old way of doing things and changes history. ");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
    else if(w=="ARITHMETIC")
    {
        System.out.println("HINT : The most basic branch of math that deals with the fundamental mechanics of counting, adding, subtracting, multiplying, and dividing.");
        for (j=0;j<l;j++)
        {
            System.out.println("Enter your "+(j+1)+" letter");
            inp = sc.next().charAt(0);
            if (w.charAt(j) == inp)
                 {
                    System.out.println("Correct guess ^_^!");
                    System.out.println("Lives left: " + live);
                 }
            else
                 {
                    live = live - 1;
                    System.out.println("Wrong guess *_*!");
                    System.out.println("Lives left: " + live);
                 }
            if (live == 0)
                {
                   System.out.println("You have lost all your lives!");
                   System.out.println("The word was: " + w);
                   break;
                }
        }
    }
}
}
}