package demo8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);
        LocalDate ld2 = ld1.plusDays(2);
        System.out.println(ld2);
        LocalDate ld3 = ld1.plusYears(4);
        System.out.println(ld3);
        LocalDate ld4 = ld1.minusDays(5);
        System.out.println(ld4);

        String bth = "2004-03-16";
        LocalDate ld5 = LocalDate.parse(bth);
        System.out.println(ld5.getDayOfWeek());
        LocalDate ld6 = LocalDate.of(2004,05,15);
        System.out.println(ld6);
        LocalDateTime lt1 = LocalDateTime.now();
        System.out.println(lt1);
        LocalDateTime lt2 = lt1.plusMinutes(5);
        System.out.println(lt2);

    }
}
