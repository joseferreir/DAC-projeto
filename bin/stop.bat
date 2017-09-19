echo off
cls
echo “stop containes”
cd ..
docker-compose down

echo “Removendo imagens”

docker rmi -f ijm/projeto-db
#docker rmi -f npw/projeto-share
docker rmi -f ijm/projeto-core
docker rmi -f ijm/projeto-web
cls

echo “stop sucess”


