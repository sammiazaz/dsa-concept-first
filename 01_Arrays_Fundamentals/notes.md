## 5. Arrays
 
### 5.1 Introduction
 
An **array** is an indexed collection of a **fixed number** of **homogeneous** (same type) data elements.
 
```
Array of int with 5 elements:
 
Index:  [0]  [1]  [2]  [3]  [4]
Value:  10   20   30   40   50
         ↑
     a[0] = 10
```
 
**Advantage:** Represent multiple values using a single variable name → better readability.
 
**Disadvantage:** Fixed in size. Once created, cannot grow or shrink.  
→ Solution: Use **Collections** (ArrayList, etc.) for dynamic sizing.
 
---
 
### 5.2 Array Declaration
 
**Single Dimensional:**
```java
int[] a;      // Recommended ✅ — type and name clearly separated
int []a;      // Valid
int a[];      // Valid
 
// INVALID — cannot specify size at declaration time:
int[5] a;     // INVALID
```
 
**Two Dimensional (6 valid ways):**
```java
int[][] a;
int [][]a;
int a[][];
int[] []a;
int[] a[];
int []a[];
```
 
**Three Dimensional (10 valid ways):**
```java
int[][][] a;
int [][][]a;
int a[][][];
int[] [][]a;
int[] a[][];
int[] []a[];
int[][] []a;
int[][] a[];
int []a[][];
int [][]a[];
```
 
**Tricky Multi-variable Declarations:**
```java
int[] a1, b1;     // a1=1D, b1=1D        → VALID
int[] a2[], b2;   // a2=2D, b2=1D        → VALID
int[] []a3, b3;   // a3=2D, b3=2D        → VALID
int[] a, []b;     // INVALID — [] before b is not allowed for 2nd variable
```
 
> **Rule:** If dimension is specified before variable name, it applies to the 1st variable only. Second variable onwards cannot have `[]` before its name.
 
---
 
### 5.3 Array Construction
 
Every array in Java is an **object**, created using the `new` keyword.
 
```java
int[] a = new int[3];
 
Memory Layout:
a ──→  ┌─────┬─────┬─────┐
       │  0  │  0  │  0  │   (default values = 0)
       └─────┴─────┴─────┘
        [0]   [1]   [2]
```
 
**Rules:**
 
**Rule 1:** Size must be specified at creation time.
```java
int[] a = new int[3];    // VALID
int[] a = new int[];     // INVALID — array dimension missing
```
 
**Rule 2:** Size zero is legal.
```java
int[] a = new int[0];
System.out.println(a.length);   // 0
```
 
**Rule 3:** Negative size → `NegativeArraySizeException` at runtime.
```java
int[] a = new int[-3];   // RE: NegativeArraySizeException
```
 
**Rule 4:** Allowed size types: `byte`, `short`, `char`, `int`.
```java
int[] a = new int['a'];    // VALID ('a' = 97)
byte b = 10;
int[] a = new int[b];      // VALID
short s = 20;
int[] a = new int[s];      // VALID
int[] a = new int[10l];    // INVALID — long not allowed
int[] a = new int[10.5];   // INVALID — float not allowed
```
 
**Rule 5:** Maximum size = Integer.MAX_VALUE = 2,147,483,647
```java
int[] a1 = new int[2147483647];    // VALID (but may get OutOfMemoryError)
int[] a2 = new int[2147483648];    // INVALID — too large (compile error)
```
 
**Array Type → Internal Class Name:**
| Array Type | Class Name |
|------------|-----------|
| `int[]` | `[I` |
| `int[][]` | `[[I` |
| `double[]` | `[D` |
 
---
 
### 5.4 Multi-Dimensional Array Creation
 
Java implements multidimensional arrays as **array of arrays** (NOT matrix form).  
Benefit: Saves memory — each row can have a different size (jagged arrays).
 
**Example 1 — 2D Jagged Array:**
```java
int[][] a = new int[2][];   // 2 rows, column size not yet decided
a[0] = new int[3];          // row 0 has 3 columns
a[1] = new int[2];          // row 1 has 2 columns
 
Memory:
a ──→ [ ref0 | ref1 ]
         │       └──→ [ 0 | 0 ]
         └──────────→ [ 0 | 0 | 0 ]
```
 
