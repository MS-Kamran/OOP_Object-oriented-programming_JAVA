public class Teacher{
    
    public String name;
    public String sub;
    public String co="";
    int a=0;
    
    public Teacher(String name, String sub){
        this.name = name;
        this.sub = sub;
    }
    
    public void addCourse(Course c){
        if (a==0)
        {
            this.co =this.co+c.courseName;
        }
        else
        {
            this.co =this.co+"\n"+c.courseName;
        }
        a++;
    }
    
    public void printDetail(){
        System.out.println("========================");
        System.out.println("Name: "+this.name+"\nDepartment: "+this.sub+"\nList of courses");
        System.out.println("========================");
        System.out.println(this.co);
        System.out.println("========================");
    }
}
