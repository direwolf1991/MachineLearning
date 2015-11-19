#!/bin/sh
#define constants that could change becouse of different project
PACKAGE_NAME=firstServiceClient
#define some constants
PROJECT_PATH=${PWD}
SRC_PATH=$PROJECT_PATH/src/$PACKAGE_NAME
BIN_PATH=$PROJECT_PATH/bin

#remove javaFile.txt file if it exists and then create javaFile.txt of the project
rm -f $PROJECT_PATH/javaFile.txt
find $SRC_PATH -name \*.java > $PROJECT_PATH/javaFile.txt

#remove bin directory if it exists and then create the bin directory of the project
rm -rf $BIN_PATH
mkdir $BIN_PATH

#compile the project
javac -d $BIN_PATH @$PROJECT_PATH/javaFile.txt

echo "compile done"