// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceInterface.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.build.buildservice._03._Agent2008Status;
import ms.tfs.build.buildservice._03._BuildAgent2008;
import ms.tfs.build.buildservice._03._BuildAgentSpec2008;
import ms.tfs.build.buildservice._03._BuildDefinition;
import ms.tfs.build.buildservice._03._BuildDefinitionSpec;
import ms.tfs.build.buildservice._03._BuildDeletionResult;
import ms.tfs.build.buildservice._03._BuildDetail;
import ms.tfs.build.buildservice._03._BuildDetailSpec;
import ms.tfs.build.buildservice._03._BuildGroupItemSpec;
import ms.tfs.build.buildservice._03._BuildGroupQueryResult;
import ms.tfs.build.buildservice._03._BuildInformationNode;
import ms.tfs.build.buildservice._03._BuildPhaseStatus;
import ms.tfs.build.buildservice._03._BuildQueryOrder;
import ms.tfs.build.buildservice._03._BuildQueryResult2008;
import ms.tfs.build.buildservice._03._BuildQueueQueryResult2008;
import ms.tfs.build.buildservice._03._BuildQueueSpec2008;
import ms.tfs.build.buildservice._03._BuildReason;
import ms.tfs.build.buildservice._03._BuildRequest2008;
import ms.tfs.build.buildservice._03._BuildServiceSoap_AddBuildAgents;
import ms.tfs.build.buildservice._03._BuildServiceSoap_AddBuildAgentsResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_AddBuildDefinitions;
import ms.tfs.build.buildservice._03._BuildServiceSoap_AddBuildDefinitionsResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_AddBuildQualities;
import ms.tfs.build.buildservice._03._BuildServiceSoap_AddBuildQualitiesResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_CancelBuilds;
import ms.tfs.build.buildservice._03._BuildServiceSoap_CancelBuildsResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_DeleteBuildAgents;
import ms.tfs.build.buildservice._03._BuildServiceSoap_DeleteBuildAgentsResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_DeleteBuildDefinitions;
import ms.tfs.build.buildservice._03._BuildServiceSoap_DeleteBuildDefinitionsResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_DeleteBuildQualities;
import ms.tfs.build.buildservice._03._BuildServiceSoap_DeleteBuildQualitiesResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_DeleteBuilds;
import ms.tfs.build.buildservice._03._BuildServiceSoap_DeleteBuildsResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_EvaluateSchedules;
import ms.tfs.build.buildservice._03._BuildServiceSoap_EvaluateSchedulesResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_GetAffectedBuildDefinitions;
import ms.tfs.build.buildservice._03._BuildServiceSoap_GetAffectedBuildDefinitionsResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_GetBuildQualities;
import ms.tfs.build.buildservice._03._BuildServiceSoap_GetBuildQualitiesResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_ProcessChangeset;
import ms.tfs.build.buildservice._03._BuildServiceSoap_ProcessChangesetResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueryBuildAgentsByUri;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueryBuildAgentsByUriResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueryBuildDefinitionsByUri;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueryBuildDefinitionsByUriResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueryBuildGroups;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueryBuildGroupsResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueryBuildQueue;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueryBuildQueueById;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueryBuildQueueByIdResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueryBuildQueueResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueryBuilds;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueryBuildsByUri;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueryBuildsByUriResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueryBuildsResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueueBuild;
import ms.tfs.build.buildservice._03._BuildServiceSoap_QueueBuildResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_StopBuilds;
import ms.tfs.build.buildservice._03._BuildServiceSoap_StopBuildsResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_UpdateBuildAgents;
import ms.tfs.build.buildservice._03._BuildServiceSoap_UpdateBuildAgentsResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_UpdateBuildDefinitions;
import ms.tfs.build.buildservice._03._BuildServiceSoap_UpdateBuildDefinitionsResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_UpdateBuildInformation;
import ms.tfs.build.buildservice._03._BuildServiceSoap_UpdateBuildInformationResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_UpdateBuilds;
import ms.tfs.build.buildservice._03._BuildServiceSoap_UpdateBuildsResponse;
import ms.tfs.build.buildservice._03._BuildServiceSoap_UpdateQueuedBuilds;
import ms.tfs.build.buildservice._03._BuildServiceSoap_UpdateQueuedBuildsResponse;
import ms.tfs.build.buildservice._03._BuildStatus;
import ms.tfs.build.buildservice._03._BuildUpdate;
import ms.tfs.build.buildservice._03._BuildUpdateOptions;
import ms.tfs.build.buildservice._03._ContinuousIntegrationType;
import ms.tfs.build.buildservice._03._DeleteOptions;
import ms.tfs.build.buildservice._03._Failure;
import ms.tfs.build.buildservice._03._GetOption;
import ms.tfs.build.buildservice._03._InformationChangeRequest;
import ms.tfs.build.buildservice._03._InformationField;
import ms.tfs.build.buildservice._03._ProcessTemplate;
import ms.tfs.build.buildservice._03._ProcessTemplateType;
import ms.tfs.build.buildservice._03._QueryDeletedOption;
import ms.tfs.build.buildservice._03._QueryOptions;
import ms.tfs.build.buildservice._03._QueueOptions;
import ms.tfs.build.buildservice._03._QueuePriority;
import ms.tfs.build.buildservice._03._QueueStatus;
import ms.tfs.build.buildservice._03._QueuedBuild2008;
import ms.tfs.build.buildservice._03._QueuedBuildUpdate;
import ms.tfs.build.buildservice._03._QueuedBuildUpdateOptions;
import ms.tfs.build.buildservice._03._RetentionPolicy;
import ms.tfs.build.buildservice._03._Schedule;
import ms.tfs.build.buildservice._03._ScheduleDays;
import ms.tfs.build.buildservice._03._WorkspaceMapping;
import ms.tfs.build.buildservice._03._WorkspaceMappingType;
import ms.tfs.build.buildservice._03._WorkspaceTemplate;

