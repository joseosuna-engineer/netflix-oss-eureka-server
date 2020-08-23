# netflix-oss-eureka-server
Eureka is a REST (Representational State Transfer) based service that is primarily used in the AWS cloud for locating services for the purpose of load balancing and failover of middle-tier servers.  At Netflix, Eureka is used for the following purposes apart from playing a critical part in mid-tier load balancing.

## See the registry
w3m -dump http://localhost:xxxx | less

## Run
java -Dlogs=$LOGS_DIR -jar eureka-server-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 &
