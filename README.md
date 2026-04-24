# Restaurant-Ordering-system
For my final project, I built a Restaurant Ordering System that basically works like a simple digital ordering tool you’d see at a small café or fast‑food place. The whole idea was to make something useful while also showing that I can actually apply all the data structures we learned this semester in a real program. The system lets users browse a full menu, place orders, and see totals, while the program keeps track of popular items and organizes everything behind the scenes. I tried to design it in a way that feels organized but still easy to follow, so each part of the project has its own class and purpose. Overall, the project helped me understand how things like queues, stacks, linked lists, sorting, searching, and even recursion can work together in one bigger application instead of just separate homework problems.


# Written Report
For my final project, I created a Restaurant Ordering System that works like a simple digital ordering tool you might see at a small café or fast‑food place. The program lets users view a full menu, place orders, and see their total cost, while the system keeps track of which items are ordered the most. I wanted to build something that actually feels useful instead of just a random demo, so I tried to design it in a way that’s easy to navigate and makes sense from a real‑world perspective. It’s also entertaining to use because you can mix and match items, try different combinations, and see how the system reacts. Overall, the project shows how different data structures and algorithms can work together to support a bigger application instead of just being separate homework problems.
# Algorithims
1. Linear Search
Steps:
Loop through each item in the menu list.

Compare the item’s name to the user’s input.

If it matches, return the item.

If the loop ends with no match, return null.

Explanation:  
I used linear search because the menu isn’t extremely large, and it’s simple to implement. It lets the user type the name of any food item and the system checks each item until it finds the right one.

Big‑O Complexity:  
O(n) — the time grows based on the number of menu items.

2. Selection Sort
Steps:
Start at the first item.

Find the cheapest item in the rest of the list.

Swap it with the current position.

Move to the next position and repeat.

Explanation:  
I used selection sort to organize menu items by price. It’s not the fastest sorting algorithm in the world, but it’s easy to understand and works fine for a small menu.

Big‑O Complexity:  
O(n²) — nested loops make it slower for large lists.

3. Recursive Total Calculator
Steps:

Base case: if index reaches the end of the list, return 0.

Otherwise, return the current item’s price + recursive call on the next index.

Explanation:  
I used recursion to calculate the total cost of an order. It’s a simple example of how recursion can replace a loop, and it fits nicely since each step just adds one item’s price.

Big‑O Complexity:  
O(n) — one recursive call per item.
# Data-Structures
ArrayList: I used an ArrayList to store all the menu items because it’s easy to add items, loop through them, and sort them. Since the menu doesn’t change constantly, an ArrayList works perfectly.

LinkedList; The categories (Appetizers, Burgers, Drinks, Desserts) are stored in a LinkedList. I chose this because categories don’t need random access they’re just displayed in order.

Queue:Orders are stored in a Queue to follow the “first come, first served” rule. This matches how real restaurants work, where the oldest order gets prepared first.

Stack: I used a Stack to store actions in the menu editor. If the user makes a mistake, they can undo the last action by popping it off the stack.

HashMap: The HashMap tracks how many times each item is ordered. The item name is the key, and the number of orders is the value. This makes it easy to update counts and display popularity stats.

Recursion: Recursion is used to calculate the total price of an order. It’s a simple example, but it shows how recursion can replace loops in certain situations.
# Develompent Reflection

Problem I Encountered and Solved
 One problem I ran into was handling user input when searching for menu items. At first, the program kept saying items didn’t exist even when they did. I eventually realized the issue was capitalization and spacing, so I fixed it by using equalsIgnoreCase() and trimming the input. After that, the search worked perfectly.

Design Improvement I Discovered
 Originally, I stored everything in one big class, and it quickly became messy. Splitting the project into separate classes (Menu, Order, OrderManager, etc.) made the code way easier to understand and maintain. It also made debugging a lot simpler because each class had a clear job.

What I Would Add in Version 2
 If I had more time, I would add file saving so the system could remember past orders and menu changes even after closing the program. I’d also like to add a login system for employees and maybe even a simple kitchen display mode that shows the next order in the queue. A GUI version would also be cool, but that would be a much bigger project.