// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildinfo._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildinfo._03._BuildStoreWebServiceSoap_GetPlatformFlavorsForBuildResponse;
import ms.tfs.build.buildinfo._03._PlatformFlavorData;

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
public class _BuildStoreWebServiceSoap_GetPlatformFlavorsForBuildResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _PlatformFlavorData[] getPlatformFlavorsForBuildResult;

    public _BuildStoreWebServiceSoap_GetPlatformFlavorsForBuildResponse()
    {
        super();
    }

    public _BuildStoreWebServiceSoap_GetPlatformFlavorsForBuildResponse(
        final _PlatformFlavorData[] getPlatformFlavorsForBuildResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGetPlatformFlavorsForBuildResult(getPlatformFlavorsForBuildResult);
    }

    public _PlatformFlavorData[] getGetPlatformFlavorsForBuildResult()
    {
        return this.getPlatformFlavorsForBuildResult;
    }

    public void setGetPlatformFlavorsForBuildResult(_PlatformFlavorData[] value)
    {
        this.getPlatformFlavorsForBuildResult = value;
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("GetPlatformFlavorsForBuildResult"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _PlatformFlavorData complexObject0 = new _PlatformFlavorData();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.getPlatformFlavorsForBuildResult = (_PlatformFlavorData[]) list0.toArray(
                                new _PlatformFlavorData[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}