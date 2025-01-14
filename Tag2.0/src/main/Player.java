package main;

import java.awt.*;
import java.util.ArrayList;

public class Player {
    private int x;
    private int y;
    private Color col;
    //[up, right, down, left]
    int[] keys;
    private int speed;
   
    private boolean isImmobilized;

    public Player (int ix, int iy, int ispeed, int[] ikeys, Color icolor) {
        x=ix;
        y=iy;
        col=icolor;
        keys=ikeys;
        speed=ispeed;
        
        isImmobilized=false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return col;
    }

    public void setKeys(int[] input){
        keys=input;
    }

    public void setX(int ix){ x = ix;}

    public void setY(int iy){ y = iy;}

    public void setColor(Color icol){ col=icol;}
    
    public void setSpeed(int ispeed)
    {
    	speed=ispeed;
    }

    public boolean hasKey(int key){
       
            for(int i=0;i<keys.length;i++){
                if(key==keys[i]) return true;
            }
        
        return false;
    }

    public void doKey(int key){
        if(!isImmobilized){  
            if(key==keys[0]) y-=speed;
            if(key==keys[1]) x+=speed;
            if(key==keys[2]) y+=speed;
            if(key==keys[3]) x-=speed;
        }
                
            
        
    }

    public String toString(){
        return (String)(x+" "+y+" "+col.toString());
    }

    public void immobilize(boolean move){
        isImmobilized=move;
    }

}