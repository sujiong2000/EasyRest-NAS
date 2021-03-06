package tech.dbgsoftware.easyrest.actors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import tech.dbgsoftware.easyrest.model.ResponseEntity;

public class Signal {

    private static final Gson GSON = new GsonBuilder().create();

    public static final String SUCCESS = "SUCCESS";

    public static final String FAILED = "FAILED";

    public static String getFailedMessage(){
        return GSON.toJson(ResponseEntity.buildFailedResponse());
    }

    public static String getSuccessMessage(){
        return GSON.toJson(ResponseEntity.buildOkResponse());
    }

    public static String getFailedMessage(String message){
        return GSON.toJson(ResponseEntity.buildFailedResponse(message));
    }

    public static String getSuccessMessage(String message){
        return GSON.toJson(ResponseEntity.buildOkResponse(message));
    }

}
