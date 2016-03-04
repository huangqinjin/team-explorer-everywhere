// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.services.notification._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.services.notification._03._IntegrationServiceSoap_Notify;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _IntegrationServiceSoap_Notify
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String eventXml;
    protected String tfsIdentityXml;

    public _IntegrationServiceSoap_Notify()
    {
        super();
    }

    public _IntegrationServiceSoap_Notify(
        final String eventXml,
        final String tfsIdentityXml)
    {
        // TODO : Call super() instead of setting all fields directly?
        setEventXml(eventXml);
        setTfsIdentityXml(tfsIdentityXml);
    }

    public String getEventXml()
    {
        return this.eventXml;
    }

    public void setEventXml(String value)
    {
        this.eventXml = value;
    }

    public String getTfsIdentityXml()
    {
        return this.tfsIdentityXml;
    }

    public void setTfsIdentityXml(String value)
    {
        this.tfsIdentityXml = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "eventXml",
            this.eventXml);
        XMLStreamWriterHelper.writeElement(
            writer,
            "tfsIdentityXml",
            this.tfsIdentityXml);

        writer.writeEndElement();
    }
}