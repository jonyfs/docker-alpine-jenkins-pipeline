FROM jenkins:alpine

USER root

RUN echo "jenkins ALL=NOPASSWD: ALL" >> /etc/sudoers

USER jenkins

COPY plugins.txt /usr/share/jenkins/plugins.txt

RUN /usr/local/bin/plugins.sh /usr/share/jenkins/plugins.txt

# Copy file to create user
#COPY create-user.groovy /usr/share/jenkins/ref/create-user.groovy.d/create-user.groovy

#COPY jenkins.sh /usr/local/bin/jenkins

RUN echo 'jenkins.model.Jenkins.instance.securityRealm.createAccount("user1", "password123")' | java -jar jenkins-cli.jar -s http://localhost:8080/ groovy =
