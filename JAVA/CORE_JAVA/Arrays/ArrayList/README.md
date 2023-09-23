// Array of List:: this is a resizeable array.

ArrayList<Integer> integers = new ArrayList<>();

// to add item
use the in-built method add("contents") or add(index, "content")

// to access item
use the in-built method get(index)

// changing item
use the in-built method set(index, value)

// removing item
use the in-built method remove(index) or value.

// to remove all item
use the in-built method clear()

// to get the size of an Array List
use the in-built method size()

// looping through an array list

let's say we have a list called:

ArrayList<String> fruits = new ArrayList<>();

fruits.add(banana);
fruits.add(strawberry);
fruits.add(casava);
fruits.add(orange);
fruits.add(mango);

let's loop through the list.

for( int i = 0; i < fruits.size(); i++ )
System.out.println(fruits.get(i) + " ");

Sorting an array list::

use the sort() of the Collections class.

Example::
let's sort the previous list alphabetically.

use the Collections class.
Collections.sort(fruits)
System.out.println(fruits)
