/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.oozie.action.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.security.Credentials;
import org.apache.oozie.action.ActionExecutor.Context;

public interface CredentialsProvider {

     /**
     * This is the interface for all the Credentials implementation. Any new credential implementation must implement
     * this function. This function should modify the jobconf which will be used further to pass the credentials to the
     * tasks while running it. Credentials properties and context is also provided by that user can get all the
     * necessary configuration.
     *
     * @param credentials the credentials object which is updated
     * @param config launcher AM configuration
     * @param props properties for getting credential token or certificate
     * @param context workflow context
     * @throws Exception thrown if failed
     *
     */
    public void updateCredentials(Credentials credentials, Configuration config, CredentialsProperties props, Context context)
            throws Exception;
}
