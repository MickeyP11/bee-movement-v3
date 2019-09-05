import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends Actor
{
    private int score = 0;
    public void act() 
    {move(5);
       
        int x = getX();
        int y = getY();
        if (x > 600 || y > 400 || y < 0){
            x = 0;
            y = Greenfoot.getRandomNumber(400);
            turn(Greenfoot.getRandomNumber(15)-10);
            setLocation(x,y);
    } 
    //check if we touch the cactus
    
    boolean contactCactus = isTouching(Cactus.class);
       if(contactCactus){
           Cactus plant =(Cactus) getOneIntersectingObject(Cactus.class);
           int plantScore = plant.getScore();
           score= plantScore +score;
           removeTouching(Cactus.class);
           
    
}
    boolean contactFlower=isTouching(Flower.class);
        if(contactFlower){
            Flower poison =(Flower) getOneIntersectingObject(Flower.class);
           int poisonScore = poison.getScore();
           score= score - poisonScore;
           removeTouching(Flower.class); 
}           
        if (score>=25){
            SpiderWin winScreen = new SpiderWin(); 
    Greenfoot.setWorld(winScreen);
}
//bee wins
if (score<=-25){
    BeeWin winScreen = new BeeWin(); 
    Greenfoot.setWorld(winScreen);
}

}
}