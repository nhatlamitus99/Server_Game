package model;

import bitzero.util.common.business.Debug;

import org.apache.commons.lang.exception.ExceptionUtils;

import util.database.DataHandler;

public class MapSocialId {
    private static String SEPERATOR = "_";

    public MapSocialId() {
        super();
    }

    public static void putMap(String _accountType, String _accountId, String _zingId) {
        /*
        if(mapSocial.get(_accountType + SEPERATOR + _accountId) == null)
        {
            mapSocial.put(_accountType + SEPERATOR + _accountId, _zingId);
            try {
                saveMap();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            //System.out.println("this user already exists in map");
        }
        */
        try {
            DataHandler.set(_accountType + SEPERATOR + _accountId, _zingId);
        } catch (Exception e) {
            Debug.warn("MAP SOCIAL EXCEPTION " + e.getMessage());
            Debug.warn(ExceptionUtils.getStackTrace(e));
        }

    }

    public static String getZingId(String _accountType, String _accountId) {
        /*
        String zingId = mapSocial.get(_accountType + SEPERATOR + _accountId);
        if(zingId == null)
            zingId = "-1";
        return zingId;
        */
        try {
            String zingId;
            Object mapId = DataHandler.get(_accountType + SEPERATOR + _accountId);
            if (mapId != null)
                return mapId.toString();
            else
                return "-1";
        } catch (Exception e) {
            Debug.warn("MAP SOCIAL EXCEPTION " + e.getMessage());
            Debug.warn(ExceptionUtils.getStackTrace(e));
        }
        return "-1";
    }

    /*
    synchronized public void saveMap() throws Exception {
        DataHandler.set(SAVE_KEY, gson.toJson(mapSocial));
    }

    public void loadMap() throws Exception {
        mapSocial = gson.fromJson((String)DataHandler.get(SAVE_KEY), HashMap.class);
        if(mapSocial == null) {
            mapSocial = new HashMap<String, String>();
        }
    }
    */
}
