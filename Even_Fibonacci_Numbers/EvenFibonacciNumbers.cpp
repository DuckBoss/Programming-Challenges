#include <iostream>
#include <vector>

using namespace std;

int main(int argc, char* argv[]) {

	if (argc != 4) {
		cout << "This program requires 2 starting integers, and the max terms to count!" << endl;
		exit(0);
	}

	int start1 = atoi(argv[1]);
	int start2 = atoi(argv[2]);
	int maxCount = atoi(argv[3]);
	if (maxCount < 2)
		maxCount = 2;

	vector<int> fullList;
	fullList.push_back(start1);
	fullList.push_back(start2);
	fullList.resize(maxCount);

	for (int i = 2; i < maxCount; i++) {
		fullList[i] = fullList[i - 1] + fullList[i - 2];
	}
	cout << "Result - {";
	for (int fib : fullList) {
		if (fib % 2 == 0) {
			cout << " " << fib;
		}
	}
	cout << " }" << endl;

	system("pause");
	return 0;
}
