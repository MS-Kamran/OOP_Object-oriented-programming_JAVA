public class studentinfo{
    public static void main (String []args){
        student s1 = new student ("Jhon","1102","Banasree",4.00);
        System.out.println(s1);
        System.out.println(s1.getName());
        System.out.println(s1.getID());
        System.out.println(s1.getAddress());
        System.out.println(s1.getCGPA());
        
        System.out.println("\n");
        
        student s2 = new student ("Mike","1103","Banani",3.50);
        System.out.println(s2);
        System.out.println(s2.getName());
        System.out.println(s2.getID());
        System.out.println(s2.getAddress());
        System.out.println(s2.getCGPA());
        
        System.out.println("\n");
        
        student s3 = new student ("Carol","1104","Gulshan",3.25);
        System.out.println(s3);
        System.out.println(s3.getName());
        System.out.println(s3.getID());
        System.out.println(s3.getAddress());
        System.out.println(s3.getCGPA());
    }
}