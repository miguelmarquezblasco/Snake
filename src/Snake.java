
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author miguel
 */
public class Snake {

    private final ArrayList<Node> body;
    private Direction direction;

    public Snake() {
        body = new ArrayList<Node>();
        body.add(new Node(Board.NUM_ROWS / 2, Board.NUM_COLS / 2));
        body.add(new Node(Board.NUM_ROWS / 2, Board.NUM_COLS / 2 - 1));
        body.add(new Node(Board.NUM_ROWS / 2, Board.NUM_COLS / 2 - 2));
        body.add(new Node(Board.NUM_ROWS / 2, Board.NUM_COLS / 2 - 3));
        direction = Direction.RIGHT;
    }

    public List<Node> getBody() {
        return body;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
    
    public void paint(Graphics g, int width, int height) {
        boolean firstNode = true;
        Color color;
        for (Node node : body) {
            if (firstNode) {
                color = Color.GREEN.darker();
                firstNode = false;
            } else {
                color = Color.GREEN;
            }
            Util.drawSquare(g, node.row, node.col, color, width, height);
        }
    }

    public void move() {
        switch (direction) {
            case UP:
                body.add(0, new Node(body.get(0).row - 1, body.get(0).col));
                body.remove(body.size() - 1);
                break;
            case DOWN:
                body.add(0, new Node(body.get(0).row + 1, body.get(0).col));
                body.remove(body.size() - 1);
                break;
            case LEFT:
                body.add(0, new Node(body.get(0).row, body.get(0).col - 1));
                body.remove(body.size() - 1);
                break;
            case RIGHT:
                body.add(0, new Node(body.get(0).row, body.get(0).col + 1));
                body.remove(body.size() - 1);
                break;
        }
    }

    public void grow() {
        
        switch (direction) {
            case UP:
                body.add(0, new Node(body.get(0).row - 1, body.get(0).col));
                break;
            case DOWN:
                body.add(0, new Node(body.get(0).row + 1, body.get(0).col));
                break;
            case LEFT:
                body.add(0, new Node(body.get(0).row, body.get(0).col - 1));
                break;
            case RIGHT:
                body.add(0, new Node(body.get(0).row, body.get(0).col + 1));
                break;
        }
    }

    public boolean colide() {
        int row = body.get(0).row;
        int col = body.get(0).col;
        if (row < 0 || row >= Board.NUM_ROWS || col < 0 || col >= Board.NUM_COLS) {
            return true;
        }

        for (int i = 1; i < body.size(); i++) {
            if (body.get(i).row == row && body.get(i).col == col) {
                return true;
            }
        }
        return false;
    }

    public boolean eats(Food food) {
        return food.row == body.get(0).row && food.col == body.get(0).col;
    }
    
    public boolean eats(DeathFood food) {
        if (food.row == body.get(0).row && food.col == body.get(0).col) {
            colide();
            return true;
        } else {
            return false;
        }
    }
    
}
