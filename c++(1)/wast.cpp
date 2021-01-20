#include<iostream>
int main()
{
	int test;
	scanf("%d", &test);
	while( test-- )
	{
		long int N;
		scanf("  %ld", &N);
		if(N == 2)
			printf("2 \n");
		else 
			printf ("%ld \n",N / 2 + 1) ;
	}

	return 0;
}