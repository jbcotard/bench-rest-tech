package fr.jbc.exemple.rest.mysimplerestbyvertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.json.Json;

/**
 * Created by jbcotard on 17/06/2017.
 */
public class MyFirstVerticle extends AbstractVerticle {


    static int counter;

    @Override
    public void start() {

        //Thread.currentThread().getName())
         counter = 0;
        //Json.encodePrettily("{counter: " + ++counter + ", thread: " + Thread.currentThread().getName() + "}");
        vertx
                .createHttpServer()
                .requestHandler(r -> {
                    r.response().end(Json.encodePrettily("{counter: " + ++counter + ", thread: " + Thread.currentThread().getName() + "}"));
                })
                .listen(9998);
    }
}
