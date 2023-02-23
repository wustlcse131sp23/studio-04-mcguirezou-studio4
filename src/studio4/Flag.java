package studio4;

import java.awt.Color;
import java.awt.Font;
import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.rectangle(.5, .5, 0.5, .3);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(.75, .75, 0.25, .05);
		
		StdDraw.setPenColor(Color.ORANGE);
		StdDraw.filledRectangle(.75, .65, .25, .05);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(.75, .55, .25, .05);
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(.75, .45, .25, .05);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(.75, .35, .25, .05);
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.filledRectangle(.75, .25, .25, .05);
		StdDraw.setPenColor(Color.BLACK);
		double[] x = {0.5,0,1};
		double[] y = {0.8,.2,.2};
		double[] x1 = {0,.5,.5,0};
		double[] y1 = {.55,.5,.8,.8};
		double[] x2 = {0,.5,.5,0};
		double[] y2 = {.45,.5,.2,.2};
		StdDraw.filledPolygon(x,y);
		StdDraw.filledPolygon(x1, y1);
		StdDraw.filledPolygon(x2, y2);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.polygon(x, y);
		Font font = new Font("Arial", Font.BOLD, 25);
		StdDraw.setFont(font);
		StdDraw.text(.55, 0.45, "DARK SIDE OF 131",-20.0);
		
		
	}
}