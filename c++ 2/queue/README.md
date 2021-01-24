# Queue Data Structure

A queue is a list in which alll insertions are made at one end of the list (the *rear* or *back*), and all deletions are made at the other end (the *front* or *head*). The list elements enter amd leave the queue in a **First-In, First-Out (FIFO)** or **Last-In, Last-Out (LILO)** order.

## Standard Queue Operations
- `enqueue(): Inserts an element on the queue from one end (rear/back). If there is no place for a new element, the queue gets in overflow state.`

- `dequeue(): Returns and removes an element from the other end of the queue (front/head). If there are no elements, the queue gets in an underflow state.`

- `isEmpty(): Checks whether the queue is empty or not.`

- `isFull(): Checks whether the queue is full or not.`

- `peek(): Accesses the element at the i-th position.`

- `count(): Counts the number of elements in the queue.`

- `change(): Overrides an element at the i-th position.`

- `display(): Displays all the elements in the queue.`