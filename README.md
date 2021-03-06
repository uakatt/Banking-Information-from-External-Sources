Banking Information from External Sources
======================

This git repository represents the University of Arizona (the UA)'s _Banking Information from External Sources_ modification to **KFS 3.0**, in the form of patch files (generated by svn diff), liquibase scripts, and documentation.
This "patch package" is designed to be informative to technical developers in the position to
apply patch files to the java source code of KFS. In order to better serve such an endeavor,
this README contains several informative sections:

* <a href="#jiras">List of Jiras</a> - This list contains every Jira ticket at the University of Arizona
  that relates to this modification. It provides reverse documentation back to the developers at
  the UA in case of questions regarding how this patch package was created.
* <a href="#liquibase_changesets">List of Liquibase Changesets</a> - This list contains any
  liquibase changeset files that were associated with this modification.
* <a href="#patch_files">List of Patch Files</a> - This is a list of each patch file that needs
  to be applied to the KFS source code in order to realize the modification. This list does _not_
  include patch files for revisions that didn't touch the `trunk/` at the UA.
  Before a modification was merged with `trunk/`, it may have been tweaked, reworked, refactored,
  code reviewed, etc, in handfuls of revisions in a feature branch.
* <a href="#revisions">List of Revisions</a> - This list contains every revision associated with
  this modification. Many of which, as you will see, only touch files in a feature branch. The
  revisions that actually made it into the actual modification touch files in `trunk/`. The list
  of patch files is a better reference of which are these revisions.
* <a href="#files">Lists of Files</a> - These lists contain every file that was created,
  modified, or deleted for this enhancement.
* <a href="#extra_files">List of Extra Files</a> - This list contains any extra files that were not
  explicitly changed during the enhancement. The enhancement may rely on these files, and they may
  not be a part of the original release.
* <a href="#post_mod_changes">List of Post-Modification Changes</a> - This list contains
  revision numbers that are _not_ included in the patches, or raw patches, but that touched one
  or more key files involved in this modification.

<h2><a name="jiras">Jiras</a></h2>

This is a list of Jira tickets at the University of Arizona that relate to this modification. The subversion revisions tagged against each such jira are also listed:

* **KITT-665**: (The main jira for this modification)<br />
  revisions: #9840, #9841, #9842, #9843, #9894, #9895, #9912, #9913, #9914, #9942, #9943, #9944, #9945, #9946, #9963, #9976, #9979, #9997, #9998, #10056, #10057, #10058, #10060, #10079, #10080, #10081, #10082, #10083, #10110, #10127, #10157, #10160, #10179, #10272, #10274, #10275, #10276, #10299, #10300, #10301, #10302, #10420, #10423, #10442
* **KITT-1202**: (A large change request against this modification)<br />
  revisions: #10965, #10966, #10971, #11086, #11087, #11091, #11092, #11097, #11130, #12268, #12269, #12399

<h2><a name="liquibase_changesets">Liquibase Changesets</a></h2>

There are no liquibase changesets associated with this modification.

<h2><a name="patch_files">Patch Files</a></h2>

This is a list of all of the patches for revisions that affected files in `trunk/`. The filenames in each has been modified, for easy digestion. UA's subversion server manages many Kuali projects in one Subversion project, so a file path like:

```
financial-system/kfs/trunk/src/org/kuali/kfs...
```

has been modified to:

```
src/org/kuali/kfs...
```

* [`patches/10299_KITT-665_cleaned.diff`](Banking-Information-from-External-Sources/blob/master/patches/10299_KITT-665_cleaned.diff) is the patch file for #10299.
* [`patches/10301_KITT-665_cleaned.diff`](Banking-Information-from-External-Sources/blob/master/patches/10301_KITT-665_cleaned.diff) is the patch file for #10301.
* [`patches/10302_KITT-665_cleaned.diff`](Banking-Information-from-External-Sources/blob/master/patches/10302_KITT-665_cleaned.diff) is the patch file for #10302.
* [`patches/10442_KITT-665_cleaned.diff`](Banking-Information-from-External-Sources/blob/master/patches/10442_KITT-665_cleaned.diff) is the patch file for #10442.
* [`patches/11130_KITT-1202_cleaned.diff`](Banking-Information-from-External-Sources/blob/master/patches/11130_KITT-1202_cleaned.diff) is the patch file for #11130.
* [`patches/12268_KITT-1202_cleaned.diff`](Banking-Information-from-External-Sources/blob/master/patches/12268_KITT-1202_cleaned.diff) is the patch file for #12268.
* [`patches/12269_KITT-1202_cleaned.diff`](Banking-Information-from-External-Sources/blob/master/patches/12269_KITT-1202_cleaned.diff) is the patch file for #12269.
* [`patches/12399_KITT-1202_cleaned.diff`](Banking-Information-from-External-Sources/blob/master/patches/12399_KITT-1202_cleaned.diff) is the patch file for #12399.

