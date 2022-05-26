# zm-migration-tool
Zimbra migration tool

Update the jar version in build.xml with version we want to create jar with.
for example :- Current version 8.7 and we are upgrading with 8.8
Make changes in build.xml and update version in zm-migration-tools-version to the version we want to create

Ant command to create jar

ant zmzimbratozimbramig

This will create jar in location build/jars/zmzimbratozimbramig-<version number>.jar

Once we create jar we need to upload it to files.zimbra.com and follow below process

Build information :-

Any change in zm-migration-tools repo needs a version update in following places.
2. zm-zcs-lib in build.xml
3. zm-zcs-lib in pkg-builder.pl

