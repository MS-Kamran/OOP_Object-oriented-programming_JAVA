public class Clock{
    private int hour, minute, second;
    
    Clock(){
        hour=12; minute=0; second=0;
    }
    
    Clock(int h, int m, int s){
        if(h>=0 && h<24)
            hour=h; 
        if(m>=0 && m<60)
            minute=m; 
        if(s>=0 && s<60)
            second=s;
    }
    
    Clock(int s){
        hour=s/3600;
        s=s%3600;
        minute=s/60;
        second=s%60;
    }
    
    void setClock(int s){
        hour=s/3600;
        s=s%3600;
        minute=s/60;
        second=s%60;
    }
    
    int getHours(){
        return hour;
    }
    
    int getMinutes(){
        return minute;
    }
    
    int getSeconds(){
        return second;
    }
    
    void setHours(int h){
        this.hour=h;
    }
    
    void tick(){
        second++;
        if(second==60){
            minute++;
            second=0;
        }
        if(minute==60){
            minute=0;
            hour++;
        }
        if(hour>23)
            hour=0;
    }
    
    void tickdown(){
        second--;
        if(second<0){
            minute--;
            second=59;
        }
        if(minute<0){
            minute=59;
            hour--;
        }
        if(hour<0)
            hour=23;
    }
    
    public String toString() {
        return hour+":"+minute+":"+second;
    }
}