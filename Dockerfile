FROM openjdk:22

COPY ./out/production/CVBuilder /app
WORKDIR /app

ENTRYPOINT ["java","Main"]
