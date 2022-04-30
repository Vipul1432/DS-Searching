// Binary Search

#include <iostream>
using namespace std;

int binarySearch(int array[], int x, int start, int end)
{

    // Repeat until the pointers cross each other
    while (start <= end)
    {
        int mid = start + (end - start) / 2;

        if (array[mid] == x)
            return mid;

        if (array[mid] < x)
            start = mid + 1;

        else
            end = mid - 1;
    }

    return -1;
}

int main(void)
{
    int array[] = {2, 3, 4, 5, 6, 7, 8};
    int x = 6;
    int n = sizeof(array) / sizeof(array[0]);
    int result = binarySearch(array, x, 0, n - 1);
    if (result == -1)
        printf("Element Not found");
    else
        printf("Element is found at index %d", result);
}