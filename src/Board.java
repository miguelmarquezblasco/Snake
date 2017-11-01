
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author miguel
 */
public class Board extends javax.swing.JPanel implements Runnable {

    public static final int NUM_ROWS = 30;
    public static final int NUM_COLS = 30;
    private Snake snake;
    private Food food;
    private SpecialFood specialFood;
    private BeastFood beastFood;
    private DeathFood deathFood;
    private Timer timer;
    MyKeyAdapter keyAdapter;
    private ScoreBoard scoreBoard;
    private int velocity;

    /**
     * Creates new form Board
     */
    public Board() {
        initComponents();
        initializeBoard(Configuration.getInstance().getDifficulty());
    }

    public void initializeBoard(int velocity) {
        snake = new Snake();
        food = new Food(snake);
        keyAdapter = new MyKeyAdapter();
        addKeyListener(keyAdapter);
        setFocusable(true);
        this.velocity = velocity;
        if (timer != null) {
            timer.stop();
        }
        run();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createOrNotSpecialFood() {
        int random = (int) (Math.random() * 10);
        if (random == 5) {
            specialFood = new SpecialFood(snake);
        }
    }

    private void createOrNotBeastFood() {
        int random = (int) (Math.random() * 25);
        if (random == 5) {
            beastFood = new BeastFood(snake);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.drawRect(0, 0, getWidth() / NUM_COLS * NUM_COLS, getHeight() / NUM_ROWS * NUM_ROWS);

        snake.paint(g, getSize().width / Board.NUM_COLS, getSize().height / Board.NUM_ROWS);
        food.paint(g, getSize().width / Board.NUM_COLS, getSize().height / Board.NUM_ROWS);

        if (specialFood != null) {
            specialFood.paint(g, getSize().width / Board.NUM_COLS, getSize().height / Board.NUM_ROWS);
        }

        if (beastFood != null) {
            beastFood.paint(g, getSize().width / Board.NUM_COLS, getSize().height / Board.NUM_ROWS);
        }

        if (deathFood != null) {
            deathFood.paint(g, getSize().width / Board.NUM_COLS, getSize().height / Board.NUM_ROWS);
            if (snake.eats(deathFood)) {
                gameOver();
                paintGameOver(g, NUM_ROWS / 2 + 1, NUM_COLS / 2 + 1);
            }
        }

        if (snake.colide() == true) {
            paintGameOver(g, NUM_ROWS / 2 + 1, NUM_COLS / 2 + 1);
        }
    }

    @Override
    public void run() {

        timer = new Timer(velocity, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!snake.colide()) {
                    if (snake.eats(food)) {
                        Music.eatOn();
                        snake.grow();
                        scoreBoard.increment(1);
                        food = new Food(snake);
                        deathFood = new DeathFood(snake);
                        createOrNotSpecialFood();
                        createOrNotBeastFood();
                    }

                    if (specialFood != null) {
                        if (snake.eats(specialFood)) {
                            Music.eatOn();
                            snake.grow();
                            scoreBoard.increment(3);
                            specialFood = null;
                        }
                    }

                    if (beastFood != null) {
                        if (snake.eats(beastFood)) {
                            Music.eatOn();
                            snake.grow();
                            scoreBoard.increment(5);
                            beastFood = null;
                        }
                    }

                    snake.move();

                } else {
                    gameOver();
                }
                repaint();
            }
        }
        );
        if (Configuration.getInstance().isMusic()) {
            startGameWidthSound();
        } else {
            startGame();
        }
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void pauseTimer() {
        timer.stop();
    }

    public void gameOver() {
        timer.stop();
        Music.gameOverOn();
    }

    public void startGame() {
        timer.start();
    }

    public void startGameWidthSound() {
        timer.start();
        Music.musicOn();
    }

    public void restart() {
        timer.restart();
    }

    public void startAgain() {
        timer.restart();
        initializeBoard(80);
    }

