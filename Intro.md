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


* ASCII values
ASCII stands for American school code for information interchange
It is a character encoding standard used in digital communication
Every character has an ASCII value associated to it.
'A'  > 'a'
65 > 97 = false

Conversion of one data type into another is called type casting 

int asciiOfA = (int) 'A';

'Z' > 'X' true

s1 = "Arun" 
s2 = "ArC"

s1 > s2


#1 Program to count the number of vowels and consonants in a string

Input - "linkedin"
output - vowels: 3 consonants: 5


#2 Program to count the number of uppercase, lowercase, numeric characters and special characters in a string

Input - "$TrIng@12^ArEF%n0"
Ouput - uppercase: 5, lowercase: 5 numbers: 3 special chars: 4




#3 Program to count the frequency of each character in a string (only smallcase alphabets)
Input - "elephant"
Output - e: 2 l: 1 p: 1 h: 1 a: 1 n: 1 t: 1

Input - "godisgood"
output - g: 2 o: 3 d: 2 i: 1 s: 1 o: 2

'a' - 'a' = 0
'b' - 'a' = 1
'z' - 'a' = 25

int freq[26]; freq['!']++

freq['e' - 'a']++;  = freq[4]++ freq['e']++ = freq[101]++
freq['l' - 'a']++; = freq[11]++ freq['z']++ = freq[122]++
freq['e' - 'a']++; 				freq['z'-'a'] = freq[25]
freq['p' - 'a']++;	
freq['h' - 'a']++;
freq['a' - 'a']++;
freq['n' - 'a']++;
freq['t' - 'a']++;


[0,,0,0,0,2,0,0,0,00,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0]

for i=0 to str.length()
	Sysout(str.charAt(i):)
	Sysout(freq[str.charAt(i) - 'a'])


#4 Program to print all the common characters in two strings in alphabetical order (only smallcase characters)
Input - 
String1: hhhellooz
String2: ghefoph
Output: ehho

'h'-'a' = 

i=7
freq1[26] = [0,0,0,0,1,0,0,3,0,0,0,2,0,0,2,0,0,0,0,0,0,0,0,0,0,0,1]

freq2[26] = [0,0,0,0,1,1,1,2,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0]

ehho

char ch = (char)97;
char ch = (char) (4 + 'a')

















#7 Program to print all the distinct characters in two strings  in alphabetical order (only smallcase characters)
Input - 
String1: hhhellooz
String2: ghefoph
Output: fglpz

#8 Program to check if two strings are anagrams of each other
Two strings are called anagrams if both the strings contain the same characters same number of times
Input:
String1: silent
String2: listen
Output: true

Input2:
String1: triangle
String2: integral
output: true

Input3:
String1: triangle
String2: integrally
output: false

#1 remove duplicate characters from a string (only smallcase characters)
Input - character
ouput - charte
Input - znnnno
output - zno


* Two pointers algorithm
It is an algorithm used to search for a pair of elements in a sorted array based on some condition.


Problem: Given a sorted array having N  integers, find if there exists any pair of elements such that their 
sum equal to X.
Input: 10, 20, 35, 50, 75, 80
X=70


for (i=0;i<N;i++) {
	for (j=i+1;j<N;j++) {
		if (arr[i] + arr[j] == X) {
		return true;
	}
	}
}
TC: O(n^2)

Two pointers:

i=0,j=5 (n-1)
a[i]+a[j]  = 90 > 70 j--

i=0,j=4
a[i]+a[j] = 85 > 70 j--

i=0,j=3
a[i]+a[j] = 60 < 70 i++

i=1 j=3
a[i]+a[j]=70 = X
so pair with sum 70 is (20,50)


Sort an array of 0s and 1s
Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] 


for (i=0;i<n;i++){
	if (a[i]==0) {
		countOfO++;
	}
	else {
		countOf1++;
	}
}

for (i=0;i<countOf0;i++){ 0, 0, 0, 0, 0, 1, 1, 1, 1, 1
	sysout(0+", ")
}
for (i=0;i<countOf1;i++){
	sysout(1+", ")
}


