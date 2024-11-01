# Step 1: Gradle로 .war 파일 빌드
FROM gradle:8.2.1-jdk17 AS build

# 작업 디렉토리 설정
WORKDIR /app

# 소스 파일을 컨테이너에 복사
COPY . .

# .war 파일을 ROOT.war로 빌드
RUN gradle clean build

# Step 2: 톰캣 이미지를 사용하여 빌드된 .war 파일을 배포
FROM tomcat:10.1.31-jdk17

# 빌드된 .war 파일을 톰캣의 webapps 폴더에 ROOT.war로 복사
COPY --from=build /app/build/libs/*.war /usr/local/tomcat/webapps/ROOT.war

# 톰캣이 사용하는 8080 포트를 노출
EXPOSE 8080

# 톰캣 서버 실행
CMD ["catalina.sh", "run"]
