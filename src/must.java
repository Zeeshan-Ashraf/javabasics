////////////////////////////////////////////////////////////////////////
/* PDT */
////////////////////////////////////////////////////////////////////////

/***
 * PDT: 8 PDT = boolean byte char short int long float double
 * 1. can't be null
 * 2. no method associated coz it is not a Class
 * 3. starts with lowercase
 * 4. PDT is different from its equivalent Collections class e.g. int is not same as Integer (although they both store
 * integer but Class Integer has more functionality coz Integer class is wrapper over PDT int), Long Float Character,
 * Byte, Short
 * 5. PDT doesn't auto type cast like C
 */

// Note creating var without value assignment will cause compile error if read/accessed before initialised/value assigned
int i;  //default size = 4B = -2x10^9 to +2x10^9
int i = 100;
int i = 1000_000_000; //readble
int i = 0b101;  //storing 5 in int format in i (PDT does auto typecast if not loosing data)
int i = 0x7E;   //stores 50 in int format in i

//--↓ ERROR ↓ --
//(PDT doesn't auto typecast if narrowing but does auto type case if not narrowing i.e not loosing data)
int i = 1.5;    //error: incompatible types: possible lossy conversion from double to int


short j = 32767; //size = 2B  short j = 32768; will give ERROR of incompatible types from int to short
long l = 10000000000000000l;  // size = 8B  +-9x10^19
byte b = 15;     //size = 1B  -128 to 127

float f = 5.5;   //ERROR coz 5.5 is of size double
float f = 5.5f;  //CORRECT
double d = 5.5;  //4B

char c = 'a';  //char c = "a"; ERR: coz will try assign String "a" to var c of type char
c++; //stores 'b' in c by incrementing from 'a' to 'b'

boolean b = true;
boolean b = 0;  //ERROR incompatible types

/***
 * Type conversion, type casting, type promotion & assigment: widening is allowed during assigment
 * but narrowing will give compile error
 * we can cast from any type to any type
 */

// Hierarchy: double > float > long > int > char > short > byte

e.g:
        int i = 10;
        double d = i;  // Allowed widening
        short s = i;   // Error incompatible types
        short s = (short)i; //allowed but precision will be lost so large no can loop back to -ve
        short s1 = 1000;
        short s2 = 2000;
        int i = s1 * s2; //the result will be promoted to int to accomodate 2000000 & store in i

        //P.S we can cast any PDT -to-> any PDT & any non-PDT Class-to-> non-PDT Class
        int i = (int)'a';  //i will store Unicode value of 'a' i.e 97 (Java follows Unicode not ASCII)
        char c = (char)97;  //c will store 'a'
        int i  = (float)5.5;// i = 5


/***
 * Airthemtic operations
 */
int i = 10;
int j = 20;
int result = 10+20;

i++; //i = 11 from 10
i+=1; //i = 12 from 11
i-=1; //i = 11 from 12
i*=10; // i=110 from 11

int i = 8%3; //i=2 the remainder
int i = 10/3; //i=3 the quotient

System.out.print(5>=3) // prints true
//true statement
5==5
5>=3
'a'<='c'
"a" <= "c" //ERROR NOT ALLOWED to compare String
5<3 || 4>=2  //1st statement false 2nd true so  (false or true) = true
5<3 || 4>=2  //False 1st statement false 2nd true so  (false and true) = false
(5>=3) || ("a" <= "c")  //ERROR coz 2nd condition is wrong, we cant compare string to string directly
!(5>=3)  //false





long l = 0;
if (l==-1 || l<-2){
    System.out.print("if");
}
else if(l>=0)  //elif not allowed
    System.out.print("if else");
else System.out.print("else");  //new line is not mandatory only space is enough



// ternary operator
int i  = (5<2 || 6>10) ? 100 : 200;

// switch case
switch (i){   // only allowed type are: char, byte, short, int,  Character, Byte, Short, Integer, String or enum
    case 100, 200:
        System.out.print("100 or 200");
        break;
    default:
        System.out.print("default");
}


// for while loop
while(<only bolean type>){

}

int x;
for (x=0;x<5;x++){
    System.out.print(x);
}

for (int j=0;j<5;j++){
    System.out.print(j);
}

