FROM jenkinsci/jenkins:alpine

USER root

RUN apk add --update bash wget maven nodejs && npm install npm@latest -g && rm -rf /var/cache/apk/*

USER jenkins

RUN /usr/local/bin/install-plugins.sh git matrix-auth workflow-aggregator docker-workflow blueocean credentials-binding

ENV JENKINS_USER admin
ENV JENKINS_PASS admin

# Skip initial setup
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false -Djava.awt.headless=true

COPY executors.groovy /usr/share/jenkins/ref/init.groovy.d/
COPY default-user.groovy /usr/share/jenkins/ref/init.groovy.d/

VOLUME /var/jenkins_home