* Sorting Algorithms

Sorting is a technique in which we rearrange the elements of an array in either increasing or decreasing order.
There are many sorting algorithms available:
* Bubble sort
* Insertion sort
* Selection sort
* Quick sort
* Merge sort

Input: 12 11 13 5 6
Output: 5 6 11 12 13

These algorithms give the same output for a given input array, the difference is in their performance i.e. 
their time and space complexity.


* Bubble sort
Input: 5, 1, 4, 2, 8
Output: 1, 2, 4, 5, 8

i=0
5 1 4 2 8
1 5 4 2 8
1 4 5 2 8
1 4 2 5 8

i=1
1 4 2 5 8
1 2 4 5 8

i=2
1 2 4 5 8

i=3
1 2 4 5 8


i=0
12 11 13 5 6
11 12 13 5 6
11 12 5 13 6
11 12 5 6 13

i=1
11 12 5 6 13
11 5 12 6 13
11 5 6 12 13

i=2
11 5 6 12 13
5 11 6 12 13
5 6 11 12 13

i=3
5 6 11 12 13

TC: O(N^2)
SC: O(1)


* Insertion sort

Input: 12 11 13 5 6

First pass:

12 11 13 5 6

11 12 13 5 6

Second pass: 
11 12 13 5 6

Third pass:
11 12 13 5 6
5 11 12 13 6

Fourth pass:
5 11 12 13 6
5 6 11 12 13

TC: O(n^2)
SC: O(n)

* Selection sort

12 11 6 5 13

5 11 13 12 6

5 6 13 12 11

5 6 11 12 13	

for (int i=0; i<n; i++ { 
	min = arr[i];
	for (int j=i+1; j<n; j++) {
		if (arr[j] < min) {
			min = arr[j];
		}
	}
	// swap arr[i] and min
	int temp = arr[i];
	arr[i] = min;
	min = temp;
}

TC: O(n^2)
SC: O(1)

* find min element in an array
12 11 6 5 13


Swap two numbers:
input : a = 10, b = 20
ouput : a = 20, b = 10

int temp = a; // 10
a = b; // 20
b = temp; // 10


* Quick sort

Input: 4 5 3 2 7
ouput: 2 3 4 5 7

We will choose first element as pivot

arr[0] = 4 is pivot
partition the array such that all the elements smaller than 4 are on the left of it and all the elements greater than 4 are on the right of it

partition(arr)

array will become - 3 2 4 5 7

now call quick sort for first half {3,2} and second half {5, 7}

{3, 2}
3 is pivot
partition(arr)
array will become {2, 3}

{5, 7}
5 is pivot
partition(arr)
array will become {5, 7}


* Modulo Arithmetic

5 % 3 = 2

The range of int data type is -2^31 to 2^31-1

multiply two numbers a and b

1 <= a,b <=10^20

Output the result modulus 10^31+7

res = 10^20 * 10^20 = 10^40

Rules in modulo arithmetic:

1. (a+b)%c = (a%c + b%c)%c

Example:
a=15 b=17 c=7

(15 + 17) % 7 = 32 % 7 = 4
(15 % 7 + 17 % 7) % 7 = (1 + 3) % 7 = 4 % 7 = 4

Problem: Find sum of two numbers. Print the sum modulus 127.
Note: You can only use data type byte

Constraints:
1 <= a,b <= 127

a = 127 b = 127 

(127 + 127) % 127 = 254 % 127 = 0
(127 % 127 + 127 % 127) % 127 = (0 + 0) % 127 = 0 % 127 = 0


2. (a-b)%c = (a%c - b%c)%c 
a = 20 b = 4 c = 7

(20 - 4) % 7 = 16 % 7 = 2
(20 % 7 - 4 % 7) % 7 = (6 - 4) % 7 = 2 % 7 = 2


3. (a * b) mod c = (a % c * b % c) % c
a = 12 b = 13 c = 5 

(12 * 13) % 5 = 156  % 5 = 1
(12 % 5 * 13 % 5) % 5 = (2 * 3) % 5 = 6 % 5 = 1


* Modulo exponentiation

a ^ b

a,b <= 100

a^b = 100 ^ 100

Suppose x = 2 y = 3 p = 5
Compute (x^y) % p

(2^3)mod 5
8  mod 5
3


* Modulo Inverse

Given two integers a and m, find modulo inverse of a under m.

a * x = 1 (mod m)
and x should be less than m

Example:
a = 3 m = 11
(3 * 4) mod 11 = 12 mod 11 = 1 
This means 4 is modulo inverse of 3 under 11


(3 * 4) % 11 = (3 % 11 * 4 % 11) % 11

a = 10 m = 17
(10 * x) % 17 = 1
(10 * 12) % 17 = 120 % 17 = 1

"11223344" + "334458"
sum = 12
in op strig = sum %10
carry = sum/10
02



* Searching 

Problem : [10, 20, 30, 70, 80, 60, 20, 90, 40]
Find 20 in the array
Output: true (Boolean)

* Linear Search algorithm: When we traverse the whole array to search for an element, it is called linear search

for (int i=0; i<arr.length; i++) {
	if (arr[i] == X) {
		Sysout(i)
	}
}
return false;

Time complexity of linear search: O(n)

Problem : [10, 20, 30, 70, 80, 60, 20, 90, 40]
Find all the positions of 20
Output: 1, 6

* Binary search

It is a searching algorithm used in a sorted array by repeatedly dividing search interval into half.
It is a divide and conquer algorithm.

Input: 
arr[] = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170}, x = 90

