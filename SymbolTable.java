import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SymbolTable{
	private Map<String, List<String>> nodes;

	public SymbolTable(){
		this.nodes = new HashMap<>();
	}

	public void addEdge(String u, String v){
		if(!nodes.containsKey(u)){
			nodes.put(u,new ArrayList<>());
		}
		nodes.get(u).add(v);
		return;
	}

	/* Printing Adjacency List*/
	public void PrintSymbolTable(){
		System.out.println("\nAdjacency List: ");
		for (Map.Entry<String, List<String>> entry : nodes.entrySet()) {
			System.out.print(entry.getKey() + "-> ");
			List<String> values = entry.getValue();
			for (int i = 0; i < values.size(); ++i) {
				System.out.print(values.get(i) + " ");
			}
			System.out.println();
		}
	}

	/* Creating TXT file */
	public void convertAdjacencyListToTxtFile(String filename){
		try(BufferedWriter w = new BufferedWriter(new FileWriter(filename))){
			w.write("Adjacency List:\n");
			for(Map.Entry<String, List<String>> entry: nodes.entrySet()){
				w.write(entry.getKey()+ " -> ");
				List<String> values = entry.getValue();
				for(int i = 0; i < values.size(); ++i){
					w.write(values.get(i));
					if(i!=values.size()-1)w.write(" - ");
				}
				w.newLine();
			}
		} catch(IOException e){
			e.printStackTrace();
		}
	}

}

