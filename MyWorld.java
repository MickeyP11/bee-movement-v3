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
        
        //flowers
        K k1 = new K();
        addObject(k1, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        K k2 = new K();
        addObject(k2, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        K k3 = new K();
        addObject(k3, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        K k4 = new K();
        addObject(k4, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        K k5 = new K();
        addObject(k5, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        K k6 = new K();
        addObject(k6, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
         K k7 = new K();
        addObject(k7, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        K k8 = new K();
        addObject(k8, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        
        YellowBalloon balloon1 = new YellowBalloon();
        addObject(balloon1, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        YellowBalloon balloon2 = new YellowBalloon();
        addObject(balloon2, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        YellowBalloon balloon3 = new YellowBalloon();
        addObject(balloon3, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        YellowBalloon balloon4 = new YellowBalloon();
        addObject(balloon4, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        
        YellowNana nana1 = new YellowNana();
        addObject(nana1, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        YellowNana nana2 = new YellowNana();
        addObject(nana2, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        YellowNana nana3 = new YellowNana();
        addObject(nana3, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        YellowNana nana4 = new YellowNana();
        addObject(nana4, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        YellowNana nana5 = new YellowNana();
        addObject(nana5, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        YellowNana nana6 = new YellowNana();
        addObject(nana6, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        YellowNana nana7 = new YellowNana();
        addObject(nana7, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        
        
        //spider
        Spider spider1 =new Spider();
        addObject(spider1, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        
        //cacti
        GreenApple ga1 =new GreenApple();
        addObject(ga1, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        GreenApple ga2 =new GreenApple();
        addObject(ga2, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        GreenApple ga3 =new GreenApple();
        addObject(ga3, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        GreenApple ga4 =new GreenApple();
        addObject(ga4, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        GreenApple ga5 =new GreenApple();
        addObject(ga5, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        GreenApple ga6 =new GreenApple();
        addObject(ga6, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        GreenApple ga7 =new GreenApple();
        addObject(ga7, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        GreenApple ga8 =new GreenApple();
        addObject(ga8, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        
        GreenBoy gb1 =new GreenBoy();
        addObject(ga1, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        GreenBoy gb2 =new GreenBoy();
        addObject(ga2, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        GreenBoy gb3 =new GreenBoy();
        addObject(ga3, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        GreenBoy gb4 =new GreenBoy();
        addObject(ga4, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        
        GreenGrass gg1 =new GreenGrass();
        addObject(gg1, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        GreenGrass gg2 =new GreenGrass();
        addObject(gg2, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        GreenGrass gg3 =new GreenGrass();
        addObject(gg3, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        GreenGrass gg4 =new GreenGrass();
        addObject(gg4, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        GreenGrass gg5 =new GreenGrass();
        addObject(gg5, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        GreenGrass gg6 =new GreenGrass();
        addObject(gg6, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
        GreenGrass gg7 =new GreenGrass();
        addObject(gg7, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
    }
    public void act() {
            if( numberOfObjects() == 2){
            Tie TieScreen = new Tie();
            Greenfoot.setWorld(TieScreen);
            }



        }
    }