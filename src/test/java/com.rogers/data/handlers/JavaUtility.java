package com.rogers.data.handlers;

import com.rogers.test.base.BaseTest;

import java.util.Random;

public class JavaUtility  {

    int Ran=0;
    public int generateRandomNumber(int num){
        Random rand = new Random();
        Ran=rand.nextInt(num);
        return Ran;

    }

}
