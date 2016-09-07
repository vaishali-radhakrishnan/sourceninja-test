# sourceninja-test

This repo is to test source ninja code. We are profiling a simple Spring App using our Source Ninja jar. 

VM Arguments:
-javaagent:/path to jar/sourcewalker-0.0.1-SNAPSHOT-jar-with-dependencies.jar -Xms1024M -Xmx2048M  -DprofileName=test -DlogPath=/your log path/

Tracer output will go to logPath you have provided above
