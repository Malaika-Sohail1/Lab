package Lab_2;

public class Date {
    private int day;
    private int month;

    private int year;

    Date(int date, int month, int year){
        this.day=date;
        this.month=month;
        this.year=year;
    }
    public int getDay(){
        return day;
    }
    public void setDay(){
        this.day=day;
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

    public void setMonth(int month) {
        this.month = month;
    }
    public String toString(){
        return String.format("%d/%d/%d",day,month,year);
    }

    public Date isRecent(Date d1, Date d2){
        return d1.getMonth()>d2.getMonth()?d1:d2;
        }
}
