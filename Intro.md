Intro to Computer Science
Computer science is a study of algorithms, computation which is done with the aid of computers. 

    Hardware : Physical devices which we can see and touch. Eg: Mouse, keyboard, cpu, monitor, floppy, pen 	drive
		Input - Eg: Keyboard, Mouse, scanners, etc
		Output - Monitor, Printer
		Storage - pen drive, CD, Floppy, hard disk, etc
			Primary Storage - Random access memory (RAM) - temporary storage, gets clear upon restart.
			Secondary Storage - hard disk, pen drive, CD, floppy.
			Tertiary Storage - cloud storage like Google drive, one drive

	Software: the program that makes the hardware work
		System Software: Operating system, device drivers
		Application software: web browser, notepad

	Internet and its technologies
	Internet is a network of connected devices or networks.
		Frontend - HTML, CSS, Javascript, React (Javascript framework)
		Backend - Java, PHP, Node.js
		Databases - SQL, MongoDB, Cassandra

Full stack development = frontend + backend
MERN stack - MongoDB, Express.js, React, Node.js

Binary Number System is made of 0 and 1

Units of storage:
	Bit - Binary digit (0 or 1)
	Byte - 8 bits (00110011)
	Kilo Bytes - 1024 bytes
	Mega byte - 1024 Kilo bytes (KB)
	Giga byte (GB) - 1024 Mega bytes (MB)


	Decimal to Binary conversion
5 / 2 = 1
2 / 2 = 0
1 / 2 = 1

5 = 101

        remainder
8 / 2 =    0
4 / 2 =    0
2 / 2 =    0
1 / 2 =    1

8 = 1000

		remainder
9 / 2 =  1
4 / 2 =  0
2 / 2 =  0
1 / 2 =  1

9 = 1001

			remainder
12 / 2 = 	0
6 / 2 = 	0
3 / 2 = 	1
1 / 2 = 	1

12 = 1100


	Binary to Decimal conversion

1100 = 1 * 2^3 + 1 * 2^2 + 0 * 2^1 + 0 * 2^0 = 1 * 8 + 1 * 4 + 0 * 2 + 0 * 1 = 8 + 4 + 0 + 0 = 12

10101 = 1 * 2^4 + 0 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0 
	  = 1 * 16 + 0 * 8 + 1 * 4 + 0 * 2 + 1 * 1
	  = 16 + 0 + 4 + 0 + 1
	  = 21

111 = 1 * 2^2 + 1 * 2^1 + 1 * 2^0
	= 1 * 4 + 1 * 2 + 1 * 1
	= 4 + 2 + 1
	= 7


Basics of Programming

* Program
It is a set of instructions which acts as input to computer and gives some output

* Algorithm
It is a sequence of steps to be followed to complete any task or solve any problem

* Source code
Whatever we write in a program is called source

* Compiler
Compiler is a software which converts a program into a format which computer understands and can run.

* Install Java
https://www.java.com/en/download/manual.jsp
To open command prompt:
1. Type window key + r
2. run dialog will open, write cmd in it and press enter
3. A black screen dialog should open

javac -version

* Hello World

* Data types

char - means character 'a', 'A', 'x', '%', '?'
string - means words or sentences "Hello", "Hello world", "My name is Shashank"
boolean - means true or false
byte - same as integer, range is -128 to 127
short - same as integer, range is -32,768 to 32,767
int - means integer 5, 65, -3, range is -2,147,483,648 to 2,147,483,647
long - means integer, range is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float - stores decimal numbers upto 6-7 decimal places, 5.32, 6.3452345
double - stores decimal numbers upto 15 decimal places



* Variables

Variables are containers for storing values

* Add Two numbers


* Data types
	** Primitives
					default		size
		byte          0			1 byte
		short		  0         2 bytes
		int 		  0			4 bytes
		long		  0L		8 bytes
		float		  0.0f      4 bytes
		double		  0.0d      8 bytes

		boolean		  false     1 bit
		char          \u0000	2 bytes
	** Non primitive
		String - combination of characters, it is like words and sentences in english
				"Hello", "Hello world"
		Array - combination of any data type, array is like a list
				integer array - 1,5,6,2,8 - 20 bytes
				float array - 43.432, 78.65, 85.4, 9.0 - 16 bytes
				char array - 'a', 'z', 'x', '?', '%', - 10 bytes

