package BouncingBall;

import java.util.ArrayList;

import zen.core.Zen;

public class BouncingBall {
	
	static ArrayList<Ball> balls = new ArrayList<Ball>();
	
	public static void main(String[] args) {
		setup();
		
		while(true)
		{
			Zen.setBackground("black");
			
			for (Ball b1: balls)
			{
				b1.draw();
				b1.move();
				for (Ball b2: balls)
				{
					b2.Collision(b1, b2);
				}
			}
			Zen.buffer(1);
		}
	}
	
	public static void setup()
	{
		Zen.create(800, 800);
		
		for (int i = 0; i < 14; i++)
		{
			balls.add(new Ball());
		}
	}

}
