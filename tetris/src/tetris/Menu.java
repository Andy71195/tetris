package tetris;


import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Menu
{
	public Button play,restart, quit;
	
	private BufferedImage menu_image;
	
	
	
	public Menu()
	{
		int fillerY = 150;
		play = new Button(FILEMENU.CENTRE_X-400, fillerY , 200, 50).setText("Play");
		restart = new Button(FILEMENU.CENTRE_X -400, fillerY+ 100, 200, 50).setText("Restart");
		quit = new Button(FILEMENU.CENTRE_X-400, fillerY + 200 , 200, 50).setText("Quit");
	}
		
	public void render(Graphics g)
	{

		try
		{
		   menu_image = ImageIO.read(new File("C:/tetris/src/menu_screen.png"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
		g.drawImage(menu_image, 0, 0, null);
			
		g.setFont(new Font("Comic Sans",Font.ITALIC, 36));
		
		play.drawButton(g, 65);
		restart.drawButton(g, 40);
		quit.drawButton(g, 65);
		
	}
}

