package org.vaadin.sasha.videochat.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface VideoChatService extends RemoteService {
	
    int createChatRoom(int creatorId) throws IllegalArgumentException;

    int registerUser() throws IllegalArgumentException;
}