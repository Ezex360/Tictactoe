package tictactoe;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
    	staticFileLocation("/public");
        get("/hello", (req, res) -> "Hello World");
    }
}