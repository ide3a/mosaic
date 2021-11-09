# syntax=docker/dockerfile:1

FROM maven:3-openjdk-11

RUN apt update && apt install -y software-properties-common

RUN apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv-keys 87637B2A34012D7A
RUN add-apt-repository "deb http://ppa.launchpad.net/sumo/stable/ubuntu focal Release" -y
RUN apt update && apt install sumo sumo-tools sumo-doc python3-pip python3-dev -y && \
    pip install jupyterlab numpy pandas glom pyproj lxml pytest
# RUN curl -fsSL https://code-server.dev/install.sh | sh

RUN useradd -ms /bin/bash smartcities-mosaic
USER smartcities-mosaic
WORKDIR /home/smartcities-mosaic

# COPY .code-server .code-server
# ENV CODE_SERVER_CONFIG .code-server/config.yaml
# RUN code-server --install-extension 'vscjava.vscode-java-pack'

# ENV JUPYTER_ENABLE_LAB yes
EXPOSE 8443
EXPOSE 8888

# CMD /bin/bash
CMD jupyter notebook --allow-root --port=8888 --ip 0.0.0.0 --no-browser