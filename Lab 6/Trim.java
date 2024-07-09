public class Trim{
    
    public static char [] trim(char [] input){
        char [] output = new char[input.length];
        
        for(int i=0,j=0; i<input.length ; i++){
            if (input[i] != ' ')
            {
                output[j++] = input[i];
            }
            else
            {
                if (input[i-1] != ' ')
                {
                    output[j++] = input[i];
                }
            }
        }
        return output ;
    }
    
    public static void main(String [] args){
        
        char [] input = {'T','h','i','s',' ',' ',' ',' ',' ','i','s',' ',' ',' ',' ','a',' ',' ',' ',' ','t','e','s','t','.'};
        
        for (int i = 0; i< input.length; i++){
            System.out.print(input[i]);
        }
        System.out.println("");
        
        char []  output = trim(input);
        
        for (int i = 0; i< output.length; i++){
            System.out.print(output[i]);
        }
        System.out.println("");    
    }
}
