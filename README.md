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
The public modifier should be used to allow global access to fields, methods or classes.

### private
The private modifier should be used to disallow global access to fields, methods or classes. This discludes package access.

### protected
The protected modifier should be used when only package access is wanted or required.

### Examples
| Modifier | Example             |
| -------- | ------------------- |
| public   | public string name  |
| private  | private string name |

## Key words
Keys word are restricted use - you can NOT use them as a field or method name.

- All the access modifiers
- All the return types
- Bool types (true and false)

## Semi-colons?
The use of semi-colons will be optional, although discouraged.

### Example
| Semi-colon? | Example      |
| ----------- | ------------ |
| With        | string name; |
| Without     | string name  |

## Setting the package
To set the package all you have to do is have it in the correct directory and add the following line to the top of your source file.

	package uk.jamierocks.example

## Commenting
Comments are defined by using `//`.

	// This is a comment, no?

## Example class
The following is a example of a source file.

	package uk.jamierocks.example // Set the package, and made a comment

	class Example { // Set the class - see I have used no access modifier because it will default to public

		private string name // Declared a private field - notice no semi-colon?

		string getName() { // Declared a method - see no access modifer - again public is assumed.
			return name
		}
	}