<h2><a name="revisions">Revisions</a></h2>

This is an ordered list of revisions that relate to this modification. There may not be a patch
file for every revision listed below for the following reasons:

* A revision might only affect a branch, perhaps one where development primarily took place. Any
  changes that finally made it into `trunk/` will be seen in revisions that specifically touch
  files in `trunk/`. Therefore, we do not create patch files for revisions that only affect a
  branch.
* A revision might only include a liquibase changeset that is executed by some automated process.
  Since each institution maintains different revision controls on their database, liquibase
  changesets are not provided as patches. They are instead presented as intact files under the
  `liquibase-changesets/` directory.

[Here](Banking-Information-from-External-Sources/blob/master/patch_log.txt) is a printout of `svn log -v` for each revision.

*   \#10299 was committed against KITT-665 on 2010-06-03 21:49:17 UTC by <strong>hlo</strong>.

    > KITT-665 Merging with branch.
*   \#10301 was committed against KITT-665 on 2010-06-03 21:55:14 UTC by <strong>hlo</strong>.

    > KITT-665 Merging branch changes.
*   \#10302 was committed against KITT-665 on 2010-06-03 21:58:12 UTC by <strong>hlo</strong>.

    > KITT-665 Merging branch changes.
*   \#10442 was committed against KITT-665 on 2010-06-11 16:14:52 UTC by <strong>hlo</strong>.

    > KITT-665 Merging code after code review.
*   \#11130 was committed against KITT-1202 on 2010-07-14 18:20:35 UTC by <strong>hlo</strong>.

    > KITT-1202 Merging code changes.
*   \#12268 was committed against KITT-1202 on 2010-08-21 00:32:09 UTC by <strong>hlo</strong>.

    > KITT-1202 Changes after functional testing.
*   \#12269 was committed against KITT-1202 on 2010-08-21 00:35:19 UTC by <strong>hlo</strong>.

    > KITT-1202 Cleaning up code.
*   \#12399 was committed against KITT-1202 on 2010-08-25 17:35:39 UTC by <strong>hlo</strong>.

    > KITT-1202 Changing equals to equalsIgnoreCase.

<h2><a name="files">Files</a></h2>

Files **created** for this modification (19 files)

    /build/external/work/staging/pdp/achBanks
    /build/external/work/staging/pdp/achBanks/placeholder.txt
    /build/external/work/staging/pdp/achPayeeBankAccounts
    /build/external/work/staging/pdp/achPayeeBankAccounts/placeholder.txt
    /test/unit/src/edu/arizona/kfs/pdp/batch
    /test/unit/src/edu/arizona/kfs/pdp/batch/AchBankInputFileTypeTest.java
    /test/unit/src/edu/arizona/kfs/pdp/batch/AchPayeeBankAcctInputFileTypeTest.java
    /test/unit/src/edu/arizona/kfs/pdp/util
    /test/unit/src/edu/arizona/kfs/pdp/util/PayeeACHAcctFlatFileConverterTest.java
    /work/src/edu/arizona/kfs/pdp/batch/AchBankInputFileType.java
    /work/src/edu/arizona/kfs/pdp/batch/AchPayeeBankAcctInputFileType.java
    /work/src/edu/arizona/kfs/pdp/batch/LoadAchBankStep.java
    /work/src/edu/arizona/kfs/pdp/batch/LoadAchPayeeBankAcctStep.java
    /work/src/edu/arizona/kfs/pdp/service/AchBankService.java
    /work/src/edu/arizona/kfs/pdp/service/PayeeAchAccountService.java
    /work/src/edu/arizona/kfs/pdp/service/impl/AchBankServiceImpl.java
    /work/src/edu/arizona/kfs/pdp/service/impl/PayeeAchAccountServiceImpl.java
    /work/src/edu/arizona/kfs/pdp/util
    /work/src/edu/arizona/kfs/pdp/util/PayeeACHAcctFlatFileConverter.java

Files **modified** for this modification (4 files)

    /work/src/edu/arizona/kfs/pdp/spring-pdp.xml
    /work/src/edu/arizona/kfs/sys/AZKFSConstants.java
    /work/src/edu/arizona/kfs/sys/KFSKeyConstants.java
    /work/src/org/kuali/kfs/pdp/batch/LoadFederalReserveBankDataStep.java

