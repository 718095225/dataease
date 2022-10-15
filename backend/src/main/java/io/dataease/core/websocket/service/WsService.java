package io.dataease.core.websocket.service;

import io.dataease.core.websocket.entity.WsMessage;


public interface WsService {

    void releaseMessage(WsMessage wsMessage);


}
