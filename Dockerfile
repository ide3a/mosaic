#syntax=docker/dockerfile:1

#FROM maven:3-openjdk-11
FROM ubuntu:focal

RUN apt update && apt install -y software-properties-common maven

RUN apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv-keys 87637B2A34012D7A
RUN add-apt-repository "deb http://ppa.launchpad.net/sumo/stable/ubuntu focal Release" -y
RUN apt update && apt install sumo sumo-tools sumo-doc -y && apt install python3-dev python3-pip -y \ 
    && pip3 install --upgrade pip
RUN pip3 install pyzmq numpy scipy matplotlib jupyter pandas flake8 protobuf==3.18.0
RUN apt install libzmq3-dev -y && apt install libczmq-dev -y

RUN useradd -ms /bin/bash mosaic

EXPOSE 5544

USER root
#WORKDIR /home/root
#WORKDIR /home/mosaic

CMD /bin/bash
