import org.code.theater.*;
import org.code.media.*;

public class LastYear extends Scene {

  private String text;
  private String[] memories = {"quince.jpg","friends.jpg","camp.jpg"};
  private String[] foods = {"foodcsa.jpg","pastacsa.jpg","tacoscsa.jpg","wingscsa.jpg"};

  public LastYear() {
    text = "These are my adventures, hangouts, and food from 2025!";
  }

  public LastYear(String text) {
    this.text = text;
  }

  /**
   * Draws the full LastYear scene.
   
   */
  public void drawScene() {
    drawBanner(200, 22);

    for (int i = 0; i < memories.length; i++) {
      clear("white");
      drawImage(memories[i], 50, 50, 300, 300, 5);
      pause(1);
    }

    for (int i = 0; i < foods.length; i++) {
      clear("white");
      drawImage(foods[i], 50, 50, 300, 300, -5);
      pause(1);
    }
  }

  /**
   * Draws  banner text across the screen.
   */
  public void drawBanner(int yPos, int textSize) {
    setTextHeight(textSize);
    setTextColor("white");

    int xPos = 400; // start off screen to the right

    while (xPos > -600) {  // scroll until fully off screen
      clear("white");
      drawImage("Petco-park.jpg", 50, 50, 300, 300, 0);
      drawText(text, xPos, yPos);
      pause(0.1);
      xPos -= 10;
    }
  }
}
