class ArgsAdd{
	public static void main(String args[]){
	
		if(args.length<0){
			//if there is no args then enter some args
			System.out.println("Error Please Enter the args");
		}
		else{	
			//To Add the value of two num on command line 
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
		 	System.out.println("The Addition of two args is : "+(a+b));
		}
	}
}