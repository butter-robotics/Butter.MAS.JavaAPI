package com.butter.mas.packets;

import com.butter.mas.data.Response;


/**
 * Represents a TCP data packet
 *
 * @class PacketTcp
 * @extends Packet
 */
public class PacketTcp extends Packet {
    /**
     * Creates an instance of PacketTcp.
     *
     * @param ip    robot IP
     * @param port  robot port
     * @param query packet payload
     */
    public PacketTcp(String ip, int port, String query) {
        super(ip, port, query);
    }

    /**
     * Send packet
     *
     * @param timeout packet timeout (optional)
     * @return response containing the response
     */
    public Response send(int timeout) {
        throw new UnsupportedOperationException("Not Implemented");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof PacketTcp that)) return false;

        return this.mIp.equals(that.mIp) && this.mPort == that.mPort && this.mQuery.equals(that.mQuery);
    }
}
