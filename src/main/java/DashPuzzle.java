import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;
import java.util.ArrayList;

public class DashPuzzle {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";
    staticFileLocation("/public");

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/puzzleInput.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/puzzleOutput", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/puzzleOutput.vtl");

      String userInput = request.queryParams("sentenceInput");
      String puzzleOutput = dashPuzzle(userInput);

      model.put("puzzleOutput", puzzleOutput);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

    public static String dashPuzzle(String sentence) {
      sentence = sentence.replace('a', '-');
      sentence = sentence.replace('e', '-');
      sentence = sentence.replace('i', '-');
      sentence = sentence.replace('o', '-');
      sentence = sentence.replace('u', '-');
      sentence = sentence.replace('y', '-');
      sentence = sentence.replace('A', '-');
      sentence = sentence.replace('E', '-');
      sentence = sentence.replace('I', '-');
      sentence = sentence.replace('O', '-');
      sentence = sentence.replace('U', '-');
      sentence = sentence.replace('Y', '-');

      return sentence;
    }
  }
