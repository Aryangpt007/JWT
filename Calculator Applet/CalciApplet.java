import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class CalciApplet extends Applet implements ActionListener
{
	Button mBtns[]= new Button[10];
	Button add, sub, mul, div, mod, clear, EQ;
	String symbol[]= {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	int v1, v2;
	double result;
	TextField mTf, mTf2, mTf3;
	char op;
	
	public void init()
	{
		Color mColor = new Color(255,255,255);
		setBackground(mColor);
		mTf3= new TextField(100);
		add(mTf3);
		mTf3.setText("CALCULATOR");
		mTf2= new TextField(100);
		mTf2.addActionListener(this);
		add(mTf2);
		mTf= new TextField(10);
		mTf.addActionListener(this);
		add(mTf);
		GridLayout mGl = new GridLayout(5,4);
		setLayout(mGl);
		for( int i=0; i<10; i++)
		{
			mBtns[i]= new Button(symbol[i]);
			add(mBtns[i]);
			mBtns[i].addActionListener(this);
		}
		add=new Button("+");
		sub=new Button("-");
		mul=new Button("*");
		div=new Button("/");
		mod=new Button("%");
		clear=new Button("CLR");
		EQ=new Button("=");
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(clear);
		add(EQ);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clear.addActionListener(this);
		EQ.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		char ch=str.charAt(0);
		if ( Character.isDigit(ch))
		mTf.setText(mTf.getText()+str);
		else
		if(str.equals("+"))
		{
			v1=Integer.parseInt(mTf.getText());
			op='+';
			mTf.setText("");
			mTf2.setText(""+v1+" + ");
		}
		else if(str.equals("-"))
		{
			v1=Integer.parseInt(mTf.getText());
			op='-';
			mTf.setText("");
			mTf2.setText(""+v1+" - ");
		}
		else if(str.equals("*"))
		{
			v1=Integer.parseInt(mTf.getText());
			op='*';
			mTf.setText("");
			mTf2.setText(""+v1+" * ");
		}
		else if(str.equals("/"))
		{
			v1=Integer.parseInt(mTf.getText());
			op='/';
			mTf.setText("");
			mTf2.setText(""+v1+" / ");
		}
		else if(str.equals("%"))
		{
			v1=Integer.parseInt(mTf.getText());
			op='%';
			mTf.setText("");
			mTf2.setText(""+v1+" % ");
		}
		if(str.equals("="))
		{
			v2=Integer.parseInt(mTf.getText());
			if(op=='+')
				result=0.0+v1+v2;
			else if(op=='-')
				result=0.0-v1-v2;
			else if(op=='*')
				result=1.0*v1*v2;
			else if(op=='/')
				result=1.0*v1/v2;
			else if(op=='%')
				result=v1%v2;
			mTf.setText(""+result);
			mTf2.setText(""+v1+" "+op+" "+v2+" = ");
		}	
		if(str.equals("CLR"))
		{
			mTf.setText("");
			mTf2.setText("");
		}
	}
}
