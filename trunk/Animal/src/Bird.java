public class Bird extends Animal {

    public Bird() {
   //This line calls the main constructor of the superclass
    	super();
System.out.println("A new bird has been created!");
    }
    
        public void sleep() {
   System.out.println("A bird sleeps...");
}
    public void eat() {
        System.out.println("A bird eats...");
    }
}
