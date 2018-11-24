public class Solution 
{
     static class Edge 
    {
        int source;
        int destination;
        Double weight;

        public Edge(int source, int destination,Double weight) 
        {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }
	public int vertices;

    static class Graph 
    {
        int vertices;
        static LinkedList<Edge> [] adjacencylist;

        Graph(int vertices) 
        {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
             
            for (int i = 0; i <vertices ; i++) 
            {
                adjacencylist[i] = new LinkedList<>();
            }
        }

        public void addEgde(int source, int destination,Double weight) 
        {
            Edge edge = new Edge(source, destination, weight);
            adjacencylist[source].addFirst(edge);  
            edge = new Edge(destination, source, weight);
            adjacencylist[destination].addFirst(edge);
        }
        private static void printGraph(Graph g) 
        {
        	for (int i = 0; i <g.vertices ; i++) 
            {
               
        		LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j <list.size() ; j++)
                {
                    System.out.print(i+":"+" " +i+"-"+list.get(j).destination +" "+list.get(j).weight+"  ");
                }
    			System.out.println("\n");
            }
    		
    	}
    }
	public static void main(String[] args) 
     {
		 
           Scanner sc=new Scanner(System.in);
    	    int vertices,Edges;
     
    	    Graph g = new Graph(vertices=sc.nextInt());
    	   
    	    Edges=sc.nextInt();
    	    int count=0,source=0,destination=0;
            Double weight; 
    		while(count<Edges)
    		 {
    			 source=sc.nextInt();
    			 destination=sc.nextInt();
    			 weight=sc.nextDouble();
    			 g.addEgde(source, destination, weight);
    			 count++;
    		 }
    		String s=sc.next();
		String caseToGo = null;
		switch (caseToGo) 
{
		case "Graph":
			        System.out.println(vertices+"vertices"+" "+Edges+"edges");
    	    		     g.printGraph(g);
			break;

		case "DirectedPaths":
			// Handle the case of DirectedPaths, where two integers are given.
			// First is the source and second is the destination.
			// If the path exists print the distance between them.
			// Other wise print "No Path Found."
			break;

		case "ViaPaths":
			// Handle the case of ViaPaths, where three integers are given.
			// First is the source and second is the via is the one where path should pass throuh.
			// third is the destination.
			// If the path exists print the distance between them.
			// Other wise print "No Path Found."
			break;

		default:
			break;
		}

	}
}