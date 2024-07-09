public class FootBallTeam extends Team{
    
    FootBallTeam(String name, String mascot){
        super(name,mascot);
    }
    
    public String toString(){
        String s = "Our name is " + super.name +"\nWe play Football"+"\nOur football team mascot name is";
        return s;
    }
} 