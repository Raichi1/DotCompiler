import java.util.*;

public class EvalVisitor extends DotBaseVisitor<String>{
	Map<String, List<String>> memory = new HashMap<String, List<String>>();
	SymbolTable ST = new SymbolTable();

	/* gd=(GRAPH|DIGRAPH) id '{' stmt_list '}' */
	//@Override
	//public String visitGrafo(DotParser.GrafoContext ctx){
	//	String str = visit(ctx.id());
	//	if(!memory.containsKey(str)){ 
	//		if(ctx.gd.getType()==DotParser.GRAPH){ 
	//			memory.put("graph", new ArrayList<>()); 
	//		} else { 
	//			memory.put("digraph", new ArrayList<>()); 
	//		}
	//	}
	//	if(ctx.gd.getType()==DotParser.GRAPH){ 
	//		memory.get("graph").add(str); 
	//	} else {
	//		memory.get("digraph").add(str); 
	//	}
	//	return null;
	//}

	/* (stmt ;?)* */
	//public String visitStc(DotParser.StcContext ctx){
	//	Integer size = ctx.children.size();
	//	System.out.println(size);
	//	return null;
	//}

	/* edge_stmt */
	public String visitEdge(DotParser.EdgeContext ctx){
		return visit(ctx.edge_stmt());
	}

	/* (node_id | subgraph) edgeRHS? attr_list? */
	@Override
	public String visitSubgrafo(DotParser.SubgrafoContext ctx){
		String nodeU = visit(ctx.node_id());
		if(!memory.containsKey(nodeU)){
			memory.put(nodeU, new ArrayList<>());
		}
		if(ctx.edgeRHS()!=null){
			String nodeV = visit(ctx.edgeRHS());
			ST.addEdge(nodeU,nodeV);
			memory.get(nodeU).add(nodeV);
		}
		return null;
	}

	/* EDGEOP (node_id | subgraph) edgeRHS? */
	@Override
	public String visitNodeEdge(DotParser.NodeEdgeContext ctx){
		String nodeV = visit(ctx.node_id());
		if(ctx.edgeRHS()==null){
			return nodeV; 
		} else{
			String nodeVV = visit(ctx.edgeRHS());
			if(!memory.containsKey(nodeV)){
				memory.put(nodeV, new ArrayList<>());
			}
			ST.addEdge(nodeV,nodeVV);
			memory.get(nodeV).add(nodeVV);
			return nodeV;
		}
	}

	/* id port? */
	@Override
	public String visitNodeO(DotParser.NodeOContext ctx){
		return visit(ctx.id());
	}

	/* ID */
	@Override
	public String visitIdentify(DotParser.IdentifyContext ctx){
		return ctx.ID().getText();
	}

	/* STRING */
	@Override
	public String visitString(DotParser.StringContext ctx){
		return ctx.STRING().getText();
	}

	//-------------------------------FUNCTIONS---------------------------//
	public void ShowMemory(){
		ST.PrintSymbolTable();
	}

	public void SaveSymbolTable(){
		ST.convertAdjacencyListToTxtFile("output.txt");
	}
}
