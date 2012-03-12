/*
 * Copyright 2008 The Kuali Foundation.
 * 
 * Licensed under the Educational Community License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.opensource.org/licenses/ecl1.php
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kuali.kfs.pdp.service;

import org.kuali.kfs.pdp.businessobject.PayeeACHAccount;

/**
 * Payee Ach Account Service
 * 
 */
public interface PayeeAchAccountService {

    /**
     * Get Ach Payee
     *
     * @param disbVchrPayeeIdNumber
     * 
     * @return PayeeAchAccount
     */
    public PayeeACHAccount getPayeeAchAccount(String disbVchrPayeeIdNumber);
}
