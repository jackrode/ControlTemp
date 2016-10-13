
public class Control {
	String nombre, cedula, edad;
	int n, menorup=0, cont, acc=0;
	int mayor=0;
	int menor=36;
	int moda=0;
	int temperatura[];
	double promedio;
	String estado;
	
	
	public Control(String nombre, String cedula, String edad){
		this.nombre=nombre;
		this.edad=edad;
		this.cedula=cedula;
		
	}
	
	public int menor(){
		for (int p=0;p<(temperatura.length);p++){
			if(temperatura[p]<36){
				
			
			if(temperatura[p]<menor)
			{
				menor=temperatura[p];
				if(menor>temperatura[p])
				{
					menorup=temperatura[p];
				}
		}
	}
}return menorup;
}
	public int getMenorup(){
		
		return menorup;
	}
	public int mayor(){
		for (int p=0;p<(temperatura.length);p++){
			if (temperatura[p]>36){
			if(temperatura[p]>mayor){
				mayor=temperatura[p];
			}
		}
		}
		return mayor;
	}
	public void setTamaño(int n){
		temperatura= new int [n];
	}
	public void temperaturas(int n){
		for (int i=0;i<=temperatura.length;i++){
			
		}

	
		}
	public double prom(){
		for (int i=0;i<(temperatura.length);i++)
		{
			acc=acc+temperatura[i];	

		}
		promedio=acc/temperatura.length;
		
		return promedio;
	}
	
	public String estado(){
		if(promedio==36 || promedio==37)
		{
			estado="NORMAL";	
		}else{ 
			if(promedio>37&&promedio<39)
		{
			estado="fiebre";
		}else{

			if(promedio<36)
			{
				estado="hipotermia";
			}else{
				if(promedio>39&&promedio<42)
				{ 
					estado="Fiebre severa";
				}else{ 
					if(promedio>42){
						estado="FIEBRE GRAVÍSIMA";	
					}
				}
			}
		}
		}
		return estado;
	}
	
	public int moda(int[] temperatura)
	{
	  int count = 1, tempCount;
	  int moda= temperatura[0];
	  int temp = 0;
	  for (int i = 0; i < (temperatura.length - 1); i++)
	  {
	    temp = temperatura[i];
	    tempCount = 0;
	    for (int j = 1; j < temperatura.length; j++)
	    {
	      if (temp == temperatura[j])
	        tempCount++;
	    }
	    if (tempCount > count)
	    {
	      moda = temp;
	      count = tempCount;
	    }
	  }
	  return moda;
	}
}

	

