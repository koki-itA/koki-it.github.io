
import java.io.*;

public class Rei03_k
{
   public static void main (String args[]) throws IOException
   {
      //キーボードから入力し、BufferedReader abc　に入れる

  BufferedReader abc = new BufferedReader (new InputStreamReader (System.in));

           String  su,  su_1, su_2, su_3, su_4, su_5, su_6, su_7, su_8;
   
           int     age,  point1,  sex,  point2, tbc,  point3 , dbt, point5 , bp_1, bp_2, kyf, point6  ;// 整数の属性は int です。
       
           double    taizyu , sintyou, point4, goukei;
           
           goukei = 0 ;


        
	System.out.println("年齢を入力してください");
        System.out.println("年齢(歳)                  点数    ");
        System.out.println("40～44                      0  ");
        System.out.println("45～50                      5  ");
	System.out.println("50～54                      6  ");
        System.out.println("55～59                      12 ");
        System.out.println("60～64                      16 ");
        System.out.println("65～69                      19 ");
        su = abc.readLine() ; //キーボードから文字列の番号を受け取り、suに入れる。
        age = Integer.parseInt(su);
        System.out.println("あなたの年齢は" +  age  + "なので");
        point1 = check_age(age);
        System.out.println("ポイントは" +  point1 + "です") ;
     






        System.out.println("");   
        System.out.println("");
        System.out.println("");
        System.out.println("性別を入力してください");
	System.out.println(" 性別                   点数 ");
        System.out.println(" 1.男性                   6 ");
        System.out.println(" 2.女性                   0 ");
        su_1 = abc.readLine() ; //キーボードから文字列の番号を受け取り、su_1に入れる。
        sex = Integer.parseInt(su_1);
        System.out.println("あなたが押した番号は" +  sex  + "なので");
        point2 = check_sex(sex);
        System.out.println("ポイントは" +  point2 + "です") ;








        System.out.println("");   
        System.out.println("");
        System.out.println("");
        System.out.println("たばこを吸っていますか？");
	System.out.println(" 吸っている場合             点数 ");
        System.out.println(" 1.男性                      4 ");
        System.out.println(" 2.女性                      8 ");
        System.out.println(" 吸っていない場合              ");
        System.out.println(" 3.男性                      0 ");
	System.out.println(" 4.女性                      0 ");
        su_2 = abc.readLine() ; //キーボードから文字列の番号を受け取り、su_2に入れる。
        tbc = Integer.parseInt(su_2);
        System.out.println("あなたが押した番号は" +  tbc  + "なので");
        point3 = check_tbc(tbc);
        System.out.println("ポイントは" +  point3 + "です") ;





        System.out.println("");   
        System.out.println("");
        System.out.println("");
        System.out.println("次にBMIを測定します") ;
        System.out.println("");   
        System.out.println("");
        System.out.println("");

      for ( ; ; )
      {
         System.out.println("身長を入力してください") ;
         su_3 = abc.readLine() ;
         sintyou = Double.parseDouble(su_3) ; //整数omosa←su_3 文字列
         
 
         if ( sintyou >= 0 ) break ;
           else
              {
               System.out.println("入力エラーです、再入力してください") ;
               }
     }//for

        System.out.println("");   
        System.out.println("");
       

       for ( ; ; )
       {
         System.out.println("体重を入力してください") ;
         su_4 = abc.readLine() ;
         taizyu = Double.parseDouble(su_4) ; //整数omosa←su_4 文字列
         

           if ( taizyu >= 0 ) break ;
           else
              {
               System.out.println("入力エラーです、再入力してください") ;
               }
            }//for
     
        System.out.println("");   
        System.out.println("肥満度(BMI)             点数 ");
	System.out.println(" 25以下                  0   ");
        System.out.println(" 25～30                  2   ");
        System.out.println(" 30以上                  3   ");
        System.out.println(" BMI = 体重(kg) ÷ 身長(m) ÷　身長(m)");
        point4 = check_bmi(sintyou , taizyu);
        System.out.println("ポイントは" +  point4 + "です") ;


           



  
        System.out.println("");   
        System.out.println("");
        System.out.println("");
        System.out.println("糖尿病を患っていますか？");
        System.out.println("糖尿病             点数 ");
	System.out.println(" 1.はい             7 ");
	System.out.println(" 2.いいえ           0 ");
        su_5 = abc.readLine() ; //キーボードから文字列の番号を受け取り、su_5に入れる。
        dbt = Integer.parseInt(su_5);
        System.out.println("あなたが押した番号は" +  dbt  + "なので");
        point5 = check_dbt(dbt);
        System.out.println("ポイントは" +  point5 + "です") ;



    

  
        System.out.println("");   
        System.out.println("");
        System.out.println("");
        System.out.println("血圧の数値を入力してください");
        System.out.println("");
        System.out.println("                     血圧                         点数   ");
        System.out.println("              120未満/80未満                       0     ");
	System.out.println("              120～129/80～84                      3     ");
	System.out.println(" 降圧薬内服   130～139/85～89                      6     ");
        System.out.println(" なしの場合   140～159/90～99                      8     ");   
        System.out.println("              160～179/100～109                    11    ");
        System.out.println("              180以上/110以上                      13    ");
        System.out.println("");
        System.out.println(""); 
        System.out.println("              120未満/80未満                       10    ");
	System.out.println("              120～129/80～84                      10    ");
	System.out.println(" 降圧薬内服   130～139/85～89                      10    ");
        System.out.println(" ありの場合   140～159/90～99                      11    ");   
        System.out.println("              160～179/100～109                    11    ");
        System.out.println("              180以上/110以上                      15    ");
        System.out.println("");   
        System.out.println("");
        System.out.println("");
        System.out.println("降圧薬内服を使っていますか？");
        System.out.println("1.はい(ありの場合)");
        System.out.println("2.いいえ(なしの場合)");
        su_6 = abc.readLine() ; //キーボードから文字列の番号を受け取り、su_6に入れる。
        kyf = Integer.parseInt(su_6);
        System.out.println("");
        System.out.println("次に上の血圧を入力してください");
        su_7 = abc.readLine() ; //キーボードから文字列の番号を受け取り、su_7に入れる。
        bp_1 = Integer.parseInt(su_7);
        System.out.println("");
        System.out.println("次に下の血圧を入力してください");
        su_8 = abc.readLine() ; //キーボードから文字列の番号を受け取り、su_8に入れる。
        bp_2 = Integer.parseInt(su_8);
        System.out.println("");
        System.out.println("あなたが押した上下の血圧は" +  bp_1 +  "と" + bp_2 + "なので");
        point6 = check_bp(kyf,bp_1,bp_2);
        System.out.println("ポイントは" +  point6 + "です") ;




       System.out.println("");   
       System.out.println("");
       System.out.println("");
       goukei= goukei+ point1 + point2 + point3+ point4 + point5 + point6 ;
       System.out.println("あなたのポイントの合計は" +  goukei + "です") ;
       System.out.println("");   
       System.out.println("");
       System.out.println("");



       
       System.out.println("  合計点数        発症確率          血管年齢(歳)         ");   
       System.out.println("                                   男性        女性      ");
       System.out.println("  10点以下        1％未満           42          47       ");
       System.out.println("  11～17点        1～2％未満        53          60       ");   
       System.out.println("  18～22点        2～3％未満        59          67       ");
       System.out.println("  23～25点        3～4％未満        64          72       ");
       System.out.println("  26～27点        4～5％未満        67          76       ");   
       System.out.println("  28～29点        5～％未満         70          80       ");
       System.out.println("   30点           6～7％未満        73          83       ");
       System.out.println("  31,32点以下     7～8％未満        75          85       ");
       System.out.println("   33点           8～9％未満        77         90以上    ");   
       System.out.println("   34点           9～10％未満       79         90以上    ");
       System.out.println("  35～36点        10～12％未満      82         90以上    ");
       System.out.println("  37～39点        12～15％未満      85         90以上    ");   
       System.out.println("  40～42点        15～20％未満     90以上      90以上    ");
       System.out.println("   43点           20％未満         90以上      90以上    ");



       System.out.println("");   
       System.out.println("");
       System.out.println("");
       System.out.println("結果はどうだったでしょうか？");   
       System.out.println("よくなかったという場合は日々の生活習慣を見直しましょう");
       System.out.println("また、そんなに悪くなかったからといって、油断は禁物です");
       System.out.println("バランスのとれた三食を摂り、適度な運動を心がけましょう");   
       System.out.println("とはいえ結果がよかったのであればなによりです");
       System.out.println("それが続くように頑張りましょう");







 }//main

/*********************************************************************************************/

