Luna Bytecode Specification
===========================
Luna will be a extensive programming language built similarly to Java. Like Java it will have bytecode, Luna's bytecode will be referenced as LiteCode.

Luna will use packages and classes, and work similarly to Java.

## Return types
- `bool`
- `char`
- `string`
- `int`
- `float`
- `double`
- `void`

### bool
Booleans in Luna code will be represented using 'bool'. In LiteCode 'B' will be used.

### char
Characters in Luna code will be represented using 'char'. In LiteCode 'C' will be used.

### string
Strings in Luna code will be represented using 'string'. In LiteCode 'S' will be used.

### int
Integers in Luna code will be represented using 'int'. In LiteCode 'I' will be used.

### float
Floating points in Luna code will be represented using 'float'. In LiteCode 'F' will be used.

### double
Doubles in Luna code will be represented using 'double'. In LiteCode 'D' will be used.

### void
Void in Luna code will be represented using 'void'. In LiteCode 'V' will be used.

### Examples
| Type    | Example                           |
| ------- | --------------------------------- |
| bool    | (B) uk.jamierocks.Example#getBool(); |
| char    | (C) uk.jamierocks.Example#getChar(); |
| string  | (S) uk.jamierocks.Example#getString(); |
| int     | (I) uk.jamierocks.Example#getInt(); |
| float   | (F) uk.jamierocks.Example#getFloat(); |
| double  | (D) uk.jamierocks.Example#getDouble(); |
| void    | (V) uk.jamierocks.Example#main(); |

## Fields vs Methods
Referencing fields and methods is very similar in the fact that you just have to specify arguments for a method.

| Type   | Example                                |
| ------ | -------------------------------------- |
| Field  | (B) uk.jamierocks.Example#isStarted;   |
| Method | (B) uk.jamierocks.Example#isStarted(); |
