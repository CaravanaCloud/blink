#!/bin/bash
set -ex

aws cloudformation deploy \
    --template-file "template.cfn.yaml" \
    --stack-name "blink-lex" \
    --capabilities "CAPABILITY_IAM"
    
