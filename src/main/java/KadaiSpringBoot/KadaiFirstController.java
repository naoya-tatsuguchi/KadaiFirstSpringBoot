package KadaiSpringBoot;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

     @GetMapping("dayofweek/{val}")
    public String dispDayOfWeek(@PathVariable int val) {
         String Val = Integer.toString(val);
         String y = Val.substring(0,4);
         String m = Val.substring(4,6);
         String d = Val.substring(6,8);

         int Y = Integer.parseInt(y);
         int M = Integer.parseInt(m);
         int D = Integer.parseInt(d);

         Calendar Cl = Calendar.getInstance();
         Cl.set(Calendar.YEAR, Y);
         Cl.set(Calendar.MONTH, M-1);
         Cl.set(Calendar.DATE, D);
         int week = Cl.get(Calendar.DAY_OF_WEEK);
         String result = Integer.toString(week);
         switch(week) {
         case(Calendar.MONDAY):
             result = "Monday";
             break;
         case(Calendar.TUESDAY):
             result = "Tuesday";
             break;
         case(Calendar.WEDNESDAY):
             result = "Wednesday";
             break;
         case(Calendar.THURSDAY):
             result = "Thursday";
             break;
         case(Calendar.FRIDAY):
             result = "Friday";
             break;
         case(Calendar.SATURDAY):
             result = "Saturday";
             break;
         case(Calendar.SUNDAY):
             result = "Sunday";
             break;
         }
         return result;
     }

     @GetMapping("/plus/{val1}/{val2}")
     public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
         int plus = 0;
         plus = val1 + val2;
         String Plus = Integer.toString(plus);
         return Plus;
     }

     @GetMapping("/minus/{val1}/{val2}")
     public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
         int minus = 0;
         minus = val1 - val2;
         String Minus = Integer.toString(minus);
        return Minus;
     }

     @GetMapping("/times/{val1}/{val2}")
     public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
         int times = 0;
         times = val1 * val2;
         String Times = Integer.toString(times);
         return Times;
     }

     @GetMapping("/divide/{val1}/{val2}")
     public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
         int divide = 0;
         divide = val1 / val2;
         String Divide = Integer.toString(divide);
         return Divide;
     }
}
