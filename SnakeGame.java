package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame{

    SnakeGame(){
        
        // setLocation(700, 300); [ Use for set snakeGame window size without center
        
        super("Snake Game 2025");   //window Frame Heading also super must be the 1st statement of constructor
        add(new Board());       //For constructor call
        pack();            //use for Frame changes reflaction
   
        setLocationRelativeTo(null);     // Set window in center 
        setResizable(false);
        
    }
    
    public static void main(String[] args) {
       new SnakeGame().setVisible(true);
    }
    
}
