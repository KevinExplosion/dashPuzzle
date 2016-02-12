import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;
import java.util.ArrayList;

public class DashPuzzle {
  public static void main(String[] args) {
    // String layout = "templates/layout.vtl";
    // staticFileLocation("/public");
  }

    public static String dashPuzzle(String sentence) {
      sentence = sentence.replace('a', '-');

      return sentence;
    }
  }
