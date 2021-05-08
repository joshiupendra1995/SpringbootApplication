Steps to create docker compose build so that the postgres db and springboot app runs within same docker container

1 . once you cloned this repo you will find two files DOCKER and docker-compose.yml
2. keep the files as it is just build your project using maven (mvn clean install)
3. check whether you have docker installed in your windows,linux or mac whichever OS you prefer.
4. also check if you have docker-compose installed in your systems.
5. If not installed check this link out for installation process (https://docs.docker.com/docker-for-windows/install/)
6. now you just need to follow below commands to build docker image of your app.
7. go inside the project where the DOCKER file lies enter( docker build --tag=uj-app:latest . )
8 .you can give any name so basically tag commmand tags the image and container to the name you provide and builds the same image for you.

Note: (If you want to run springboot or spring app individually without any db interation then go for DOCKER else docker-compose)

9. if you want both postgresql and app run in the same container go for docker-compose.
10. type in (docker-compose build)
11. then (docker-compose up)
12. waalllahhh!!!!!!!!! you have created your first docker containerized app.
13. Use postman  or swagger-ui to test the api.
14 .anyone faces any issues like not able to connect to postgresql instance or app not running within container let me know.
