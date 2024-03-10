package krishna.CoreJava;

import java.util.Scanner;
public class Patterns
{
    //created by krishnaanupam56@gmail.com(author)
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args)
    {
        System.out.println("enter the maxsize");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*
        for n=5

         * * * * *
         * * * *
         * * *
         * *
         *

         */
        for(int i=0;i<n;i++)
        {
            for (int j=n;j>i;j--)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.print(ANSI_RED+"* ");
            }
            System.out.println();
        }

        System.out.println();
        /*
        for n=5

         *
         * *
         * * *
         * * * *
         * * * * *

         */
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.print(ANSI_RED+"* ");
            }
            System.out.println();
        }

        System.out.println();
        /*
        for n=5

         * * * * *
         * * * *
         * * *
         * *
         *

         */
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (i>j)
                {
                    System.out.print("  ");
                }
                else
                {
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.print(ANSI_RED+"* ");
                }
            }
            System.out.println();
        }

        System.out.println();

/*
for n=5

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/
        int x=1;
        for (int i = 0; i <n; i++)
        {
            for (int j = 0; j <=i; j++)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.print(ANSI_RED+x+" ");
                x++;
            }
            System.out.println();
        }

        System.out.println();

/*
for n=5

1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

*/

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <=i; j++)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.print(ANSI_RED+j+" ");
            }
            for (int k = i-1; k >0; k--)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.print(ANSI_RED+k+" ");
            }
            System.out.println();
        }
        System.out.println();

/*
for n=5

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
4 3 2 1
3 2 1
2 1
1

 */


        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <=i; j++)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.print(ANSI_RED+j+" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++)
        {
            for (int j = n-i; j >0; j--)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.print(ANSI_RED+j+" ");
            }
            System.out.println();
        }
        System.out.println();

/*
for n=5

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */

        for (int i = 1; i <=n; i++)
        {
            for (int j =1; j<=n-i+1 ; j++)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.print(ANSI_RED+j+" ");
            }
            System.out.println();
        }
        for (int i = 1; i <n; i++)
        {
            for (int j =1; j <=i+1 ; j++)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.print(ANSI_RED+j+" ");
            }
            System.out.println();
        }

        System.out.println();