size = 10
l is left most index of search interval, r is right most index of search interval
l = 0, r = 9
mid = (l + (r-1)) / 2 
mid = 4
check if arr[mid] == x
l = 5 r= 6, mid = 5
l = 6, r = 6, mid = 6
Now, arr[mid] < x, so x lies in the right half

l = mid + 1 = 5, r = 9
mid = (5 + (9-1)) / 2 = (5 + 8) / 2 = 13 / 2 = 6

check if arr[mid] == x
Now, arr[mid] < x, so lies in right half

l = 7, r = 9
mid = (7 + (9-1)) / 2 = (7 + 8) / 2 = 15 / 2 = 7
check if arr[mid] == x

Now, arr[mid] < x, so lies in right half

l = 8, r= 9
mid = (8 + 8) / 2 = 8

check arr[mid]
arr[mid] = x, so we have found x


Input: [2, 3, 4, 10, 40], x = 2

size = 5
l = 0, r = 4
mid = (l+r)/2 = (0+4)/2 = 2
check arr[mid]

Now, arr[mid] > x, so x lies in left half

l = 0, r = mid - 1 = 1
mid = 0

check arr[mid]

arr[mid] = x, so x is found at index mid

Time complexity of Binary Search: O(log(n))
Space complexity is O(1)

 

* Check if one string is rotation of another
String1: abcd String2: cdab 
output: true
String1: abcd String2: dcab
output: false



String1.concat(String1) = abcdabcd
check if String2 is part of concatenated string or not
if (String1.concat(String1).indexOf(String2) != -1) 
	return true
else 
	return false;



* Hashing

Hashing is a technique of transforming/mapping any given key into a value using a hash function.


[11, 12, 13, 14, 15, 21, 22, 23]

Hash function: x%10

[1, 2, 3, 4, 5]

key -> value
11 -> 1
12 -> 2
13 -> 3
14 -> 4
15 -> 5
21 -> 1
22 -> 2
23 -> 3

Hash function: x+2
key -> value
11 -> 13
12 -> 14
13 -> 15
14 -> 16
15 -> 17


There are data structures available in every programming language which implements/uses hashing.

* HashTable
It implements a hash table which maps key to values.

In a hash table, there are two things, one is key and the other is value.
We store key/value pairs in Hashtable

Hashtable<Integer, String> ht = new Hashtable<Integer, String>(3, 0.5);

ht.put(1, "firstValue");
ht.put(2, "secondValue");
ht.put(3, "thirdValue")


Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();

