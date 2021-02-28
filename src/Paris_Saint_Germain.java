import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Paris_Saint_Germain {
    private String club;
    private String country;
    private String was_founded;
    private String tournament;
    private String stage;
    private String stadium;
    private String Manager;
    private LocalDateTime localDateTime;

    public Paris_Saint_Germain(String club, String country, String was_founded, String tournament, String stage, String stadium, String manager, LocalDateTime localDateTime) {
        this.club = club;
        this.country = country;
        this.was_founded = was_founded;
        this.tournament = tournament;
        this.stage = stage;
        this.stadium = stadium;
        this.Manager = manager;
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "Paris_Saint_Germain{" +
                "club='" + club + '\'' +
                ", country='" + country + '\'' +
                ", was_founded='" + was_founded + '\'' +
                ", tournament='" + tournament + '\'' +
                ", stage='" + stage + '\'' +
                ", stadium='" + stadium + '\'' +
                ", Manager='" + Manager + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }

    public String getClub() {
        return club;
    }

    public String getCountry() {
        return country;
    }

    public String getWas_founded() {
        return was_founded;
    }

    public String getTournament() {
        return tournament;
    }

    public String getStage() {
        return stage;
    }

    public String getStadium() {
        return stadium;
    }

    public String getManager() {
        return Manager;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
