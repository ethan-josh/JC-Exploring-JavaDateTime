# Name: Ethan Joshua Camingao
## Exploring Java StringBuilder

---

### Exercise 1: append() - Appending Content

**Code to run:**
```
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeLab {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2025, 8, 21);
        
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy", Locale.ENGLISH);

        System.out.println("Default format: " + today);
        System.out.println("Custom format 1: " + today.format(dtf1));
        System.out.println("Custom format 2: " + today.format(dtf2));
    }
}
```
**Predicted Output:**
```
Default format: 2025-08-21
Custom format 1: 21/08/2025
Custom format 2: Thursday, August 21, 2025
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-JavaDateTime/blob/main/images/Ex1.png"/>

**Explanation:**

LocalDate.of(2025, 8, 21) creates a LocalDate object. Its default toString() format is YYYY-MM-DD.

DateTimeFormatter.ofPattern(...) creates a formatter using a specific pattern. dd is the day of the month, MM is the month number, and yyyy is the year.

The second formatter uses EEEE for the full day of the week and MMMM for the full month name. Providing a Locale ensures the names (like "Thursday" and "August") are in the correct language.

---

### Exercise 2: LocalTime and DateTimeFormatter

**Code to run:**
```
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeLab {
    public static void main(String[] args) {
        LocalTime now = LocalTime.of(16, 45, 30);
        
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        System.out.println("Default format: " + now);
        System.out.println("24-hour format: " + now.format(dtf1));
        System.out.println("12-hour format with AM/PM: " + now.format(dtf2));
    }
}
```
**Predicted Output:**
```
Default format: 16:45:30
24-hour format: 16:45:30
12-hour format with AM/PM: 4:45:30 PM
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-JavaDateTime/blob/main/images/Ex2.png"/>

**Explanation:**

HH represents the hour in 24-hour format (00-23).

hh represents the hour in 12-hour format (01-12).

mm is minutes, and ss is seconds.

a is the AM/PM marker.

The default format includes nanoseconds if they are present.

---

### Exercise 3: LocalDateTime and DateTimeFormatter

**Code to run:**
```
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeLab {
    public static void main(String[] args) {
        LocalDateTime event = LocalDateTime.of(2025, 11, 27, 19, 0, 0);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' hh:mm a");

        System.out.println("Default format: " + event);
        System.out.println("Custom format: " + event.format(dtf));
    }
}
```
**Predicted Output:**
```
Default format: 2025/11/27 19:00:00
Custom format: NOV 27, 2025 at 07:00 PM
```

**Actual Output:**

<img src="https://github.com/ethan-josh/JC-Exploring-JavaDateTime/blob/main/images/Ex3.png"/>

**Note:**

Mistakes on the Default format, missing T and use -: `2025-11-27T19:00`

Mistake on the Custom format, MMM gives abbreviated name but not in uppercase: `Nov 27, 2025 at 07:00 PM`

**Explanation:**

The formatter combines patterns for both date and time. MMM gives the abbreviated month name (e.g., "Nov"). You can also include literal text in the pattern by enclosing it in single quotes, like 'at'. The default format for LocalDateTime separates the date and time with a T.