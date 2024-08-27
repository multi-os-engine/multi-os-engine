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


#import <Foundation/Foundation.h>

void initCharArray( char array[] );
//void initIntArray( int array[] );
//void initBooleanArray( bool array[] );
//void initFloatArray( float array[] );
//void initDoubleArray( double array[] );
//void initLongArray( long array[] );
//void initShortArray( short array[] );

void initCharPtrArray( char** ptr );
void initNSStringArray( id* strArr );

char* returnCharArray();
//int* returnIntArray();
//bool* returnBooleanArray();
//float* returnFloatArray();
//double* returnDoubleArray();
//long* returnLongArray();
//short* returnShortArray();

char** returnCharPtrArray();

void* argumentToRet( void* ptr );
char* getTail( char array[] , long fromIndex );
long*** complexPtrToRet( long* ptr );
