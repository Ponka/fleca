package ponka.games.cards;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ReplicateScaleFilter;

import javax.accessibility.AccessibleContext;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class DTest extends JFrame implements MouseListener{
	DraggableImageComponent dic;
	DraggableImageComponent dic2;
	public DTest() {
		// TODO Auto-generated constructor stub
		Stack s = new Stack(10,10,100,100);
		setLayout(null);
		JLayeredPane jp = new JLayeredPane();
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		dic = new DraggableImageComponent();
		dic.addMouseListener(this);
		dic2 = new DraggableImageComponent();
		dic.setImage("gifs/qh.gif");
		dic2.setImage("gifs/ks.gif");

		dic.setSize(new Dimension(73, 97));
		dic2.setSize(new Dimension(73, 97));
		
		dic2.setBounds(100, 100, 73, 97);
		jp.setSize(300, 300);
		jp.add(dic);
		jp.add(dic2);
		add(jp);
		
//		jp.setLayer(dic, 2);
	//	jp.setLayer(dic2, 1);
		//dic.setDraggable(false);
		//AccessibleContext a = getAccessibleContext();
		
		//Component c[] = getComponents();
		
		/*int s[] = new int[2];
		for(int x = 0 ; x < c.length ; x++){
			System.out.println("C["+x+"] = "+c[x]);
			if(c[x].equals(dic)){
				s[0] = x;
			}
			if(c[x] == dic2){
				s[1] = x;
			}
		}
		
		Component tmp = c[s[0]];
		c[s[0]] = c[s[1]];
		System.out.println("C0:"+c[s[0]]);
		System.out.println("C1"+c[s[1]]);
		c[s[1]] = tmp;
		//pack();
		revalidate();
		repaint();
		*/
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DTest();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		Point x = e.getLocationOnScreen();
		DraggableImageComponent c = ((DraggableImageComponent)e.getSource());
		Rectangle r = c.getBounds();
		//System.out.println("S:"+x);
		System.out.println("S:"+r);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		//Point x = e.getLocationOnScreen();
		DraggableImageComponent c = ((DraggableImageComponent)e.getSource());
		Rectangle r = c.getBounds();
		//System.out.println("E"+x);
		System.out.println("E"+r);
	}

	
	
}
