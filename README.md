# Homework7-Java
HW Coding Exercise

See the HW7 Folder in the Files section for a sample testing application that your team will need to improve.  Sure, it works, but the code needs to be modified every time a new Animal class is added.  You have to take the classes provided and change them so that the AnimalClassTester class can test new Animal classes without needing to be changed.

Some background:  Your team is working at the ACME Toy factory.   ACME is committed to producing quality toys for children.   To enhance the educational impact, the toys will say three things about the animal that they are.  When the toy is tapped a certain way, the toy will state one of three facts about the animal.  Your team is handed proof of concept code that shows that the new classes produced by the Designers can be tested.  (We must make sure the that the things the toy says are what we mean it to say.  That batch of cursing toys is a disaster that we are still dealing with.)

After looking at the existing code, you convince your team leader that the code needs to be refactored so that it is easier to use in the future.  Your team lead agrees, and she wants you to rewrite the AnimalClassTester class so that it is closed for modification, but is open to testing new Animal classes (open for extension).    

As you and your team look over the code, you realize that you might need to change the existing animal classes as well.  Again, your team leader agrees to your proposal.  But she adds a caveat:  You need to write the TreeClimbingOctopus class and use this class to demonstrate that the AnimalClassTester is indeed following the Open/Closed principle.

So your team must:

refactor (rewrite) the AnimalClassTester class to follow OCP
refactor the existing Animal classes as needed
write the TreeClimbingOctopus class and test it using the rewritten AnimalClassTester class to demonstrate OCP
Easy, right?

Creative problem solving is encouraged.  There is more than one right answer.  There is more than 1 wrong answer as well.  

NOTE: This assignment will be difficult because you will need to determine the intent behind some one else's code, and then re-write (refactor) that code to complete the assignment.  

For maximum success on this assignment, follow this path:

Determine HOW the AnimalClassTester can be modified so that is can be closed for modification.
Determine HOW the different animal classes are similar.
Determine HOW you to make the existing animal classes polymorphic.
 Refactor the various animal classes.
Refactor the AnimalClassTester class to use polymorphism when testing an object.
Write the TreeClimbingOctopus class.
You have succeeded if:
If the AnimalClassTester does not need to be modified to test the TreeClimbingOctopus class.
 

HW Report (One per group)

The HW report must have the following:

A link to your group's GitHub account which will have your group's source code
Describe any problems your group had writing the code
Did you change the classes that were tested?  Why or why not?
Describe your team's solution.  Explain how it meets the criteria given.
Do you think unit testing is important? Why or why not?
Name 3 key parts of the Observer pattern
When would you use the Observer pattern?  What problem does it solve?
Name 3 key parts of the Strategy pattern
When would you use the Strategy pattern?  What problem does it solve?
