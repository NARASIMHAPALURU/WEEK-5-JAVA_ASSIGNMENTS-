/*write a java applet program to implement the MouseEvent */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code = "MouseEventApplet.class" width = "320" height = "120">
   </applet>
*/
public class MouseEventApplet extends Applet implements MouseListener
{
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		setBackground(Color.yellow);
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		setBackground(Color.red);
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		setBackground(Color.green);
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
	}
	public void mouseReleased(MouseEvent me)
	{
	}
}
