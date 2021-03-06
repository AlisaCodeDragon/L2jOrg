/*
 * Copyright © 2019 L2J Mobius
 * Copyright © 2019-2020 L2JOrg
 *
 * This file is part of the L2JOrg project.
 *
 * L2JOrg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * L2JOrg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.l2j.gameserver.model.events.impl.server;

import org.l2j.gameserver.model.actor.instance.Player;
import org.l2j.gameserver.model.events.EventType;
import org.l2j.gameserver.model.events.impl.IBaseEvent;
import org.l2j.gameserver.network.GameClient;

/**
 * @author UnAfraid
 */
public class OnPacketReceived implements IBaseEvent {
    private final GameClient _client;
    private final byte[] _data;

    public OnPacketReceived(GameClient client, byte[] data) {
        _client = client;
        _data = data;
    }

    public Player getActiveChar() {
        return _client.getPlayer();
    }

    public GameClient getClient() {
        return _client;
    }

    public byte[] getData() {
        return _data;
    }

    @Override
    public EventType getType() {
        return EventType.ON_PACKET_RECEIVED;
    }
}