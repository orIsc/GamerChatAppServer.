package com.hit.service;

import java.util.ArrayList;

import com.hit.dao.DbHandle;
import com.hit.dao.DbHandleImpl;
import com.hit.server.Request;
import com.hit.server.Response;
import com.hit.server.Request.*;
import com.hit.dm.Messages;

public class WriteMessageService implements Services{

    private DbHandle dbHandle;
    private Response response;
    private ArrayList<Messages> messageList;

    public WriteMessageService() {
        this.dbHandle = DbHandleImpl.getInstance();
        this.response = new Response(new Header("write_message_success"), new Body());
    }

    @Override
    public Response executeService(Request request) {
        dbHandle.addMessage(request.getBody().getMessage());
        response.getBody().setChatRoom(dbHandle.getChatRoomById(request.getBody().getChatRoom().getChatRoom_id()));
        response.getBody().setMessage(request.getBody().getMessage());
        response.getBody().setUser(request.getBody().getUser());
        messageList = dbHandle.getChatRoomMessages(request.getBody().getMessage().getChat_room_id());
        response.getBody().setMessageList(messageList);
        return response;
    }
    
}
