/*******************************************************************************
 *     SDR Trunk 
 *     Copyright (C) 2014-2016 Dennis Sheirer
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>
 ******************************************************************************/
package io.github.dsheirer.message;

import io.github.dsheirer.alias.Alias;
import io.github.dsheirer.map.Plottable;

import java.util.Collections;
import java.util.List;

/**
 * Base message class
 */
public abstract class Message
{
    protected long mTimeReceived;

    public Message()
    {
        mTimeReceived = System.currentTimeMillis();
    }

    public long getTimeReceived()
    {
        return mTimeReceived;
    }

    /**
     * Map plottable
     */
    @Deprecated //Remove from this class in a separate ticket -- broadcast plottables over another channel
    //from the channel or decoder state
    public Plottable getPlottable()
    {
//TODO: move this to an IPlottable interface that only gets implemented as needed
        return null;
    }

    /**
     * Decoded textual representation of the message
     */
    @Deprecated //Tagged for removal once IIDentifier is fully implemented
    public String toString()
    {
        return null;
    }

    /**
     * Indicates if the message is valid and has passed crc/integrity checks
     */
    public abstract boolean isValid();

    /**
     * Status of the CRC check of the message
     */
    @Deprecated //Tagged for removal once IIDentifier is fully implemented
    public String getErrorStatus()
    {
        return null;
    }

    /**
     * Parsed Message
     *
     * @return
     */
    @Deprecated //Tagged for removal once IIDentifier is fully implemented
    public String getMessage()
    {
        return null;
    }

    /**
     * Raw ( 0 & 1 ) message bits
     */
    @Deprecated //Tagged for removal once IIDentifier is fully implemented
    public abstract String getBinaryMessage();


    /**
     * Decoded protocol
     */
    public abstract String getProtocol();

    /**
     * Event - call, data, idle, etc.
     */
    @Deprecated //Tagged for removal once IIDentifier is fully implemented
    public String getEventType()
    {
        return null;
    }

    /**
     * Formatted from identifier
     */
    @Deprecated //Tagged for removal once IIDentifier is fully implemented
    public String getFromID()
    {
        return null;
    }

    /**
     * From identifier alias (from AliasManager)
     */
    @Deprecated //Tagged for removal once IIDentifier is fully implemented
    public Alias getFromIDAlias()
    {
        return null;
    }


    /**
     * Formatted to identifier
     */
    @Deprecated //Tagged for removal once IIDentifier is fully implemented
    public String getToID()
    {
        return null;
    }

    /**
     * To identifier alias (from AliasManager)
     */
    @Deprecated //Tagged for removal once IIDentifier is fully implemented
    public Alias getToIDAlias()
    {
        return null;
    }

    /**
     * Provides a listing of aliases contained in the message.
     */
    @Deprecated //Tagged for removal once IIDentifier is fully implemented
    public List<Alias> getAliases()
    {
        return Collections.EMPTY_LIST;
    }
}