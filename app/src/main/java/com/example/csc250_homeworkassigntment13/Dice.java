package com.example.csc250_homeworkassigntment13;

import java.util.Random;

public class Dice
{
    private int numberOfSides;

    public Dice(int numberOfSides)
    {
        this.numberOfSides = numberOfSides;
    }

    public int roll()
    {
        Random r = new Random();
        return r.nextInt(this.numberOfSides)+1;
    }


}
