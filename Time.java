class Time{
    int hour,minute,second;

    Time(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    static Time timeSum(Time t1,Time t2){
        Time ans = new Time(0,0,0);
        int min = 0,ho = 0;
        int sec = t1.second + t2.second;
        if (sec > 60){
            sec -= 60;
            min++;
        }
        min += t1.minute + t2.minute;
        if(min > 60){
            min -= 60;
            ho++;
        }
        ho += t1.hour + t2.hour;
        ans.hour = ho;
        ans.minute = min;
        ans.second = sec;
        return ans;
    }
    void display(){
        System.out.println("\nTime is " + hour+ ":"+minute+":"+second);
    }

    public static void main(String... args) {
        Time t1 = new Time(5,23,49);
        Time t2 = new Time(3,51,12);

        Time t3 = timeSum(t1, t2);
        t1.display();
        t2.display();
        System.out.println("Addition of t1 and t2 : ");
        t3.display();
    }
}