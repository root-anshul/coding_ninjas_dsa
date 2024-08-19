package CN_week_7_oops;

public class ComplexNumbers {

	int real;
	int img;
	public ComplexNumbers(int real, int imaginary) {
		this.real=real;
		this.img=imaginary;
	}
	
	
	public void plus( ComplexNumbers c) {
		
		int real = this.real+c.real;
		int img  = this.img+c.img;
		this.real=real;
		this.img=img;
		
		
	}

	public void multiply(ComplexNumbers c) {
		int real=(this.real*c.real)-(this.img*c.img);
		int img=(this.real*c.img)+(this.img*c.real);
		this.real=real;
		this.img=img;
		
	} 
	public void print() {
		System.out.print(this.real+" "+" + "+"i"+this.img);
		
	}

}
