
public class Model {

	double[] x;
	double[] y;
	
	double b, m;
	double x_avg, y_avg, xy_avg, xsqd_avg;
	
	public Model (double[] x, double[] y) {
		this.x = x;
		this.y = y;
	}
	
	public void find_x_avg() {
		for (int i = 0; i < x.length; i++) {
			x_avg += x[i];
		}
		
		x_avg /= x.length;
	}
	
	public void find_xsqd_avg() {
		for (int i = 0; i < x.length; i++) {
			xsqd_avg += x[i]*x[i];
		}
		
		xsqd_avg /= x.length;
	}
	
	public void find_y_avg() {
		for (int i = 0; i < y.length; i++) {
			y_avg += y[i];
		}
		
		y_avg /= x.length;
	}
	
	public void find_xy_avg() {
		for (int i = 0; i < x.length; i++) {
			xy_avg += x[i]*y[i];
		}
		
		xy_avg /= x.length;
	}
	
	public void find_avgs() {
		find_x_avg();
		find_xsqd_avg();
		find_y_avg();
		find_xy_avg();
	}
	
	public void findm() {
		m = (x_avg*y_avg-xy_avg)/(x_avg*x_avg-xsqd_avg);
	}
	
	public void findb() {
		b = y_avg - m*x_avg;
	}
	
	public void run() {
		find_avgs();
		findm();
		findb();
	}
	
	public double getm() {
		return m;
	}
	
	public double getb() {
		return b;
	}
	
	public void print() {
		System.out.println(x_avg);
		System.out.println(m + " " + b);
	}
	
}
