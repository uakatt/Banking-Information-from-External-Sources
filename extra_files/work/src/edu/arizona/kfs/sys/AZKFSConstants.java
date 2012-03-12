/*
 * Copyright 2009 The Kuali Foundation.
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
package edu.arizona.kfs.sys;

import org.kuali.kfs.sys.ParameterKeyConstants;
import org.kuali.rice.core.util.JSTLConstants;

/**
 * This class is used to define our global constants.
 */
public class AZKFSConstants extends JSTLConstants implements ParameterKeyConstants {
    public static final String ENABLE_SALES_TAX_AMOUNT_TAX_EXEMPT_IND = "ENABLE_SALES_TAX_AMOUNT_TAX_EXEMPT_IND";  // for KITT-235
    public static final String GL_USETAX_DOCUMENT_TYPE = "USE_TAX_DOCUMENT_TYPE";
    public static final String GL_USETAX_TAX_REGION = "USE_TAX_TAX_REGION_CODE";
    public static final String VALID_OBJECT_SUB_TYPES_BY_SUB_FUND_GROUP_PARM = "VALID_OBJECT_SUB_TYPES_BY_SUB_FUND_GROUP";  // for KITT-296 and KITT-803
    public static final String INVALID_OBJECT_SUB_TYPES_BY_SUB_FUND_GROUP_PARM = "INVALID_OBJECT_SUB_TYPES_BY_SUB_FUND_GROUP";  // for KITT-296 and KITT-803
    public static final String REFERENCE_NUMBER_VALIDATION_IND_PARM = "REFERENCE_NUMBER_VALIDATION_IND";
    public static final String DEFAULT_NUMBER_OF_DAYS_ERROR_CERTIFICATION_TAB_REQUIRED = "DEFAULT_NUMBER_OF_DAYS_ERROR_CERTIFICATION_TAB_REQUIRED";
    public static final String ERROR_CERTIFICATION_DEFAULT_OVERRIDE_BY_SUB_FUND = "ERROR_CERTIFICATION_DEFAULT_OVERRIDE_BY_SUB_FUND";
    public static final String MESSAGE_BATCH_UPLOAD_TITLE_BANK_TRANSACTIONS = "message.batchUpload.title.bankTransactions";
    public static final String MESSAGE_BANK_TRANSACTIONS_BATCH_UPLOAD_ERROR = "message.batchUpload.error.bankTransactions";
    public static final String DEFAULT_NUMBER_OF_FISCAL_PERIODS_ERROR_CERTIFICATION_TAB_REQUIRED = "DEFAULT_NUMBER_OF_FISCAL_PERIODS_ERROR_CERTIFICATION_TAB_REQUIRED";
    public static final String BI_REPORT_URL = "BI_REPORT_URL"; // KITT-513
    public static final String PCDH_FILE_TYPE_IDENTIFIER = "procurementCardHolderInputFileType";
        
    //KevinMcO Docuware KITT-414 Constants
    public static final String VIEW_DOCUWARE = "viewImages"; //for KITT-414
    public static final String DOCUWARE_TABLE_PARAMETER = "DOCUWARE_TABLE_PARAMETER"; //for KITT-414
    public static final String DOCUWARE_TABLE = "table";   //for KITT-414   
    public static final String DOCUWARE_IDVALUE = "idvalue";   //Document ID Number
    public static final String DOCUWARE_DV_DOC_TYPE = "DV";   //for KITT-414 
    public static final String DOCUWARE_PREQ_DOC_TYPE = "PREQ";   //for KITT-414
    
    public static final class ShippingConstants {
        public static final String DEFAULT_TRANSACTION_OBJECT_CODE = "DEFAULT_TRANSACTION_OBJECT_CODE";
        public static final String SHIPPING_COMPANIES = "SHIPPING_COMPANIES";
        public static final String VENDOR_DUNS_NUMBER_BY_SHIPPING_COMPANIES = "VENDOR_DUNS_NUMBER_BY_SHIPPING_COMPANIES";
        public static final String SHIP_FILE_TYPE_IDENTIFIER = "shippingInputFileType";
        public static final String SHIPPING_FILE_NAME = "extract_for_shipping";
    }
    
