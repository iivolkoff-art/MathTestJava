package com.company;

public class Teacher {
    public void Info()
    {
        System.out.println("Hello students, now we will conduct " +
                "a test on the knowledge of the multiplication table." + '\n' + "The test will consist of 10 questions," +
                " and for each correct answer, you will receive 1 point.");
    }

    public void Start()
    {
        System.out.println("Ok, The test has started, good luck");
    }

    public void Finish()
    {
        System.out.println("Ok, the test is over, let's see what you have here");
    }

    public void Great()
    {
        System.out.println("Congratulations, you passed the test perfectly!");
    }
    public void Good()
    {

        System.out.println("Well done, you wrote the test well.");
    }
    public void Normal()
    {

        System.out.println("You wrote the test well, but prepare better next time.");
    }
    public void Bad()
    {
        System.out.println("I checked your test and I don't like your result, better prepare next time.");
    }
    public void VeryBad()
    {

        System.out.println("The test results upset me, you did not prepare for it at all.");
    }
}
