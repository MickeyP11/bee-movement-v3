//Mikayla P

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        //bees
        bee bee1 = new bee();
        addObject(bee1, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        bee bee2 = new bee();
        addObject(bee2, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        //flowers
        K k1 = new K();
        addObject(k1, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        
       
        YellowBalloon balloon1 = new YellowBalloon();
        addObject(balloon1, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        
        YellowNana nana1 = new YellowNana();
        addObject(nana1, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        
        //spider
        Spider spider1 =new Spider();
        addObject(spider1, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        
        //cacti
        
    }
}
