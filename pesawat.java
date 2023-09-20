import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesawat extends Actor
{
    public void act() {
        moveAndRotate();
    }

    private void moveAndRotate() {
        int speed = 10;
        move(speed);

        if (isAtEdge()) {
            // Jika mencapai ujung layar, putar secara acak antara -180 dan 180 derajat
            int randomRotation = Greenfoot.getRandomNumber(360) - 180;
            turn(randomRotation);
        }
    }
}