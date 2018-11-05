#!/bin/bash
  cd /${your_path}/eureka-parent/eureka-server
  mvn clean install -P$1 -Dmaven.test.skip=true
  echo 'node=>>' $1
  sshpass -p ${your_pwd} scp target/eureka-server.jar root@$2:/wisesoft/app/jar/
  sshpass -p ${your_pwd} ssh root@$2 << eeooff
  cd /wisesoft/app/
  sh server.sh
  exit
  eeooff
  echo $1 "done!"
