One of the Hacker rank test given problem shared :-
Maze Red team chases the blue team and results. Code added in Java

The chase game (100 marks) 
company hr has decided to conduct entertainment and fun activities for the quarter. one such activity is the chase game. in the game, there will be two teams, a chasing team and an escaping team. the game will be played in a maze of n*n slots where only one member will be present at a particular slot. 
hr has divided the employees into two teams - team red (chasing team) 
team blue (escaping team) 
team red will try to chase and catch the team blue members. there are few conditions though for the game: 
one person can catch only one person. 
a person can catch the member only in the same row. 
for example: a member of team red has two members of team blue in his row then he can catch only one of them. if the member was in the same column he cannot catch him. 
a red team member cannot catch a member of the blue team if he is more than d units away. a member of the red team will be represented by r and a member of the blue team will be represented by b. hr wants to know the maximum number of blue team members which will be caught by red team members given the positions of members in the maze. can you help hr so they can prepare for the gifts accordingly for the winners? 
example: 
given below is a maze of 4*4. a member of team red cannot catch a blue team member which is more than 2 units away. a single slot is considered a single unit. row 1: both the blue team members can be caught by the red team members. 
row 2: the red team member can catch two of the blue team members. but as one person can catch only one person, only one of them will be caught. 
row 3: both the blue team members can be caught as both are in reach of red team members. 
row 4: both the blue team members can be caught as both are in reach of red team members. 
the total number of blue team members which can be caught are 7. 
input format 
the first line of input consists of the numbers of test cases, t. 
the first line of each test case consists of two space-separated integers, n and d respectively. 
next n lines each consists of n space-separated integers representing the position of red team member or blue team members represented by r and b respectively. 
constraints 
1&lt;= t &lt;=10 
1&lt;= n &lt;=100 
1&lt;= d &lt;=n 
output format 
for each test case, print the maximum number of blue team members which can be caught. 
sample testcase 1 
input 
1 
4 2 
r r b b 
b b b r 
r b r b 
r b b r 
output 
7

