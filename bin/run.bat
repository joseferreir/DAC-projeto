echo off
cls
echo “Construindo o projeto”
cd ..
mvn clean install

echo “Criando containe docker”

docker-compose up -d --build
cls

echo “exibindo log containe core”

docker logs -f $(docker ps -q -f name=" projeto-core")
