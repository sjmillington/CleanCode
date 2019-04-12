# Comments

Comments are a necessary evil.

If programming languages were more expressive, they wouldn't be needed.

**Try to express the meaning of the code within the code itself.**

Comments are hard to maintain as the code changes over time. 

**Inccurate comments are worse than no comments at all**

### Comments do NOT make up for bad code.

Don't comment the code - clean it!

### Explain yourself in code

i.e instead of:

```$xslt
//Check to see if the employee is eligible for full benefits
if((employee.flags & HOURLY_FLAG) 
  && employee.age > 65){...}
```

do:

`if(employee.isEligibleForFullBenefits()){...}`


### Good Comments

Some comments are necessary or beneficial.

consider:

1. Legal Comments - copyright and authorship etc. 
2. Informative comments:

    ```$xslt
    //format matched kk:mm:ss EEE, MMM dd, yyyy
    Pattern timeMatcher = Pattern.compile(
     "\\d ..... );
    ```
    
    this could still be improved by moving to a class than handles date and time conversions.

3. Explanation of intent - `This is the best attempt to do x..`
4. Clarification:

    Just making something more readable  
    `assertEquals(a.compareTo(a) == 0 //a == b`

5. Warning of consequences - `//warning this is NOT thread safe.`
6. TODOS - `//todo - this thing` ides will also show todos
7. Amplification - to emphasise something REALLY important
8. Javadocs.

### Bad comments

1. Mumbling
2. Redundant comments from deleted code. 
3. Obvious comments that just say the same thing again:
    
   ```$xslt
    //The processor delay for this component
    protected int backgroundProcessorDelay = -1;
    ```

4. Misleading comments
5. Mandated comments - comments for the sake of it i.e a javadoc for EVERY function AND variable
6. Journal comments:  

   `//@v1.1 it does this, @v1.2 it does this now.`  
    source code does this now..

7. Noise - `//default constructor`. duh..

8. Use function names instead of comments

    ```$xslt
    ArrayList moduleDependees = smodule.getDependSubsystems();
    String mySubsystem = subSysMod.getSubsystem();
    if(moduleDependees.contains(ourSubSystem));
    ```
    
    rather than `//check if the module depend on the sub......`

9. Position Markers - `// ACTIONS //////////////////////////`
10. Closing brace comments:

    ```$xslt
    void myMethod{
     ...
     
     } //myMethod
     
    ```
    
11. Attributions - `/* Added by Bill */`
12. Commented out code - Others will think it's important and not delete it.
13. HTML comments - No html in source code comments
14. TMI - keep it short
15. inobvious connection
16. **Javadocs in non-public code** - there is no point, and it's a waste of time.

### Footnote

Explain as little as it takes for the code to make sense. 
It's good to talk about technical things used in the code. i.e algorithms employed. 


    
    





