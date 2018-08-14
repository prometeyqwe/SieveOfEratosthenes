#include <iostream>
#include <vector>
void qwe(int p, int m, int s);
using namespace std;
vector<int> vec1;
int main(){
	
	vector<int>::iterator iter;
	int max;
	cout << "Enter the upper limit: ";
	cin >> max;
	
	for(int j = 0, i = 2; j < max; i++,j++){
		vec1.push_back(i);
	}

	

	int p = 2;
	
	qwe(p, vec1[vec1.size()-1], vec1.size());

	for(int i=0; i < vec1.size(); i++){
		if(vec1[i]>0)
			cout << vec1[i] << " ";
	}
	cout << endl;

	system("pause");
	return 0;
}

void qwe(int p, int max, int size){
	for(int num_p=2; p*num_p <= max; num_p++){
		for(int i = 0; i < size; i++){
			if(vec1[i] == num_p*p){
				vec1[i] = -1;
				break;
			}
				
		}
	}
	int next_num;
	for(next_num=0; next_num < size; next_num++){
		if(vec1[next_num] > p && vec1[next_num]>0)
			break;
	}

	if(vec1[next_num]*2<size)
		qwe(vec1[next_num], max, size);
	
}