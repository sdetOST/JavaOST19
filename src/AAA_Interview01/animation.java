package AAA_Interview01;
/*
A collection of particles is contained in a linear chamber. They all
have the same speed, but some are headed toward the right and others are
headed toward the left. These particles can pass through each other
without disturbing the motion of the particles, so all the particles will
leave the chamber relatively quickly.

You will be given the initial conditions by a String "init" containing at
each position an 'L' for a leftward moving particle, an 'R' for a
rightward moving particle, or a '.' for an empty location. "init" shows
all the positions in the chamber. Initially, no location in the chamber
contains more than one particle.

We would like a simple animation of the process. At each unit of time, we
want a string showing occupied locations with an 'X' and unoccupied locations
with a '.'.  Create a function "animate" that is given an int "speed" and a
String 
"init" giving the initial conditions. "speed" is the number of positions
each particle moves in one time unit.

The method will return an array of strings in which each successive element
shows the occupied locations at the next time unit. The first element of
the return should show the occupied locations at the initial instant
(at time = 0) in the 'X', '.' format. The last element in the returned array
should show the empty chamber at the first time that it becomes empty.

Java Definition
Class: ParticleAnimation
Method: animate
Method signature:
  public String[] animate(int speed, String init)

Your method should be public

You may assume the following constraints:
- "speed" will be between 1 and 10 inclusive

- "init" will contain between 1 and 50 characters inclusive

- each character in "init" will be '.' or 'L' or 'R'

Examples

(Note that in the examples below, the double quotes should not be
O considered part of the input or output strings.)
0)  2,  "..R...."

Returns:

{ "..X....",
"....X..",
"......X",
"......." }

The single particle starts at the 3rd position, moves to the 5th, then
7th, and then out of the chamber.


1)   3,  "RR..LRL"
Returns:
{ "XX..XXX",
".X.XX..",
"X.....X",
"......." }

At time 1, there are actually 4 particles in the chamber, but the 4th
position contains two particles that are passing through each other

2)  2,  "LRLR.LRLR"
Returns:
{ "XXXX.XXXX",
"X..X.X..X",
".X.X.X.X.",
".X.....X.",
"........." }

At time 0 there are 8 particles. At time 1, there are still 6 particles,
but only 4 positions are occupied since particles are passing through
each other.

3)  10,  "RLRLRLRLRL"

Returns:
{ "XXXXXXXXXX",
".........." }

These particles are moving so fast that they all exit the chamber by
time 1.


4)  1,  "..."

Returns:
{ "..." }

5)  1,  "LRRL.LR.LRR.R.LRRL."

Returns:
{ "XXXX.XX.XXX.X.XXXX.",
"..XXX..X..XX.X..XX.",
".X.XX.X.X..XX.XX.XX",
"X.X.XX...X.XXXXX..X",
".X..XXX...X..XX.X..",
"X..X..XX.X.XX.XX.X.",
"..X....XX..XX..XX.X",
".X.....XXXX..X..XX.",
"X.....X..XX...X..XX",
".....X..X.XX...X..X",
"....X..X...XX...X..",
"...X..X.....XX...X.",
"..X..X.......XX...X",
".X..X.........XX...",
"X..X...........XX..",
"..X.............XX.",
".X...............XX",
"X.................X",
"..................." }

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class animation  {
	
	public static String[] animate(int speed, String init) {
		
		List<String> lst = new ArrayList<>(Arrays.asList(init.split("")));
		List<String> lstR = new ArrayList<>();
		List<String> lstL = new ArrayList<>();
		List<String> lst2 = new ArrayList<>();
		List<String> result = new ArrayList<>();
		
		if (speed < 1  || speed > 10 ) {
			String[] ar = {"Speed should be between 1 and 10 inclusive."}; 
			return ar;
		}
		if (init.length() > 50) {
			String[] ar = {"String init length should be less than 51 character."}; 
			return ar;
		}
		else {
		
			for (String s : lst) 
				if (s.equals("L") ) lstR.add("."); else lstR.add(s);
			for (String s : lst) 
				if (s.equals("R") ) lstL.add("."); else lstL.add(s);	
			
			while ( lstR.contains("R") || lstL.contains("L") ) {
					
				for (int i = lstR.size()-1; i >= 0 ; i--) {
					if (i>=speed) lstR.set(i, lstR.get(i-speed));
					else lstR.set(i,".");
				}
				
				for (int j = 0; j < lstL.size() ; j++) {
					if(j<lstL.size()-speed)   lstL.set(j, lstL.get(j+speed));
					else lstL.set(j,".");
				}
				
				
				for (int k = 0; k < lst.size() ; k++) {
					if (lstL.get(k).equals("L") || lstR.get(k).equals("R")) lst2.add("X");
					else lst2.add(".");
				}
				String str = lst2.toString().replace("[", "").replace("]", "").replace(",","");
				result.add(str);
				lst2.clear();
			}
			result.add(0, lst.toString().replace("[", "").replace("]", "").replace(",",""));
			
		}
			
			String [] animation = result.toArray(new String[result.size()]);
			return animation;
		
		
	}
	
	public static void main(String[] args)  {
		
		int speed = 1;
		String init = "LRRL.LR.LRR.R.LRRL.";
		
		for (String str: animate(speed, init)) 
			System.out.println(str);
			
		
		
	}
		
}
