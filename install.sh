#!/usr/bin/env bash
# helper to reinstall into local environment
rm -rf ~/.groovy/grapes/com.cloudbees.thirdparty/
rm -rf /Volumes/OSX/m2r/com/cloudbees/thirdparty/
mvn clean source:jar javadoc:jar install
