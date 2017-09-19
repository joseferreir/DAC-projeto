# PARANDO CONTAINERS
docker-compose down

# REMOVENDO IMAGENS
docker rmi -f ijm/projeto-db
#docker rmi -f npw/projeto-share
docker rmi -f ijm/projeto-core
docker rmi -f ijm/projeto-web


# REMOVENDO VOLUME
#docker volume remove ./bd:/var/lib/postgresql
