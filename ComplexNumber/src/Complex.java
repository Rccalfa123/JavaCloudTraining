public class Complex {
   
	private float real;
	private float imaginary;
	
	//Setters and getters
	public float getReal() {
		return real;
	}
	public void setReal(float real) {
		this.real = real;
	}
	public float getImaginary() {
		return imaginary;
	}
	public void setImaginary(float imaginary) {
		this.imaginary = imaginary;
	}
	
	//Set function
	public void set(float real,float imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	
	//sum function
	public Complex sum(Complex complex1, Complex complex2)
	{
	     complex1.real = complex1.real+complex2.real; //Adding real Part
	     complex1.imaginary = complex1.imaginary+complex2.imaginary;  //Adding Imaginary Part
		 return complex1;
	}
	@Override
	public String toString() {
		return "Complex ["+ real + "+" + imaginary + "i]";
	}
	
}


