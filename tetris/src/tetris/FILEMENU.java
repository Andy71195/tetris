package tetris;


import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class FILEMENU extends Canvas implements Runnable,KeyListener{
public static final int WIDTH=800;
public static final int HEIGHT=560;
public static final int CENTRE_X = WIDTH / 2;
public static final int CENTRE_Y = HEIGHT / 2;
public static Menu menu = new Menu();
	
public static Menu getMenu()
{
	return menu;
}

public static void main(String args [])
{

JFrame frame = new JFrame("Tetris");
frame.setSize(WIDTH,HEIGHT);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLocationRelativeTo(null);
frame.setResizable(false);
frame.setLayout(null);
JMenuBar bar = new JMenuBar();
bar.setBounds(0,0 ,WIDTH, 25);

JMenu file = new JMenu("FILE");
file.setBounds(0, 0, 45,  24);

JMenuItem newGame = new JMenuItem("NEW GAME");
newGame.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		
		tetris.initialize();
		System.out.println("starting game");
	}
});

JMenuItem highScore = new JMenuItem("HIGH SCORE");
highScore.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		int highscore = 0;
		final JFrame alert = new JFrame("HIGH SCORE");
		alert.setSize(300, 200);
		alert.setLocationRelativeTo(null);
		alert.setLayout(null);
		alert.setResizable(false);
		
		JLabel score = new JLabel("The high score is :"+ highscore);
		score.setBounds(0, -50, 200, 250);
		
		JButton okaybutton = new JButton ("Okay");
		okaybutton.setBounds(100, 120, 100, 30);
		okaybutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				alert.dispose();
			}
		 });
		alert.add(score);
		alert.add(okaybutton); //adds the ok button to the frame of high score
		alert.setVisible(true);
	}
});

JMenuItem exit = new JMenuItem("EXIT");
exit.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		System.out.println("CLOSING");
		System.exit(0); 
	}
});



FILEMENU tm = new FILEMENU();
tm.setBounds(0,25,WIDTH, HEIGHT-25);
file.add(newGame);
file.add(highScore);
file.add(exit); // adds the menu items to the menu file

frame.add(tm); 

bar.add(file);
frame.add(bar);
MouseInput mouse = new MouseInput();
tm.addMouseListener(mouse);
tm.addMouseMotionListener(mouse);
frame.setVisible(true);
tm.start();
}
public void start(){
	Thread t= new Thread(this);
	t.setPriority(Thread.MAX_PRIORITY);
	t.start();
}
	public void run()
	{ 
		boolean running = true;
		while(running){
		update();
		BufferStrategy buf= getBufferStrategy();
		if(buf==null)
		{
			createBufferStrategy(3);
			continue;
		}
		Graphics2D g = (Graphics2D)buf.getDrawGraphics();
		render(g);
		buf.show();
	}
		
	}
	public void render(Graphics2D g)
	{
		menu.render(g);
	}
	public void update(){
		
	}
	
	public void keyPressed(KeyEvent e)
	{
		
	}
	
	public void keyTyped(KeyEvent e)
	{
		
	}
	
	public void keyReleased(KeyEvent e)
	{
		
	}

}


