To get the suspiciousness score for a program, build its maven directory in the src directory of the root folder. The coverage information is altered if there is more than one test suite in the test dirctory, so at any point only one test suite can be run against the program.The instructions to get the score are:
# GETTING STARTED:
1. Test and install primitive hamcrest (needed for Tarantula and Tacoco)
	cd primitive-hamcrest
	mvn test
	mvn install
2. Compile Tacoco (generates the coverage JSON file required by Tarantula)
	cd tacoco
	mvn compile
	mvn test

# RUNNING FAULT LOCALIZATION:
## 1. GENERATING THE COVERAGE MATRIX
	1.1 	cd /to/your/project/root
	1.2		mvn test
	1.3		mvn dependency:build-classpath -Dmdep.outputFile=cp.txt
	1.4		export CLASSPATH=`cat cp.txt`:$CLASSPATH
	1.5		export CLASSPATH={your project absolute path}/target/test-					classes:{your project absolute path}/target/classes:$CLASSPATH
	1.6		cd /to/tacoco/project/root
	1.7		mvn dependency:build-classpath -Dmdep.outputFile=cp.txt
	1.8		export CLASSPATH=`cat cp.txt`:$CLASSPATH
	1.9		export CLASSPATH={tacoco project absolute path}/target/test-				classes:{tacoco project absolute path}/target/classes:$CLASSPATH
	1.10	mvn dependency:copy-dependencies -DoutputDirectory=lib
	1.11	java -javaagent:lib/org.jacoco.agent-0.7.4.201502262128-runtime.			jar=destfile=jacoco.exec,dumponexit=false org.spideruci.					tacoco.TacocoRunner {your project absolute path}/target/test-classes
	1.12	mvn -q exec:java -Panalyzer -Dtacoco.										sut={/absolute/path/to/system/under/test's/root/dir} -Dtacoco.				exec={/absolute/path/to/tacoco/root/directory}/jacoco.exec -Dtacoco.		json={/path/where/to/store/coverage/file/filename}.json -Dtacoco.			fmt=COMPACT -Dtacoco.pp
## 2. RUNNING TARANTULA
	1.1 	cd /to/tarantula/root/directory
	1.2 	mvn exec:java -Dexec.mainClass="org.spideruci.tarantula.Tarantula" -		Dexec.args="/home/rhythm/Desktop/APR/jtcas/coverage.json"

## CLEANING UP:
	1.	cd {to/the/project/root}
			rm cp.txt
			mvn clean test
	2.	cd {to/where/JSON/file/is/stored}
			rm {filename}.JSON
	3.	cd {to/tacoco/project/root}
		 	rm jacoco.exec
			rm cp.txt
			mvn clean test
	4.	cd {to/primitive/hamcrest/root}
			mvn clean test
	5.	cd {to/Tarantula/root}
			mvn clean test
You could also run the getscore script in the main directory. It will only work on a Linux machine and must be reun from the root folder itself. The script will display the results in a file called output.txt which is created in the root folder.