#!/bin/bash
cd /${your_path}/eureka-client
nodes=(8081 8082 8083 9091 9092 9093)
ips=(ip1 ip2)

  mvn clean install -P${nodes[0]} -Dmaven.test.skip=true
  sshpass -p ${your_pwd} scp target/eureka-client.jar root@${ips[0]}:/home/app/jar/eureka-client8081.jar

  mvn clean install -P${nodes[1]} -Dmaven.test.skip=true
  sshpass -p ${your_pwd} scp target/eureka-client.jar root@${ips[0]}:/home/app/jar/eureka-client8082.jar

  mvn clean install -P${nodes[2]} -Dmaven.test.skip=true
  sshpass -p ${your_pwd} scp target/eureka-client.jar root@${ips[0]}:/home/app/jar/eureka-client8083.jar

  mvn clean install -P${nodes[3]} -Dmaven.test.skip=true
  sshpass -p ${your_pwd} scp target/eureka-client.jar root@${ips[1]}:/home/app/jar/eureka-client9091.jar

  mvn clean install -P${nodes[4]} -Dmaven.test.skip=true
  sshpass -p ${your_pwd} scp target/eureka-client.jar root@${ips[1]}:/home/app/jar/eureka-client9092.jar

  mvn clean install -P${nodes[5]} -Dmaven.test.skip=true
  sshpass -p ${your_pwd} scp target/eureka-client.jar root@${ips[1]}:/home/app/jar/eureka-client9093.jar

  ./start-client.sh node1 ${ips[0]}
  ./start-client.sh node2 ${ips[1]}
