package cmd.send.demo;

import bitzero.server.extensions.data.BaseMsg;

import cmd.CmdDefine;

import java.nio.ByteBuffer;

import model.PlayerInfo;

public class ResponseRequestUserInfo extends BaseMsg {
    public PlayerInfo info;
    public ResponseRequestUserInfo(PlayerInfo _info) {
        super(CmdDefine.GET_USER_INFO);
        info = _info;
    }
    
    @Override
    public byte[] createData() {
        ByteBuffer bf = makeBuffer();
        bf.putInt(info.position.x);
        bf.putInt(info.position.y);
        return packBuffer(bf);
    }
}
