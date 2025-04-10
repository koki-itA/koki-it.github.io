/********
*
* 
*
*/

import java.io.*;

public class Rei16
{
   public static void main (String args[]) throws IOException
   {
      //キーボードから入力し、BufferedReader abc　に入れる

  BufferedReader abc = new BufferedReader (new InputStreamReader (System.in));

       String su ;
       int omosa , ryokin ;

        ryokin = 0 ;   //  料金を初期化させる

        /*****
         *郵便料金の計算
         ******/

  for ( ; ; )
   {
      for ( ; ; )
      {
         System.out.println("重さを入力してください") ;
         su = abc.readLine() ;
         omosa = Integer.parseInt(su) ; //整数omosa←su 文字列
           if ( omosa >= 0 ) break ;
           else
              {
               System.out.println("入力エラーです、再入力してください") ;
               }
      }//for

         if ( omosa ==0 )  
           {
                 System.out.println("重さは" + omosa + "gで、終了") ;
                 break ;
           }


             if ( omosa <=25 )
                {
                ryokin = 80 ;
                }
             else if ( omosa <= 50 )
                   {
                    ryokin = 90 ;
                   }
            else
              {
                System.out.println("重さは" + omosa + "gで、規格外です") ;
              }
         if ( omosa == 0 ) 
            {
               System.out.println("重さは" + omosa + "gで、料金は0円です") ;
            }
         else if ( omosa <= 50 )
        {
         System.out.println("重さは" + omosa + "gで、料金は" + ryokin + "円です") ;
        }
}//for
 }//main

}//class
