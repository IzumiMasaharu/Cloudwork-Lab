FROM openjdk:8-jre-alpine

LABEL maintainer=me
ENV JAVA_ARGS="-Dfile.encoding=UTF8 -Duser.timezone=GMT+08"
ENV JAR_FILE="productAddClient.jar"

COPY ./target/${JAR_FILE} ./

EXPOSE 8019

CMD java -jar ${JAVA_ARGS} ${JAVA_OPTS} /${JAR_FILE}

