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
                this.setTitle("�����ϴ� ������ �����");// Ÿ��Ʋ�� �����ϴ� ������ �����
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                thread = new runnable();
                th = new Thread(thread);
                this.setLocation(100, 100);//���� ��ġ
                Container c = getContentPane();
        		c.setLayout(new FlowLayout());
                JLabel label = new JLabel("���� ���̺�");
                c.add(label);
                this.add(p);
                this.setVisible(true);
                this.setSize(300, 300);//������� 300x300
                
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
                                        f.setLocation(90, 100);//90,100 �� 
                                        Thread.sleep(1);
                                        f.setLocation(100, 100);//100,100�� �����ư��鼭 �̵�-����
                                }
                               catch(InterruptedException e){return;}}}}}
public class Vibrate
{
      public static void main(String[] args) 

        {new VibratingFrame();}
}
