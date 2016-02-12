import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.junit.*;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;

public class DashPuzzleTest {
  @Test
  public void dashPuzzle_removesVowels_wordChanges() {
    DashPuzzle testDashPuzzle = new DashPuzzle();
    assertEquals("P-zzl-", testDashPuzzle.dashPuzzle("Puzzle"));
  }
}
