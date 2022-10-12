package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    static class  Exercises{

        public static  void Exercises1(){
            System.out.println("Hello");
            System.out.println("Kerry");
        }

        public  static  void Exercises2(){
            Scanner sc = new Scanner(System.in);


            System.out.println("Enter your a year: ");
           int inputYear = sc.nextInt();
            if(inputYear % 400 == 0){
                System.out.println("Its leap year");
            }else {
                System.out.println("it´s not leap year");
            }
        }

        public  static  void Exercises3(){
            int a=3, b=9;
            System.out.printf("%d + %d = %d \n",a,b, (a+b));
            System.out.printf("%d - %d = %d \n",a,b, a-b);
            System.out.printf("%d * %d = %d \n",a,b, a*b);
            System.out.printf("%d / %d = %d \n",a,b, a/b);
        }
        public  static  void Exercises4(){
            int a=2, b=3, c=22;
            System.out.printf("(%d + %d + %d)/3 = %d", a,b,c,(a+b+c)/3);
        }
        public  static  void Exercises5(){
            String name;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
             name = sc.nextLine();
            System.out.printf("Hello %s",name);
        }

        public  static  void Exercises6(){
            int a,b;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter two number");
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.printf("%d + %d = %d \n",a,b, (a+b));
            System.out.printf("%d - %d = %d \n",a,b, a-b);
            System.out.printf("%d * %d = %d \n",a,b, a*b);
            System.out.printf("%d / %d = %d \n",a,b, a/b);


        }

        public  static void  Exercises7(){
                int sec = 86399;
                int hours = (int) sec / 3600;
                int remainder = (int) sec - hours*3600;
                int mins = remainder / 60;
                remainder = remainder - mins * 60;
                int secs = remainder;
            System.out.println(hours+":"+mins+":"+secs);
        }

        public  static void  Exercises8(){
          Random rand = new Random();
          int rand_number = rand.nextInt(500);

          Scanner sc = new Scanner(System.in);

           int guess;




         while (true){

            try{
                System.out.println("Guess the random number:");
                 guess =  sc.nextInt();

                if(guess == rand_number){
                    System.out.println("Guess right");
                    break;
                } else if (guess > rand_number) {
                    System.out.println("Your guess was to big");

                }else if(guess < rand_number){
                    System.out.println("Your guess was to small");
                }

            }catch (InputMismatchException exception){
                System.out.println("Not any number please try enter any number");
                Exercises8();
            }
         }



        }
    }

    public static void main( String[] args )
    {

        //call any static mehthods of class Exierixce. .....
        //example method
        Exercises.Exercises8();

    }
}
