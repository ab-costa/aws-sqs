export CLASSPATH=target/sqs-1.0-SNAPSHOT.jar
export className=SqsApplication
echo "## Running $className..."
shift
mvn exec:java -Dexec.mainClass="br.com.abcosta.aws.sqs.$className"