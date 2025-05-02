class Time{
    int hour,minute,second;

    Time(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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