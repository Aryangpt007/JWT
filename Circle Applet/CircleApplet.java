import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="CircleApplet" width=500 height=500>
</applet>
*/

public class CircleApplet extends Applet implements ActionListener
{
	Button grow, shrink, left, right, up, down;
	Circle cr;
	
	public void init()
	{
		cr= new Circle();
		grow= new Button("GROW");
		grow.addActionListener(this);
		shrink= new Button("SHRINK");
		shrink.addActionListener(this);
		left= new Button("LEFT");
		left.addActionListener(this);
		right= new Button("RIGHT");
		right.addActionListener(this);
		up= new Button("UP");
		up.addActionListener(this);
		down= new Button("DOWN");
		down.addActionListener(this);
		add(grow);
		add(shrink);
		add(left);
		add(right);
		add(up);
		add(down);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==grow)
		{
			cr.grow();
		}
		else if(e.getSource()==shrink)
		{
			cr.shrink();
		}
		else if(e.getSource()==left)
		{
			cr.left();
		}
		else if(e.getSource()==right)
		{
			cr.right();
		}
		else if(e.getSource()==up)
		{
			cr.up();
		}
		else if(e.getSource()==down)
		{
			cr.down();
		}
		repaint();
	}
	
	public void paint(Graphics g)
	{
		cr.display(g);
	}
}