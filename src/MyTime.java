/**
 * Created by Степан on 11.03.2015.
 */
public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second) {
        if (hour>=0 && hour<=23){
            this.hour = hour;
        }
        else {
            throw new IllegalArgumentException("invalid hour!");
        }
        if (minute>=0 && minute<=59){
            this.minute = minute;
        }
        else {
            throw new IllegalArgumentException("invalid minute!");
        }
        if (second>=0 && second<=59){
            this.second = second;
        }
        else {
            throw new IllegalArgumentException("invalid second!");
        }
    }
    public void setTime(int hour, int minute, int second) {
        if (hour>=0 && hour<=23){
            this.hour = hour;
        }
        else {
            throw new IllegalArgumentException("invalid hour!");
        }
        if (minute>=0 && minute<=59){
            this.minute = minute;
        }
        else {
            throw new IllegalArgumentException("invalid minute!");
        }
        if (second>=0 && second<=59){
            this.second = second;
        }
        else {
            throw new IllegalArgumentException("invalid second!");
        }
    }

    public void setHour(int hour) {
      if (hour>=0 && hour<=23){
          this.hour = hour;
      }
        else {
          throw new IllegalArgumentException("invalid hour!");
      }
    }

    public void setMinute(int minute) {
        if (minute>=0 && minute<=59){
            this.minute = minute;
        }
        else {
            throw new IllegalArgumentException("invalid minute!");
        }

    }

    public void setSecond(int second) {
        if (second>=0 && second<=59){
            this.second = second;
        }
        else {
            throw new IllegalArgumentException("invalid second!");
        }

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    public MyTime nextSecond() {
        int second=this.second;
        MyTime time = new MyTime(this.hour, this.minute, this.second);
        if (this.second == 59) {
            time=time.nextMinute();
            time.setSecond(0);

        } else{
            second++;
           time = new MyTime(hour, minute, second);
        }

        return time;
    }

    public MyTime nextMinute() {
        int minute=this.minute;
        MyTime time = new MyTime(this.hour, this.minute, this.second);
        if (this.minute == 59) {
            time=time.nextHour();
            time.setMinute(0);
        } else{
            minute++;
            time = new MyTime(hour, minute, second);
        }

        return time;
    }

    public MyTime nextHour() {
        int hour=this.hour;
        MyTime time = new MyTime(this.hour, this.minute, this.second);
        if (this.hour == 23) {
          time.setHour(0);
        } else{
            hour++;
            time = new MyTime(hour, minute, second);
        }

        return time;

    }

    public MyTime previousSecond() {
        int second=this.second;
        MyTime time = new MyTime(this.hour, this.minute, this.second);
        if (this.second == 0) {
            time=time.previousMinute();
            time.setSecond(59);

        } else{
            second--;
            time = new MyTime(hour, minute, second);
        }

        return time;

    }
   public MyTime previousMinute() {
       int minute=this.minute;
       MyTime time = new MyTime(this.hour, this.minute, this.second);
       if (this.minute == 0) {
           time=time.previousHour();
           time.setMinute(59);

       } else{
           minute--;
           time = new MyTime(hour, minute, second);
       }

       return time;


   }
   public MyTime previousHour() {
       int hour=this.hour;
       MyTime time = new MyTime(this.hour, this.minute, this.second);
       if (this.hour == 0) {
           time.setHour(23);

       } else{
           hour--;
           time = new MyTime(hour, minute, second);
       }

       return time;



   }

}