        public static int check_age ( int age ) throws IOException
        {

        int point1, tensu ;

         tensu = 0 ;

        if ( age <=44 )
           {    
             tensu = 0 ;
           } 
          else if ( age <=49 )
              {
                 tensu = 5 ;
              } 
          else if ( age <=54 )
              {
                 tensu = 6 ;
              }
          else if ( age <=59 )
              {
                 tensu = 12 ;
              }
          else if ( age <=64 )
              {
                 tensu = 16 ;
              }
          else  
              {
                 tensu = 19 ;
              }

        point1 = tensu ;

       return point1 ;

       }

/**********************************************************************************************************/


 public static int check_sex ( int sex ) throws IOException
        {

        int point2, tensu2 ;

        tensu2 = 0 ;


        switch  ( sex )
          {
            case 1 :
                    tensu2 = 6 ;
                    break ;
         
            case 2 :
                    tensu2 = 0 ;
                    break ;
           

          }//switch




             point2 = tensu2 ;

             return point2 ;

       }

/**********************************************************************************************************/



   public static int check_tbc ( int tbc ) throws IOException
        {

        int point3, tensu3 ;

        tensu3 = 0 ;

        switch  ( tbc )
          {
            case 1 :
                    tensu3 = 4 ;
                    break ;
         
            case 2 :
                    tensu3 = 8 ;
                    break ;
            case 3 :
                    tensu3 = 0 ;
                    break ;
            case 4 :
                    tensu3 = 0 ;
                    break ;
         


          }//switch


             point3 = tensu3 ;

             return point3 ;

       }

/*************************************************************************************************/



