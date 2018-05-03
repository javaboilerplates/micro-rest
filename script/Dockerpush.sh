echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
docker push javaboilerplates/micro-rest
docker push javaboilerplates/micro-rest:0.0.0