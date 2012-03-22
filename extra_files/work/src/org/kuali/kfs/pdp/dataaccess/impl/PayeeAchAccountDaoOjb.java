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
package org.kuali.kfs.pdp.dataaccess.impl;

import org.apache.ojb.broker.query.Criteria;
import org.apache.ojb.broker.query.QueryByCriteria;
import org.kuali.kfs.pdp.businessobject.PayeeACHAccount;
import org.kuali.kfs.pdp.dataaccess.PayeeAchAccountDao;
import org.kuali.rice.kns.dao.impl.PlatformAwareDaoBaseOjb;

/**
 * Payee Ach Account Dao Impl for Ojb
 *
 * @author Derek Helbert
 * @version $Revision$
 */
public class PayeeAchAccountDaoOjb extends PlatformAwareDaoBaseOjb implements PayeeAchAccountDao {
    
    private static org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(PayeeAchAccountDaoOjb.class);

    public PayeeAchAccountDaoOjb() {
        super();
    }

    /**
     * Get Payee Ach Account
     * 
     * @see org.kuali.kfs.pdp.dataaccess.PayeeAchAccountDao#getPayeeAchAccount(java.lang.String)
     */
    public PayeeACHAccount getPayeeAchAccount(String disbVchrPayeeIdNumber) {
        LOG.debug("getPayeeAchAccount() started");

        Criteria criteria = new Criteria();
        criteria.addEqualTo("disbVchrPayeeIdNumber", disbVchrPayeeIdNumber);

        return (PayeeACHAccount)getPersistenceBrokerTemplate().getObjectByQuery(new QueryByCriteria(PayeeACHAccount.class,criteria));
    }
}
