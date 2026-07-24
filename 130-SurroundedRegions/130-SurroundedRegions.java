// Last updated: 24/07/2026, 10:00:18
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    public void dfs(Node node , Node copy , Node[] visited){
23        visited[copy.val] = copy;// store the current node at it's val index which will tell us that this node is now visited
24        
25//         now traverse for the adjacent nodes of root node
26        for(Node n : node.neighbors){
27//             check whether that node is visited or not
28//              if it is not visited, there must be null
29            if(visited[n.val] == null){
30//                 so now if it not visited, create a new node
31                Node newNode = new Node(n.val);
32//                 add this node as the neighbor of the prev copied node
33                copy.neighbors.add(newNode);
34//                 make dfs call for this unvisited node to discover whether it's adjacent nodes are explored or not
35                dfs(n , newNode , visited);
36            }else{
37//                 if that node is already visited, retrieve that node from visited array and add it as the adjacent node of prev copied node
38//                 THIS IS THE POINT WHY WE USED NODE[] INSTEAD OF BOOLEAN[] ARRAY
39                copy.neighbors.add(visited[n.val]);
40            }
41        }
42        
43    }
44    public Node cloneGraph(Node node) {
45        if(node == null) return null; 
46        Node copy = new Node(node.val); 
47        Node[] visited = new Node[101];
48        Arrays.fill(visited , null); 
49        dfs(node , copy , visited); 
50        return copy; 
51    }
52}