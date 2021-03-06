// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._IdentityDescriptor;
import ms.ws._IdentityManagementWebService2Soap_UpdateIdentityExtendedProperties;
import ms.ws._PropertyValue;

import java.lang.Object;
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
public class _IdentityManagementWebService2Soap_UpdateIdentityExtendedProperties
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _IdentityDescriptor descriptor;
    protected _PropertyValue[] updates;
    protected _PropertyValue[] localUpdates;

    public _IdentityManagementWebService2Soap_UpdateIdentityExtendedProperties()
    {
        super();
    }

    public _IdentityManagementWebService2Soap_UpdateIdentityExtendedProperties(
        final _IdentityDescriptor descriptor,
        final _PropertyValue[] updates,
        final _PropertyValue[] localUpdates)
    {
        // TODO : Call super() instead of setting all fields directly?
        setDescriptor(descriptor);
        setUpdates(updates);
        setLocalUpdates(localUpdates);
    }

    public _IdentityDescriptor getDescriptor()
    {
        return this.descriptor;
    }

    public void setDescriptor(_IdentityDescriptor value)
    {
        this.descriptor = value;
    }

    public _PropertyValue[] getUpdates()
    {
        return this.updates;
    }

    public void setUpdates(_PropertyValue[] value)
    {
        this.updates = value;
    }

    public _PropertyValue[] getLocalUpdates()
    {
        return this.localUpdates;
    }

    public void setLocalUpdates(_PropertyValue[] value)
    {
        this.localUpdates = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.descriptor != null)
        {
            this.descriptor.writeAsElement(
                writer,
                "descriptor");
        }

        if (this.updates != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("updates");

            for (int iterator0 = 0; iterator0 < this.updates.length; iterator0++)
            {
                this.updates[iterator0].writeAsElement(
                    writer,
                    "PropertyValue");
            }

            writer.writeEndElement();
        }

        if (this.localUpdates != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("localUpdates");

            for (int iterator0 = 0; iterator0 < this.localUpdates.length; iterator0++)
            {
                this.localUpdates[iterator0].writeAsElement(
                    writer,
                    "PropertyValue");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
