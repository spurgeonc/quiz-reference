# Use the official Ubuntu 22.04 image as the base
# This provides a stable and well-supported foundation for our devcontainer
FROM mcr.microsoft.com/vscode/devcontainers/base:ubuntu-22.04

# Set the default shell to bash
ENV SHELL=/bin/bash

# Install Git
RUN apt-get update && apt-get install -y git

# Install OpenJDK 17
# OpenJDK is an open-source implementation of the Java Development Kit (JDK)
# We choose version 17 as it is the latest long-term support (LTS) release
RUN apt-get update && apt-get install -y openjdk-17-jdk

# Install Gradle
# Gradle is a powerful and flexible build automation tool for Java projects
# We specify the desired Gradle version using the GRADLE_VERSION environment variable
ENV GRADLE_VERSION=8.7
RUN wget https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-bin.zip \
    && unzip gradle-${GRADLE_VERSION}-bin.zip \
    && mv gradle-${GRADLE_VERSION} /opt/gradle \
    && rm gradle-${GRADLE_VERSION}-bin.zip
ENV PATH="/opt/gradle/bin:${PATH}"