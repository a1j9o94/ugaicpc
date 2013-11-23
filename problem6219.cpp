/*
	Solution to problem 6219 in the ICPC problem archive
	By: Adrian Obleton
*/

#include <iostream>
#include <stdlib.h>
#include <string>
#include <queue>
#include <math.h>

using namespace std;
int main(){

	//n is the number of candies
	int n;
	//m is the price of the candies multiplied by 100 to account for cent values
	int m;
	cin >> n;
	//string to take in money value because cin does not do floats
	string money;
	cin >> money;
	m = (int)(atof(money.c_str())*100);
	while(m != 0 && n != 0){
		//calories and costs for each candy.
		int candyCalories[n];
		int candyCosts[n];

		for(int i = 0; i < n; i++){
			cin >> candyCalories[i];
			candyCalories[i];
			string number;
			cin >> number;
			candyCosts[i] = (int)(atof(number.c_str())*100);
		}
		
		//an array of possible prices
		int possible[m+10];
		for(int i = 0; i < m+10; i++){
			possible[i] = 0;
		}
		possible[0] = 1;

		//an array of calories at each price value
		int totalCalories[m+10];
		//used to keep track of highest calorie value
		priority_queue<int> highestCal;

		//sets total calories at each point to 0 to make sure there are no garbage values
		for(int i = 0; i < m+10; i++){
			totalCalories[i] = 0;
		}
		for(int i = 0; i < n; i++){
			/*starting from the current costs, increment costs by 1 penny.
				if the current costs - the cost at i was possible, ie it was one,
				then the current costs is also possible
			*/
			for(int j = candyCosts[i]; j <= m; j++){
				possible[j] |= possible[j- candyCosts[i]];
				if(possible[j] == 1){
					/*total calores at each point = total calores of previous valid costs
						+ the calories for the current costs.
					*/
					totalCalories[j] = totalCalories[j - candyCosts[i]] + candyCalories[i];
					//the highest total calories will be at the top
					highestCal.push(totalCalories[j]);
				}
			}
		}
		cout << highestCal.top() << endl;
		cin >> n;
		cin >> money;
		m = (int)(atof(money.c_str())*100);
	}
}