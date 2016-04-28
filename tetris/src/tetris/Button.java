package tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class Button extends Rectangle 
{
	private String text;

	public Button(int x, int y, int width, int height) 
	{
		super(x, y, width, height);
	}
	
	public Button setText(String text)
	{
		this.text = text;
		return this;
	}
	
	public void drawButton(Graphics g, int offset)
	{
		g.setColor(Color.BLACK);
		g.fillRect(x, y, width, height);
		g.setColor(Color.RED);
		g.drawRect(x, y, width, height);
		int xx = x + offset;
		int yy = y + 38;
		g.setColor(Color.BLUE);
		g.drawString(text, xx, yy);
	}
}