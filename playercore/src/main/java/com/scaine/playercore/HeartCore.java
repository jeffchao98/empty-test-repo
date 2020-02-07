package com.scaine.playercore;

import com.bumptech.glide.request.RequestOptions;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class HeartCore {

    String defaultJson =
            "{\"user-name\":\"default-name\", \"player-state\":\"inactive\", " +
            "\"player-type\":\"unknown\", \"player-level\":-1}";

    public HeartCore() {

    }

    CoreData getData() {
        RequestOptions requestOptions = new RequestOptions().override(30);
        return new Gson().fromJson(defaultJson, new TypeToken<CoreData>() {
        }.getType());
    }

    public HeartCore(String setupContent) {
        defaultJson = setupContent;
    }

    public String getName() {
        return getData().name;
    }

    public String getState() {
        return getData().state;
    }

    public int getLevel() {
        return getData().level;
    }

    public String getType() {
        return getData().type;
    }
}
