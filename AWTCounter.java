/* Create an AWT GUI application(Called AWTCounter).Each time the count button is clicked,the counter value shall be increased by 1. */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code = "AWTCounter.class" width = "320" height = "120">
   </applet>
*/
public class AWTCounter extends Applet implements ActionListener
{
	Label l;TextField tf;Button b;
	public void init()
	{
		l = new Label("Counter");
		tf = new TextField();
		b = new Button("Count");
		b.addActionListener(this);
		tf.addActionListener(this);
		add(l);add(tf);add(b);
	}
	int count1 = 0;
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		if(s.equals("Count"))
		{
			count1= count1+1;
			tf.setText(Integer.toString(count1));
		}
	}
}