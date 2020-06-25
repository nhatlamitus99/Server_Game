package model;

import java.util.HashMap;

import util.database.DataModel;

public class UserGame extends DataModel {
    public HashMap<Long, Long> listPlayedGame;
    public long lastPlayedGame;

    public UserGame() {
        super();
        listPlayedGame = new HashMap<Long, Long>();
    }
}
