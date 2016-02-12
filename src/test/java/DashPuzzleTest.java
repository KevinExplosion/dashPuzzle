import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.junit.*;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;

public class DashPuzzleTest extends FluentTest{
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void dashPuzzle_removesVowels_sentenceChanges() {
    DashPuzzle testDashPuzzle = new DashPuzzle();
    assertEquals("P-zzl-", testDashPuzzle.dashPuzzle("Puzzle"));
  }

  @Test
  public void dashPuzzle_removesCapitalVowels_sentenceChanges() {
    DashPuzzle testDashPuzzle = new DashPuzzle();
    assertEquals("--lp", testDashPuzzle.dashPuzzle("Yelp"));
  }

  @Test
  public void dashPuzzle_removesVowelsFromEntireSentence_sentenceChanges() {
    DashPuzzle testDashPuzzle = new DashPuzzle();
    assertEquals("Th- m-v-- t-tl- -s ---ng G-ns", testDashPuzzle.dashPuzzle("The movie title is Young Guns"));
  }

  @Test
  public void rootTest() {
      goTo("http://localhost:4567");
      assertThat(pageSource()).contains("The Dash Puzzle!");
  }

  @Test
 public void formTest() {
     goTo("http://localhost:4567/puzzleOutput.vtl");
     find("#player1Rock").click();
     find("#player2Rock").click();
     submit("#submitChoice");
     assertThat(pageSource()).contains("It's a tie!");
 }
}