**Example 2 — 3D Array:**
```java
int[][][] a = new int[2][][];
a[0] = new int[3][];
a[0][0] = new int[1];
a[0][1] = new int[2];
a[0][2] = new int[3];
a[1] = new int[2][2];
```
 
**Valid/Invalid Constructions:**
```java
int[][] a = new int[3][4];      // VALID
int[][] a = new int[3][];       // VALID (jagged)
int[][] a = new int[][4];       // INVALID — must specify first dimension
int[][][] a = new int[3][4][5]; // VALID
int[][][] a = new int[3][4][];  // VALID
int[][][] a = new int[3][][5];  // INVALID — must specify from left to right
```
 
---
 
### 5.5 Array Initialization
 
When an array is created, all elements are automatically initialized to **default values**.
 
| Type | Default Value |
|------|--------------|
| `int`, `byte`, `short`, `long` | 0 |
| `float`, `double` | 0.0 |
| `boolean` | false |
| `char` | `\u0000` (blank space) |
| Object references | null |
 
```java
int[] a = new int[3];
System.out.println(a);       // [I@3e25a5  (hash of array object)
System.out.println(a[0]);    // 0
```
 
> **Note:** Printing an array reference calls `toString()` which returns `classname@hashcode`.  
> For `int[]`, class is `[I`, so output looks like `[I@3e25a5`.
 
**Replacing default values:**
```java
int[] a = new int[4];
a[0] = 10;
a[1] = 20;
a[2] = 30;
a[3] = 40;
a[4] = 50;   // RE: ArrayIndexOutOfBoundsException: 4
a[-4] = 60;  // RE: ArrayIndexOutOfBoundsException: -4
```
 
> If you access any index outside [0, length-1], you get `ArrayIndexOutOfBoundsException`.
 
---
 
### 5.6 Declaration + Construction + Initialization in One Line
 
```java
// Long way:
int[] a;
a = new int[3];
a[0] = 10;
a[1] = 20;
a[2] = 30;
 
// Short way (all in one line):
int[] a = {10, 20, 30};   // ✅ Recommended
```
 
**Other examples:**
```java
char[] ch = {'a', 'e', 'i', 'o', 'u'};
String[] s = {"Alice", "Bob", "Charlie"};
```
 
**Multi-dimensional shortcut:**
```java
int[][] a = {{10, 20, 30}, {40, 50}};
 
Memory:
a ──→ [ ref0 | ref1 ]
         │       └──→ [ 40 | 50 ]
         └──────────→ [ 10 | 20 | 30 ]
```
 
**3D example:**
```java
int[][][] a = {{{10,20,30},{40,50}}, {{60},{70,80},{90,100,110}}};
 
// Access:
System.out.println(a[0][1][1]);   // 50 ✅
System.out.println(a[1][0][2]);   // RE: ArrayIndexOutOfBoundsException ❌
System.out.println(a[1][2][1]);   // 100 ✅
System.out.println(a[1][2][2]);   // 110 ✅
System.out.println(a[1][1][1]);   // 80 ✅
```
 
> **Important:** Shortcut (inline initialization) only works if declaration, construction, and initialization are all done on the **same line**.
```java
int[] x = {10, 20, 30};   // VALID ✅
 
// This FAILS:
int[] x;
x = new int[3];
x = {10, 20, 30};         // CE: illegal start of expression ❌
```
 
---
 
### 5.7 length vs length()
 
| | `length` | `length()` |
|--|----------|------------|
| Type | Variable (final) | Method |
| Applies to | Arrays | String objects |
| Usage | `a.length` | `s.length()` |
 
```java
int[] x = new int[3];
System.out.println(x.length);    // 3 ✅
System.out.println(x.length());  // CE: cannot find symbol ❌
 
String s = "Hello";
System.out.println(s.length());  // 5 ✅
System.out.println(s.length);    // CE: cannot find symbol ❌
```
 
**For multidimensional arrays**, `length` gives only the **base (outermost) size**:
```java
int[][] a = new int[6][3];
System.out.println(a.length);      // 6 (number of rows)
System.out.println(a[0].length);   // 3 (columns in row 0)
 
// Total size (manual calculation):
// a[0].length + a[1].length + ... + a[n].length
```
 
---
 
### 5.8 Anonymous Arrays
 
Arrays created **without a name**, used only for immediate one-time use.
 
