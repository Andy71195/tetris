package tetris;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class tetris extends JFrame {

    JLabel statusbar;


    public tetris() {

        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);
        Board board = new Board(this);
        add(board);
        board.start();

        setSize(200, 400);
        setTitle("Tetris");
       
   }

   public JLabel getStatusBar() {
       return statusbar;
   }

   
    public static void initialize() {

        tetris game = new tetris();
        game.setLocationRelativeTo(null);
        game.setVisible(true);

    }
}