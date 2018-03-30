echo off
setlocal

SET JMETER_HOME=C:\ccviews\apps\apache-jmeter-4.0
SET JAVA_HOME=C:\ccviews\Java\jdk1.8.0_162
SET JM_LAUNCH=%JAVA_HOME%\bin\java.exe
SET HEAP=-Xms2g -Xmx2g -XX:MaxMetaspaceSize=256m

%JMETER_HOME%\bin\jmeter -n -t test.jmx -l temp\test -e -o report