# Change Directory to solution on local machine
echo $PWD
echo "DataSynthesis Java"
cd $PWD
cd ../

/usr/local/bin/mvn clean install
echo "Maven Build Completed"
/usr/local/bin/mvn package
echo "Maven Release Completed"