Operation - 
a + b - addition
Here, a and b are operands
+ is the operator

a=10
b=10
a++ + ++b
11 + 10 = 21
b

Post increment - add one and then use
pre increment - use and then add one

a=10
a++
++a

b=10
b--
--b

a=10
b=10
a-- + --b = 9 + 10 = 19


* Operators
	Unary Operator
		- operators which need only one operand
		post increment: a++ 
		pre increment: ++a 
		post decrement: a--
		pre decrement: --a


	Arithmetic Operator
		- +, -, , /, %
	Shift Operator
		- 
	Relational Operator
		- >, <, <=, >=, == (equals operator), != (Not equal to)
	Bitwise Operator
		- 
	Logical Operator
		Logical AND, &&
		Logical OR, ||

		0 && 0 = 0
		0 && 1 = 0
		1 && 0 = 0
		1 && 1 = 1

		0 || 0 = 0
		0 || 1 = 1
		1 || 0 = 1
		1 || 1 = 1


	Assignment Operator
		- =, +=, -=, =, /=, %= (short hand operators)


		a = 10
		b = 5
		b += a => b = b + a => b = 5 + 10 => 15
		
		b -= a => b = b - a => b = 5 - 10 => -5

		a %= b => a = a % b => 0
		

* Operators assignment:

* Control Structure


* If else ladder

	if (condition is true) {
		....
		..
		..
		..

	}
	else if (second condition is true) {
		....
		..
		..
		..
	}
	else if (third condition is true) {
		....
		..
		..
	}
	.
	.
	.
	.
	else {
		....
		.
		..
		..
	}

* Odd even problem

* Leap year
	2020 % 4 = 0
	2022 % 4 != 0

	(1000, 2000, 3000, 1900, 1800, 2100 ) % 400 == 0

	Given a year, find if it is a leap year. Leap year is the year that is multiple of 4. But, multiples of 100 which are not multiples of 400 are not leap years.

	Scanner sc=new Scanner(System.in);
       int year = sc.nextInt();
             	if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0) )){
                    	System.out.println("YES");
                	}
                }
              	else {
                   System.out.println("NO");
              	}

* Switch case

Switch case is very similar to if-else but it reduces the complexity of if-else

switch (condition) {
	case 1: 
	 ....
	case 2: 
	 ....
	case 3:
	 ...
}

* Ternary operator

Takes three operands
It is a short hand for if-else

condition ? if true do this : if false do this

int age = 30;

age >= 18 ? System.out.print("You can drive") : System.out.print("You can't drive");

if (age >= 18) {
	System.out.print("You can drive");
}
else {
	System.out.print("You can't drive");
}

int a = 8
int b = 8
int c = 500;

a < b ? c = 100 : c = 200;

System.out.print(c); // 200

----------------------------------
int x = 10;
int y =20;
if (x == 8 || y == 20) {
	print("Hello");
}
if (y % 2 != 0) {
	print("world");
}
else {
	print("Newton");
}
Output: HelloNewton

Shashank Jha
SDE-2 at Expedia

* Loops
Loops are control structures which are used to execute a statement many number of times until a condition is satisfied.

* while loop

while (boolean condition) {
	......

	update statement
}

* for loop

for (initialization statement; boolean condition; update statement) {
	......
}

* do while loop

do {
	...
}
while (boolean condition)

* Type conversion
	Upward conversion
		int a = 120;
		float f = a; // f is 120.0


	Downward conversion
		float f = 3.14;
		int d = f; // compilation error
		int d = (int)f; // explicit type conversion, d will become 3

		byte = -128 to 127	
		int = 	-2147483648 to 2147483647

		byte a = 127;
		byte b = 4;
		byte c = a + b; // -125

		int a = 2147483647
		int b = 2
		int c = a + b; // -2147483647

* Run time exception
A = 100 
B = 0
A/B -> Run time exception
B / A = 0


* Functions

function is a reusable sub-program

function definition or function declaration:

	return_type function_name (int a, float f,......) {
		// function body


		return statement;
	}

return_type is the data type of the output this function produces

* Function declaration / definition

