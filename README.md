# OCC - Name scoring application

## Introduction
This application is a command-line utility that accepts a filename of names and then "scores" them and returns the score. Individual names are scored by the sum of their letters' position in the alphabet (A = 1, B = 2, ...). The entire list's score is the sum of the individual name scores times their position number in the list. 

## Build
To build the application:

cd src/org/peb/scorer
java *.java

## Run
To run the application type:

cd src
java org.peb.scorer.ScoreUtility
