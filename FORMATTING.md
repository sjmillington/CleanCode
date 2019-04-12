# Formatting

Consistency is key.

## The purpose of formatting

The code styling and readability set precedents that affect maintainability and 
extensibility of the code.

The style persists, even as the code is changed.

## Vertical formatting

### The newspaper metaphor

You read a newspaper vertically. Headline followed by story. Paragraph one gives
you a synopsis of the whole story, hiding the details until you want to know more.

Java files should be the same. The name should be simple but explanatory - enough
to tell us if we are in the right module. Detail should increase as we go downwards

**Use blank lines to separate concepts in files**

```$xslt
package ...

imports ...

class ...

variables...

functions..
``` 

Keep **dependent methods** close together vertically.

**Variable declarations** should be as close to their usage as possible. Local variables 
at the start of their functions.

**Instance variables** should always be declared at the top of the class.

Vertical ordering of functions - A function that is called should be **below** the function 
that is calling it. 

## Horizontal formatting

~ 45 characters is the optimal line length. That's this big:

|------------------------------------------|

Rule of thumb is to stay below line lengths of 120. 

### Indenting

indenting represents hierarchy. 

Can be tempting to break indenting for short loops and ifs. Try not to.

### Avoid dummy scopes

## Team rules

teams should agree on formatting. Space or tab indenting, number of indents, etc..







