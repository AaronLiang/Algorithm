http://en.wikipedia.org/wiki/Tree_traversal#Depth-first


Depth-first[edit]

Pre-order[edit]
preorder(node)
  if node == null then return
  visit(node)
  preorder(node.left) 
  preorder(node.right)
  
iterativePreorder(node)
  parentStack = empty stack
  while not parentStack.isEmpty() or node != null
    if node != null then
      visit(node)
      parentStack.push(node.right)
      node = node.left
    else
      node = parentStack.pop()
      
 ---------------------     
In-order[edit]
inorder(node)
  if node == null then return
  inorder(node.left)
  visit(node)
  inorder(node.right)
  
  ---------------------------------------
  
iterativeInorder(node)
  parentStack = empty stack
  while not parentStack.isEmpty() or node != null
    if node != null then
      parentStack.push(node)
      node = node.left
    else
      node = parentStack.pop()
      visit(node)
      node = node.right
  
      -------------------------
Post-order[edit]
postorder(node)
  if node == null then return
  postorder(node.left)
  postorder(node.right)
  visit(node)
  
  -=-----------------------------
iterativePostorder(node)
 if node == null then return
 nodeStack.push(node)
 prevNode = null
 while not nodeStack.isEmpty()
   currNode = nodeStack.peek()
   if prevNode == null or prevNode.left == currNode or prevNode.right ==currNode
     if currNode.left != null
       nodeStack.push(currNode.left)
     else if currNode.right != null
       nodeStack.push(currNode.right)
   else if currNode.left == prevNode
     if currNode.right != null
       nodeStack.push(currNode.right)
   else
     visit(currNode)
     nodeStack.pop()
   prevNode = currNode
    
    
    
    
    --------------------
    Breadth-first[edit]
Also, listed below is pseudocode for a simple queue based level order traversal, and will require space proportional to the maximum number of nodes at a given depth. This can be as much as the total number of nodes / 2. A more space-efficient approach for this type of traversal can be implemented using an iterative deepening depth-first search.

levelorder(root)
  q = empty queue (LinkedList)
  q.add(root)
  while not q.empty do
    node := q.remove()
    visit(node)
    if node.left ? null
      q.add(node.left)
    if node.right ? null
      q.add(node.right)
