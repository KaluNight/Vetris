#remove old build
if [ -d "build" ];then
	echo -e "\n\033[1;31mRemoving old build\033[0m";
	rm -r build
fi

#create build directory
echo -e "\n\033[1;31mCreating directory\033[0m";
mkdir build

#compilation
echo -e "\n\033[1;31mCompilyng\033[0m";
mkdir build/class
javac -sourcepath src src/vetris/Main.java -d build/class -version

#copy resources
echo -e "\n\033[1;31mCopying resources\033[0m";
cp -r src/resources build/class/resources

#archive
echo -e "\n\033[1;31mArchiving\033[0m";
mkdir build/release
jar cvmf MANIFEST.MF build/release/Vetris.jar -C build/class .

#proguard
echo -e "\n\033[1;31mProguard\033[0m";
proguard @config.pro

#end
echo -e "\n\033[1;31mCompleted\033[0m\n";