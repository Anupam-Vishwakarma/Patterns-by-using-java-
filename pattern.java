import java.util.Scanner;
public class pattern
{
    //created by krishnaanupam56@gmail.com(author)
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {
        System.out.println("enter the maxsize");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
/*
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
                 System.out.print(ANSI_RED+"* ");
             }
             System.out.println();
         }
        
        System.out.println();
/*
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
                 System.out.print(ANSI_RED+"* ");
             }
             System.out.println();
         }
        
        System.out.println();
/*
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
                     System.out.print(ANSI_RED+"* ");
                 }
             }
             System.out.println();
         }
        
        System.out.println();
        
/*
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
                 System.out.print(ANSI_RED+x+" ");
                 x++;
             }
             System.out.println();
         }
        
         System.out.println();

/*
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
                System.out.print(ANSI_RED+j+" ");
            }
            for (int k = i-1; k >0; k--)
            {
                System.out.print(ANSI_RED+k+" ");
            }
            System.out.println();
        }
            System.out.println();

/*
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
                System.out.print(ANSI_RED+j+" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) 
        {
            for (int j = n-i; j >0; j--) 
            {
                System.out.print(ANSI_RED+j+" ");
            }
            System.out.println();
        }
                System.out.println();

/*
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
                System.out.print(ANSI_RED+j+" ");
            }
            System.out.println();
        }
        for (int i = 1; i <n; i++) 
        {
            for (int j =1; j <=i+1 ; j++) 
            {
                System.out.print(ANSI_RED+j+" ");
            }
            System.out.println();
        }
             
        System.out.println();

/*
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
                System.out.print(ANSI_RED+k+" ");
            }
            for (int p=i-1; p>=1 ; p--)
            {
                System.out.print(ANSI_RED+p+" ");
            }
            System.out.println();
        }
            
        System.out.println();

/*
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
                    System.out.print(ANSI_RED+"* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            for (int j = i+1; j>0 ; j--)
            {
                System.out.print(ANSI_RED+"* ");
            }
            System.out.println();
        }
              
        System.out.println();

        /*

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
                    System.out.print(ANSI_RED+"* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            for (int j = 1; j < i; j++) 
            {
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
        christmus tree (value of n should be higher than 7 for better look of the tree otherwise it will like a christmus tree

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
        for(n=n;n>4;n--)
        {
            for(int i=1;i<=4;i++)
            {
                for(int j=n-i;j>0;j--)
                {
                    System.out.print("  ");
                }
                for(int k=m;k<=(2*i)-1;k++)
                {
                    System.out.print(ANSI_RED+"* ");
                }

                System.out.println("  ");
            }
            m=m-2;
        }
        for(int l=1;l<=4;l++)
        {
            for(int j=p-1;j>0;j--)
            {
                System.out.print("  ");
            }
            System.out.println(ANSI_RED+"* ");
        }
        
        System.out.println();
        
               /*
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
         for (int i = 0; i < n; i++)
         {
            for (int j = i; j < n; j++)
            {
                System.out.print("  ");
            }
            for (int j = 0; j < 5 + 2 * i; j++)
            {
                System.out.print(ANSI_RED+"* ");
            }
            for (int j = 2*i; j <2*n-1 ; j++)
            {
                System.out.print("  ");
            }
            for (int j = 0; j < 5 + (2 * i); j++)
            {
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
                System.out.print(ANSI_RED+"* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
