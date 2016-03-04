// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._04._BuildServiceSoap_CreateTeamProjectComponents;
import ms.tfs.build.buildservice._04._BuildTeamProjectPermission;

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
public class _BuildServiceSoap_CreateTeamProjectComponents
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String projectUri;
    protected _BuildTeamProjectPermission[] permissions;

    public _BuildServiceSoap_CreateTeamProjectComponents()
    {
        super();
    }

    public _BuildServiceSoap_CreateTeamProjectComponents(
        final String projectUri,
        final _BuildTeamProjectPermission[] permissions)
    {
        // TODO : Call super() instead of setting all fields directly?
        setProjectUri(projectUri);
        setPermissions(permissions);
    }

    public String getProjectUri()
    {
        return this.projectUri;
    }

    public void setProjectUri(String value)
    {
        this.projectUri = value;
    }

    public _BuildTeamProjectPermission[] getPermissions()
    {
        return this.permissions;
    }

    public void setPermissions(_BuildTeamProjectPermission[] value)
    {
        this.permissions = value;
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
            "projectUri",
            this.projectUri);

        if (this.permissions != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("permissions");

            for (int iterator0 = 0; iterator0 < this.permissions.length; iterator0++)
            {
                this.permissions[iterator0].writeAsElement(
                    writer,
                    "BuildTeamProjectPermission");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}