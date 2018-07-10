
public class DayOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        
        int age=-5;
//        
//        boolean flag=true;
//
//        double time = 5.50;
//        
//        String name= "Sylhet";
//        
//        age++;
//        
//        System.out.println(age);
//        
//        


//        if(age>0)
//        {
//         System.out.println("The Child is a kid");
//        }
//        else if(age<0){
//         System.out.println("The Child has not born yet");
//        }else{
//
//         System.out.println("There is no kid");
//         }

        
//        for(int i=0; i<5; i++){
//        	System.out.println(i+" is the position");
//        	
//        }
        
//        int i=10;
//        while(i>5){
//        	System.out.println(i+" is the position");
//        	i--;
//        }
        
        String [] names;
        
        names=new String[5];
        
        names[0]="JAVA";
        names[1]="SCALA";
        names[2]="PYTHON";
        names[3]="SWIFT";
        names[4]="RUBY";
        
 
        
//        for(int i=0; i<names.length; i++){
//        	System.out.println(names[i].toLowerCase());
//        }
        
//        String tag = "Android Development";
//        
//        for(int i=0; i<tag.length(); i++){
//        	System.out.println(tag.charAt(i));
//        	
//        }
        		
        //printNumbers(5, 12);
        
        //Returns int
//        System.out.println(addNumbers(5,6));
//        
//        //Returns double
//        System.out.println(addNumbers(5.0,6.0));
//        
//        
        
        
//        Person teacher = new Person("Zafar", 45, false);
//
//        
//        
////        teacher.setName("Zafar");
////        teacher.setAge(45);
////        teacher.setFamily(true);
//        
//        System.out.println(teacher.getName());
//        System.out.println(teacher.getAge());
//        System.out.println(teacher.isFamily());
        
        Student dayyan = new Student("A", "12");
        dayyan.setAge(21);
        dayyan.setFamily(false);
        dayyan.setName("DAYYAN");
        
        System.out.println(dayyan);
    }
    
    
    public static void printNumbers(int initial, int limit){
    	  for(int i=initial; i<limit; i++){
          	System.out.println(i+" is the position");
          }
    }
    
    
    public static int addNumbers(int a, int b){
    	
    	int c =0;
    	c=a+b;
    	return c;
    }
    
  public static double addNumbers(double a, double b){
    	
	  	 double c =0;
    	c=a+b;
    	return c;
    }
}
