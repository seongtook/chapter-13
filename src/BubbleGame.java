import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Bubble extends JLabel implements Runnable
{
ImageIcon bubble=new ImageIcon("images/chicken.jpg");//이미지가 있는 경로와 파일명
int x,y;
Bubble(int x,int y)
{
this.x=x;
this.y=y;

setLocation(x,y);
setIcon(bubble);
setSize(bubble.getIconWidth(),bubble.getIconHeight());
Thread th=new Thread(this);
th.start();
}

public void run()//run 메소드 이용
{
while(true){
try{

Thread.sleep(30);
setLocation(x,y);
y-=10;
if(y<=-10)
{
this.invalidate();}
}

catch(InterruptedException e)
{
return;}}}}
public class BubbleGame extends JFrame
{
Container contentPane;
BubbleGame()
{
setTitle("버블 게임");//타이틀 제목은 버블 게임
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
contentPane=getContentPane();
MyPanel panel=new MyPanel();
contentPane.add(panel,BorderLayout.CENTER);

setSize(700,700);//size 는 700x700
setVisible(true);
}

class MyPanel extends JPanel
{
MyPanel()
{

setLayout(null);
addMouseListener(new MyMouse(this));
}

class MyMouse extends MouseAdapter
{
JPanel a;
MyMouse(JPanel a)
{
this.a=a;
}
public void mouseReleased(MouseEvent e)
{
int x=e.getX();
int y=e.getY();

Bubble b=new Bubble(x,y);
a.add(b);}
}

public void paintComponent(Graphics g)
{
super.paintComponent(g);}
}
public static void main(String[] args)
{

new BubbleGame();}
}
