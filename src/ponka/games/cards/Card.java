package ponka.games.cards;


import javax.swing.JFrame;

public class Card extends DraggableImageComponent{

	boolean onBack;
	
	public static final String BACK_IMAGE_PATH = "gifs/b.gif";
	
	public static final int SIZE_X = 73;
	public static final int SIZE_Y = 97;
	
	
	public static final int HEARTS = 0;
	public static final int DIAMONDS = 1;
	public static final int SPADES = 2;
	public static final int CLUBS = 3;
	
	//public static final int VALUE_1  = 0;
	public static final int VALUE_2  = 0;
	public static final int VALUE_3  = 1;
	public static final int VALUE_4  = 2;
	public static final int VALUE_5  = 3;
	public static final int VALUE_6  = 4;
	public static final int VALUE_7  = 5;
	public static final int VALUE_8  = 6;
	public static final int VALUE_9  = 7;
	public static final int VALUE_10 = 8;
	public static final int VALUE_J  = 9;
	public static final int VALUE_Q = 10;
	public static final int VALUE_K = 11;
	public static final int VALUE_A = 12;
	public static final int VALUE_JOKER = 13;

	int suit;
	int value;
	
	String path;
	
	public void flip(){
		onBack = !onBack;
		resetImage();
	}
	
	Card(int suit, int value ){
		String s = null;
		onBack = false;
		switch(suit){
			case HEARTS:
				s = "h";
				break;
			case DIAMONDS:
				s = "d";
				break;				
			case SPADES:
				s = "s";
				break;
			case CLUBS:
				s = "c";
				break;				
				
		}
		String v = null;
		switch(value){
		case VALUE_2:
		case VALUE_3:
		case VALUE_4:
		case VALUE_5:
		case VALUE_6:
		case VALUE_7:
		case VALUE_8:
		case VALUE_9:
			v = ""+(value+1);
			break;
		case VALUE_10:
			v = "t";
			break;
		case VALUE_J:
			v = "j";
			break;
		case VALUE_Q:
			v = "q";
			break;
		case VALUE_K:
			v = "k";
			break;
		case VALUE_A:
			v = "a";
			break;
		case VALUE_JOKER:
			s = "";
			v = "j";
		}
		path = "gifs/"+ v+""+s+".gif";
		resetImage();
		setSize(SIZE_X, SIZE_Y);
	
	}
	
	private void resetImage(){
		if(onBack){
			setImage(path);
		}else{
			setImage(Card.BACK_IMAGE_PATH);
		}
	}
	
	Card(){
		this(0,VALUE_JOKER);
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card(Card.HEARTS,Card.VALUE_Q);
		
		JFrame f = new JFrame();
		f.setLayout(null);
		f.setSize(400, 400);
		f.add(c);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);

		c.flip();
		c.setDraggable(false);
	}

}
