import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class VibratingFrame extends JFrame
{
        JFrame f = this;
        JPanel p = new JPanel();
        runnable thread;
        Thread th;
        VibratingFrame()
        {
                this.setTitle("진동하는 프레임 만들기");// 타이틀은 진동하는 프레임 만들기
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                thread = new runnable();
                th = new Thread(thread);
                this.setLocation(100, 100);//시작 위치
                Container c = getContentPane();
        		c.setLayout(new FlowLayout());
                JLabel label = new JLabel("진동 레이블");
                c.add(label);
                this.add(p);
                this.setVisible(true);
                this.setSize(300, 300);//사이즈는 300x300
                
                th.start();
                
        }

        class runnable implements Runnable
        {
                public void run()
                {
                        while(true)
                        {
                                try
                                {     
                                        f.setLocation(90, 100);//90,100 과 
                                        Thread.sleep(1);
                                        f.setLocation(100, 100);//100,100을 번갈아가면서 이동-진동
                                }
                               catch(InterruptedException e){return;}}}}}
public class Vibrate
{
      public static void main(String[] args) 

        {new VibratingFrame();}
}
