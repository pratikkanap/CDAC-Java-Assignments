//command line arguments 
class CommandArgs{
	public static void main(String[] args){
		if(args.length < 0){
			System.out.println("Error Please enter args ");
		}
		else{
			System.out.println("Entered args is : "+args[0]);
		}
	}
}