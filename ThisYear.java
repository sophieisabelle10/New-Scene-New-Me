import org.code.theater.*;
import org.code.media.*;

public class ThisYear extends Scene {

  private String title;

  public ThisYear() {
    title = "Goals for 2026";
  }

  public ThisYear(String title) {
    this.title = title;
  }

  /**
   *  ThisYear scene.
   */
  public void drawScene() {
    drawIntroScene();

    if (getGoalCount() > 2) {
      drawText("Big year ahead!", 20, 250);
    }

    pause(3);

    for (int angle = 0; angle <= 30; angle += 10) {
      clear("white");
      drawImage("cheer.JPG", 50, 50, 300, 300, angle);
      pause(0.2);
    }

    clear("white");
    drawImage("good-grades.jpg", 50, 50, 300, 300, 10);
    pause(2);

    clear("white");
    drawImage("outside-adventure.jpg", 50, 50, 300, 300, -10);
    pause(2);

    drawEndScreen();
  }

  /**
   *  intro goal list.
   */
  public void drawIntroScene() {
    setTitleScreenStyle();
    clear("white");
    drawText(title, 20, 50);
    drawText("* cheer", 20, 100);
    drawText("* good grades", 20, 150);
    drawText("* outside adventures", 20, 200);
  }

  /**
   *  number of goals.
   */
  public int getGoalCount() {
    return 3;
  }

  public void setTitleScreenStyle() {
    setTextHeight(35);
    setTextColor("purple");
    setTextStyle(Font.SANS, FontStyle.ITALIC);
  }

  public void drawEndScreen() {
    setEndScreenStyle();
    clear("white");
    drawText("That's a Wrap!", 90, 120);
  }

  public void setEndScreenStyle() {
    setTextHeight(35);
    setTextColor("purple");
    setTextStyle(Font.MONO, FontStyle.BOLD_ITALIC);
  }
}
