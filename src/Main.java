import java.time.*;
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
        System.out.println( " Манчестер Юнайтед VS ПСЖ," + " Барселона VS Ювентус");

        LinkedList<Манчестер_Юнайтед> clubs = new LinkedList<>();

        clubs.add(new Манчестер_Юнайтед(
                " Манчестер Юнайтед",
                " Англия",
                " 1878",
                " Лига Чемпионов",
                "1/2 финала",
                " Олд Траффорд",
                " Оле Гуннар Сульшер", LocalDateTime.of(1878, Month.NOVEMBER, 1, 2, 18, 24)));

        clubs.forEach(System.out::println);


        LinkedList<Пари_Сен_Жермен> clubs5 = new LinkedList<>();
        clubs5.add(new Пари_Сен_Жермен(
                " Пари_Сен_Жермен",
                " Франция",
                " 1888",
                " Лига Чемпионов",
                "1/2 финала",
                " Парк дэ Пранс",
                " Маурисио Почеттино", LocalDateTime.of(1888, Month.MARCH, 1, 10, 20, 55)));
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println("Id: " + zoneId.getId());
        clubs5.forEach(System.out::println);

        LinkedList<Ювентус> clubs3 = new LinkedList<>();
        clubs3.add(new Ювентус(
                " Ювентус",
                " Италия",
                " 1905",
                " Лига Чемпионов",
                "1/2 финала",
                " Ювентус",
                " Андреа Пирло",
                LocalDateTime.of(1905, Month.SEPTEMBER, 6, 21, 56, 4)));
        clubs3.forEach(System.out::println);



        LinkedList<Барселона> clubs4 = new LinkedList<>();
        clubs4.add(new Барселона(
                " Барселона",
                " Spain",
                " 1899",
                " Лига Чемпионов",
                "1/2 финала",
                " Ноу Камп",
                " Рональд Куман", LocalDateTime.of(1899, Month.AUGUST, 3, 14, 30, 35)));

        clubs4.forEach(System.out::println);

//        LocalDateTime before = LocalDateTime.parse("2021-03-28T12:30:30" + "");
//        LocalDateTime after = LocalDateTime.parse("2017-03-28T12:30:30");
//        System.out.println(after.isAfter(before));
        OffsetDateTime date2 = OffsetDateTime.parse("2021-03-28T12:30:30+01:00");
        System.out.println(date2 + " В это время МЮ Проиграл ПСЖ У себя же Дома Со Счетом 1-2 ");
        System.out.println(" Сульшер - Мы разочарованы Все Этим Результатом, Сделаем Выводы И Отдадим Все силы В Ответном Поединке!");
        System.out.println(" Почеттино - Мы Очень Рады Этой Важной Победе, Но не Стоит Расслабляться," +
                " Впереди Еще Одна Ответная Игра, Случится Может Что Угодно, Но Мы Будем Готовы К Этой Игре ");
        LocalDate ddate2 = LocalDate.parse("2021-04-04");
        System.out.println(" Интервью Перед Завтрашней Игрой - Сульшер --Мы Жаждем Победы " +
                "Можете Быть Уверены, Мы Покажем Яркий Футбол " + ddate2);
        System.out.println(" Интервью Перед Завтрашней Игрой - Почеттино --Мы Готовы И Отдадим Всего Себя На Поле, Чтобы Пройти В Финал" + " adding days: ");
        LocalDate rreturnvalue444 = ddate2.plusDays(1);
        System.out.println(" 5 мая МЮ Делает Камбэк в Парк дэ Пранс Со Счетом 4-2 и Проходит в Финал" + rreturnvalue444);

        OffsetDateTime offsetDT3 = OffsetDateTime.of(2021, 3, 5, 20, 15, 45,
                345875000, ZoneOffset.of("+07:00"));
        System.out.println(offsetDT3 + " Ювентус Одерживает Домашнюю Победу Против Барселоны");
        System.out.println(" Интервью Андреа Пирло После Игры--- Мог бы Забить Больше, Ведь Нам Было Бы Проще Пройти В Финал В Ответной Игре ");
        System.out.println(" Интервью Куман После Игры -- Я удивлен Судейским Решением, Бонуччи Два Раза Сфолил У Себя В Штрафной Зоне" +
                " На Рэмзи, Не Знаю Куда Судья Смотрел!");

        Instant instant6 = Instant.parse("2021-04-05T18:18:30.00Z");
        System.out.println(instant6 + " Барселона Вырывает Победу В Концовке Матча и Проходит В Финал!");

        ZoneId zoneeId = ZoneId.of("Europe/Madrid");
        System.out.println(" Финал Будет Проходить В Мадриде " + zoneeId.getId());

        ZonedDateTime zoneddatetime = ZonedDateTime.parse("2021-04-06T19:21:12.123+05:30[Europe/Madrid]");

        ZonedDateTime finaal = zoneddatetime.minusMinutes(15);
        System.out.println(" 15 Минут Назад Начался Финал! " + finaal);

        LocalTime tonight = LocalTime.of(21, 12, 59, 999999);
        System.out.println(tonight + " Месси Получает Травму на Тренировке Перед Важным Матчем, и Похоже Не Сможет Выйти Сегодня");

        YearMonth interview = YearMonth.of(2021,04);
        System.out.println(interview + " Сульшер перед игрой -- Я Сочувстую Куману и Желаю Ему Всего Самого Наилучшего," +
                " Никогда Не знаешь, Что может Произойти С Твоими Игроками На Тренировках");

        Duration duration2 = Duration.ofHours(8);
        Duration duration3 = Duration.ofMinutes(15);
        Duration duration4 = Duration.ofSeconds(10);
        System.out.println(" Осталось  8 Часов И 15 Минут 10 секунд Перед Игрой: " + duration3 + duration2 + duration4);
        LocalDate startDate = LocalDate.of(2021, 3, 28);
        LocalDate endDate = LocalDate.of(2021, 4, 18);

        Period period = Period.between(startDate, endDate);
        System.out.println(period + " Период Начало 1/2 Финала И Конец Периода" );


        Period twentyOneDays = Period.of(2021, 4, 18);
        System.out.println(" Манчестер Юнайтед Забирает Трофей Лиги Чемпионов  " + twentyOneDays.getYears() + " " + twentyOneDays.getMonths() + " " + twentyOneDays.getDays());   //1

    }
}
