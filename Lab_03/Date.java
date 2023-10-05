package Lab_03;

public class Date {
    private int day;
    private int month;
    private int year;

    Date(int day, int month, int year){
     this.day=day;
     this.month=month;
     this.year=year;
 }

    public void setDay() {
        this.day=day;

    }
    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {

        return month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        String D=String.format("%d/%d/%d",day,month,year);
        return D;
    }

}
