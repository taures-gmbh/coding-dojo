# Zonk

## What is Zonk
Zonk is an addictive dice game. In each round the player rolls 6 dice. Then (s)he composes combinations of them. Each combination gives certain points.

Then player can take one or more dice combinations to their hand and re-roll remaining dice or save the score. Dice in the player's hand won't be
taken into account in subsequent rolls.

If no combinations can be composed - the situation is called "zonk". The player who rolled zonk loses all points in that round and the next player
takes a turn. So it's up to the player to decide when to re-roll and when to stop and keep their score.

## Task
Your task is simple - just evaluate the current roll and return the maximum number of points that can be scored from it. If no combinations can be
made, the function should return 0 (see Note below). The function should not modify the input.

Of course, in the real Zonk game it's sometimes not worth to collect all combination from a roll. Taking less dice and rerolling more remaining may be
better, but this task is just to calculate the maximum possible score from a single roll.

There are different variations of Zonk. In this kata, we will use the most common table of combinations:

| Combination                | Example roll | Points                                           |
|----------------------------|--------------|--------------------------------------------------|
| Straight (1,2,3,4,5 and 6) | 6 3 1 2 5 4  | 1000 points                                      |
| Three pairs of any dice    | 2 2 4 4 1 1  | 750 points                                       |
| Three of 1                 | 1 4 1 1      | 1000 points                                      |
| Three of 2                 | 2 3 4 2 2    | 200 points                                       |
| Three of 3                 | 3 4 3 6 3 2  | 300 points                                       |
| Three of 4                 | 4 4 4        | 400 points                                       |
| Three of 5                 | 2 5 5 5 4    | 500 points                                       |
| Three of 6                 | 6 6 2 6      | 600 points                                       |
| Four of a kind             | 1 1 1 1 4 6  | 2 × Three-of-a-kind score (in example, 2000 pts) |
| Five of a kind             | 5 5 5 4 5 5  | 3 × Three-of-a-kind score (in example, 1500 pts) |
| Six of a kind              | 4 4 4 4 4 4  | 4 × Three-of-a-kind score (in example, 1600 pts) |
| Every 1                    | 4 3 1 2 2    | 100 points                                       |
| Every 5                    | 5 2 6        | 50 points                                        |



Each die cannot be used in multiple combinations the same time, so three pairs of 2, 3 and 5 will worth you only 750 points (for three pairs), not 850
(for three pairs and two fives). But you can select multiple combinations, 2 2 2 1 6 will worth you 300 points (200 for three-of-kind 2 plus 100 for
single 1 die).

## Examples
* [1,2,3]       =>  returns 100  = points from one 1
* [3,4,1,1,5]   =>  returns 250  = points from two 1 and one 5
* [2,3,2,3,3,2] =>  returns 500  = three of 2 + three of 3
* [1,1,1,1,1,5] =>  returns 3050 = five 1 + one 5
* [2,3,4,3,6,6] =>  returns 0    = Zonk, no combinations here
* [2,2,6,6,2,2] =>  returns 400  = four 2, this cannot be scored as three pairs
* [1,3,4,3,4,1] =>  returns 750  = three pairs
* [3,3,3,3]     =>  returns 600  = four of 3
* [1,2,3,4,5]   =>  returns 150  = it's not straight

