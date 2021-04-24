import java.applet.*;
/* write a java program to change the background of the applet using Choice Controls.*/
import java.awt.*;
import java.awt.event.*;
/*
<applet code = "LApplet.class" width = "320" height = "120">
   </applet>
*/
public class LApplet extends Applet implements ItemListener
{
	List l ;
	public void init()
	{
	Label l1 = new Label("SELECTED ONE ITEM");
	l = new List();
	l.add("red");l.add("yellow");l.add("green");
	l.addItemListener(this);
	add(l1);
	add(l);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String s = l.getSelectedItem();
		if(s.equals("red"))
			setBackground(Color.red);
		else if(s.equals("yellow"))
			setBackground(Color.yellow);
		else
			setBackground(Color.green);
	}
	
}