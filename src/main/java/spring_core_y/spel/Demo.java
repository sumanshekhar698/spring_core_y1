package spring_core_y.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
///My SQL and D Beaver
@Component // Demo class is eleigble for autowired
@Scope("prototype")
public class Demo {

	@Value("67")
	private int x;

	@Value("#{67+33}")
	private int y;

	@Value("#{T(java.lang.Math).sqrt(169)}")
	private double m;
	private double n;

	@Value("#{20 > 54 ? false : true}")
	private boolean isSpringEasy;

	public boolean isSpringEasy() {
		return isSpringEasy;
	}

	public void setSpringEasy(boolean isSpringEasy) {
		this.isSpringEasy = isSpringEasy;
	}

	public int getX() {
		return x;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", m=" + m + ", n=" + n + ", isSpringEasy=" + isSpringEasy + "]";
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getM() {
		return m;
	}

	public void setM(double m) {
		this.m = m;
	}

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

}
