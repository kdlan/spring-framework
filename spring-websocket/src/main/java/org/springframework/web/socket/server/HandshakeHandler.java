/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.web.socket.server;

import java.io.IOException;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;

/**
 * Contract for processing a WebSocket handshake request.
 *
 * @author Rossen Stoyanchev
 * @since 4.0
 */
public interface HandshakeHandler {


	/**
	 *
	 * @param request
	 * @param response
	 * @param webSocketHandler
	 * @return
	 *
	 * @throws IOException thrown when accessing or setting the response
	 *
	 * @throws HandshakeFailureException thrown when handshake processing failed to
	 *         complete due to an internal, unrecoverable error, i.e. a server error as
	 *         opposed to a failure to successfully negotiate the requirements of the
	 *         handshake request.
	 */
	boolean doHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler webSocketHandler)
			throws IOException, HandshakeFailureException;

}
