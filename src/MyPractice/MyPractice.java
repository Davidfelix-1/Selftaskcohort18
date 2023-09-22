package MyPractice;

public class MyPractice {
    public static void printDate(String day, String month,int date,int year ){
        System.out.println(day+","+month+","+ date+ ","+year);
    }
    public static void printDate2(int date, String day,String month, int year){
        System.out.println(date+","+day+","+month+","+year);
    }
    public static void printEuropeanDate(String day,int date,String month, int year){
        System.out.println( day+","+date+","+month+","+year);
    }

    public static void main(String[] args) {
        String day= "thursday";
        String month="march";
        int date = 24;
        int year = 2023;

        printDate(   day , month , date   , year);
        printDate2(  date , day , month   , year);
        printEuropeanDate("European_date:  " +  day , date , month ,year);
    }


}