ht.put(1, 5);
ht.put(2, 6);
ht.put(3, 7)

Hashtable takes two arguments:
initial capacity: Default initial capacity is 11.
load factor: Default load factor is 0.75


int[] ar = new int[10]


* Hashmap
So it is same as Hashtable in syntax and functionality

The only difference between hastable and hashmap:
hashtable is synchronised and hashmap is non-synchronised

Synchronised means that only one thread of a process can access it at one point of time and non-synchronised means multiple threads can access it at one point of time.


* Time complexity:

Hashtable/Hashmap provides get() and put() methods in constant time. Time complexity is O(1) for get() and put().


* Applications of Hashtable/Hashmap:

find all the distinct elements of an array
[2, 4, 2, 3, 9, 3]
output: 4, 9
find all the duplicate elements of an array
input: [2, 4, 2, 3, 9, 3]
output: 2, 3


* Prefix Sum Subarray

[10, 20, 2, 3, 5]

for arr[2] = arr[0] and arr[1] are prefix
for element arr[i], prefix subarray is arr[0].....arr[i-1]

Prefix_sum = [10, 30, 32, 35, 40]

what is prefix sum subarray for arr[2] = Prefix_sum[2]
what is prefix sum subarray for arr[4] = Prefix_sum[4]

prefix_sum[0] = arr[0];
for (int i=1; i<n; i++) {
	prefix_sum[i] = prefix_sum[i-1] + arr[i];
}


* Kadane's algorithm

It is used to find largest sum of contiguous subarray

3 cases:

1. All positive elements in array:

[2, 4, 7, 9, 1]
complete array is the largest sum of contiguous subarray which is 23.

2. All negative elements in array:

[-2, -4, -7, -9, -1]

Largest element in this array will give us largest sum of contiguous subarray which is -1.


3. Mixture of positive and negative elements:

[-2, 4, -7, 9, 1]  = 10

[-2, -3, 4, -1, -2, 1, 5, -3]


* Find sub array with given sum 

[1, 4, 20, 3, 10, 5], sum = 33
output: start = 2, end = 4

curr_sum += arr[i] // 43

cur_sum - sum = have we already seen this sum before ?
38 - 33 = 5

HashMap<curr_sum, index>

[10, 2, -2, -20, 10], sum = -10
output: start = 0, end = 3

[10, 2, -2, -20, 10], sum = -15
output: No subarray


* Linked List
	* Single linked list
	* Doubly linked list
	* Circular linked list

What is linked list?
Linked list is a data structure where elements are not stored in a contiguous mannner.
The elements are linked to each other using memory address references.
Each node contains a data element and a reference to the next element in the list

Linked list vs Array ? (Advantages of LL):
 - The size of array is fixed but the size of LL is dynamic.

 - Insertion and deletion is array takes O(n) time but in LL, it takes constant time O(1).

 Drawbacks of LL:
  - Random  access of elements is not possible, to access elements/nodes in LL, we have to traverse the whole list

  - Extra space or memory is required to store next node references.


Linked list looks like this:
head -> 5|next -> 7|next -> 3|next -> 'a'|next -> 'm'|next -> 5.78|null -> null



* Doubly Linked list

* Circular Linked List



* Stacks

Stack is a linear data structure which allows operations at specific ends.
Stack is a Last In First Out (LIFO) or First In Last Out (FILO) data structure.

Example of stack is a pile of plates.

In a stack, insertion and deletion is only allowed at one end i.e. top.

Stack supports following operations:
* push - insert elements at the top of the list
* pop - remove elements from the top of the list, removes the topmost element
* peek - returns top most element
* size - returns size of stack
* isEmpty - returns true if the stack is empty, false otherwise


Stacks can be implemented:

* Using Arrays
* Using LinkedList


* problem:
Check if the expression has balanced parenthesis:
input: [(]){}
output: 

[({})] - true

[(]) - false

[()]{}{[()()]} - true

[) - false

()[]{} - true

()[{}]) - 

 
The bracket which opens first should be closed last 
		or
The bracket which opens last should get closed first







































