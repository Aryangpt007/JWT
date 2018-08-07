import java.awt.*;

class Circle
{
	int xPos, yPos, dia;
	
	Circle()
	{
		xPos= yPos= 10;
		dia= 15;
	}
	
	void display(Graphics g)
	{
		g.drawOval(xPos, yPos, dia, dia);
	}
	
	void grow()
	{
		dia+=5;
	}
	
	void shrink()
	{
		dia-=5;
	}
	
	void left()
	{
		xPos-=5;
	}
	
	void right()
	{
		xPos+=5;
	}
	
	void up()
	{
		yPos-=5;
	}
	
	void down()
	{
		yPos+=5;
	}
}