
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguel
 */
public class Food {
    
    public int row;
    public int col;
    
    public Food(Snake snake) {
        boolean colision = true;
        while (colision) {
            row = (int) (Math.random()*Board.NUM_ROWS);
            col = (int) (Math.random()*Board.NUM_COLS);
            colision = false;
            for (Node node : snake.getBody()) {
                if (node.row == row && node.col == col) {
                    colision = true;
                    break;
                }
            }
        }    
    }
    
    public void paint(Graphics g, int width, int height) {
        Util.drawSquare(g, row, col, Color.RED, width, height);
    }
    
}
