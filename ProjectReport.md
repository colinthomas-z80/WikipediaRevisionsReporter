# Project Report

Colin Thomas

## Challenge #1 Complete
To complete challenge #1, I edited the QueryEngineModule class so that it 
binds the WikipediaQueryEngine instead of the FakeQueryEngine to the QueryEngine Interface. This results
in a WikipediaQueryEngine being injected when the QueryEngine interface is called. 

## Challenge #2 Complete
Challenge #2 required the creation of a new module and interface to use dependency injection. I added the 
RevisionFormatterModule, and RevisionFormatterInterface. I also created an AlternativeRevisionFormatter 
class which formats the revision information in a more readable way. The RevisionFormatterModule allows us to 
decide which RevisionFormatter will be injected when the RevisionFormatterInterface is called.

## Challenge #3 Complete
Challenge #3 took me a bit of JavaDoc reading in order to complete. At first, I went straight for the
stream.foreach() method, but I felt like that was still an iterative solution. The Map and Collect methods 
allowed me to perform an operation on each element of the list and return it as a new one without the concept
of iteration. Still, I feel like it might still be happening in the background. 

## Reflection Question #1: Functional vs OO
At the moment I still prefer the iterative approach to string concatenation. The functional solution, and a lot
of functional programming I see in general, is very hard to read. There is probably a better way of solving the
problem than what I did, and perhaps that would be more readable. If I try to put myself in the perspective of
someone very familiar with Java Collections, I can begin to appreciate the elegance of a functional solution. The
OO solution is straightforward, and its purpose should be quickly recognizable. 

## Reflection Question #2: Polymorphism and Dependency Inversion
In this application, polymorphism offered the QueryEngine and RevisionFormatter the ability to take 
on multiple forms. Which form they assume, is injected at runtime. This ability engendered dependency
inversion by decoupling the WikipediaAnalyzer view from its hard-coded dependencies, and replacing them
with abstracted interfaces.

