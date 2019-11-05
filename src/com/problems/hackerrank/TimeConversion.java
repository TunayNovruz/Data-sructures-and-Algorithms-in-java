package com.problems.hackerrank;

public class TimeConversion {

    public static void main(String[] args) {

        String time = "01:23:45AM";
        String result = timeConversion(time);
        System.out.println(result);
    }

    private static String timeConversion(String s) {
        String begin = s.substring(0,2);
        int hour = Integer.parseInt(begin);
        String dayPart = s.substring(s.length()-2);
        String newHour = hour+"";

        if(dayPart.equals("PM") &&  hour != 12){
            newHour = (hour+12)+"";
        }
        else if(dayPart.equals("AM") &&  hour == 12){
            newHour = "00";
        }else if(hour < 10){
            newHour = "0"+newHour;
        }

        String result = s.replace(begin,newHour+"");
        result = result.replace( dayPart,"");
        return result;
    }
}
