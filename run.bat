echo off
cls
echo “Construindo o projeto backup”

mvn clean install

echo “Criando containe docker”

docker-compose up -d --build

echo “exibindo log containe core”

docker logs -f $(docker ps -q -f name=" projeto-core")
