
public class Traingle {

	private double side_ab;
	private double side_bc;
	private double side_ca;
	public double getSide_ab() {
		return side_ab;
	}
	public void setSide_ab(double side_ab) {
		this.side_ab = side_ab;
	}
	public double getSide_bc() {
		return side_bc;
	}
	public void setSide_bc(double side_bc) {
		this.side_bc = side_bc;
	}
	public double getSide_ca() {
		return side_ca;
	}
	public void setSide_ca(double side_ca) {
		this.side_ca = side_ca;
	}

	public boolean isRight()
	{
		double side_ca_square = side_ca*side_ca;
		if(side_ca_square == Math.pow(side_ab, 2)+Math.pow(side_bc, 2))
		{
			return true;
		}
		return false;
	}
	
	public boolean isScalene()
	{
		if(side_ab != side_bc && side_bc != side_ca && side_ca != side_ab)
		{
			return true;
		}
		return false;
	}
	
	public boolean isIsoceles()
	{
		if((side_ab == side_bc && side_bc == side_ca && side_ca != side_ab)||(side_ab == side_bc && side_bc != side_ca && side_ca == side_ab)||(side_ab != side_bc && side_bc == side_ca && side_ca == side_ab))
		{
			return true;
		}
		return false;
	}
	
	public boolean isEquilateral()
	{
		if(side_ab == side_bc && side_bc == side_ca && side_ca == side_ab)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Traingle [side_ab=" + side_ab + ", side_bc=" + side_bc + ", side_ca=" + side_ca + ", getSide_ab()="
				+ getSide_ab() + ", getSide_bc()=" + getSide_bc() + ", getSide_ca()=" + getSide_ca() + ", isRight()="
				+ isRight() + ", isScalene()=" + isScalene() + ", isIsoceles()=" + isIsoceles() + ", isEquilateral()="
				+ isEquilateral() + "]";
	
}
}
