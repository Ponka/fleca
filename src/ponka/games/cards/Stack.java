package ponka.games.cards;

import java.util.Enumeration;
import java.util.Vector;

import javax.swing.JLayeredPane;

public class Stack extends JLayeredPane{

	Vector<Card> cards ;
	int currentLayer;
	
	
	Stack(int x, int y, int sizeX, int sizeY){
		currentLayer = 1;
		cards = new Vector<Card>();
		setSize(sizeX, sizeY);
	}
	
	public void add(Card c){
		super.add(c);
		for(Enumeration<Card> e = cards.elements() ; e.hasMoreElements() ;){
			Card x = e.nextElement();
			x.setDraggable(false);
			x.flip();
		}
		cards.add(c);
		setLayer(c, currentLayer);
		currentLayer++;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