import java.lang.String;

import java.util.Calendar;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2005/06/Build/BuildService/03}BuildServiceSoap
 */
public interface _BuildServiceSoap
{
    public _BuildDefinition[] addBuildDefinitions(final _BuildDefinition[] definitions)
        throws TransportException, SOAPFault;

    public void addBuildQualities(
        final String teamProject,
        final String[] qualities)
        throws TransportException, SOAPFault;

    public void cancelBuilds(final int[] ids)
        throws TransportException, SOAPFault;

    public void deleteBuildDefinitions(final String[] uris)
        throws TransportException, SOAPFault;

    public void deleteBuildQualities(
        final String teamProject,
        final String[] qualities)
        throws TransportException, SOAPFault;

    public _BuildDeletionResult[] deleteBuilds(final String[] uris)
        throws TransportException, SOAPFault;

    public void evaluateSchedules()
        throws TransportException, SOAPFault;

    public _BuildDefinition[] getAffectedBuildDefinitions(final String[] serverItems)
        throws TransportException, SOAPFault;

    public String[] getBuildQualities(final String teamProject)
        throws TransportException, SOAPFault;

    public _BuildAgent2008[] queryBuildAgentsByUri(final String[] uris)
        throws TransportException, SOAPFault;

    public _BuildGroupQueryResult queryBuildDefinitionsByUri(final String[] uris)
        throws TransportException, SOAPFault;

    public _BuildGroupQueryResult[] queryBuildGroups(final _BuildGroupItemSpec[] specs)
        throws TransportException, SOAPFault;

    public _BuildQueryResult2008[] queryBuilds(final _BuildDetailSpec[] specs)
        throws TransportException, SOAPFault;

    public _BuildQueryResult2008 queryBuildsByUri(
        final String[] uris,
        final String[] informationTypes,
        final _QueryOptions options)
        throws TransportException, SOAPFault;

    public _BuildQueueQueryResult2008[] queryBuildQueue(final _BuildQueueSpec2008[] specs)
        throws TransportException, SOAPFault;

    public _BuildQueueQueryResult2008 queryBuildQueueById(
        final int[] ids,
        final _QueryOptions options)
        throws TransportException, SOAPFault;

    public _QueuedBuild2008 queueBuild(
        final _BuildRequest2008 buildRequest,
        final _QueueOptions options)
        throws TransportException, SOAPFault;

    public void stopBuilds(final String[] uris)
        throws TransportException, SOAPFault;

    public _BuildDetail[] updateBuilds(final _BuildUpdateOptions[] updateOptions)
        throws TransportException, SOAPFault;

    public _QueuedBuild2008[] updateQueuedBuilds(final _QueuedBuildUpdateOptions[] updateOptions)
        throws TransportException, SOAPFault;

    public _BuildAgent2008[] addBuildAgents(final _BuildAgent2008[] agents)
        throws TransportException, SOAPFault;

    public void deleteBuildAgents(final String[] uris)
        throws TransportException, SOAPFault;

    public void processChangeset(final int changesetId)
        throws TransportException, SOAPFault;

    public _BuildAgent2008[] updateBuildAgents(final _BuildAgent2008[] updates)
        throws TransportException, SOAPFault;

    public _BuildDefinition[] updateBuildDefinitions(final _BuildDefinition[] updates)
        throws TransportException, SOAPFault;

    public _BuildInformationNode[] updateBuildInformation(final _InformationChangeRequest[] changes)
        throws TransportException, SOAPFault;
}
