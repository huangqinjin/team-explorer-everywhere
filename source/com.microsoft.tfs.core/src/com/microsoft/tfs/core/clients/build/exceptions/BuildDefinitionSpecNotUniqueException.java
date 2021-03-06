// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.core.clients.build.exceptions;

import java.text.MessageFormat;

import com.microsoft.tfs.core.Messages;

/**
 * Exception that is thrown when a build definition spec was not unique.
 *
 * @since TEE-SDK-10.1
 */
public class BuildDefinitionSpecNotUniqueException extends BuildException {
    public BuildDefinitionSpecNotUniqueException(final String teamProject, final String name) {
        super(MessageFormat.format(
            Messages.getString("BuildDefinitionSpecNotUniqueException.MessageFormat"), //$NON-NLS-1$
            name,
            teamProject));
    }

}
