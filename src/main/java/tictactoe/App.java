package tictactoe;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
    	staticFileLocation("/public");
        get("/hello", (req, res) -> "Hello World");
        Map map = new HashMap();
        get("/play", (req, res) -> {
            return new MustacheTemplateEngine().render(
                new ModelAndView(map, "play.mustache")
            );
        });
    }
}