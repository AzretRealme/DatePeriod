import java.time.*;
import java.time.temporal.ChronoField;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Первые полуфиналы 1/2 Лиги Чемпионов - 28 апреля, ответные - 5 мая. Финал состоится в Базеле 18 мая");
        System.out.println(" Жеребьевка Начнется Сегодня Вечером в 18:30 По Московскому Времени");

        LocalDate date4 = LocalDate.parse("2021-03-03");
        System.out.println(date4);
        LocalDateTime localDateTime3time = date4.atTime(18,30,30,500);
        LocalDateTime date1 = date4.atTime(LocalTime.from(localDateTime3time));
        System.out.println(date1 + ". В Процессе Жеребьевки Мы Выяснили, Кто С Кем Будет Играть --: ");
        System.out.println( " Манчестер Юнайтед VS ПСЖ," + " Barcelona VS Juventus");

        LinkedList<ManchesterUnited> clubs = new LinkedList<>();

        clubs.add(new ManchesterUnited(
                " Манчестер Юнайтед",
                " Англия",
                " 1878",
                " Лига Чемпионов",
                "1/2 финала",
                " Олд Траффорд",
                " Оле Гуннар Сульшер", LocalDateTime.of(1878, Month.NOVEMBER, 1, 2, 18, 24)));

        clubs.forEach(System.out::println);


        LinkedList<ParisSaintGermain> clubs5 = new LinkedList<>();
        clubs5.add(new ParisSaintGermain(
                " ParisSaintGermain",
                " Франция",
                " 1888",
                " Лига Чемпионов",
                "1/2 финала",
                " Парк дэ Пранс",
                " Маурисио Почеттино", LocalDateTime.of(1888, Month.MARCH, 1, 10, 20, 55)));
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println("Id: " + zoneId.getId());
        clubs5.forEach(System.out::println);

        LinkedList<Juventus> clubs3 = new LinkedList<>();
        clubs3.add(new Juventus(
                " Juventus",
                " Италия",
                " 1905",
                " Лига Чемпионов",
                "1/2 финала",
                " Juventus",
                " Андреа Пирло",
                LocalDateTime.of(1905, Month.SEPTEMBER, 6, 21, 56, 4)));
        clubs3.forEach(System.out::println);



        LinkedList<Barcelona> clubs4 = new LinkedList<>();
        clubs4.add(new Barcelona(
                " Barcelona",
                " Spain",
                " 1899",
                " Лига Чемпионов",
                "1/2 финала",
                " Ноу Камп",
                " Рональд Куман", LocalDateTime.of(1899, Month.AUGUST, 3, 14, 30, 35)));

        clubs4.forEach(System.out::println);


        OffsetDateTime date2 = OffsetDateTime.parse("2021-03-28T12:30:30+01:00");
        System.out.println(date2 + " В это время МЮ Проиграл ПСЖ У себя же Дома Со Счетом 1-2 ");
        int minute = date2.getMinute();
        System.out.println("Minute: " + minute + ", Сульшер - Мы разочарованы Все Этим Результатом, Сделаем Выводы И Отдадим Все силы В Ответном Поединке!");
        int nano = date2.getNano();
        System.out.println("nano: " + nano + ", Почеттино - Мы Очень Рады Этой Важной Победе, Но не Стоит Расслабляться," +
                " Впереди Еще Одна Ответная Игра, Случится Может Что Угодно, Но Мы Будем Готовы К Этой Игре ");
        LocalDate dDate2 = LocalDate.parse("2021-04-04");
        System.out.println("localDate " + dDate2 + ", Интервью Перед Завтрашней Игрой - Сульшер --Мы Жаждем Победы " +
                "Можете Быть Уверены, Мы Покажем Яркий Футбол ");
        System.out.println("localDate " + dDate2 +  ", Интервью Перед Завтрашней Игрой - Почеттино --Мы Готовы И Отдадим Всего Себя На Поле, Чтобы Пройти В Финал" + " adding days: ");
        LocalDate rreturnValue444 = dDate2.plusDays(1);
        System.out.println(" plusDays: " + rreturnValue444 + ", 5 мая МЮ Делает Камбэк в Парк дэ Пранс Со Счетом 4-2 и Проходит в Финал");

        LocalDateTime d = LocalDateTime.of(2021, Month.MAY, 04,
                15, 10, 45);
        LocalDateTime d2 = d.minusDays(50);
        System.out.println(d2);
        d2 = d.minusDays(-50);
        System.out.println("minusDays: " + d2 + " 50 дней назад МЮ выиграл Кубок АПЛ!");

        LocalDateTime date = LocalDateTime.parse("2019-03-28T12:30:30");
        System.out.println("minusYears: " + date.minusYears(2) + ", 2 года назад МЮ выиграл Кубок АПЛ и Кубок ЛЧ");

        LocalDateTime uDate = LocalDateTime.parse("2020-03-28T12:30:30");
        System.out.println("plusYears: " + uDate.plusYears(1) + ", Cпустя год, МЮ взял еще один кубок АПЛ! ");

        OffsetDateTime offSetDT3 = OffsetDateTime.of(2021, 3, 5, 20, 15, 45,
                345875000, ZoneOffset.of("+07:00"));
        System.out.println("offsetDT3: " + offSetDT3 + ", Juventus Одерживает Домашнюю Победу Против Барселоны");

        int dayOfMonth = offSetDT3.getDayOfMonth();
        System.out.println("dayOfTheMonth: " + dayOfMonth + ", Интервью Андреа Пирло После Игры--- Мог бы Забить Больше, Ведь Нам Было Бы Проще Пройти В Финал В Ответной Игре ");

        int dayOfYear = offSetDT3.getDayOfYear();
        System.out.println("dayOfYear: " + dayOfYear + ", Интервью Куман После Игры -- Я удивлен Судейским Решением, Бонуччи Два Раза Сфолил У Себя В Штрафной Зоне" +
                " На Рэмзи, Не Знаю Куда Судья Смотрел!");

        Instant instant5 = Instant.parse("2021-04-05T17:18:30.00Z");
        Instant instant6 = Instant.parse("2021-04-05T18:18:30.00Z");
        System.out.println("instant " + instant5 + ", Все готовятся к игре");
        System.out.println("instant " + instant6 + ", Barcelona Вырывает Победу В Концовке Матча и Проходит В Финал!");

        boolean value = instant5.isAfter(instant6);
        System.out.println("isAfter " + value + ", Интервью Кумана после игры -- Просто нет слов! ");

        Instant instant4 = Instant.parse("2021-04-05T18:45:45.00Z");
        boolean mili = instant4.isSupported(ChronoField.MILLI_OF_SECOND);
        System.out.println("MiliSecond Field is supported: " + mili + ", Интервью Андреа Пирло -- Не хочется даже разговаривать, Судья снова умудрился показаться идиотом!");

        Instant instant7 = Instant.parse("2021-04-06T21:21:21.00Z");
        System.out.println("Range : " + instant7.range(ChronoField.NANO_OF_SECOND ) + ", Осталось два 1500 билетов на финальный матч!");

        Instant instant9 = Instant.parse("2021-04-06T21:21:21.00Z");
        System.out.println("Instant: " + instant9.toString() + ", Успейте купить, осталось 200 билетов!");
        // addition of 84000 seconds to this instant
        Instant returnedValue = instant9.plusSeconds(84000);
        // print result Instant using toString()
        System.out.println("Returned Instant: " + returnedValue.toString() + ", Все билеты распроданы! ");

        ZoneId zoneeId = ZoneId.of("Europe/Madrid");
        System.out.println(" Финал Будет Проходить В Мадриде " + zoneeId.getId());

        ZonedDateTime zonedDdateTime = ZonedDateTime.parse("2021-04-18T19:21:12.123+05:30[Europe/Madrid]");
        ZonedDateTime finaal = zonedDdateTime.minusMinutes(15);
        System.out.println(" 15 Минут назад нам сообщили, что все билеты распроданы! " + finaal);

        ZonedDateTime zonedDdateTime6 = ZonedDateTime.parse("2021-04-18T19:21:22.123+05:30[Europe/Madrid]");
        int zzzone = zonedDdateTime6.getDayOfMonth();
        System.out.println("day-of-month:" + zzzone + ", Сегодня все мы в предвкушении финального поединка! ");

        ZonedDateTime zoned2DateTime = ZonedDateTime.parse("2018-12-06T16:16:12.123+05:30[Asia/Calcutta]");
        DayOfWeek week = zoned2DateTime.getDayOfWeek();
        System.out.println("day-of-week:" + week + ", У нас в Азии/Calcutta  время - 16:16:12, тоже ждем матча! ");

        ZonedDateTime year = ZonedDateTime.parse("2018-12-06T16:16:12.123+05:30[Asia/Calcutta]");
        int yearr = year.getYear();
        System.out.println("getYear: " + yearr + ", У нас в Азии в Шанхае  время - 17:16:12, тоже ждем матча! ");

        LocalTime tonight = LocalTime.of(21, 12, 59, 999999);
        System.out.println(tonight + " Месси Получает Травму на Тренировке Перед Важным Матчем, и Похоже Не Сможет Выйти Сегодня");

        YearMonth interview = YearMonth.of(2021,4);
        System.out.println(interview + " Сульшер перед игрой -- Я Сочувстую Куману и Желаю Ему Всего Самого Наилучшего," +
                " Никогда Не знаешь, Что может Произойти С Твоими Игроками На Тренировках");

        YearMonth da1te = YearMonth.of(2021,4);
        LocalDate date32 = da1te.atEndOfMonth();
        System.out.println("EndOfMonth: " + date32 + " Время приближается все ближе и ближе!");

        YearMonth thisYearMonth = YearMonth.of(2021, 4);
        System.out.println("YearMonth :" + thisYearMonth);
        boolean supported = thisYearMonth.isSupported(ChronoField.PROLEPTIC_MONTH);
        System.out.println("PROLEPTIC_MONTH Field is supported by YearMonth class: " + supported + ", Куман о травме Месси во время тренировки --" + " -Я опустошен! Но мы продолжим верить и биться!");

        YearMonth aDate = YearMonth.of(2021,4);
        System.out.println("lengthOfMonth: " + aDate.lengthOfMonth() + " Де Йонг о травме Месси-- " + "-- Все мы были немного огорчены таким событием, ведь он наш ключевой игрок");

        YearMonth yearMonth = YearMonth.parse("2021-04");
        YearMonth result = yearMonth.minusMonths(1);
        System.out.println("Modified YearMonth: " + result + ", Мед Персонал о травме Месии--" + " -- Мы были очень расстроены этой ситуацией, ведь Месяц назад с ним все было хорошо.... ");

        Duration duration2 = Duration.ofHours(8);
        Duration duration3 = Duration.ofMinutes(15);
        Duration duration4 = Duration.ofSeconds(10);
        System.out.println("ofHours: " + duration2 + ", Осталось  8 Часов И 15 Минут 10 секунд Перед Игрой: ");
        System.out.println("ofMinutes: " + duration3);
        System.out.println("ofSeconds: " + duration4);
        System.out.println("getNano: " + duration2.getNano() );
        System.out.println("getNano: " + duration3.getNano() );
        System.out.println("getNano: " + duration4.getNano() );
        System.out.println("getUnits: " + duration4.getUnits());

        long noOfHours = 4;
        Duration duraation = Duration.ofHours(noOfHours);
        System.out.println("ofHours: " + duraation.getSeconds() + " До матча осталось 4 часа!");

        Duration duraaation = Duration.ofMinutes(22);
        System.out.println("ofMinutes: "+ duraaation.getSeconds() +  "  И 22 минуты!");

        Duration duratio2n = Duration.parse("P2DT3H4M");
        System.out.println(duratio2n.toString() + ", По статистике обе команды не проигрывали все матчи!");

        LocalDate startDate = LocalDate.of(2021, 3, 28);
        LocalDate endDate = LocalDate.of(2021, 4, 18);
        Period period = Period.between(startDate, endDate);
        System.out.println(period + " Период Начало 1/2 Финала И Конец Периода" );

        int yeeear = 2021;
        int months = 4;
        int days = 18;
        Period peri1od = Period.of(yeeear, months, days);
        System.out.println(peri1od.getDays() + ",  Матч Начался!");

        int numberOfWeeks = 5;
        Period p = Period.ofWeeks(numberOfWeeks);
        System.out.println(p.getYears() + " Years" + p.getMonths() + " Months" + p.getDays() + " Days" +
                " Опасный МОменТ! Де Йонг попадает в каркас ворота!");

        String string = "P21Y4M18D";
        Period p2 = Period.parse(string);
        System.out.println(p2.getYears() + " Years" + p2.getMonths() + " Months" + p2.getDays() + " Days" +
                " ГОЛ! 1-0 Рашфорд отправляет мяч со штрафного в верхний праый угол!  ");


        int yearrs = 4;
        int monthss = 11;
        int dayss = 10;
        Period p1 = Period.of(yearrs, monthss, dayss);

        int daysToAdd = 8;
        addDays(p1, daysToAdd);

        Period twentyOneDays = Period.of(2021, 4, 18);
        System.out.println(" Манчестер Юнайтед Забирает Трофей Лиги Чемпионов  " + twentyOneDays.getYears() + " " + twentyOneDays.getMonths() + " " + twentyOneDays.getDays());   //1

    }
    static void addDays(Period p1, int daysToAdd)
    {

        System.out.println(p1.plusDays(daysToAdd));
    }

}
