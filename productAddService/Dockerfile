FROM openjdk:8-jre-alpine

LABEL maintainer=me
ENV JAVA_ARGS="-Dfile.encoding=UTF8 -Duser.timezone=GMT+08"
ENV JAR_FILE="productAddService.jar"

COPY ./target/${JAR_FILE} ./

EXPOSE 8011

CMD java -jar ${JAVA_ARGS} ${JAVA_OPTS} /${JAR_FILE}

