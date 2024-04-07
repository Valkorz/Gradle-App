#ifndef USER_DATA_HEADER
#define USER_DATA_HEADER
#include <iostream>
#include <fstream>
using namespace std;

namespace cpp{

    class UserData{
    private:
        int num;
    public:
        UserData(int num){
            this->num = num;
        }
        void exportData(char* path){
            ofstream dataFile(path);
            dataFile << num;
            dataFile.close();
        }
        void importData(char* path){
            //TODO
        }
    
    };

}

#endif