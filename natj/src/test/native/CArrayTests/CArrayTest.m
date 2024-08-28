/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/


#import "CArrayTest.h"

void initCharArray( char arr[] ) {
    memcpy(arr, "initCharArray", 14 * sizeof(char));
}

//void initBooleanArray( bool arr[] ) {
//    memcpy(arr, "initBooleanArray", 14);
//}
//
//void initIntArray( int arr[] ) {
//    memcpy(arr, (int[]){1,1,2,3,5,8,13,21,34,55,89} , 11 * sizeof(int));
//}
//
//void initFloatArray( float arr[] ) {
//    memcpy(arr, "initFloatArray", 14);
//}
//
//void initDoubleArray( double arr[] ) {
//    memcpy(arr, "initDoubleArray", 14);
//}
//
//void initLongArray( long arr[] ) {
//    memcpy(arr, "initLongArray", 14);
//}
//
//void initShortArray( short arr[] ) {
//    memcpy(arr, "initShortArray", 14);
//}

void initCharPtrArray( char** ptr ) {
    char* str = "initCharPointerArray";
    for (int i = 0; i < 5; i++) {
        ptr[i] = malloc( 4 * sizeof(char) );
        memcpy(ptr[i], &str[ 4 * i ], 4 * sizeof(char) );
    }
}

void initNSStringArray( id* strArr ) {
    for (int i = 0; i < 100; i++) {
        strArr[i] = [NSString stringWithFormat:@"%d",i];
    }
}

char* returnCharArray() {
    char* arr = malloc(15 * sizeof(char));
    memcpy(arr, "returnCharArray" , 15 * sizeof(char));
    return arr;
}
//
//int* returnIntArray() {
//    int* arr = malloc(11 * sizeof(int));
//    memcpy(arr, (int[]){1,1,2,3,5,8,13,21,34,55,89} , 11 * sizeof(int));
//    return arr;
//}
//bool* returnBooleanArray();
//float* returnFloatArray();
//double* returnDoubleArray();
//long* returnLongArray();
//short* returnShortArray();

char** returnCharPtrArray() {
    char* str = "returnCharPtrArray";
    char** toRet = malloc( 6 * sizeof( char* ) );
    for (int i = 0; i < 6; i++) {
        toRet[i] = malloc( 3 * sizeof(char) );
        memcpy(toRet[i], &str[ 3 * i ], 3 * sizeof(char) );
    }
    return toRet;
}

void* argumentToRet( void* ptr ) {
    return ptr;
}

char* getTail( char array[] , long fromIndex ) {
    return &array[fromIndex];
}

long*** complexPtrToRet( long* ptr ) {
    long** toPtrPtr = malloc( sizeof(void*) );
    memcpy(toPtrPtr, &ptr, sizeof(void*) );
    long*** ptrToPtrToPtr = malloc( sizeof(void*) );
    memcpy(ptrToPtrToPtr, &toPtrPtr, sizeof(void*) );
    return ptrToPtrToPtr;
}
