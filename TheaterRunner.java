import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

    LastYear lastYear = new LastYear("These are my adventures, hangouts, and food from 2025!");
    ThisYear thisYear = new ThisYear("Goals for 2026");

    lastYear.drawScene();
    thisYear.drawScene();

    Theater.playScenes(lastYear, thisYear);
  }
}