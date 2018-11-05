#!/bin/bash
sshpass -p ${your_pwd} ssh root@$p2 << eeooff
cd /home/app/
sh client.sh
exit
eeooff
echo "$p1 cluster done!"