int getSum (int a, int b) {
	int sum = a + b;

	return sum;
}

* Function call

int result1 = getSum(2, 3); // 5
int result2 = getSum(8, 10); // 18
int result3 = getSum(4, 3); // 7

System.out.print(getSum(4, 5)) // 9

System.out.print(9)



* Function demo

* void return type

void is a keyword in java which means empty

* Bytecode
	Compile - javac FuncDemo.java
	A file named FuncDemo.class will  get created
	Run - java FuncDemo

	This className.class file contains bytecode and this is run by JVM.
	This class file can be run on any OS or any machine.

* JVM = Java virtual machine
It is an abstract which provides a run time environment in which java bytecode can be executed.

* JRE = Java Runtime Environment
JRE = JVM + Other set of libraries which are used for java development

* JDK = Java Development kit
JDK = JRE + Development tools like javac, java

Set-Up:
Setting up JDK in your development environment is super easy, just follow the below simple steps. 

Installation of JDK

Go to this Oracle’s official Download Page through this link
Select the latest JDK version and click Download and add it to your classpath.
Just check the JDK software is installed or not on your computer at the correct location, for example, at C:\Program Files\Java\jdk11.0.9.

Set JAVA_HOME for Windows:

Right-click My Computer and select Properties.
Go to the Advanced tab and select Environment Variables, and then edit JAVA_HOME to point to the exact location where your JDK software is stored, for example, C:\Program Files\Java\jdk11.0.9 is the default location in windows.


* Array
Array is a data structure or collection which contains elements of similar data type.

[1, 5,7,8,9]

['a', 'c', 'd', ....]
[5.43, 8.9, 43.2....]
["Hello", "hello2", "nojahd"....]

Arrays are index based which starts from 0.
[1,5,7,8,9]
array size = 5
first index = 0
last index = 4

* declaration of array

dataType variableName[]; or dataType[] variableName; or dataType []variableName;

Example - int arr[]; or int[] arr; or int []arr; 
char arr[]; or char[] arr; or char []arr;

* instantiation of array

variableName = new dataType[size];


Example - arr = new int[10]; 
When we instantiate an array, compiler will allocate some memory to this array.
Total memory of this array = size of one int * size of array = 4 bytes * 10 = 40 bytes

int arr[] = new int[10];

* Accessing the elements of array

int arr[] = new int[10];
arr[0] = 4;
arr[1] = 8;
arr[2] = 6;
arr[3] = 0;
...
arr[9] = 12;
arr[10] = 40; // error (ArrayIndexOutOfBoundsException)

System.out.print(arr[5]);
System.out.print(arr[1]); // 8


* 2-D array (Matrix)
1-D array = [1,2,3,4,5,6,6,7,7,7,7,7,6,5,3,3,67,,76];

[	1, 2, 3,
	4, 5, 6,
	7, 8, 9,
	12, 14, 67,
	45, 76, 54	]

int a[][];

int a[][] = new int[5][6]; // 5 is no.of rows and 6 is no. of columns

int a[] = {1, 2, 3, 4, 5}; // initialising a 1-D array

int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

	0 1 2
  0	1 2 3
  1	4 5 6
  2	7 8 9

rowIndex and colindex of 3 = (0, 2) (row, col)


* Accessing elements of 2-D array

int arr[][] = new int[3][3];

arr[0][0] = 1;
arr[0][1] = 2;
arr[0][2] = 3;
arr[1][0] = 4;
arr[1][1] = 5;
arr[1][2] = 6;
arr[2][0] = 7;
arr[2][1] = 8;
arr[2][2] = 9;


for (int i=0; i<3; i++) { // rows
	for (int j=0; j<3; j++) { // columns
		System.out.print(arr[i][j] + " ");
	}
	System.out.println();
}

1 2 3 6 9 8 7 4


* GCD - Greatest common divisor / HCF

8 - 1, 2, 4, 8
12 - 1, 2, 3, 4, 6, 12
common - 1, 2, 4
HCF/GCD - 4

48 - 1, 2, 3, 4, 6, 8, 12, 16, 24, 48
36 - 1, 2, 3, 4, 6, 9, 12, 18, 36
common - 1, 2, 3, 4, 6, 12
HCF/GCD - 12

* LCM - Lowest common multiple

