# riff-boot-java-encode


## Install

    riff system install --node-port

    riff namespace init function-chain --dockerhub $USER


## Deploy


    riff function create message-encoder  -n function-chain \
      --git-repo https://github.com/danupo068/riff-boot-java-encode-demo.git \
      --image $USER/riff-boot-java-encoder:v1 \
      --verbose

    riff function create message-encoder  \
      --git-repo https://github.com/danupo068/riff-boot-java-encode-demo.git \
      --image $USER/riff-boot-java-encoder:v1 \
      --verbose

# Verify

    riff service invoke message-encoder -n function-chain --text -- -w '\n' \
       -d "Hello every one,CF Summit 2019 - Happy Eventing"

    riff service invoke message-encoder  --text -- -w '\n' \
           -d "Hello every one,CF Summit 2019 - Happy Eventing"
# Logs

    kail run -d message-encoder -n function-chain

Based on the official Knative documentation, licensed under the Creative Commons Attribution 4.0 License,
and code samples are licensed under the Apache 2.0 License