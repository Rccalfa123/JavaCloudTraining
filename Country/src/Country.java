//
public class Country {
   
	 private String name;
	 private double population;
	 private double area;
	 
	  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public Country largestArea(Country c[])
	  {
		  int i,k=0;
		  double max = c[0].area;
		  for(i = 1;i<c.length;i++)
		  {
			  if(c[i].area > max)
			  {
				  max = c[i].area;
				  k = i;
			  }
			     
		  }
		  return c[k];
	  }
	
	  public Country largestPopulation(Country c[])
	  {
		  int i,k=0;
		  double max = c[0].area;
		  for(i = 1;i<c.length;i++)
		  {
			  if(c[i].population > max)
			  {
				  max = c[i].population;
				  k = i;
			  }
			     
		  }
		  return c[k];
	  }
	
	  public Country largestPopulationDensity(Country c[])
	  {
		  int i,k=0;
		  double max = (c[0].population)/(c[0].area);
		  for(i = 1;i<c.length;i++)
		  {
			  if((c[i].population)/(c[i].area) > max)
			  {
				  max = (c[i].population)/(c[i].area);
				  k = i;
			  }
			     
		  }
		  return c[k];
	  }

	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + ", area=" + area + ", PopulationDensity= " + population/area+"]";
	}
	
	 
}

