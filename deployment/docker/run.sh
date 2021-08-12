sudo docker-compose up -d --build

sudo docker run \
    -v $PWD/mailslurper-config.json:/opt/mailslurper/config.json \
    -p 2500:2500 -p 8010:8010 -p 8015:8015 \
    marcopas/docker-mailslurper