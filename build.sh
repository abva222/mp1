#!/bin/bash
mkdir -p junit/4.12/
cd junit/4.12/
wget http://central.maven.org/maven2/junit/junit/4.12/junit-4.12.jar
cd ../../ # Wouldn't let me write the .jar files unless I was in the directory...
mkdir -p org/hamcrest/hamcrest-core/1.3/
cd org/hamcrest/hamcrest-core/1.3/
wget http://central.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
cd ../../../../
mkdir -p target/classes/
javac -d target/classes/ src/test/java/MyStack.java
mkdir -p target/test-classes/
javac -d target/test-classes/ -cp .:junit/4.12/junit-4.12.jar:.org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar.: src/test/java/MyStackTest.java src/test/java/MyStack.java
java -cp .:junit/4.12/junit-4.12.jar:org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:target/test-classes/:target/classes/:src/test/java/* org.junit.runner.JUnitCore MyStackTest