```java
new int[]{10, 20, 30, 40}         // 1D anonymous array
new int[][]{{10,20},{30,40}}      // 2D anonymous array
 
// INVALID — cannot specify size in anonymous arrays:
new int[3]{10, 20, 30};           // INVALID
```
 
**Practical use — passing directly to a method:**
```java
class Test {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{10, 20, 30, 40}));   // 100
    }
 
    public static int sum(int[] x) {
        int total = 0;
        for (int x1 : x) {
            total = total + x1;
        }
        return total;
    }
}
```
 
> The array is created just to call `sum()`. After the call, it's no longer needed → perfect for anonymous arrays.
 
**You CAN give a name to an anonymous array (then it's no longer truly anonymous):**
```java
int[] a = new int[]{10, 20, 30, 40};   // VALID
```
 
---
 
### 5.9 Array Element Assignments
 
**Case 1 — Primitive Arrays:**  
Allowed types = any type that can be **promoted** to the declared type.
 
```java
// int[] accepts: byte, short, char, int
int[] a = new int[10];
a[0] = 97;      // VALID (int literal)
a[1] = 'a';     // VALID (char promoted to int)
byte b = 10;
a[2] = b;       // VALID (byte promoted to int)
short s = 20;
a[3] = s;       // VALID (short promoted to int)
a[4] = 10l;     // INVALID (long cannot go into int)
 
// float[] accepts: byte, short, char, int, long, float
```
 
**Case 2 — Object Type Arrays:**  
Allowed: declared type objects OR its **child class** objects.
 
```java
Object[] a = new Object[10];
a[0] = new Integer(10);       // VALID
a[1] = new Object();          // VALID
a[2] = new String("hello");   // VALID (String extends Object)
 
Number[] n = new Number[10];
n[0] = new Integer(10);       // VALID (Integer extends Number)
n[1] = new Double(10.5);      // VALID (Double extends Number)
n[2] = new String("hello");   // INVALID — String does NOT extend Number
```
 
**Number class hierarchy:**
```
Object
  └── Number
        ├── Integer (I)
        ├── Byte    (B)
        ├── Short   (S)
        ├── Long    (L)
        ├── Float   (F)
        └── Double  (D)
```
 
**Case 3 — Interface Type Arrays:**  
Allowed: objects of classes that **implement** the interface.
 
```java
Runnable[] r = new Runnable[10];
r[0] = new Thread();           // VALID (Thread implements Runnable)
r[1] = new String("hello");    // INVALID — String does not implement Runnable
```
 
**Summary Table:**
 
| Array Type | Allowed Element Types |
|------------|----------------------|
| Primitive arrays | Any type promotable to declared type |
| Object type arrays | Declared type OR child class objects |
| Interface type arrays | Implemented class objects |
| Abstract class arrays | Child class objects |
 
---
 
### 5.10 Array Variable Assignments
 
**Case 1:** Primitive element promotions do NOT apply at array level.
 
```java
int[] a = {10, 20, 30};
char[] ch = {'a', 'b', 'c'};
 
int[] b = a;     // VALID — same type
int[] c = ch;    // INVALID — char[] ≠ int[] at array level
```
 
**Promotion chart:**
```
char  ──────────────→ int    (VALID element promotion)
char[] ─────────────→ int[]  (INVALID array promotion)
int   ──────────────→ long   (VALID)
int[] ──────────────→ long[] (INVALID)
double ─────────────→ float  (INVALID — cannot downcast)
String ─────────────→ Object (VALID)
String[] ───────────→ Object[] (VALID — child array to parent array)
```
 
**Case 2:** When assigning arrays, only **reference** is reassigned (elements are NOT copied). Size doesn't matter, but **type must match**.
 
```java
int[] a = {10, 20, 30, 40, 50, 60, 70};
int[] b = {80, 90};
a = b;   // VALID — a now points to b's array
b = a;   // VALID
```
 
**Case 3:** Dimensions must match.
 
```java
int[][] a = new int[3][];
a[0] = new int[4][5];   // INVALID — 2D cannot go into slot expecting 1D
a[0] = 10;              // INVALID — int cannot go into int[]
a[0] = new int[4];      // VALID ✅
```
 
**Example — Jagged 2D reassignment:**
```java
int[][] a = new int[3][2];
a[0] = new int[3];     // VALID — sizes can differ
a[1] = new int[4];     // VALID
a = new int[4][3];     // VALID — type and dimensions match
```
 
---