/*
for n=5

       1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

 */

        for (int i = 1; i <=n; i++)
        {
            for (int j = 1; j<=n-i ; j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k<=i ; k++)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.print(ANSI_RED+k+" ");
            }
            for (int p=i-1; p>=1 ; p--)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.print(ANSI_RED+p+" ");
            }
            System.out.println();
        }

        System.out.println();

        /*
        for n=5

         *                 *
         * *             * *
         * * *         * * *
         * * * *     * * * *
         * * * * * * * * * *
         */

        for (int i =1;i<=n;i++)
        {
            for (int j=1;j<=n ; j++)
            {
                if (i>=j)
                {
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.print(ANSI_RED+"* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            for (int j = n; j>0; j--)
            {
                if(j<=i)
                {
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.print(ANSI_RED+"* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();


        /*
        for n = 7
         *
         * * *
         * * * * *
         * * * * * * *
         * * * * * * * * *
         * * * * * * * * * * *
         * * * * * * * * * * * * *

         */
        for (int i = 0; i < n; i++)
        {
            for (int j =n; j >0; j--)
            {
                if (j<=i)
                {
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.print(ANSI_RED+"* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            for (int j = i+1; j>0 ; j--)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.print(ANSI_RED+"* ");
            }
            System.out.println();
        }

        System.out.println();

        /*
          for n=7
                     *
                   * * *
                 * * * * *
               * * * * * * *
             * * * * * * * * *
           * * * * * * * * * * *
         * * * * * * * * * * * * *
           * * * * * * * * * * *
             * * * * * * * * *
               * * * * * * *
                 * * * * *
                   * * *
                     *
         */
        for (int i = 0; i < n+1; i++)
        {
            for (int j = n; j >0 ; j--)
            {
                if(j<=i)
                {
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.print(ANSI_RED+"* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j < i; j++)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.print(ANSI_RED+"* ");
            }
            System.out.println();
        }
        for (int i = n; i >0; i--)
        {
            for (int j = n ;j>0 ; j--)
            {
                if (i>j)
                {
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.print(ANSI_RED+"* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            for (int j = 2; j<n ; j++)
            {
                if (i-j>0)
                {
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.print(ANSI_RED+"* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        /*
        Christmas tree (value of n should be higher than 7 for better look of the tree otherwise it will like a christmus tree
        for n=9
                       *
                     * * *
                   * * * * *
                 * * * * * * *
                     * * *
                   * * * * *
                 * * * * * * *
               * * * * * * * * *
                   * * * * *
                 * * * * * * *
               * * * * * * * * *
             * * * * * * * * * * *
                 * * * * * * *
               * * * * * * * * *
             * * * * * * * * * * *
           * * * * * * * * * * * * *
               * * * * * * * * *
             * * * * * * * * * * *
           * * * * * * * * * * * * *
         * * * * * * * * * * * * * * *
                       *
                       *
                       *
                       *

         */

        int p=n;
        int m=1;
        for(p=p;p>4;p--)
        {
            for(int i=1;i<=4;i++)
            {
                for(int j=p-i;j>0;j--)
                {
                    System.out.print("  ");
                }
                for(int k=m;k<=(2*i)-1;k++)
                {
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.print(ANSI_RED+"* ");
                }

                System.out.println("  ");
            }
            m=m-2;
        }
        for(int l=1;l<=4;l++)
        {
            for(int j=n-1;j>0;j--)
            {
                System.out.print("  ");
            }
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(ANSI_RED+"* ");
        }

        System.out.println();

        /*
        for n=4
               * * * * *               * * * * *
             * * * * * * *           * * * * * * *
           * * * * * * * * *       * * * * * * * * *
         * * * * * * * * * * *   * * * * * * * * * * *
       * * * * * * * * * * * * * * * * * * * * * * * * *
         * * * * * * * * * * * * * * * * * * * * * * *
           * * * * * * * * * * * * * * * * * * * * *
             * * * * * * * * * * * * * * * * * * *
               * * * * * * * * * * * * * * * * *
                 * * * * * * * * * * * * * * *
                   * * * * * * * * * * * * *
                     * * * * * * * * * * *
                       * * * * * * * * *
                         * * * * * * *
                           * * * * *
                             * * *
                               *
         */
//if the value of n is less than 5 then pattern will look good
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                System.out.print("  ");
            }
            for (int j = 0; j < 5 + 2 * i; j++)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.print(ANSI_RED+"* ");
            }
            for (int j = 2*i; j <2*n-1 ; j++)
            {
                System.out.print("  ");
            }
            for (int j = 0; j < 5 + (2 * i); j++)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.print(ANSI_RED+"* ");
            }
            System.out.println();
        }
        for (int i = 0; i<5+(2*n); i++)
        {
            for (int j = 0; j <i ; j++)
            {
                System.out.print("  ");
            }
            for (int j =4*n+9; j >2*i ; j--)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.print(ANSI_RED+"* ");
            }
            System.out.println();
        }

        System.out.println();
        
       /* 
        Vertical hollow Pyramid
        for large value of n (more than 10) the pattern will look good
        
          for n=13
          |*
          |  *
          |    *
          |  *
          |*
          |  *
          |    *
          |  *
          |*
          |  *
          |    *
          |  *
          |*
        
        */
        int k=0;
        for (int i = 1; i <=n ; i++)
        {
            System.out.print("|");
            if (i%4==0)
            {
                k++;
                System.out.print("  ");
            }
            int q = i - 4 * k;
            for (int j = 1; j < q ; j++)
            {
                System.out.print("  ");
            }
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(ANSI_RED+"*");
        }
        sc.close();
    }
}