<h2><a name="extra_files">Extra Files</a></h2>

Extra files for this modification that have been included for some reason or another. Most likely, these files did not exist in Foundation KFS 3.0, but are referenced in this enhancement. (8 files)

    work/src/edu/arizona/kfs/pdp/spring-pdp.xml
    work/src/edu/arizona/kfs/sys/AZKFSConstants.java
    work/src/edu/arizona/kfs/sys/KFSKeyConstants.java
    work/src/org/kuali/kfs/pdp/dataaccess/PayeeAchAccountDao.java
    work/src/org/kuali/kfs/pdp/dataaccess/impl/PayeeAchAccountDaoOjb.java
    work/src/org/kuali/kfs/pdp/service/PayeeAchAccountService.java
    work/src/org/kuali/kfs/pdp/service/impl/PayeeAchAccountServiceImpl.java
    work/src/org/kuali/kfs/pdp/spring-pdp.xml

<h2><a name="post_mod_changes">Post Mod Changes</a></h2>

For each file that was changed or added for this modification, I've looked at its history in subversion (`svn log <file_name>`) to find whether later fixes were committed against this modification that I might have missed. There were some :) They may be fixes to the modification, or further enhancements, or changes completely unrelated. Please contact the UA for more information about a given revision number, or Jira ticket. Here they are:

*   **#16219** touches: 
    * /work/src/edu/arizona/kfs/pdp/batch/LoadAchPayeeBankAcctStep.java
    * /work/src/edu/arizona/kfs/pdp/batch/LoadAchBankStep.java

    > KFSI-3162
    > KITT-2221
    > Moving .done file removal code. Also threw in some BufferedWriter cleanup.
*   **#17253** touches /work/src/edu/arizona/kfs/pdp/batch/AchBankInputFileType.java.

    > KFSI-3481
    > KITT-2336
    > Added better error handling in case the OriginCode sent with the file was invalid.
*   **#17358** touches /work/src/edu/arizona/kfs/pdp/batch/AchPayeeBankAcctInputFileType.java.

    > KFSI-3505
    > KITT-2348
    > Fixed an NPE on the OriginCode when a bad one used in the ACH Payee Bank Data Load.
*   **#18503** touches: 
    * /work/src/edu/arizona/kfs/pdp/batch/AchPayeeBankAcctInputFileType.java
    * /test/unit/src/edu/arizona/kfs/pdp/batch/AchPayeeBankAcctInputFileTypeTest.java

    > KFSI-3837 KITT-2506 keep retrieved Person objects around longer to reduce the number of queries needed during job execution
*   **#20172** touches /work/src/edu/arizona/kfs/pdp/batch/AchBankInputFileType.java.

    > Adjusting logging properties, and some code, to decrease logging verbosity.
    > 
    > KITT-2617
*   **#20419** touches /work/src/edu/arizona/kfs/pdp/batch/AchBankInputFileType.java.

    > Revert "Adjusting logging properties, and some code, to decrease logging verbosity."
    > 
    > Reverting a number of recent changes to restore logging verbosity, until I can figure out what went wrong.
    > 
    > KITT-2617
    > KITT-2663
    > 
    > This reverts commit c230f2b7e48bf203858a7274d8e21af8c420d0a8.
*   **#21462** touches: 
    * /work/src/edu/arizona/kfs/pdp/util/PayeeACHAcctFlatFileConverter.java
    * /work/src/edu/arizona/kfs/pdp/batch/AchBankInputFileType.java

    > KFSI-5210
    > KITT-2890
    > Removed multi-byte (but not UTF-8) characters from comments that were breaking a strict compile.
*   **#23903** touches: 
    * /work/src/edu/arizona/kfs/pdp/batch/AchPayeeBankAcctInputFileType.java
    * /work/src/edu/arizona/kfs/pdp/service/PayeeAchAccountService.java
    * /work/src/edu/arizona/kfs/pdp/service/impl/PayeeAchAccountServiceImpl.java

    > KFSI-6193
    > The system has now been updated to remove all entries of the type in the file (excepting override IDs), before loading the new file.
*   **#24362** touches /work/src/edu/arizona/kfs/pdp/service/impl/PayeeAchAccountServiceImpl.java.

    > KFSI-6193
    > Added some special handling in the case where there are no overrides setup in the system.

(9 revisions)

The following files were ignored here:

    AZKFSConstants.java
    spring-pdp.xml
    KFSKeyConstants.java

This means, for example, that "AZKFSConstants.java" was changed for this modification, but its history was not used to build this list of revisions.