  public static double check_bmi ( double sintyou, double taizyu ) throws IOException
        {

        double  bmi, point4, tensu4 ;

        tensu4 = 0 ;

       
  bmi = taizyu / (sintyou*0.01 * sintyou*0.01) ;

           
             if ( bmi <=25 )
                {
                tensu4 = 0 ;
                }
             else if ( bmi <= 30 )
                   {
                   tensu4 = 2 ;
                   }
             else  
                   {
                     tensu4 = 3 ;
                   }
            
             point4 = tensu4 ;

             return point4 ;

     }

/**********************************************************************************************/



 public static int check_dbt ( int dbt ) throws IOException
        {

        int point5, tensu5 ;

        tensu5 = 0 ;

        switch  ( dbt )
          {
            case 1 :
                    tensu5 = 7 ;
                    break ;
         
            case 2 :
                    tensu5 = 0 ;
                    break ;
         
          }//switch


             point5 = tensu5 ;

             return point5 ;

       }

/*****************************************************************************************************/



    public static int check_bp ( int kyf , int bp_1, int bp_2 ) throws IOException
        {

        int point6, tensu6 ;

        tensu6 = 0 ;



        if (kyf == 2 &&  bp_1 <= 120 &&  bp_2 <= 80  )
        {
         tensu6 = 0;
        }
        else if (kyf == 2 && bp_1 <= 120  && bp_2 >= 81 && bp_2 <= 84  )
        {
         tensu6 = 3;
        }
        else if (kyf == 2 && bp_1 <= 120  && bp_2 >= 85 && bp_2 <= 89  )
        {
         tensu6 = 6;
        }      
        else if (kyf == 2 && bp_1 <= 120  && bp_2 >= 90 && bp_2 <= 99  )
        {
         tensu6 = 8;
        }
        else if (kyf == 2 && bp_1 <= 120  && bp_2 >= 100 && bp_2 <= 109  )
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 <= 120 &&  bp_2 >= 110  )
        {
         tensu6 = 13;
        }
   else if (kyf == 2 && bp_1 >= 121  &&   bp_1 <= 129  && bp_2 <= 80  )
        {
         tensu6 = 3;
        }
        else if (kyf == 2 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 81 && bp_2 <= 84  ) 
        {
         tensu6 = 3;
        }
        else if (kyf == 2 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 85 && bp_2 <= 89  ) 
        {
         tensu6 = 6;
        }
        else if (kyf == 2 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 90 && bp_2 <= 99  ) 
        {
         tensu6 = 8;
        }
        else if (kyf == 2 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 100 && bp_2 <= 109  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 110  ) 
        {
         tensu6 = 13;
        }
    else if (kyf == 2 && bp_1 >= 130  &&   bp_1 <= 139  && bp_2 <= 80  )
        {
         tensu6 = 6;
        }
        else if (kyf == 2 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 81 && bp_2 <= 84  ) 
        {
         tensu6 = 6;
        }
        else if (kyf == 2 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 85 && bp_2 <= 89  ) 
        {
         tensu6 = 6;
        }
        else if (kyf == 2 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 90 && bp_2 <= 99  ) 
        {
         tensu6 = 8;
        }
        else if (kyf == 2 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 100 && bp_2 <= 109  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 110  ) 
        {
         tensu6 = 13;
        }
    else if (kyf == 2 && bp_1 >= 140  &&   bp_1 <= 159  && bp_2 <= 80  )
        {
         tensu6 = 8;
        }
        else if (kyf == 2 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 81 && bp_2 <= 84  ) 
        {
         tensu6 = 8;
        }
        else if (kyf == 2 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 85 && bp_2 <= 89  ) 
        {
         tensu6 = 8;
        }
        else if (kyf == 2 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 90 && bp_2 <= 99  ) 
        {
         tensu6 = 8;
        }
        else if (kyf == 2 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 100 && bp_2 <= 109  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 110  ) 
        {
         tensu6 = 13;
        }
  else if (kyf == 2 && bp_1 >= 160  &&   bp_1 <= 179  && bp_2 <= 80  )
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 81 && bp_2 <= 84  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 85 && bp_2 <= 89  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 90 && bp_2 <= 99  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 100 && bp_2 <= 109  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 110  ) 
        {
         tensu6 = 13;
        }
   else if (kyf == 2 && bp_1 >= 180 &&  bp_2 <= 80  )
        {
         tensu6 = 13;
        }
        else if (kyf == 2 && bp_1 >= 180  && bp_2 >= 81 && bp_2 <= 84  )
        {
         tensu6 = 13;
        }
        else if (kyf == 2 && bp_1 >= 180  && bp_2 >= 85 && bp_2 <= 89  )
        {
         tensu6 = 13;
        }      
        else if (kyf == 2 && bp_1 >= 180  && bp_2 >= 90 && bp_2 <= 99  )
        {
         tensu6 = 13;
        }
        else if (kyf == 2 && bp_1 >= 180  && bp_2 >= 100 && bp_2 <= 109  )
        {
         tensu6 = 13;
        }
        else if (kyf == 2 && bp_1 >= 180 &&  bp_2 >= 110  )
        {
         tensu6 = 13;
        }
    else if (kyf == 1 &&  bp_1 <= 120 &&  bp_2 <= 80  )
        {
         tensu6 = 10;
        }
        else if (kyf == 1 && bp_1 <= 120  && bp_2 >= 81 && bp_2 <= 84  )
        {
         tensu6 = 10;
        }
        else if (kyf == 1 && bp_1 <= 120  && bp_2 >= 85 && bp_2 <= 89  )
        {
         tensu6 = 10;
        }      
        else if (kyf == 1 && bp_1 <= 120  && bp_2 >= 90 && bp_2 <= 99  )
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 <= 120  && bp_2 >= 100 && bp_2 <= 109  )
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 <= 120 &&  bp_2 >= 110  )
        {
         tensu6 = 15;
        }
   else if (kyf == 1 && bp_1 >= 121  &&   bp_1 <= 129  && bp_2 <= 80  )
        {
         tensu6 = 10;
        }
        else if (kyf == 1 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 81 && bp_2 <= 84  ) 
        {
         tensu6 = 10;
        }
        else if (kyf == 1 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 85 && bp_2 <= 89  ) 
        {
         tensu6 = 10;
        }
        else if (kyf == 1 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 90 && bp_2 <= 99  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 100 && bp_2 <= 109  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 110  ) 
        {
         tensu6 = 15;
        }
    else if (kyf == 1 && bp_1 >= 130  &&   bp_1 <= 139  && bp_2 <= 80  )
        {
         tensu6 = 10;
        }
        else if (kyf == 1 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 81 && bp_2 <= 84  ) 
        {
         tensu6 = 10;
        }
        else if (kyf == 1 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 85 && bp_2 <= 89  ) 
        {
         tensu6 = 10;
        }
        else if (kyf == 1 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 90 && bp_2 <= 99  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 100 && bp_2 <= 109  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 110  ) 
        {
         tensu6 = 15;
        }
    else if (kyf == 1 && bp_1 >= 140  &&   bp_1 <= 159  && bp_2 <= 80  )
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 81 && bp_2 <= 84  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 85 && bp_2 <= 89  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 90 && bp_2 <= 99  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 100 && bp_2 <= 109  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 110  ) 
        {
         tensu6 = 15;
        }
  else if (kyf == 1 && bp_1 >= 160  &&   bp_1 <= 179  && bp_2 <= 80  )
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 81 && bp_2 <= 84  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 85 && bp_2 <= 89  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 90 && bp_2 <= 99  ) 
        {
         tensu6 = 1;
        }
        else if (kyf == 1 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 100 && bp_2 <= 109  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 110  ) 
        {
         tensu6 = 15;
        }
   else if (kyf == 1 && bp_1 >= 180 &&  bp_2 <= 80  )
        {
         tensu6 = 15;
        }
        else if (kyf == 1 && bp_1 >= 180  && bp_2 >= 81 && bp_2 <= 84  )
        {
         tensu6 = 15;
        }
        else if (kyf == 1 && bp_1 >= 180  && bp_2 >= 85 && bp_2 <= 89  )
        {
         tensu6 = 15;
        }      
        else if (kyf == 1 && bp_1 >= 180  && bp_2 >= 90 && bp_2 <= 99  )
        {
         tensu6 = 15;
        }
        else if (kyf == 1 && bp_1 >= 180  && bp_2 >= 100 && bp_2 <= 109  )
        {
         tensu6 = 15;
        }
        else if (kyf == 1 && bp_1 >= 180 &&  bp_2 >= 110  )
        {
         tensu6 = 15;
        }

        
         
             point6 = tensu6 ;

             return point6 ;
       





/*******************************************************************************************/






}//main
 

}//class
