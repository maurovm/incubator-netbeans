/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.websvc.wsitmodelext.policy;

import org.netbeans.modules.websvc.wsitmodelext.rm.RMAssertion;
import org.netbeans.modules.xml.wsdl.model.ExtensibilityElement;

/**
 *
 * @author Martin Grebac
 */
public interface ExactlyOne extends ExtensibilityElement {
    public static final String ALL_PROPERTY = "EAALL";     //NOI18N
    public static final String EXACTLYONE_PROPERTY = "EAEXACTLYONE";     //NOI18N
    public static final String POLICYREFERENCE_PROPERTY = "EAPOLICYREFERENCE";     //NOI18N
    public static final String POLICY_PROPERTY = "POLICY";     //NOI18N
    
    All getAll();
    void setAll(All all);
    void removeAll(All all);

    ExactlyOne getExactlyOne();
    void setExactlyOne(ExactlyOne exactlyOne);
    void removeExactlyOne(ExactlyOne exactlyOne);

    PolicyReference getPolicyReference();
    void setPolicyReference(PolicyReference policyReference);
    void removePolicyReference(PolicyReference policyReference);
    
    RMAssertion getRMAssertion();
    void setRMAssertion(RMAssertion rmAssertion);
    void removeRMAssertion(RMAssertion rmAssertion);
}
