public class Dog extends Animal implements SoundSource{
    
    Dog(String name){
        super(name);
    }
    
    public void makeSound(){
        System.out.println(getName()+" is crying.");
    }
}