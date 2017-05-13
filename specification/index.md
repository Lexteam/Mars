Mars Language Specification
===========================
The Mars programming language will follow a similar syntax to that of Groovy.
It will use the file extension `.mars`.

## Access Modifiers
- `public`
- `private`

If no modifier is set, then public is assumed.

### public
The public modifier should be used to allow global access.

### private
The private modifier restricts access to that package only.

### Examples
| Modifier  | Example               | Note                                     |
| --------- | --------------------- | ---------------------------------------- |
| public    | string name           | Optionally you can do public string name |
| private   | private string name   |                                          |

## Keywords
See [keywords.md](keywords.md).

## Semi-colons?
Although they will be supported, they are not required.

## Setting the package
To set the package all you have to do is have it in the correct directory and add the following line to the top of your source file.

```
package uk.jamierocks.example
```

## Comments
Comments are defined by using `//`.

```
// This is a comment
```

### Long comments
```
/*
 * This is a long comment
 */
```
A long comment is defined by it's start `/*` and it's end `*/`, the content it contains can be formatted however the programmer likes.

## Source files
Unlike in Java, you don't have to name the source file after the class it will contain, infact source files can have multiple classes/structs/etc.
The most basic class would define a main method.

```
void main(string[] args) {
    println("Hello, World!")
}
```

## Classes
The following is a example of a class.

```
package xyz.lexteam.example // Set the package

class ExampleClass { // Set the class - see I have used no access modifier because it will default to public

	private string name // Declared a private field - notice no semi-colon?

	string getName() { // Declared a method - see no access modifer - again public is assumed.
		return name
	}

}
```

## Structs
Unlike the likes of Java, Mars has structs.

```
package xyz.lexteam.example

struct Book {
    
    string name
    string author
    
}
```

You can make an instance of that struct like the following.

```
new xyz.lexteam.example.Book("iWoz", "Steve Wozniak")
```

## Enums
The following is an example of a enum.

```
package xyz.lexteam.example

enum OperatingSystem {
    
    OSX('mac'),
    LINUX('nix'),
    WINDOWS('dows');
    
    private string identifier
    
    OperatingSystem(string identifier) {
        this.identifier = identifier
    }
    
}
```