    // KITT-665
    public static final class ACHFileConstants {
        public static final String ACH_BANK_FILE_TYPE_IDENTIFIER = "achBankInputFileType";
        public static final String ACH_BANK_LOADED_SUCCESSFULLY = "Bank record successfully loaded";
        public static final String ACH_BANK_INVALID_OFFICE_CD_ERROR = "Invalid office code - default value O used";
        public static final String ACH_BANK_INVALID_TYP_CD_ERROR = "Invalid record type code - default value 0 used";
        public static final String ACH_BANK_TYP_CD_ROUTING_NBR_ERROR = "New routing number not provided for record type code 2 - record not loaded";
        public static final String ACH_BANK_MISSING_NM_ERROR = "Bank name not provided - record not loaded";
        public static final String ACH_BANK_INCOMPLETE_ADDR_ERROR = "Incomplete bank address - record not loaded";
        public static final String ACH_BANK_INCOMPLETE_PHONE_ERROR = "Incomplete phone number - default value with zeros used";
        public static final String ACH_BANK_INVALID_INST_STAT_CD = "Invalid institution status code - default value 1 used";
        public static final String ACH_BANK_INVALID_DATA_VIEW_CD = "Invalid data view code - default value 1 used";
        
        public static final String ACH_PAYEE_ACCT_FILE_TYPE_IDENTIFIER = "achPayeeBankAcctInputFileType";
        public static final String ACH_PAYEE_ACCT_INVALID_ROUTING = "Bank routing number doesn't exist - record not loaded";
        public static final String ACH_PAYEE_ACCT_EMP_LOADED_SUCCESSFULLY = "Employee ACH Account record successfully loaded";
        public static final String ACH_PAYEE_ACCT_ENT_LOADED_SUCCESSFULLY = "Entity ACH Account record successfully loaded";
        public static final String ACH_PAYEE_ACCT_LOADED_SUCCESSFULLY = "ACH Account record successfully loaded";
        public static final String ACH_PAYEE_ACCT_EMP_UPDATED_SUCCESSFULLY = "Employee ACH Account recorded successfully updated";
        public static final String ACH_PAYEE_ACCT_ENT_UPDATED_SUCCESSFULLY = "Entity ACH Account recorded successfully updated";
        public static final String ACH_PAYEE_ACCT_UPDATED_SUCCESSFULLY = "ACH Account recorded successfully updated";
        public static final String ACH_PAYEE_ACCT_MISSING_PAYEE_ID_NBR_ERROR = "Payee ID number not provided - record not loaded";
        public static final String ACH_PAYEE_ACCT_MISSING_EMAIL = "Payee email address not provided - record not loaded";
        public static final String ACH_PAYEE_ACCT_MISSING_ROUTING_ERROR = "Routing number not provided";
        public static final String ACH_PAYEE_ACCT_MISSING_ACCT_NBR_ERROR = "Account number not provided";
        public static final String ACH_PAYEE_ACCT_MISSING_PAYEE_NM_ERROR = "Payee name not provided - record not loaded";
        public static final String ACH_PAYEE_ACCT_INVALID_PAYEE_ID_TYP_ERROR = "Invalid payee ID type";
        public static final String ACH_PAYEE_ACCT_MISSING_BANK_ACCT_TYP_ERROR = "Bank account type not provided - record not loaded";
        public static final String ACH_PAYEE_ACCT_INVALID_BANK_ACCT_TYP_ERROR = "Invalid bank account type code - record not loaded";
        public static final String ACH_PAYEE_ACCT_OVERRIDE_EMPL_ERROR = "Employee exists in override group - no update occurred";
        public static final String ACH_PAYEE_ACCT_NO_NAME_MATCH = "No matching payee for payee ID/type found - record not loaded";
        public static final String ACH_PAYEE_ACCT_INVALID_EXISTING_MATCH = "Invalid payee ID/type found, but record exists in ACH setup - no updates occurred";
        
        public static final String BANKING_INFORMATION_OVERRIDE_GROUP = "BANKING_INFORMATION_OVERRIDE_GROUP";
    }
    
    public static final class ACHAcctTypeCodes {
        public static String CHECKING = "22";
        public static String SAVINGS = "32";
    }
    
    public static final class ACHBankOfficeCodes {
        public static String MAIN = "O";
        public static String BRANCH = "B";
    }
    
    public static final class ACHBankTypeCodes {
        public static String FEDERAL_RESERVE = "0";
        public static String CUSTOMER_ROUTING_NBR = "1";
        public static String NEW_CUSTOMER_ROUTING_NBR = "2";
    }
}
