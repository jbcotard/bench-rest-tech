package fr.jbc.exemple.rest.mysimplerestbysparkjava;

import java.io.IOException;

import static spark.Spark.*;

/**
 * Created by jbcotard on 17/06/2017.
 */
public class Main {

    public static int counter;

    public static void main(String[] args) throws IOException {

        counter = 0;

        port(9997); // Spark will run on port 9997

        get("/", (req, res) ->
                "{counter: " + ++counter + ", thread: " + Thread.currentThread().getName() + "})");

    }


}