4 - 4, 8, 12, 16, 20, 24..
6 - 6, 12, 18, 24..
common - 12, 24....
LCM - 12

LCM * HCF = a * b
LCM = (a * b) / HCF
LCM = (8 * 12) / 4 = 96 / 4 = 24

* Prime numbers

11 - 1, 11
27 - 1, 3, 9, 27

17 = 1, 
16 = 1, 2, 4, 8, 16
24 = 1,2, 3, 4, 6, 8, 12, 24
18 = 1,2*9, 3*6,6*3, 9*2, 18*1



for (int i=2; i<=n/2; i++) {
	if (n % i == 0) {
		// false
	}
}
If we find any number between 2 and n-1 which divides it completely, it is not prime

static boolean isPri



* Frequency of elements in array
Each element of array ranges between 1 and 100.

input = [3, 6, 3, 9, 6, 4, 11]
3: 2
6: 2
9: 1
4: 1

// a new array of size 101
frequency = [0, 0, 0, 2, 1, 0, 2, 0, 0, 1]

i=0
input[i]: frequency[input[i]]
3: frequency[3]
3: 2
frequency[input[i]] = 0

i=1
input[i]: frequency[input[i]]
6: frequency[6]
6: 2

i=2
input[i]: frequency[input[i]]
3: frequency[3]
3: 2

i=3
input[i]: frequency[input[i]]
9: frequency[9]
9: 1
.....


* GCD frequency

* GCD of array

[2, 4, 6, 5]

gcd(2,4)
2= 1, 2
4= 1, 2, 4
gcd = 2

gcd(2,4), 6
2 = 1, 2
6= 1, 2,3 ,6
gcd = 2

gcd(8, 2)
2= 1,2
8=1,2,4,8
gcd = 2

GCD of array is 2


2=1,2
5=1,5
gcd=1

GCD of array is 1



* Find missing element

6
[2, 4, 1, 6, 5]

2+4+1+6+5 = 18

Sum of first N integers = (N * N+1) / 2
						= (6 * 7) / 2
						= 42 / 2
						= 21

Missing element = 21 - 18 = 3

