Mars Langauge Specification
===========================
The Mars programming language will follow a similar syntax to that of Groovy.
It will use the file extension `.mars`.

## Access Modifiers
- `public`
- `private`
- `protected`

If no modifier is set, then public is assumed.

### public
The public modifier should be used to allow global access.

### private
The private modifier restricts access to that class only.

### protected
The protected modifier restricts access to that package only.

### Examples
| Modifier  | Example               | Note                                     |
| --------- | --------------------- | ---------------------------------------- |
| public    | string name           | Optionally you can do public string name |
| private   | private string name   |                                          |
| protected | protected string name |                                          |

## Keywords
See [keywords.md](keywords.md).

## Semi-colons?
The use of semi-colons will be optional, although discouraged.

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

## Example class
The following is a example of a source file.

```
package uk.jamierocks.example // Set the package

class Example { // Set the class - see I have used no access modifier because it will default to public

	private string name // Declared a private field - notice no semi-colon?

	string getName() { // Declared a method - see no access modifer - again public is assumed.
		return name
	}
}
```
