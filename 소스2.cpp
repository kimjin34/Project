#include <iostream>
#include <string>
using namespace std;

class Member{
public:
	int id;
	string name;
	int grade;
	void printInfo(){
		cout << "학번:" << id << " 이름:" << name << " 학년:" << grade << endl;
	}

};

int main(){
	Member m[5];

	int g, i; 
	string n;
	for (int j = 0; j < 5; j++){
		cin >> g >> i >> n;

		m[j].grade = g;
		m[j].id = i;
		m[j].name = n;
		
	}
	for (int j = 0; j < 5;j++)
		m[j].printInfo();

	

}