package BouncingBall;

import zen.core.Zen;

public class Ball {
	
	int x = Zen.getRandomNumber(10, 790);
	int y = Zen.getRandomNumber(10, 790);
	int dx = Zen.getRandomNumber(1, 3);
	int dy = Zen.getRandomNumber(1, 3);
	int health = 10;
	
	
	public void draw()
	{
		Zen.setColor("green");
		Zen.fillOval(x, y, 20, 20);
	
	}
	
	public void move()
	{
		x = x + dx;
		y = y + dy;
		if (x > 790 || x < 0)
		{
			dx = -dx;
		}
		if (y > 780 || y < 10)
		{
			dy = -dy;
		}
		
	}
	public void Collision(Ball b1, Ball b2)
	{
		if (Math.abs(this.x - b1.x) < 20 && Math.abs(this.y - b1.y) < 20)
		{
			b1.dx = -b1.dx;
			b1.dy = -b1.dy;
			b2.dx = -b2.dx;
			b2.dy = -b2.dy;
		}
	}
}
