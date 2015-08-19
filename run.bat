@echo off
echo Copiando executavel
copy libs\src\out\artifacts\TrabLFA_jar\TrabLFA.jar bin\run.jar
echo executando
java -jar bin\run.jar < %1
echo ===\> SIDA: ino/ino.ino