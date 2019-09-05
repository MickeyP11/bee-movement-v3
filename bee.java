
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee extends Actor
{
    private int score = 0;
    //if insect gets overwhelmed extra bit for later VVVVV
    //private int cactusEaten = 0;
    
    
    
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        //turn(Greenfoot.getRandomNumber(10)-5);
        int x = getX();
        int y = getY();
        if (x > 600 || y > 400 || y < 0){
            x = 0;
            y = Greenfoot.getRandomNumber(400);
            setLocation(x,y);
    }    
    //if(x ==Greenfoot.getRandomNumber(600) && y ==Greenfoot.getRandomNumber(400)){
        //turn(10);
    //}
    //Flower Time
    boolean contactFlower = isTouching(Flower.class);
    
    if(contactFlower){
        Flower plant = (Flower) getOneIntersectingObject(Flower.class);
        int plantScore = plant.getScore();
        score = plantScore + score;
        
        removeTouching(Flower.class);
        
    
}
//catus time    
boolean contactCactus = isTouching(Cactus.class);
        if(contactCactus){
           Cactus poison =(Cactus) getOneIntersectingObject(Cactus.class);
           int poisonScore = poison.getScore();
           score= score - poisonScore;
           removeTouching(Cactus.class);
}
//Check  if win
if(score>=17){
    BeeWin winScreen = new BeeWin(); 
    Greenfoot.setWorld(winScreen);
}
//spider win
if (score<=-17){
            SpiderWin winScreen = new SpiderWin(); 
    Greenfoot.setWorld(winScreen);
}
}
}