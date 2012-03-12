/*
 * Copyright 2007 The Kuali Foundation.
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


/**
 * Holds error key constants.
 */
public class KFSKeyConstants {
    public static final String WORKFLOW_DIRECTORY = "data.xml.root.location";
    public static final String INGESTION_DIRECTORY = "ingestion";
    
    //Account Assession Code Errors
    public static final String ERROR_ACCOUNT_EXTENDED_ATTR_INVALID_DATA = "error.common.validation.alphanumeric";//

   // GEC Errors and Message
    public static final String ERROR_GEC_REF_NUMBER_INVALID = "error.gec.ref.number";
    public static final String QUESTION_ERROR_CERTIFICATION_STMT = "question.gec.errorCertStmt";
 
    // Error Certification
    public static final String ERROR_ERROR_CERT_DATE_PARAM_TRIGGERED = "error.errorCert.dateParamTriggered";
    public static final String ERROR_ERROR_CERT_FIELDS_REQ = "error.errorCert.fieldsReq";
    public static final String ERROR_ERROR_CERT_FISCAL_PER_PARAM_TRIGGERED = "error.errorCert.fiscalPerParamTriggered";
    public static final String ERROR_ERROR_CERT_KEY = "document.errorCertification";

    // Procurement Cardholder
    public static final String MESSAGE_BATCH_UPLOAD_TITLE_PCDH = "message.batchUpload.title.procurementCardHolder";
    
    // Shipping Account
    public static final String MESSAGE_BATCH_UPLOAD_TITLE_SHIP = "message.batchUpload.title.shipping";
    
    // ACH Banking
    public static final String MESSAGE_BATCH_UPLOAD_TITLE_ACH_BANK = "message.batchUpload.title.achBank";
    public static final String MESSAGE_BATCH_UPLOAD_TITLE_ACH_PAYEE = "message.batchUpload.title.achPayee";
    
    // GLCP
    public static final String ERROR_GL_ERROR_CORRECTION_FILE_ALREADY_EXISTS = "error.gl.correction.file.already.exists";

    // LLCP
    public static final String ERROR_LL_ERROR_CORRECTION_FILE_ALREADY_EXISTS = "error.ll.correction.file.already.exists";
}
