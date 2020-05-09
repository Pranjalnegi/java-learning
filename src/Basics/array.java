package Basics;

public class array {

	public static void main(String[] args) {
	// array create and define
		String[] city= {"DELHI","MUMBAI","DEHRADUN"};
		System.out.println(city[1]);
        System.out.println(city[2]);
       
	
	//array define and fill
        String [] cities= new String[4];
        cities[0]= "doon";
        cities[1]="Delhi";
        cities[2]="Mumbai";
        cities[3]="Shimla";
        
        //USING do-while
        int i=0;
        do {
        	System.out.println("CITY:"+cities[i]);
        	i=i+1;
        }while(i<=3);    
       
        
        
        
        //USING WHILE
        //while(i<4)
        System.out.println("NEWW    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");
        int n=0;
        boolean Valf=false;
        while(!Valf) {
        	System.out.println("CITY:"+cities[n]);
        	if(cities[n]=="Mumbai") {
        		System.out.println("CITY FOUND");
        		Valf=true;
        	}n++;
        }
        
        //using for loop which is best for iterating through a array
	System.out.println("FORRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
	int x=0;
        for(x=0;x<=3;x++) {
        System.out.println(cities[x]);		
        }}}
        
        //OTHER METHOD
    //    String[] country;
    //country= new String[2];
    
    

