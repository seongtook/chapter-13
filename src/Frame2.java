import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Frame2 extends JFrame
{
       private MyPanel panel = new MyPanel();
     public Frame2()
        {
                setTitle("���� 0.5�� �������� �̵�");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setContentPane(panel);
                Container c = getContentPane();
                c.addMouseListener(new Mouse());
                setVisible(true);
                setSize(350, 350);
        }
                class MyPanel extends JPanel{
                   public void paintComponent(Graphics g) {
                      super.paintComponent(g);
                      g.setColor(Color.RED);
                      g.drawOval(20,20,80,80);
                   }
                }
        public static void main(String[] args)
        {
                new Frame2();
        }
}
class Mouse implements MouseListener
{
        public void mouseClicked(MouseEvent e)
        {
                JPanel g = (JPanel)e.getSource();
                int X = (int)(Math.random()*300);
                int Y = (int)(Math.random()*300);
                g.setLocation(X, Y);

        } //���콺�� ���� Ŭ���Ҷ� ���� ������ ��ǥ�� �� ���

        public void mouseEntered(MouseEvent e)

        {}
        public void mouseExited(MouseEvent e)
        {}
        public void mousePressed(MouseEvent e)
        {}
        public void mouseReleased(MouseEvent e)
        {}
}