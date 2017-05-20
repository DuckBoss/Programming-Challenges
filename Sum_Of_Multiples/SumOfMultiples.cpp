#include <iostream>
#include <math.h>
#include <vector>

using namespace std;

int main(int argc, char* argv[]) {

	if (argc < 3) {
		cout << "This program requires 1 integer input and 1 multiple input!" << endl;
		cout << "NOTE: This program can handle multiple 'Multiple integer' inputs..." << endl;
		exit(0);
	}

	int givenNum = atoi(argv[1]);
	vector<int> givenMultiples;
	for (int i = 2; i < argc; i++) {
		givenMultiples.push_back(atoi(argv[i]));
	}

	
	int totalSum = 0;
	for (int g = 0; g < givenMultiples.size(); g++) {
		int sum = 0;
		for (int i = givenMultiples[g]; i < givenNum; i += givenMultiples[g]) {
			sum += i;
		}
		totalSum += sum;
	}

	cout << endl;
	cout << "Multiples Of - ";
	for (int multiple : givenMultiples)
	{
		cout << multiple << " ";
	}
	cout << "under " << givenNum << endl;
	cout << "Sum Of Multiples - " << totalSum << endl;
	

	system("pause");
	return 0;
}
