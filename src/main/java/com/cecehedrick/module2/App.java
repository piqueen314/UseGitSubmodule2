package com.cecehedrick.module2;

import com.cecehedrick.module2.utilities.StupidName;
import AGitSubmodule.submodule.superCoolPkg.Yolo;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        StupidName yo = new StupidName(2,3);
        int myInt= yo.StupidAdd();
        StupidName cool = new StupidName();
        int num = cool.StupidAdd();
        System.out.println(myInt + " "+ num);

        String msg = "I using a submodule";
        Yolo.cool(msg);

    }

}
