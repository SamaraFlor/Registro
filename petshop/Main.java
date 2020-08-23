import java.util.ArrayList;
   
    public class Main{
	
	public static void main(String []args) {

	ArrayList<Pessoa>dados= new ArrayList<>();
	
	Pessoa marcos= new Pessoa();
	Pessoa pedro= new Pessoa();
	
	marcos.setNome("marcos");
    marcos.setIdade(29);
    marcos.setSigno("capricornio");
    
    pedro.setNome("pedro");
    pedro.setIdade (3);
    pedro.setSigno("cancer");
    
   
	 
		for (Pessoa pessoas: dados ) {
		System.out.println();
	}
    	
	
	}
	
}

