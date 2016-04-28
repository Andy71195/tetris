package tetris;

import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseInput extends MouseAdapter
{
	
	public static int MOUSE_X, MOUSE_Y;
	public static Rectangle MOUSE = new Rectangle(1, 1, 1, 1);
	
	private Menu menu = FILEMENU.getMenu();
	
	public void mouseClicked(MouseEvent e)
	{
		int mouse = e.getButton();
		Rectangle rect = new Rectangle(e.getX(), e.getY(), 1, 1);
		
		
		if(mouse == MouseEvent.BUTTON1)
		{
			if(rect.intersects(menu.play))
			{
				tetris.initialize();
			}
			
			if(rect.intersects(menu.restart))
			{
				tetris.initialize();
			}
			
			if(rect.intersects(menu.quit))
			{
				System.exit(0);
			}
		}
	}
}