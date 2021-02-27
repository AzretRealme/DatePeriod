import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Пари_Сен_Жермен {
    private String клуб;
    private String страна;
    private String был_основан;
    private String турнир;
    private String стадия;
    private String стадион;
    private String Менеджер;
    private LocalDateTime localDateTime;

    public Пари_Сен_Жермен(String клуб, String страна, String был_основан, String турнир, String стадия, String стадион, String менеджер, LocalDateTime localDateTime) {
        this.клуб = клуб;
        this.страна = страна;
        this.был_основан = был_основан;
        this.турнир = турнир;
        this.стадия = стадия;
        this.стадион = стадион;
        this.Менеджер = менеджер;
        this.localDateTime = localDateTime;

    }

    public String getКлуб() {
        return клуб;
    }

    public void setКлуб(String клуб) {
        this.клуб = клуб;
    }

    public String getСтрана() {
        return страна;
    }

    public void setСтрана(String страна) {
        this.страна = страна;
    }

    public String getБыл_основан() {
        return был_основан;
    }

    public void setБыл_основан(String был_основан) {
        this.был_основан = был_основан;
    }

    public String getТурнир() {
        return турнир;
    }

    public void setТурнир(String турнир) {
        this.турнир = турнир;
    }

    public String getСтадия() {
        return стадия;
    }

    public void setСтадия(String стадия) {
        this.стадия = стадия;
    }

    public String getСтадион() {
        return стадион;
    }

    public void setСтадион(String стадион) {
        this.стадион = стадион;
    }

    public String getМенеджер() {
        return Менеджер;
    }

    public void setМенеджер(String менеджер) {
        Менеджер = менеджер;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return
                "клуб={'" + клуб + '\'' +
                ", страна='" + страна + '\'' +
                ", был_основан='" + был_основан + '\'' +
                ", турнир='" + турнир + '\'' +
                ", стадион='" + стадион + '\'' +
                ", Менеджер='" + Менеджер + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
