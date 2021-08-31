package com.algorithm;

import java.util.Scanner;

/**
 * Day of Week from given date: day,month,year
 */
public class Calendar {
    static void dayOfWeek(int year,int month, int day){
        int y0=year-(14-month)/12;
        int x=year*(1+ 1/4 -1/100 +1/400);
        int m0=month+12*((14-month)/12)-2;
        int d0=(day+x+31*m0/12)%7;
        switch (d0){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
    }
    public static void main(String[] args){
        int day,month,year;
        Scanner sc =new Scanner(System.in);
        System.out.println("Give valid date: year, month and day");
        year= sc.nextInt();
        month= sc.nextInt();
        day= sc.nextInt();
        if(year>999 && (month>0 && month<13) && (day>0 && day<32)){
            dayOfWeek(year,month,day);
        }else{
            System.out.println("Invalid date");
        }
    }
}
