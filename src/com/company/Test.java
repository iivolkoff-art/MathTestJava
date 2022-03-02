package com.company;
import java.util.Random;
import java.util.Scanner;


public class Test {
        private final int QuestionNumber = 10;
        private int Mark = 0;
        private int FirstNumber;
        private int SecondNumber;
        private int Result;
        private int StudResult;

        Teacher tch = new Teacher();
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();


        public Test()
        {
                tch.Info();
                Question();
                ResultOfTest();
        }


        public void Question()
        {
                tch.Start();
                for(int i = 0; i < QuestionNumber; i++)
                {
                        FirstNumber = rand.nextInt(10);
                        SecondNumber = rand.nextInt(10);
                        Result = FirstNumber * SecondNumber;
                        System.out.println("? = " + FirstNumber + " * " + SecondNumber);
                        StudResult = scan.nextInt();
                        if(StudResult == Result)
                        {
                                Mark++;
                        }
                }
                tch.Finish();
        }


        public void ResultOfTest()
        {
                if(Mark == 10)
                {
                        tch.Great();
                }
                if(Mark <10 && Mark >= 7)
                {
                        tch.Good();
                }
                if(Mark <7 && Mark >=5)
                {
                        tch.Normal();
                }
                if(Mark <5 && Mark >=2)
                {
                        tch.Bad();
                }
                if(Mark <2 && Mark >=0)
                {
                        tch.VeryBad();
                }
                System.out.println("Your result: " + Mark);
        }
}
