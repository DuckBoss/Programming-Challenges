#include <iostream>
#include <math.h>

using namespace std;

int main(int argc, char* argv[]) {
	if (argc != 2) {
		cout << "This program requires 1 integer input!" << endl;
		exit(0);
	}

	long totalSum = 0;
	int inputtedNum = atoi(argv[1]);
	
	for (int i = 1; i <= inputtedNum; i++) {
		long val = (long)pow(i, i);
		totalSum += val;
		cout << val << endl;
	}
	cout << "Total Sum - " << totalSum <<endl;

	return 0;
}