int sum;
for(int i =0; i<size; i++ {
	sum += arr[i]; // sum = sum + arr[i]
}

int sumOfN = (N * N+1) / 2

int missingElement = sumOfN - sum;



* Print all the distinct elements of array

input: [3, 6, 3, 9, 6, 4]
output: 3 6 9 4

* Print all the duplicate elements of array

input: [3, 6, 3, 9, 6, 4]
output: 3 6

freq = [0,0,0,2,1,0,2,0,0,1,0,0,0,0,0,0,0,0]



* Bit manipulation

Binary numbers are base 2 number system

Decimal numbers are Base 10 number system

254 = 2 * 10^2 + 5 * 10^1 + 4 * 10^0
	= 2 * 100 + 5 * 10 + 4 * 1
	= 254

101 = 1 * 2^2 + 0 * 2^1 + 1 * 2^0
	= 1 * 4 + 0 * 2 + 1 * 1
	= 4 + 0 + 1
	= 5

9 = 9 / 2 = 4 / 2 = 2 / 2 = 1 / 2 = 0
1001

12 = 12 / 2 = 6 / 2 = 3 / 2 = 1 / 2 = 0

1100

Bitwise operations:

Truth table:
X	Y	X&Y		X|Y		X^Y		~X		~Y
0	0	0		0		0		1		1
0	1	0		1		1		1		0
1	0	0		1		1		0		1
1	1	1		1		0		1		0

Bitwise AND operator (&) - result is 1 only if both bits are 1
Bitwise OR operator (|) - result is 0 only when both bits are 0, otherwise 1
Bitwise XOR operator (^) - Exclusive OR
Bitwise NOT operator (~ tilde) - Flips the bit

relational operator AND - (&&)
relational operator OR - (||)

if (true || false)
0||1 = 

6 || 8 =  true
6 | 8 =  0110 | 1000 = 1110 = 14

6 && 8 = true
6 & 8 = 0110 & 1000 = 0000 = 0

6 ^ 8 = 0110 ^ 1000 = 1110 = 14

~(6) = ~(0110) = 1001 = 9


Left shift operator: (<<) = Left shifts the bits of first operand and the second operand decides how many places to shift

110111 << 1 = 1101110
55 << 1 = 110

9 << 2 = 36

Right shift operator: (>>) = Right shifts the bits of first operand and the second operand decides how may places to shift

110111 >> 1 = 011011 
55 >> 1 = 27

9 >> 2 = 2
1001 >> 1 = 0100 = 4

1010 >> 1 = 0101


odd numbers = 1001, 101, 1111 = LSB is 1 = 
even numbers = 1010, 110, 1110 = LSB is 0

Most significant bit = left most bit
Least significant bit = right most bit 


1001 & 0001 = 0001 = 1
1111 & 0001 = 0001 = 1
65 & 1
1000000 & 0000001 = 0000000

1010 & 0001 = 0000 = 0

Bitwise AND of an odd number and 1 is always 1 and Bitwise AND of an even number and 1 is always 0

x = 64
if (x & 1 == 1) {
	// x is odd
} 
else {
	// x is even
} 


if (x % 2 == 0) {
	// even
} else {
	// odd
}



* We need a method to decide which alogorithm is better and in what terms

The method to compare the solutions of a problem to decide which one is more optimal. 

The method must be:
* independent of the machine and its configuration
* there should be a correlation with number of inputs
* can clearly distinguish between two alogrithms

* Time complexity
TC of an algoritm quantifies the amount of time taken by an algorithm to run as a function of the length of the input.
A simple program to check if x is present in an array
Each operation take constant time, c

	for (i=0; i<n; i++) { // c
	if (a[i] == x) { // c
		return true // c
	}
	else { // c
		return false; // c
	}
}

N*c + N*c + c + N*c + c = 3Nc + 2c = 10^20 = N
Big Oh Notation is used to determine worst case complexity of a program.
TC = O(N)

for (i=0; i<n; i++) {
	for (j=0;j<n; j++) 
		if (a[i] + a[j] == z) { 5+5+5+5+5
		return true;
	}
}



N*c + N*c + N*N*c + c = Nc + Nc + N^2c + c = 2Nc + N^2c + c = N^2
TC : O(N^2)

for 1 to 3{
	for 1 to 3{ 
		for 1 to 3 {
	 
	 System.out.print("Shashank");
}

}
}

TC: O(N^3)

* Space complexity

Space complexity of an algorithm quantifies the amount of space taken by an algorithm to run as a function of the length of input

Each variable takes constant space, c

int a[] = new int[n]; // n*c
int freq[] = new int[2*n]; // 2*n*c

 
for (int i=0; i<n; i++) { // c
	a[i] = input;
	freq[a[i]]++;
}


nc + 2nc + c = 3nc + c = n
SC: O(n)


* Recursion

The process in which a function calls iself is called recursion


int a() {
	...
	a();
	...
}

a is a recursive function

recursion is used when we can divide a problem into subproblems.

n = 5
find the sum of first n natural numbers using recursion.

1 + 2 + 3 + 4 + 5 = 15

n = 6
1 + 2 + 3 + 4 + 5 + 6 = 21

15 + 6

n=7
 21 + 7

n = 5
sum(4) + 5 // sum(n-1) + n
sum (3) + 4 + 5
sum (2) + 3 + 4 + 5
sum(1) + 2 + 3 + 4 + 5
1 + 2 + 3 + 4 + 5


int sumOfNaturalNumbers(int n) {
	
}

in a recursive program , we always need a base condition to stop infinite recursion.

Fibonacci series
0 1 1 2 3 5 8 13 21.....
3rd number in series = second + first
4th number = third + second
5th number = 4th + 3rd
6th number = 5th + 4th


nth number = (n-1)th + (n-2)th


Write a program to find nth number in fibonacci series.

int fib(int n) {

	// base condition
	if (n <= 1) {
		reutrn n;
	}
	
	return fib(n-1) + fib(n-2);
}


* Strings

'a','b', 'x', '.', ' '

Strings are collection of characters or concatenation (joining) of characters.

"Newton"
"I am studying strings"

int a = 10;
// Array literal
int a[] = {1, 2, 3, 4};
int a[] = new int[5];

// String literal
String str = "Newton school";

// using new
String str = new String("Newton School");




























