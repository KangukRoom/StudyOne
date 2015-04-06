package shapes;

import java.awt.Point;
import java.awt.Rectangle;

public class GERectangle extends GEShape{

	public GERectangle(){
		super(new Rectangle());
	}
	
	public void initDraw(Point startP){
		this.startP = startP;
	}
	
	public void setCoordinate(Point currentP){
		Rectangle tempRectangle =(Rectangle)myShape;
		tempRectangle.setFrame(startP.x, startP.y, currentP.x ,currentP.y);
	}

}
