package model;

import util.database.DataModel;

public class GameInfo extends DataModel {
    public long id;
    public String name = "";
    public String ver;
    public int contentversion;
    public String lastUpdate;
    public String pId = "";
    public String des = "";
    public String publisher = "";
    public String type = "";
    public String category = "";
    public String icon_large = "";
    public String icon_medium = "";
    public String icon_small = "";
    public String apk = "";
    public double size;
    public String[] screenshot = new String[0];

    public GameInfo() {
        super();
    }

    public void printValues() {
        System.out.printf("id=%s|name=%s|ver=%s|ctnver=%s|lastUpdate=%s|pId=%s|des=%s|publisher=%s|type=%s|category=%s|icon_large=%s|icon_medium=%s|icon_small=%s|apk=%s|size=%s\n", new Object[] {
                          id, name, ver, contentversion, lastUpdate, pId, des, publisher, type, category, icon_large,
                          icon_medium, icon_small, apk, size
        });
    }

    public String toString() {
        return String.format("id=%s|name=%s|ver=%s|ctnver=%s|lastUpdate=%s|pId=%s|des=%s|publisher=%s|type=%s|category=%s|icon_large=%s|icon_medium=%s|icon_small=%s|apk=%s|size=%s\n", new Object[] {
                             id, name, ver, contentversion, lastUpdate, pId, des, publisher, type, category, icon_large,
                             icon_medium, icon_small, apk, size
    });
    }
}