    public void setScoreBoard(ScoreBoard scoreBoard) {
        this.scoreBoard = scoreBoard;
    }

    private void paintGameOver(Graphics g, int width, int height) {
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                Util.drawSquare(g, i, j, Color.DARK_GRAY, getWidth(), getHeight());
            }
        }
        Color c;
        c = Color.getHSBColor(0.75f, 1f, 1f);
        for (int i = 0; i <= NUM_ROWS; i++) {
            for (int j = 0; j <= NUM_COLS; j++) {
                if (i == 9) {
                    if (j == 5 || j == 6 || j == 7 || j == 8 || j == 12 || j == 16 || j == 20 || j == 22 || j == 23 || j == 24 || j == 25 || j == 26) {
                        Util.drawSquare(g, i, j, Color.GREEN, width, height);
                    }
                }
                if (i == 10) {
                    if (j == 4 || j == 11 || j == 13 || j == 16 || j == 17 || j == 19 || j == 20 || j == 22) {
                        Util.drawSquare(g, i, j, Color.GREEN, width, height);
                    }
                }
                if (i == 11) {
                    if (j == 4 || j == 7 || j == 8 || j == 10 || j == 14 || j == 16 || j == 18 || j == 20 || j == 22 || j == 23 || j == 24) {
                        Util.drawSquare(g, i, j, Color.GREEN, width, height);
                    }
                }
                if (i == 12) {
                    if (j == 4 || j == 8 || j == 10 || j == 11 || j == 12 || j == 13 || j == 14 || j == 16 || j == 20 || j == 22) {
                        Util.drawSquare(g, i, j, Color.GREEN, width, height);
                    }
                }
                if (i == 13) {
                    if (j == 5 || j == 6 || j == 7 || j == 8 || j == 10 || j == 14 || j == 16 || j == 20 || j == 22 || j == 23 || j == 24 || j == 25 || j == 26) {
                        Util.drawSquare(g, i, j, Color.GREEN, width, height);

                    }
                }
                if (i == 17) {
                    if (j == 5 || j == 6 || j == 7 || j == 10 || j == 14 || j == 16 || j == 17 || j == 18 || j == 19 || j == 20 || j == 22 || j == 23 || j == 24 || j == 25) {
                        Util.drawSquare(g, i, j, Color.GREEN, width, height);

                    }
                }
                if (i == 18) {
                    if (j == 4 || j == 8 || j == 10 || j == 14 || j == 16 || j == 22 || j == 26) {
                        Util.drawSquare(g, i, j, Color.GREEN, width, height);

                    }
                }
                if (i == 19) {
                    if (j == 4 || j == 8 || j == 10 || j == 14 || j == 16 || j == 17 || j == 18 || j == 22 || j == 23 || j == 24 || j == 25) {
                        Util.drawSquare(g, i, j, Color.GREEN, width, height);

                    }
                }
                if (i == 20) {
                    if (j == 4 || j == 8 || j == 11 || j == 13 || j == 16 || j == 22 || j == 26) {
                        Util.drawSquare(g, i, j, Color.GREEN, width, height);

                    }
                }
                if (i == 21) {
                    if (j == 5 || j == 6 || j == 7 || j == 12 || j == 16 || j == 17 || j == 18 || j == 19 || j == 20 || j == 22 || j == 26) {
                        Util.drawSquare(g, i, j, Color.GREEN, width, height);

                    }
                }
            }
        }
    }

    class MyKeyAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (snake.getDirection() != Direction.RIGHT) {
                        snake.setDirection(Direction.LEFT);
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (snake.getDirection() != Direction.LEFT) {
                        snake.setDirection(Direction.RIGHT);
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (snake.getDirection() != Direction.DOWN) {
                        snake.setDirection(Direction.UP);
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (snake.getDirection() != Direction.UP) {
                        snake.setDirection(Direction.DOWN);
                    }
                    break;
                default:
                    break;
            }
            repaint();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
